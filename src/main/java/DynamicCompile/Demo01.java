package DynamicCompile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 通过IO流操作，将字符串存储成一个临时文件（Hi.java），然后调用动态编译方法。

        // 动态编译
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,"/Users/lujiafeng/GitRepositories/pattern/src/main/resources/HelloWorld.java");
        System.out.println(result==0?"编译成功":"编译失败");

        // 通过Runtime.getRuntime()运行启动新的进程运行
        Runtime run = Runtime.getRuntime();
        Process process = run.exec("java -cp /Users/lujiafeng/GitRepositories/pattern/src/main/resources/ HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String info = "";
        while ((info=reader.readLine()) != null) {
            System.out.println(info);
        }

        // 通过反射运行编译好的类
        try {
            URL[] urls = new URL[] {new URL("file:/" + "Users/lujiafeng/GitRepositories/pattern/src/main/resources/")};
            URLClassLoader loader = new URLClassLoader(urls);
            Class c = loader.loadClass("HelloWorld");
            // 调用加载类的main方法
            Method m = c.getMethod("main", String[].class);
            m.invoke(null, (Object) new String[]{});
            //m.invoke(null, (Object) new String[]{"aa", "bb"});
            // 由于可变参数是JDK5.0之后才有，上面代码会编译成：m.invoke(null, "aa", "bb")，就发生了参数不匹配的问题
            // 因此，必须要加上(Object) 转型，避免这个问题

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
