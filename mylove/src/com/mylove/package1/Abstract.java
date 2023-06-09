package com.mylove.package1;

public abstract class Abstract {
       //如果一个类继承了抽象类，那么父类抽象类里的所有的抽象方法都都需要被定义，否则这个继承的类也会变成抽象类。

       //即使没有任何抽象方法，一个类仍然可以被定义为抽象类，这种特点体现在我们不想让一个抽象类拥有任何的抽象方法，
       // 我们想禁止这个类的所有实例，这种特点的能力将会非常有用。
       //


       // 抽象方法，没有方法体，需要在子类中实现
       public abstract void myAbstractMethod();//无方法体，无大括号

    // 具体方法，实现了逻辑
    public void myConcreteMethod() {
        System.out.println("这是具体方法");
    }





}
