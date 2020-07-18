package earth_OOP_Abrastraction;
// 21Specialist cook will override the resto of the menu (abstract method) from female class.. by inheritance method using extends keyword.
// THis cook Guy what his namee??
// 22. Now goto main method after inishing sout...

public class Specialist_Cook extends Female_Abstract {


    @Override
    public void biriyani() {
        System.out.println(CookguyName + " says, Master!! I can cook Haji Biriyani and also Hyderabadi Biriyani!!");
    }

    @Override
    public void shrimpCurry() {

        System.out.println(CookguyName + " also says, Master!! I am very expert making Shrimp Curry!");

    }
}
