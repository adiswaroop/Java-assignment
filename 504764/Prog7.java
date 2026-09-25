interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class MyClass implements B {
    @Override
    public void methodA() {
        System.out.println("Hello from method A");
    }

    @Override
    public void methodB() {
        System.out.println("Hello from method B");       
    }
}

public class Prog7 {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.methodA();
        myclass.methodB();
    }
}