package earth_OOP_Polimorphism;
// 3. --> now extends female to boy
//9. Paste the copied method
public class Female extends Male{

    @Override
    public void ConsumeByMouth() {
        System.out.print("My name is " + name);
        System.out.print(", My favorite food is " + FavoriteFood);
        System.out.println(", I love to Eat my " + FavoriteFood + " by  " + WayToEat);
    }


}
