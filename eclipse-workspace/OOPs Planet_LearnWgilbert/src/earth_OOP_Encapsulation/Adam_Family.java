package earth_OOP_Encapsulation;
// 1. Lets  create 3 private variables inside the class
// 2. we have to use private keyword or making these variables private.. '
// 3. These private variables cannot be called from out side of the class..
// 4. If we want to call the private variables outside of the class then we have to go through the getter and setter formula..
// 5. right click then click generate..then click getter and setter.. see all thing are locked.. select all and bring here..
// 6. go to main class
public class Adam_Family {

    private String Name;
    private int Age;
    private String Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }




}

