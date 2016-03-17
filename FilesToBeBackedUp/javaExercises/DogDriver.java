public class DogDriver {

    public static void main (String[] args) { // EXECUTES the code
        Dog corgi = new Dog("yip!", "black", "hazel", 11); // this OBJECT opens up Dog class and runs the code inside public Dog()
        System.out.println(corgi.bark()); // returns/prints woof from method bark() in Dog class
        System.out.println(corgi.eyeColor()); // returns/prints blue from method eyeColor in Dog class
        System.out.println(corgi.getAge());
        corgi.setAge(50);
        System.out.println(corgi.getAge());
    }
}