package BasicReview;

/**
 * 1.abstract 可以修饰那些结构？修饰后，有什么特点？
 * 类、方法。
 * 类：不能实例化，提供子类
 * 方法：只定义了功能标准，具体执行需要子类实现
 *
 * 2.接口（成员变量只能是常量，成员方法只能抽象，类可以多继承接口
 *）是否能继承接口？抽象类是否能实现接口？抽象类是否
 * 能继承非抽象的类？
 * 能；
 * 能；
 * 能；object
 *
 * 3.声明抽象类，并包含抽象方法（强制要求子类做的）和
 * 非抽象方法（子类继承的），测试类中创建一个继承抽象类的
 * 匿名子类对象
 * abstract或interface或普通类 AA{
 *     public abstract void m();
 * }
 * main(){
 *     AA a = new AA(){这里的AA为抽象类或接口名
 *         public void m(){
 *             ...
 *         }
 *     }
 * }
 *
 * 4.抽象类和接口相同和不同？
 * 相同：不能实例化，都可以被继承
 *
 * 不同：抽象类有构造器，接口不能；
 * 抽象类单继承，接口多继承；
 *
 *
 * 5.如何创建静态成员内部类和非静态成员内部类的对象？
 * Outier.Inner a = new Outier.Inner();
 *
 * Person p = new Persion();
 * p.Inner i = p.new Inner();
 */
public class BasicReview {
    public static void main(String[] args) {

    }
}
