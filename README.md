[TOC]

##设计模式概述

设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。

GOF：

- 对接口编程而不是对实现编程
- 优先使用对象组合而不是继承

设计模式在软件开发中的两个主要途径：

1.开发人员的共同平台：

- 设计模式提供了一个标准的术语系统，且具体到特定的情景。例如，单例设计模式意味着使用单个对象，这样所有熟悉单例设计模式的开发人员都能使用单个对象，并且可以通过这种方式告诉对方，程序使用的是单例模式。

2.最佳的实践

- 设计模式已经经历了很长一段时间的发展，它们提供了软件开发过程中面临的一般问题的最佳解决方案。学习这些模式有助于经验不足的开发人员通过一种简单快捷的方式来学习软件设计。

**设计模式的类型：**

根据设计模式的参考书 **Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素）** 中所提到的，总共有 23 种设计模式。这些模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）。

- 创建型模式：这些设计模式提供了一种**在创建对象的同时隐藏创建逻辑的方式，而不是使用new运算符直接实例化对象**。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。 

- 结构型模式：这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
- 行为型模式：这些设计模式特别关注对象之间的通信。

- J2EE模式：这些设计模式特别关注表明层。这些模式由Sun Java Center鉴定的。

设计模式的六大原则：

1.开闭原则（Open Close Principle）

- 开闭原则的意思是：**对扩展开放，对修改关闭**。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。

2.里氏代换原则（Liskov Substitution Principle）？？？**实现抽象的规范，实现子父类互相替换**

- 里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

3.依赖倒转原则（Dependence Inversion Principle）

- 这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4.接口隔离原则（Interface Segregation Principle）

- 这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5.迪米特法原则，又称最少知道原则（Demeter Principle）

- 最少知道原则是指：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相独立。

6.合成复用原则（Composite Reuse Principle）

- 合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。

| 序号 | 模式 & 描述                                                  | 包括                                                         |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1    | **创建型模式** 这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。 | 工厂模式（Factory Pattern）抽象工厂模式（Abstract Factory Pattern）单例模式（Singleton Pattern）建造者模式（Builder Pattern）原型模式（Prototype Pattern） |
| 2    | **结构型模式** 这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。 | 适配器模式（Adapter Pattern）桥接模式（Bridge Pattern）过滤器模式（Filter、Criteria Pattern）组合模式（Composite Pattern）装饰器模式（Decorator Pattern）外观模式（Facade Pattern）享元模式（Flyweight Pattern）代理模式（Proxy Pattern） |
| 3    | **行为型模式** 这些设计模式特别关注对象之间的通信。          | 责任链模式（Chain of Responsibility Pattern）命令模式（Command Pattern）解释器模式（Interpreter Pattern）迭代器模式（Iterator Pattern）中介者模式（Mediator Pattern）备忘录模式（Memento Pattern）观察者模式（Observer Pattern）状态模式（State Pattern）空对象模式（Null Object Pattern）策略模式（Strategy Pattern）模板模式（Template Pattern）访问者模式（Visitor Pattern） |
| 4    | **J2EE 模式** 这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。 | MVC 模式（MVC Pattern）业务代表模式（Business Delegate Pattern）组合实体模式（Composite Entity Pattern）数据访问对象模式（Data Access Object Pattern）前端控制器模式（Front Controller Pattern）拦截过滤器模式（Intercepting Filter Pattern）服务定位器模式（Service Locator Pattern）传输对象模式（Transfer Object Pattern） |



##创建型模式

这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。



###单例模式（Singleton Pattern）

这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

- 单例类只能有一个实例
- 单例类必须创建自己的唯一实例
- 单例类必须给所有其他对象提供这一实例

单例模式的优点：

- 由于单例模式只能产生一个实例，减少了系统性能开销，当一个对象的产生需要较多的资源时，如读取配置、产生其他依赖对象时，则可以通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。

常见的五种单例模式实现方式：

- 主要：

  - **饿汉式**（线程安全，调用效率高。但是，不能延时加载）

  ```Java
  public class SingletonDemo1 {
      // 类初始化时，立即加载这个对象；加载类时，天然的是线程安全
     	private static SingletonDemo1 instance = new SingletonDemo1();
      private SingletonDemo1() {}
      // 方法没有同步，调用效率高
      public static SingletonDemo1 getInstance() {
          return instance;
  	}
      public void showMessage(){
        System.out.println("Hello World!");
     	}
  }
  ```

  - **懒汉式**（线程安全，调用效率不高。但是，可以延时加载）

  ```Java
  public class SingletonDemo2 {
      // 类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
      private static SingletonDemo2 instance;
      private SingletonDemo2() { // 私有化构造器，防止该类被实例化
      }
      // 方法同步，调用效率低
      public static synchronized SingletonDemo2 getInstance() {
          if (instance == null) {
              instance = new SingletonDemo2();
          }
          return instance;
      }
  }
  ```

- 其他：

  - 双重检测锁式（由于JVM底层内部模型原因。偶尔会出现问题。**不建议使用**）

  ```Java
  public class SingletonDemo3 {
      private volatile static SingletonDemo3 instance;
      private SingletonDemo3() {}
      public static SingletonDemo3 getInstance() {
          if (instance == null) {
              synchronized (SingletonDemo3.class) {
                  if (instance == null) {
                      instance = new SingletonDemo3();
                  }
              }
          }
          return instance;
      }
  }
  ```

  - **静态内部类式**（线程安全，调用效率高。但是，可以延时加载）
    - 只有真正调用getInstance()，才会加载静态内部类，加载类时是线程安全的。
    - 兼备了并发高效调用和延迟加载的优势。

  ```Java
  public class SingletonDemo4 {
      private static class SingletonClassInstance {
          private static final SingletonDemo4 instance = new SingletonDemo4();
  	}
      public static SingletonDemo4 getInstance() {
          return SingletonClassInstance.instance;
      }
      private SingletonDemo4() {
      }
  }
  ```

  - **枚举单例**（线程安全，调用效率高，不能延时加载）
    - 不能通过 reflection attack 来调用私有构造方法。

  ```Java
  public enum SingletonDemo5 {
      // 这个枚举元素本身就是单例模式
      INSTANCE;
      // 添加自己需要的操作
      public void singletonOperation() {
  	}
  }
  ```

如何选用：

- 单例对象占用资源少，不需要延时加载：
  - 枚举式 好于 饿汉式
- 单例对象占用资源大，需要延时加载：
  - 静态内部类式 好于 懒汉式

问题：

- 反射可以破解上面几种（不包含枚举单例）实现方式（可以在构造方法中手动抛出异常控制）
- 反序列化可以破解上面几种（不包含枚举单例）实现方式
  - 可以通过定义readResolve()防止获得不同对象

常见的五种单例模式在多线程环境下的测试效率：

```Java
public class Client3 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i=0; i<threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<10000000; i++) {
                        Object o = SingletonDemo3.getInstance();
                        //Object o = SingletonDemo5.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();  // main线程阻塞，直到计数器变为0，才会继续执行下去
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}

```

CountDownLatch

- 同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待
  - countDown()：当前线程调用此方法，则计数器减1（建议放在finally里执行）
  - await()：调用此方法会一直阻塞当前线程，知道计时器为0



###工厂模式（Factory Pattern）

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

核心本质：实现了创建者和调用者的分离

- 实例化对象，用工厂方法代替new操作
- 将选择实现类、创建对象统一管理和控制。从而将调用者和我们的实现解耦

工厂模式：

- 简单工厂模式：用来生产同一等级结构中的任意产品（对于增加新的产品，需要修改已有代码，不完全满足开闭原则）
- 工厂方法模式：用来生产同一等级结构中的固定产品（支持增加任意产品）
- 抽象工厂模式：用来生产不同产品族的全部产品（对于增加新的产品，无能为力；支持增加产品族）

**根据设计理论建议：工厂方法模式。但实际上，我们一般都用简单工厂模式。**



###抽象工厂模式

不可以增加产品，可以增加产品族

工厂模式要点：

- 简单工厂模式（静态工厂模式）
  - 虽然某种程度不符合设计原则，但实际使用很多
- 工厂方法模式
  - 不修改已有类的前提下，通过增加新的工厂类实现扩展
- 抽象工厂模式
  - 不可以增加产品，可以增加产品族



###建造者模式

场景：

- 我们要建造一个复杂的产品。比如：神舟飞船、iPhone。这种复杂产品的创建，有这样一个问题需要处理：
  - 装配这些子组件是不是有个步骤问题？
- 实际开发中，我们所需要的对象构建时，也非常复杂，有很多步骤需要处理

建造者模式的本质：

- 分离了对象子组件的单独构造（由Builder负责）和装配（由Director负责）

- 由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；相同的构建器，不同的装配顺序也可以做出不同的对象。

开发中应用场景：

- StringBuilder类的append方法
- SQL中的PreparedStatement
- JDOM中，DomBuilder、SAXBuilder



###原型模式（Prototype）

场景：

- 思考一下：克隆技术是怎么样的过程？

原型模式：

- 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
- 就是java中的克隆技术，以某个对象为原型，复制出新的对象。显然，新的对象具备原型对象的特点
- 优势有：效率高（直接克隆，避免了重新执行构造过程步骤）
- 克隆类似于new，但是不同于new。new创建新的对象属性采用的是默认值。克隆出的对象的属性值完全和原型对象相同。并且克隆出的新对象改变不会影响原型对象。然后，再修改克隆对象的值。

原型模式实现：

- Cloneable接口和clone方法
- Prototype模式中实现起来最困难的地方就是**内存复制**操作，所幸Java中提供了clone()方法替我们做了绝大部分事情。

**注意用词：克隆和拷贝一回事**

**注意：浅复制、深复制（看示例代码）**

利用序列化和反序列化实现深度复制

```Java
/**
 * 原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1212321321321L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);

        // 使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();   // 克隆好的对象

        System.out.println(s1.getSname());
        System.out.println(s2.getSname());

        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
        // s1,s2的Birthday指向同一对象
        date.setTime(121232132123121L);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }
}
```

短时间大量创建对象时，原型模式和普通new方式效率测试

开发中的应用场景：

- 原型模式很少单独出现，一般是和工厂方法一起出现，通过clone的方法创建一个对象，然后由工程方法提供给调用者。
  - spring中bean的创建实际就是两种：单例模式和原型模式（当然原型模式需要和工厂模式搭配起来）



###总结

创建型模式：都是用来帮助我们创建对象的

- 单例模式
  - 保证一个类只有一个实例，并且提供一个访问该实例的全局访问点
- 工厂模式：
  - 简单工厂模式：用来生产同一等级结构的任意产品。（对于新增的产品，需要需改已有的代码）
  - 工厂方法模式：用来生产同一等级结构中的固定产品。（支持增加任意产品）
  - 抽象工厂模式：用来生产不同产品族的全部产品。（对于新增加的产品，无能为力；支持产品族）
- 建造者模式：
  - 分离了对象子组件的单独构造（由Builder来负责）和装配（由Director负责）。从而可以构造出复杂的对象。
- 原型模式：
  - 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。



##结构型模式

核心作用：是从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题。



###适配器模式（adapter）

什么是适配器模式？

- 将一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。

模式中的角色：

- 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
- 需要适配的类（Adaptee）：需要适配的类或适配者类。
- 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。

工作中的场景：

- 经常用来做旧系统改造和升级
- 如果我们的系统开发之后再也不需要维护，那么很多模式都是没必要的，但是不幸的是，事实却是维护一个系统的代价玩玩是开发系统的数倍

我们学习中见过的场景：

- `java.io.InputStreamReader(InputStream)`
- `java.io.OutputStreamWriter(OutputStream)`



###代理模式（Proxy Pattern）✨

核心作用：

- 通过代理，控制对对象的访问
  - 可以详细控制访问某个（某类）对象的方法，在调用这个方法前做前置处理，调用这个方法后做后置处理。（即：AOP的微观实现）
- AOP（Aspect Oriented Programming 面向切面编程）的核心实现机制

核心角色：

- 抽象角色
  - 定义代理角色和真实角色的公共对外方法
- 真实角色
  - 实现抽象就是，定义真实角色所要实现的业务逻辑，供代理角色调用
  - 关注真正的业务逻辑
- 代理角色
  - 实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
  - **将统一的流程控制放到代理角色中处理**

应用场景：

- 安全代理：屏蔽对真实角色的直接访问
- 远程代理：通过代理类处理远程方法调用（RMI）
- 延迟加载：先加载轻量级的代理对象，真正需要再加载真实对象

分类：

- 静态代理（静态定义代理类）
- 动态代理（动态生成代理类）
  - JDK自带的动态代理
  - javaassist字节码操作库实现
  - CGLIB
  - ASM（底层使用指令，可维护性较差）

动态代理相比与静态代理的优点：

- 抽象角色中（接口）声明的方法都被转移到调用处理器一个集中的方法处理，这样，我们可以更加灵活和统一的处理众多的方法。

JDK自带的动态代理

在Java中`java.lang.reflect`包下提供了一个Proxy类和一个InvocationHandler接口，通过使用这个类和接口就可以生成动态代理对象。JDK提供的代理只能针对接口做代理，我们有更强大的代理cglib，Proxy类中的方法创建动态代理类对象。

- `java.lang.reflect.Proxy`
  - 作用：动态生成代理类和对象
- `java.lang.reflect.InvocationHandler(处理器接口)`
  - 可以通过invoke方法实现对真实角色的代理访问
  - 每次通过Proxy生成代理类对象时都要指定对应的处理器对象

```Java
Star realStar = new RealStar();
StarHandler handler = new StarHandler(realStar);
Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class, handler});
proxy.sing();
```

开发框架中应用场景：

- struts2中拦截器的实现
- 数据库连接池关闭处理
- Hibernate中延时加载的实现
- MyBatis中实现拦截器插件
- Aspect的实现
- Spring中AOP的实现
  - 日志拦截
  - 声明式事务处理
- web service
- RMI远程方法调用



###桥接模式（bridge）

场景：

- 商城系统中常见的商品分类，以电脑为类，如何良好的处理商品分类销售的问题？

问题：

- 扩展性问题（类个数膨胀问题）：
  - 如果要增加一个新的电脑类型智能手机，则要增加各个品牌下面的类。
  - 如果要增加一个新的品牌，也要增加各种电脑类型的类。
- 违反单一职责原则：
  - 一个类：联系笔记本，有两个引起这个类变化的原因

桥接模式核心要点：

- 处理多层继承结构，处理多维度变化的场景，将各个维度设计成独立的继承结构，使各个维度可以独立的扩展在抽象层建立关联。

桥接模式总结：

- 桥接模式可以取代多层继承的方案。多层继承违背了单一职责原则，复用性比较差，类的这个数也非常多。桥接模式可以极大的减少子类的个数，从而降低管理和维护的成本。
- 桥接模式极大的提高了系统可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有的系统，符合开闭原则。



###组合模式（composite）

**树形结构想到组合模式**

使用组合模式的场景：

- 把部分和整体的关系用树形结构来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象。

组合模式核心：

- 抽象结构（Component）角色：定义了叶子和容器构件的共同点
- 叶子（Leaf）构件角色：无子节点
- 容器（Composite）构件角色：有容器特征，可以包含子结点

组合模式工作流程分析：

- 组合模式为处理树形结构提供了完美的解决方案，描述了如何将容器和叶子进行递归组合，使得用户在使用时可以一致性的对待容器和叶子。
- 当容器对象的指定方法被调用时，将遍历整个树形结构，寻找也包含这个方法的成员，并调用执行。其中，使用了递归调用的机制对整个结构进行处理。

**使用组合模式，模拟杀毒软件架构设计**

开发中的应用场景：

- 操作系统的资源管理器
- GUI中的容器层次图
- XML文件解析
- OA系统中，组织结构的处理
- Junit单元测试框架
  - 底层设计就是典型的组合模式，TestCase（叶子）、TestUnite（容器）、Test接口（抽象）



###装饰器模式（decorator）

职责：

- 动态的为一个对象增加新的功能
- 装饰模式是一种用于**代替继承**的技术，无须通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更加灵活，同时能避免类型体系的快速膨胀。

实现细节：

- Component 抽象构件角色
  - 真实对象和装饰对象有相同的接口。这样，客户端对象就能够以与真实对象相同的方式同装饰对象交互。
- ConcreteComponent 具体构件角色（真实对象）
  - io流中的FileInputStream、FileOutputStream
- Decorator 装饰角色
  - 持有一个抽象构件的引用。装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象。这样，就能在真实对象调用前后增加新的功能。
- ConcreteDecorator 具体装饰角色
  - 负责给构件对象增加新的责任

开发中使用的场景：

- IO中输入流和输出流的设计
- Swing包中图形界面构件功能
- Servlet API中提供了一个request对象的Decorator设计模式的默认实现类HTTPServletRequestWrapper，HTTPServletRequestWrapper类，增强了request对象的功能。
- Struts2中，request、response、session对象的处理

**IO流实现细节**

- Component 抽象构件角色
  - io流中的InputStream、OutputStream、Reader、Writer
- ConcreteComponent 具体构件角色
  - io流中的FileInputStream、FileOutputStream
- Decorator 装饰角色
  - 持有一个抽象构件的引用：io流中的FilterInputStream、FilterOutputStream
- ConcreteDecorator 具体装饰角色
  - 负责给构件对象增加新的责任。io流中的BufferOutputStream、BufferedInputStream等

```Java
Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
```

总结：

- 装饰器模式（Decorator）也叫包装器模式（Wrapper）
- 装饰模式降低系统的耦合度，可以动态的增加或删除对象的职责，并使得需要装饰的具体构件类和具体装饰类可以独立变化，以便增加新的具体构件类和具体装饰类。

优点：

- 扩展对象功能，比继承灵活，不会导致类个数急剧增加
- 可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更加强大的对象
- 具体构件类和具体装饰类可以独立变化，用户可以根据需要自己增加新的具体构建子类和具体装饰子类

缺点：

- 产生很多小对象。大量小对象占据内存，一定程度上影响性能
- 装饰器模式易于出错，调试排查比较麻烦

装饰器模式和桥接模式的区别：

- 两个模式都是为了解决过多子类对象问题。但它们的诱因不一样。桥接模式是对象自身现有机制沿着多个维度变化，是既有不稳定。装饰器模式是为了增加新的功能。



###外观模式（Facade Pattern）

迪米特法则（最少知识原则）：

- 一个软件实体应当尽可能少的与其他实体发送相互作用。

外观模式核心：

- 为子系统提供统一的入口。封装子系统的复杂性，便于客户端调用。

开发中常见的场景：

- 频率很高。哪里都会遇到。各种技术和框架中，都有外观模式的使用，如：
  - JDBC封装后，commons提供的DBUtils类，Hibernate提供的工具类、Spring JDBC工具类等。



###享元模式（FlyWeight）

场景：

- 内存属于稀缺资源，不要随便浪费。如果有很多个完全相同或相似的对象，我们可以通过享元模式，节省内存。

核心：

- 享元模式以共享内存的方式高效地支持大量细粒度对象的重用。
- 享元对象能做到共享的关键是区分了内部状态和外部状态
  - 内部状态：可以共享，不会随环境变化而改变
  - 外部状态：不可以共享，会随环境变化而改变

围棋软件设计：

- 每个围棋棋子都是一个对象
  - 内部状态（可以共享）
    - 颜色
    - 形状
    - 大小
  - 外部状态（不可以共享）
    - 位置

享元模式实现：

- FlyweightFactory 享元工厂类
  - 创建并管理享元对象，享元池一般设计成键值对
- FlyWeight 抽象享元类
  - 通常是一个接口或抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态
- ConcreteFlyWeight 具体享元类
  - 为内部状态提供成员变量进行存储
- UnsharedConcreteFlyWeight 非共享享元类
  - 不能被共享的子类可以设计为非共享享元类

享元模式开发中应用的场景：

- 享元模式由于其共享的特性，可以在任何“池”中操作，比如：线程池、数据库连接池
- String类的设计也是享元模式

优点：

- 极大减少内存中对象的数量
- 相同或相似对象内存中只存一份，极大的节约资源，提高系统性能
- 外部状态相对独立，不影响内部状态

缺点：

- 模式较复杂，使程序逻辑复杂化
- 为了节省内存，共享了内部状态，分离出外部状态，而读取外部状态使运行时间变长。用时间换取了空间。



##行为型模式

关注系统中对象之间的相互交互，研究系统在运行时对象之间的相互通信和协作，进一步明确对象的职责，共有11种模式



###责任链模式

将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传递给链上的下一个对象。

场景：

- 打牌时，轮流出牌
- 接力赛跑
- 大学中，奖学金评审
- 公司中，公文审批

链表方式定义职责链

非链表方式定义职责链：

- 通过集合、数组生成职责链更加实用！实际上，很多项目中，每个具体的Handler并不是由开发团队定义的，而是项目上线后由外部单位追加的，所以使用链表方式定义COR链就很困难。

开发中常见的场景：

- Java中，异常机制就是一种责任链模式。一个try可以对应多个catch，当第一个ecatch不匹配类型，则自动跳到第二个catch中。
- JavaScript语言中，事件的冒泡和捕获机制。Java语言中，事件的处理采用观察者模式。
- Servlet开发中，过滤器的链式处理。
- Struts2中，拦截器的调用也是典型的责任链模式。



###迭代器模式 （iterator）

场景：

- 提供一种可以遍历聚合对象的方式。又称为：游标cursor模式
- 聚合对象：存储数据
- 迭代器：遍历数据

基本案例：

- 实现正向遍历的迭代器
- 实现逆向遍历的迭代器

开发中常见的场景：

JDK内置的迭代器（List/Set）



###中介者模式（Mediator）

核心：

- 如果一个系统中对象之间的联系呈现为网状结构，对象之间存在大量多对多关系，将导致关系及其复杂，这些对象称为“同事对象”

- 我们可以引入一个中介者对象，使各个同事对象只跟中介者对象打交道，将复杂的网络结构化解为如下的星形结构

![中介者模式](/Users/lujiafeng/Desktop/秋冬学期课程/高级企业应用开发技术/截图/中介者模式.png)

中介者模式的本质：

- 解耦多个同事对象之间的交互关系。每个对象都持有中介者对象的引用，只跟中介者对象打交道。我们通过中介者对象统一管理这些交互关系。

开发中常见的场景:

- MVC模式（其中的C，控制器就是一个中介者对象，M和V都和他打交道）
- 窗口游戏程序，窗口软件开发中窗口对象也是一个中介者对象
- 图形界面开发GUI中，多个组件之间的交互，可以通过引入一个中介者对象来解决，可以是整体的窗口对象或者DOM对象
- Java.lang.reflect.Method#invoke



###命令模式（command）不太使用

介绍：

- 命令模式：将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。也称之为：动作（Action）模式、事务（transaction）模式

结构：

- Command 抽象命令类
- ConcreteCommand 具体命令类
- Invoker 调用者/请求者
  - 请求的发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联。在程序运行时，将调用命令对象的execute()，间接调用接收者的相关操作。
- Receiver 接收者
  - 接收者执行与请求相关的操作，具体实现对请求的业务处理
  - 未抽象前，实际执行操作内容的对象
- Client 客户类
  - 在客户类中需要创建调用者、具体命令类对象，在创建具体命令对象时指定对应的接收者。发送者和接收者之间没有直接关系，都通过命令对象间接调用

开发中常见的场景：

- Struts2中，action的整个调用过程中就有命令模式
- 数据库事务机制的底层实现
- 命令的撤销和恢复



###解释器模式（interpreter）不常使用

介绍：

- 是一种不常用的设计模式
- 用于描述如何构成一个简单的语言解释器，主要用于使用面向对象语言开发的编译器和解释器设计
- 当我们需要开发一种新的语言时，可以考虑使用解释器模式
- 尽量不要使用解释器模式，后期维护会有很大麻烦。在项目中，可以使用Jruby、Groovy、Java的js引擎来替代解释器的作业，弥补java语言的不足

开发中常见的场景：

- EL表达式的处理
- 正则表达式解释器
- SQL语法的解释器
- 数学表达式解释器



###访问者模式（Visitor）不常用

模式动机：

- 对于存储在一个集合中的对象，他们可能具有不同的类型（即使有一个公共的接口），对于该集合中的对象，可以接受一类称为访问者的对象来访问，不同的访问者其访问方式也有所不同。

定义：

- 表示一个作用于某对象结构中的各元素的操作，它使我们可以在不改变元素的类的前提下定义作用于这些元素的新操作

开发中的场景：

- XML文档解释器设计
- 编译器的设计
- 复杂集合对象的处理



###策略模式（strategy）

策略模式：

- 策略模式对应于解决某一个问题的一个算法族，允许用户从该算法族中任选一个算法解决某一问题，同时可以方便的更换算法或者增加新的算法。并且由客户端决定调用哪个算法。

本质：分离算法，选择实现

开发中常见的场景：

- JAVASE中的GUI编程中，布局管理
- Spring框架中，Resource接口，资源访问策略
- javax.servlet.http.HttpServlet#service()



###模板方法模式（template method）

模板方法模式介绍：

- 模板方法模式是编程中常用到的模式。它定义了一个操作中的算法骨架，将某些步骤延迟到子类中实现。这样，新的子类可以在不改变一个算法结构的前提下重新定义该算法的某些特定步骤。

核心：

- 处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定。因此，我们采用工程方法模式，将这个节点的代码实现转移给子类完成。即：处理步骤父类中定义好，具体实现延迟到子类中定义。

方法回调（钩子方法）

- 好莱坞原则“Don't call me, we'll call you back”

- 在软件开发中，我们可以将call翻译为调用。子类（艺人）不能调用父类（娱乐公司），而通过父类调用子类。这些调用步骤已经在父类中写好了，完全由父类控制整个过程。

什么时候用到模板方法模式：

- 实现一个算法时，整体步骤很固定。但是，某些部分易变。易变部分可以抽象出来，供子类实现。

开发中常见的场景：

- 非常频繁。各个框架、类库中都有：
  - 数据库访问的封装
  - Junit单元测试
  - servlet中关于doGet/doPost方法调用
  - Hibernate中模板程序
  - spring中JDBCTemplate、HibernateTemplate等



###状态模式（state）

场景：

- 酒店系统中，房间的状态变化：
  - 已预订
  - 已入住
  - 空闲

核心：

- 用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题

结构：

- Context 环境类
  - 环境类中维护一个State对象，他定义了当前的状态
- State抽象状态类
- ConcreteState具体状态类
  - 每一个封装了一个状态对应的行为

开发中常见的场景：

- 银行系统中账号状态的管理
- OA系统中公文状态的管理
- 酒店系统中，房间状态的管理
- 线程对象各状态之间的切换



###观察者模式（Observer）

广播机制的场景

核心：

- 观察者模式主要用于1：N的通知。当一个对象（目标对象Subject或Objservable）的状态变化时（即消息发布），他需要及时告知一系列对象（观察者对象，Observer），令他们做出响应（即消息订阅）
- 通知观察者的方式：
  - 推：每次都会把通知以广播的方式发送给所有观察者，所有观察者只能被动接收
  - 拉：观察者只要直到有情况即可。至于什么时候获取内容，获取什么内容，都可以自主决定

JAVASE提供了`java.util.Observable`和`java.util.Observer`来实现观察者模式

开发中常见的场景：

- 聊天室程序的服务器转发给所有客户端
- 网络游戏（多人联机对战）场景中，服务器将客户端的状态进行分发
- 邮件订阅
- Servlet中，监听器的实现
- Android中，广播机制
- JDK的AWT中事件处理模型，基于观察者模式的委派事件模型（Delegation Event Model）
  - 事件源------目标对象
  - 事件监听器——观察者
- 京东商城中，群发某商品打折信息



###备忘录模式（memento）

核心：

- 就是保存某个对象内部状态的拷贝，这样以后就可以将该对象恢复到原先的状态。

结构：

- 源发器类 Originator
- 备忘录类 Memento
- 负责人类 CareTaker
  - 负责保存好的备忘录对象
  - 可以通过增加容器，设置多个”备忘点“

备忘点较多时：

- 将备忘录压栈

```Java
public class CareTaker {
	private Memento memento;
    private Stack<Memento> stack = new Stack<Memento>();
}
```

- 将多个备忘录对象，序列化和持久化

开发中常见的应用场景：

- 棋类游戏中的，悔棋
- 普通软件中的，撤销操作
- 数据库软件中的，事务管理中的，回滚操作
- Photoshop软件中的，历史记录


