package earth_OOP_Polimorphism;
// 5. Go to Main and create object named boy
//6. now call boy class to the main method
//9. pasted the copied method
//10. Now go to the main method and create male and female class object and can them from class to main method.
public class Boy extends Female{

    @Override
    public void ConsumeByMouth() {
        System.out.print("My name is " + name);
        System.out.print(", My favorite food is " + FavoriteFood);
        System.out.println(", I Eat my " + FavoriteFood + " by  " + WayToEat);
    }
}
