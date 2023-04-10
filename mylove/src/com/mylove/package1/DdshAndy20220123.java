package com.mylove.package1;

public class DdshAndy20220123 extends DdSh {
    //对象的组合   A类中的成员变量用B类的类名定义的，那么A类中的成员变量可以调用B类中的成员变量和方法。
    // 称A类的对象组合了（关联了）B类的对象
    //对象的组合与类的继承关系：对象的组合是显式调用has-is，继承是隐式调用。
    //对于父类与子类中的成员变量与成员方法重名的情况，在不使用super关键字的时候，调用的是子类中的成员变量与成员方法。使用this关键字的时候
    //使用super关键字的时候，调用的是父类中的成员变量与成员方法。super关键字可直接调用构造方法，不用写构造方法名（类名）
    //延伸：this关键字，调用的是成员变量，使用范围是实例方法和构造方法中，不能在类方法中使用。
    //多态包括方法的重载和覆盖。
    //方法的重载：一个类中，方法名相同，形参的个数，类型，类型顺序不同，有无返回值无所谓。



    public static void main(String[] args) {
        DdshAndy20220123 ddshAndy =new DdshAndy20220123();
        ddshAndy.fangFa1(2,3);//子类继承父类的方法
        int a;
        a=ddshAndy.fangFa();//子类继承父类的方法
        System.out.println(a);



    }














}
