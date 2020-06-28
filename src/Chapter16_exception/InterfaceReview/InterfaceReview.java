package Chapter16_exception.InterfaceReview;

/**接口复习：
 *1.interface定义
 * 2.jdk7以前，只能定义全局变量和抽象方法
 *   jdk8：除了这些还可以定义静态方法、默认方法
 * 3.接口中不能定义构造器，但可以实例化
 * 4.接口通过类去实现
 * 5.可以实现多接口，弥补了单继承的局限性
 * implements C，D，E
 * 6.接口和接口之间也可以多继承
 *
 *
 * 二。Java8中关于接口的新规范：
 * 1.接口中定义的静态方法，只能通过接口调用
 * 2.通过实现类的对象调用接口中的默认方法
 * 3.如果子类继承的父类和接口中声明了同名同参数的默认方法
 * 那么在子类没重写的情况下，默认调用父类方法
 * 4.子类实现的多个接口中有同名同参数的默认方法，
 * 子类没重写就报错，所以--必须重写--
 * 5.在子类方法中调用父类、接口中被重写的方法
 * method() 自己定义的重写方法
 * super.method();  父类方法
 * 接口名.super.mothod(); 接口的默认方法
 *
 * 三.面试题
 * 抽象类和接口的异同：
 * 相同：不能实例化；都可以包含抽象方法；
 * 不同：抽象类有构造器，接口没有；
 * 接口：全局变量，抽象方法，静态方法，默认方法
 * 类：单继承   接口：多继承   类与接口：多实现
 *
 */
public class InterfaceReview {
    public static void main(String[] args) {

    }
}