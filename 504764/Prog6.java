@FunctionalInterface
interface Greeting {
    abstract void sayHello(String name);
}

public class Prog6 {
    public static void main(String[] args) {
        Greeting innerGreeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello from the inner class Intialization gives: Hello "+ name);
            }
        };

        Greeting lambdaGreeting = (name) -> {
            System.out.println("Hello from the lambda Intialization gives: Hello "+ name);
        }; 
        
        innerGreeting.sayHello("Aditya");
        lambdaGreeting.sayHello("Aditya");
    }
}

