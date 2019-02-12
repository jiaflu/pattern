package cglib;


// 目标类：代理要增强的类
public class SomeService {
    public String doFirst() {
        System.out.println("执行doFirst()方法");
        return "abcde";
    }

    public void doSecond() {
        System.out.println("执行doSecond()方法");
    }
}
