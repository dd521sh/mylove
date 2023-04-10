package com.mylove.package1;


    class Animal{
        int a=3;
        public void beat()
        {
            System.out.println("心脏跳动。。。");
        }
        public void breath()
        {
            beat();
            System.out.println("吸一口气，吐一口气，呼吸中。。。");
        }
    }
    class Bird{
        //将原来的父类组合到原来的子类，作为子类的一个组合成分。
        private Animal a;
        public Bird(Animal a)
        {
            this.a=a;
        }
        //重新定义一个自己的breath方法
        public void Breath()
        {
            //直接复用Animal提供的breath()方法来实现Bird的breath()方法。
            a.breath();
        }
        public void fly()
        {
            System.out.println("i can fly.");
        }
    }

    class Wolf{
        //将原来的父类组合到原来的子类，作为子类的一个组合成分。
        private Animal a;
        public Wolf(Animal a)
        {
            this.a=a;
        }
        //重新定义一个自己的breath方法
        public void Breath()
        {
            //直接复用Animal提供的breath()方法来实现Bird的breath()方法。
            a.breath();
        }
        public void run()
        {
            System.out.println("i can run.");
        }
    }

    public class CompositeTest {
        class  Animal1{
            String aaBbb="内部类";
            public void aaCCC(){
                System.out.println(aaBbb);
            }

        }
        public static void main(String [] args)
        {
            CompositeTest ddSh=new CompositeTest();
            CompositeTest.Animal1 animals=ddSh.new Animal1();
            animals.aaCCC();

            //此时需要显性创建被组合的对象。
            Animal a1 = new Animal();
            a1.breath();
            a1.beat();
            Bird b = new Bird(a1);
            b.Breath();
            b.fly();
            //此时需要显性创建被组合的对象。
            Wolf c = new Wolf(a1);
            c.Breath();
            c.run();


        }




}
