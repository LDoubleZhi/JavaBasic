package Chapter16_exception.Section06;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * 异常概述和体系结构：
 * 一.概述：
 *开发过程中比如 客户输入数据的格式，读取文件是否存在等
 * 问题是不能靠代码避免的；
 * 异常：java中，将程序执行中发生的不正常情况被称为“异常”。
 * （语法错误和逻辑错误不是异常）
 * 分为两类：
 * Error：java虚拟机无法解决的严重问题。比如栈溢出S
 * tackOverflowError，堆溢出OutOfMemory
 * Exception：编程或偶然的外在因素导致的一般性问题，可以
 * 用针对性代码处理
 *
 * 二.分类
 * 捕获错误最理想的是编译期间，但有的错误只在运行时出现
 * 比如除数为0，数据下标越界。
 * 分为：编译时异常和运行时异常
 *
 */
public class concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }

    @Test
    public void test1(){

//        int[] arr = new int[3];
//        System.out.println(arr[3]);
//        数组索引越界
//        java.lang.ArrayIndexOutOfBoundsException: 3

//        String str = "abc";
//        str = null;
//        System.out.println(str.charAt(0));
//        java.lang.NullPointerException

//        Object obj = new Date();
//        String str = (String)obj;
//        java.lang.ClassCastException

        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello----1");
//        java.lang.NumberFormatException
        }catch (NumberFormatException e){
//            System.out.println("出现数值转换异常");

//            For input string: "abc"
//            System.out.println(e.getMessage());

            e.printStackTrace();
        }

        finally{
            System.out.println("hello----2");
        }
//        出现数值转换异常
//        hello----2


    }

    @Test
    public void test2(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
//        java.lang.NumberFormatException
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }


    }

    @Test
    public void test5(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

    }

    @Test
    public void test6(){
        int a =10;
        int b= 0;
        int c = a/b;
//        java.lang.ArithmeticException

    }

    @Test
    public void test7(){
        try{
        File file = new File("Hello.txt");
        FileInputStream fis = new FileInputStream(file);
        //java.io.FileNotFoundException
        int data = fis.read();//java.io.IOException
        while(data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
