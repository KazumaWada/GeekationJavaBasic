package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num = 1;
		while(num <= 100) {
			if(num % 3 == 0 && num % 5 ==0)System.out.println("FizzBuzz");
		    else if(num % 3 == 0) System.out.println("Fizz");
			else if(num % 5 ==0) System.out.println("Buzz");
			else System.out.println(num);
			num++;
		}
		
		String[] langList = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for(String lang: langList) {
			if(lang == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}
			else if(lang == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}
			else System.out.println(lang);
		}
	}

}
