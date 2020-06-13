package inheritenceOne;

public class GirlFriend extends Teacher {
	
	String FavoriteCloth;
	String Hobby;
	int BankBalance;
	
	void displayInformation3 (){
		displayInformation1();
		displayInformation2();
		System.out.println("Favorite Cloth :" +FavoriteCloth);
		System.out.println("Hobby :" +Hobby);
		System.out.println("Bank Balance :" +BankBalance);
		
	}
	

}
