package com.mylove.package1;

public class HelloWorld {
    int A;//实例变量
    static int a3;
    static int a1=4;//类变量，静态变量 有static修饰的为类变量，其他全为实例变量。
    int a2=7;
    HelloWorld hello;//引用数据类型 用类名定义的数据形式，默认组为null 空  对象的声明。还未实例化new。


    HelloWorld(int f1){
        a2=5;a3=5;
    }//构造方法对成员变量初始化。构造方法无返回值。可以有形参，可以无形参。

    HelloWorld(){
        a2=5;a3=6;
    }//构造方法对成员变量初始化。构造方法无返回值。

    static void helloDdsh(){

    }//使用satic关键字声明的方法称为静态方法，或者类方法，其他无static的全部为实例方法。可以用类名直接调用。实例方法需要用实例出来的对象名调用
    //类方法不能直接调用实例变量（实例变量需要new出来，需要对象名调用，不能用类名调用。）
    final float DOUBLE_CIRCLE =3.1415f;//final 定义为常量。常量名全部大写，如果多个单词组合那个用下划线隔开。______
    final Double E=5.4,F=6.4,G=8.4,H=7D;
    long i=3;
    char j='沐';
    boolean k=true;

    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println(1/0.0);//sout输出的快捷组合键
        HelloWorld hello;//引用数据类型 用类名定义的数据形式，默认组为null 空  对象的声明。
        HelloWorld hello1;
        hello=new HelloWorld();//对象的实例化 new 构造方法名等于类名。
        hello1=new HelloWorld(6);//对象的实例化 new 构造方法名等于类名。这个有形参。
        //hello.HelloWorld(7);构造方法不能被对象调用，只能在实例化new时调用。
        hello.a3=4;
        hello.A=5;
        int a0;
        a0=hello.a2;//为什么通过实例化出来的对象调用成员变量的时候必须赋初值？因为需要一个命名的参数接受成员变量的值。

        //int[][] shuzu = new int[2][3];
        //shuzu[0][0] = 10;
        // int i = 5;

        //System.out.println("hello world, i am ddshsandy");
        //System.out.println("hello world, \\i am ddshsandy");
        /*if (i > 3) {
               System.out.println("i>3");
            } else if (i == 3) {
               System.out.println("i=3");
            } else {
               System.out.println("i<3");
            }*/

        /*switch (3) {
            case 1:
                System.out.println("i!=3");
            case 2:
                System.out.println("i!=2");
            case 3:
                System.out.println("i=2");

        }*/
        /*int p=0;
      for(int q=1;q<=10;q++){p=p+q;
        }
        System.out.println(p);
        int sum=0;
        int sum1=1;
       while (sum1<11){sum=sum+sum1;sum1++;
        }
        System.out.println(sum);
        do {sum=sum+sum1;sum1++;
        }while (sum1<11);
        System.out.println(sum);*/

    }//psvm主方法的快捷输入组合键
















}
