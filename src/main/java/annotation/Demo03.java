package annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation.Student");

            // 获得类的所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            // 获得类的指定注解
            LjfTable lt = (LjfTable) clazz.getAnnotation(LjfTable.class);
            System.out.println(lt);

            // 获得类的属性的注解
            Field f = clazz.getDeclaredField("studentName");
            LjfField ljfField = f.getAnnotation(LjfField.class);
            System.out.println(ljfField.columnName() + "--" + ljfField.type() + "--" + ljfField.length());

            // 根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
