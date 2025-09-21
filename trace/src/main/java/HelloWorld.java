package td3;

public class HelloWorld {

    // Méthode sans paramètre
    public String hello() {
        return "Hello World!";
    }

    // Méthode avec un paramètre
    public String hello(String message) {
        return message;
    }

    // Méthode main pour tester rapidement
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();

        // Test sans paramètre
        System.out.println(hw.hello());

        // Test avec paramètre
        System.out.println(hw.hello("Bonjour!"));
    }
}
