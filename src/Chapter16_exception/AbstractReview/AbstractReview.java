package Chapter16_exception.AbstractReview;

/**
 * 复习 抽象类：
 *1.可以修饰：类、方法
 * 修饰类：抽象类，不能实例化；一定有构造函数，便于子类构造；
 * 开发中，由子类实例化；
 *
 * 抽象方法：只有声明没有方法体；包含抽象方法一定是抽象类，
 * 反之，则不一定；子类重写素有抽象方法后才可以实例化，反之
 * 则子类也是一个抽象类，需要abstract修饰
 *
 * 2.注意点
 * abstract 不能修饰：属性；构造器等
 * abstract不能修饰私有方法、静态方法（不能被重写）、
 * final方法、final类
 */
public class AbstractReview {
    public static void main(String[] args) {
        //io stream：InputStream/OutputStream
        //内部定义了抽象的read和write方法，由子类具体阵地实现
        //
    }
}
