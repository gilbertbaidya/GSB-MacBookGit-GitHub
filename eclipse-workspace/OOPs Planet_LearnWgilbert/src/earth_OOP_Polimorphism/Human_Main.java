package earth_OOP_Polimorphism;

//7. play run.. see boy is working or not.
//8. Copy (@ Override) male method to female and boy class
//11. put data into the object. male.Name = "Adams"
//12. call mehtod at the end of the putting value in the variables.
public class Human_Main {

    public static void main(String[] args) {

        Male male = new Male();
        male.name = "Adam";
        male.FavoriteFood = "Coffee";
        male.WayToEat = "Drink";
        male.ConsumeByMouth();

        Female female = new Female();
        female.name = "Eve";
        female.FavoriteFood = "Ice Cream";
        female.WayToEat = "licking";
        female.ConsumeByMouth();

        Boy boy = new Boy();
        boy.name = "TomTom";
        boy.FavoriteFood = "Chocklet";
        boy.WayToEat = "biting";
        boy.ConsumeByMouth();
    }

}
