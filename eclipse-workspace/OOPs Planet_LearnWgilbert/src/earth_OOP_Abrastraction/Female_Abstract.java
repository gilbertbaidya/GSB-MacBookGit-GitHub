package earth_OOP_Abrastraction;
// 12. now we can create an object for the Female in the main method.
//13. but woman only know the thaiSoup cooking method.
//19. Override all method from male class and Make the class abstract now make override all other method except thaiSoup.
//20. As none of them can cook biriyani and Shrimp so,male and female going to manage Specialist cook.
import earth_OOP_Polimorphism.Female;

public abstract class Female_Abstract extends Male_Abstract{


    @Override
    public void thaiSoup() {
        System.out.println(FemaleName + " says, okay babe but I can cook only Thai Soup!");
    }

    @Override
    public abstract void biriyani();

    @Override
    public abstract void shrimpCurry();
}
