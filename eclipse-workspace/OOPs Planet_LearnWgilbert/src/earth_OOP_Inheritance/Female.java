package earth_OOP_Inheritance;

// Automatically everything comes to female class.
// Now showing a method overriding from Male class
// after overriding female change the value of Gender.
// If we add super keyword infront of the variable then (like super.Gender) it will call from Male class
public class Female extends Male {

    String Gender = "girl";

    @Override
    public void kids() {

        System.out.println(su"Babe... I want a "+super.Gender);
        System.out.println("Babe... I want a "+Gender);




    }
}