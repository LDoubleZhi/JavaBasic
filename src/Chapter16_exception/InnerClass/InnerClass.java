package Chapter16_exception.InnerClass;

/**内部类：编译以后都会生成字节码文件
 * 成员内部类：外部类$内部类名.class
 * 局部内部类：外部类$数字 内部类名.class
 * 1.分类
 * 成员内部类：静态、非静态
 * 局部内部类：方法内，代码块内，构造器内
 * 2.成员内部类的理解：
 * 一方面，作为外部类的成员：调用外部类的结构；可以被static修饰
 * 可以被4中不同权限修饰
 * 另一方面，作为一个类：类内可以定义属性、方法、构造器；
 * 可以被final修饰，表示此类不能被继承；可以被abstract修饰
 * 3.成员内部类：
 *3.1如何创建成员内部类的对象？
 * Person.Dog dog= new Person.Dog();//静态内部类
 *
 * Person p = new Person();
 * Person.Dog d = p.new Dog();//非静态
 *
 * 3.2成员内部类，方法外部类结构
 * 属性：
 * name   //方法形参
 * this.name  //内部类属性
 * Person.this.name //外部类属性
 *
 * Person.this.eat()//内部类方法
 *
 * 4.局部内部类注意点：
 * 4.1在局部内部类的方法中，如果调用局部内部类所
 * 声明方法中的局部变量的话，要求此局部变量声明为
 * final；jdk8不需要显式声明为final，不能改。
 *
 *
 */
public class InnerClass {
}
