// BLUEPRINT

public class Dog {  // class names should be CAPITALIZED
    
   private String bark, furColor, eyeColor; // Instance variables
   private int age;
    
    public Dog() {   // This is a CONSTRUCTOR!--instructions how to CREATE a Dog
        bark = "woof";
        furColor = "brown";   // variable names should be camelCase
        eyeColor = "blue"; // These are also known as properties, or attributes
        age = 6;
    }
    public Dog (String dogBark, String dogFurColor, String dogEyeColor, int dogAge) { // arguments give more specifity in DogDriver class
        bark = dogBark;
        furColor = dogFurColor;
        eyeColor = dogEyeColor;
        age = dogAge;
        
    }
     
    public String bark() {  // Accessive methods...also a GETTER to 'private' variables in Dog class
        return bark; // gives/returns value of variable bark -- which would be 'woof'
    }
    public String eyeColor() {  // This is called a GETTER...aka METHOD
        return eyeColor;
    }
    public void setAge(int dogAge) { // This is a SETTER ...this does NOT return anything, just SETS something...aka METHOD
        age = dogAge;
    }
    public int getAge() {  // This is a GETTER...aka METHOD
        return age;
    }
}