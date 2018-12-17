package bean;

/**
 * 测试java.lang.Class对象的获取方式
 */
public class Demo01 {

    public static void main(String[] args) {
        String path = "bean.User";

        try {
            Class<?> clazz = Class.forName(path);
            System.out.println(clazz);
            System.out.println(clazz.hashCode());

            // 一个类只对应一个Class对象
            Class<?> clazz2 = Class.forName(path);
            System.out.println(clazz.hashCode());

            Class strClazz = String.class;
            Class strClazz2 = path.getClass();
            System.out.println(strClazz == strClazz2);

            Class intClazz = int.class;

            int[] arr01 = new int[10];
            int[] arr02 = new int[30];
            int[][] arr03 = new int[30][3];
            double[] arr04 = new double[10];

            System.out.println(arr01.getClass().hashCode());
            System.out.println(arr02.getClass().hashCode());
            System.out.println(arr01.getClass() == arr02.getClass());
            System.out.println(arr03.getClass().hashCode());
            System.out.println(arr04.getClass().hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
