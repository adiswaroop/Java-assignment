interface Calculator {
    abstract int operate(int a, int b);
    static int add(int a, int b) {
        return a+b;
    }
}

class Adder implements Calculator {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

public class Prog5 {
    static public void main(String[] args) {
        Adder adder =  new Adder();
        System.out.println("Static method called via Interface name gives: "+ Calculator.add(1, 2));
        System.out.println("Abstract method called via object gives: "+ adder.operate(1, 2));
    }
}