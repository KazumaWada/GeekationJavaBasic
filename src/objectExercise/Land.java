package objectExercise;

public class Land extends Property{
	private double wide;
	
	Land(String buildingName, String owner, String type, int price, double wide){
		super(buildingName, owner, type, price);
		this.wide = wide;
	}
	
	public void output() {
		super.output();
		System.out.println("広さ: " + this.wide + "㎡");
		System.out.println("=============================");
	}
}
