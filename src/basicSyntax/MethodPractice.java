package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 2;
		int b = 8;
		result(a,b);
	}
	

	public static int add(int a, int b) {
		return a + b;
	}
	public static int substract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int devide(int a, int b) {
		return a / b;
	}
	
	
	public static void result(int a, int b) {
		System.out.println("計算結果は" + add(a,b) + "です。");
		System.out.println("計算結果は" + substract(a,b) + "です。");
		System.out.println("計算結果は" + multiply(a,b) + "です。");
		System.out.println("計算結果は" + devide(a,b) + "です。");
	}
	
	

}
