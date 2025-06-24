package objectExercise;

public class Property {
	
	private String buildingName;
	private String owner;
	private String type;
	private int price;
	
	Property(String buildingName, String owner, String type, int price){
		this.buildingName = buildingName;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public void output() {
		System.out.println("=============================");
		System.out.println("物件名: " + this.buildingName );
		System.out.println("物件所有者名: " + this.owner );
		System.out.println("物件種別: " + this.type );
		System.out.println("物件価格: " + this.price + "円");
	}
	
}
