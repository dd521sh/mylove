package com.mylove.package1;

public class DdSh {
    int A = 3;//常量名每个字母都大写a
    int b;


    public DdSh() {
        b = 4;
    }     //构造方法等于类名，可以有形参，可以无形参。
    // 构造方法不能被对象调用，只能在实例化new时调用
    // 构造方法，不自主不声明的话，自动创建构造方法对成员变量初始化。构造方法无返回值。

    public int fangFa() {
        A = A * A;
        return A;
    }                     //类名的每个单词的首字母要大写，方法名第一个单词的首字母小写，其他单词的首字母大写。

    public void fangFa1(int a, double b) {
        System.out.println(a * b);
    }                                       //a b 为形参

    DdSh anDy;//变量名的第一个单词的首字母小写，其他单词的首字母大写。引用变量的默认值为null。
    DdSh andySys;//引用变量，定义方式为类名当做类型，后边加变量名，类似于对象的声明，但未创建实例化。

    public static void main(String[] args) {
        DdSh andy;//对象的声明，无创建实例化
        andy = new DdSh();//对象的创建实例化
        DdSh andyDdsh = new DdSh();
        andyDdsh.b = 9;
        int b;
        //System.out.println(anDy.a);
        b = andy.A;
        int a1;
        a1 = andy.A;
        //System.out.println(b);
        //System.out.println(a1);
        //a1=anDy.fangFa();
        andy.fangFa1(2, 3);//2，3实参。
        andy.fangFa1(2, 3.3);//方法的重载需要学习。
        //System.out.println(a1);
        //System.out.println(anDy.anDy);
        //System.out.println(anDy.anDySys);


    }
}