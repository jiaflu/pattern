package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// 注意，使用Cglib动态代理，要求目标类不能是fianl的
// 因为final类是不能有子类的，而Cglib动态代理的增强原理是：子类增强父类
public class CglibFactory implements MethodInterceptor {
    private SomeService target;

    public CglibFactory() {
        super();
    }

    public CglibFactory(SomeService target) {
        super();
        this.target = target;
    }

    public SomeService myCglibCreator() {
        Enhancer enhancer = new Enhancer();
        // 指定父类，即目标类。因为Cglib动态代理增强的原理是：子类增强父类
        enhancer.setSuperclass(SomeService.class);
        // 设置回调接口对象
        enhancer.setCallback(this);
        // create()方法用于创建Cglib动态代理对象，即目标类的子类对象
        return (SomeService) enhancer.create();
    }

    // 回调接口的方法执行的条件是：代理对象执行目标方法时会触发该方法执行
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object invoke = method.invoke(target, args);
        if (invoke != null) {
            invoke = ((String) invoke).toUpperCase();
        }
        return invoke;
    }
}