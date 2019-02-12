package cglib;

public class MyTest {
    public static void main(String[] args) {
        SomeService target = new SomeService();
        SomeService service = new CglibFactory(target).myCglibCreator();
        String result = service.doFirst();
        System.out.println(result);
        service.doSecond();
    }
}
