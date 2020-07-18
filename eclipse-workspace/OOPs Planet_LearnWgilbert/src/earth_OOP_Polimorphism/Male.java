package earth_OOP_Polimorphism;

public class Male {
    // 1. --> First take some variables
    // 2. --> now extends male to the female..
    String name;
    String FavoriteFood;
    String WayToEat;

    // 4. --> create a method inside of the class

    public void ConsumeByMouth() {
        System.out.print("My name is " + name);
        System.out.print(", my favorite food is " + FavoriteFood);
        System.out.println(", and I love to "+WayToEat + " "+FavoriteFood+".");
    }

}


