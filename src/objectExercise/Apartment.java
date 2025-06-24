package objectExercise;

public class Apartment extends Property{
	private int layout;
	
	Apartment(String buildingName, String owner, String type, int price, int layout){
		super(buildingName, owner, type, price);
		this.layout = layout;
	}
	
	 public void output(){
		super.output();
		System.out.println("間取り: " + layout + "LDK");
		System.out.println("=============================");
	}

}

