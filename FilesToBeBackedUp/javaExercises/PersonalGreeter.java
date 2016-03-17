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
    public static void sayHi() {
        System.out.println("Greetings!!");
    }
}

public class RobotGreeter {
    public static void main (String[] args) {
        PersonalGreeter.sayHi();
    }
}
