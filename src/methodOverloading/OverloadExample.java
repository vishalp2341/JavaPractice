package methodOverloading;

//Method overloading in Java is a fundamental concept that allows a class to have more 
//than one method with the same name, provided their parameter lists are different.

public class OverloadExample {

    // Overloaded methods
    public void display() {
        System.out.println("No parameters");
    }

    public void display(int a) {
        System.out.println("Parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Parameters: " + a + ", " + b);
    }

    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        
        obj.display();
        obj.display(10);
        obj.display(10, 20);
        obj.display("Hello");
    }
}
