package earth_OOP_Abrastraction;
// 4. go to the mail and print first method and make rest of the method and class Abstract.
// 6. From Main method we can easily create object and call male class and print them..
//7. But if we use the abstract keyword in male class then it will show error.
//8. go to Male class and make it abstract.. then play run.. its showing error..
//9. now ques. when we cannot call the class with abstract method then how we will use the main method..??
//10. Here we need to use the inheritence method by extends keywords..
//11. Now go to Female class..
//23. Create object for cookGuy
//24. now call all the methods in the main class.
//25. Now run.. and these the way abstract method and abstract class works..

public class Main {
    public static void main(String[] args) {

        Specialist_Cook obj = new Specialist_Cook();
        obj.MaleName = "Adam";
        obj.FemaleName = "Eve";
        obj.CookguyName = "Mr. Modon";

        obj.boiledEgg();
        obj.thaiSoup();
        obj.biriyani();
        obj.shrimpCurry();
    }

}
