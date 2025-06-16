package basicSyntax;

public class ComparisonLogicalOperators {
	public static void main(String[] args) {
		int a = 8;
		int b = 18;
		boolean isGreaterA = (a<b);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean isNiceWeather = (isSunny && isWarm);
		
		int x = 1;
		int y = 8;
		boolean isValid = (0<x && y%2 == 0);
		
		boolean hasPermission = false;
		boolean oppositePermission = !hasPermission;
		
		
		System.out.println(isGreaterA);
		System.out.println(isNiceWeather);
		System.out.println(isValid);
		System.out.println(oppositePermission);
	}
}
