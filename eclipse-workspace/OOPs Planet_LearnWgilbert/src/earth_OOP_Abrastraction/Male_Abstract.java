package earth_OOP_Abrastraction;
// ** Previously we discussed about inheritance class through extends keyword.
// 1. Lets take 3 Variables
// 2. Now put 4 cooking methods inside the male class.. What was our menu?? BoiledEgg, ThaiSoup, Biriyani and ShrimpCurry
// 3. declare some object name in the main method for male, female and cookGuy.
// 5. goto main method..
//14. AS male don't know cooking other menu.. lets put others in a abstract method
//15. But the problem while we are putting abstract keyword it is showing error..
//16. REMEMBER we cannot use body in a abstract method... never and ever... remove body and use ;
//17. and we cannot use abstract method in non abstract class. class must be asbtract..
//18 but we can use non abstract method in abstract class.. i.e. male can cook boilEGG in abstract class..
//

public abstract class Male_Abstract {
    String MaleName;
    String FemaleName;
    String CookguyName;

    public void boiledEgg() {
        System.out.println(MaleName + " says, I can only boil egg.. but nothing else.. ");
    }

    public abstract void thaiSoup(); //abstract method

    public abstract void biriyani(); //abstract method

    public abstract void shrimpCurry(); //abstract method

}