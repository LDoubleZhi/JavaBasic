package Chapter16_exception.DesignMode;

import java.time.Instant;

/**设计模式：
 * 1.设计模式与单例设计模式
 * 设计模式：大量实践总结和理论化后优选的代码结构、
 * 、编程风格、以及解决问题的思考方式。
 * 单例设计模式：对某个类之只能存在一个对象实例，且该
 * 类只提供一个取得其对象实例的方法。
 * 构造函数设置为private，就只能在类内部定义。
 * 由类内部的静态方法来返回该对象（静态方法只能
 * 访问类中静态成员变量，所以变量也要定义为静态的）
 *
 * 2.饿汉模式
 *public class DesignMode {
 *     public static void main(String[] args) {
 * //        Bank b = new Bank();私有后不能构建
 *         Bank bank1 = Bank.getInstance();
 *     }
 * }
 *
 * class Bank{
 *     private Bank(){}
 *     private static Bank instance = new Bank();
 *     public static Bank getInstance()
 *     {
 *         return instance;
 *     }
 *
 * }
 *
 * 3.懒汉模式
 *public class DesignMode {
 *     public static void main(String[] args) {
 * //        Bank b = new Bank();私有后不能构建
 *         Bank bank1 = Bank.getInstance();
 *     }
 * }
 *
 * class Bank{
 *     private Bank(){}
 *     //先声明类对象实例，不初始化
 *     //static变量随类加载，被所有对象共享
 *     private static Bank instance = null;
 *     public static Bank getInstance()
 *     {
 *         if(instance == null)
 *             instance = new Bank();//防止多次开堆空间
 *         return instance;
 *     }
 *
 * }
 *
 * 4.懒汉饿汉的区别：对比
 * 饿汉：对象生命周期过长，线程安全
 * 懒汉：延迟对象创建，目前写法线程不安全（
 * 如两个线程都同时调用getInstance（））——》多线程
 *
 *
 * 5.单例模式的使用场景
 * 只生成一个实例，减少了系统性能开销，当一个对象的产生
 * 需要比较多的资源时候，比如读取配置，则可以通过在应用
 * 启动时直接产生一个单例对象，然后永久驻留内存
 * java.lang.Runtime类就是单例模式
 *
 * 场景：网站计数器，应用程序的日志应用，数据库链接池
 * 读取配置文件的类；Application；win的任务管理器
 * win的回收站：只维护一个实例
 *
 *
 * 6.模板方法设计模式（多态的应用）
 *抽象类作为多个子类的通用模板，子类在保有抽象类行为
 * 的同时自己由各自扩展
 * 解决的问题：
 * （1）功能内部一部分确定，一部分不确定，把不确定的暴露
 * 出去，让子类实现
 * （2）常用的有，数据库访问封装；junit单元测试；
 * javaweb的servlet关于doGet/doPost方法调用；
 * Spring中JDBCTemiate等
/*public class DesignMode {
    public static void main(String[] args) {
//        Bank b = new Bank();私有后不能构建
        Bank bank1 = Bank.getInstance();
    }
}

class Bank{
    private Bank(){}
    private static Bank instance = new Bank();
    public static Bank getInstance()
    {
        return instance;
    }

}*/
public class DesignMode {
    public static void main(String[] args) {
//        Bank b = new Bank();私有后不能构建
        Bank bank1 = Bank.getInstance();
    }
}

class Bank{
    private Bank(){}
    //先声明类对象实例，不初始化
    //static变量随类加载，被所有对象共享
    private static Bank instance = null;
    public static Bank getInstance()
    {
        if(instance == null)
            instance = new Bank();//防止多次开堆空间
        return instance;
    }

}