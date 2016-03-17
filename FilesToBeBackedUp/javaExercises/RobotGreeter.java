/*public class Greeter {
    public static void main (String[] args) {
        System.out.println("Hello World!!"); 
    }
}
*/

/*public class Practice {
    public static void main (String[] args) {
        System.out.println("Greetings!");
    }
}
*/

class PersonalGreeter {
    public static void sayHi(String who) {
        System.out.println("Greetings " + who + "!!");
    }
}

public class RobotGreeter {
    public static void main (String[] args) {
        PersonalGreeter.sayHi("Spike");
        PersonalGreeter.sayHi("Buffy");
    }
}
