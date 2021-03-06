package main.java.learn.singleton;

/**
 * 饿汉模式  资源浪费
 *
 * @author zengqingquan
 * @date 2021/4/27 13:17
 */
public class Singleton5 {

    private static final Singleton5 instance = new Singleton5();

    private Singleton5() {
        System.out.println("Singleton5实例化");
    }

    public static Singleton5 getSingleton5() {
        return instance;
    }

    public static void  getTest(){
        System.out.println("22222");
    }
}
