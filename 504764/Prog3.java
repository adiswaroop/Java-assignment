interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable,Showable {
    String s;

    Document(String s) {
        this.s = s;
    }
 
    @Override
    public void print() {
        System.out.println("Printed from Printable method: " + this.s);
    }

    @Override
    public void show() {
        System.out.println("Printed from Showable Class: "+ this.s);
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Document d = new Document("Aditya");
        d.print();
        d.show();

        // A printable reference to the document object
        Printable p = d;
        p.print();
        // p.show() will cause error because Printable class does not define the show method
    }
}