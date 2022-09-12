package day43_abstraction.learning;

public class AppleStore {
    public static void main(String[] args) {
        // everything I can access without any class, directly from the interface - I was able to access these because they were static
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();
        Desktop desktop = new Desktop();
        desktop.turnOn();
//        desktop.typing();  cannot access the static memebers from the classes that implement that interface.
        //only access static members of an interface by the interface
        

    }
}
