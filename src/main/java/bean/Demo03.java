package bean;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API动态的操作：构造器、方法、属性
 */
public class Demo03 {
    public static void main(String[] args) {
        String path = "bean.User";

        try {
            Class<?> clazz = Class.forName(path);

            // 通过反射API调用构造方法，构造对象
            User u = (User) clazz.newInstance(); // 其实是调用了User的无参构造方法
            System.out.println(u);

            Constructor<User> c = (Constructor<User>) clazz.getDeclaredConstructor(int.class, int.class, String.class);
            User uu = (User) c.newInstance(1001, 18, "ljf");
            System.out.println(uu.getUname());

            // 通过反射API调用普通方法
            User uuu = (User) clazz.newInstance();
            uuu.setUname("陆佳峰");
            Method method = clazz.getDeclaredMethod("setUname", String.class);
            method.invoke(uuu, "ljf3"); // uuu.setUname("ljf3")
            System.out.println(uuu.getUname());

            // 通过反射API操作属性
            User u4 = (User) clazz.newInstance();
            Field f = clazz.getDeclaredField("uname");
            f.setAccessible(true); // 这个属性不需要做安全检查了，开源直接访问
            f.set(u4, "ljf4"); // 通过反射直接写属性
            System.out.println(u4.getUname()); // 通过反射直接读属性的值
            System.out.println(f.get(u4));  //

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
