package objectExercise;

public class Main {

	public static void main(String[] args) {		
		Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, 3);
		Land land = new Land("いい感じの土地", "山田 土地太郎", "土地", 80000000, 105.2);
		
		apartment.output();
		land.output();
	}
}

//出力結果
//=============================
//物件名：いい感じアパートメント
//物件所有者名：山田 マンション太郎
//物件種別：マンション
//物件価格：50000000円
//間取り：3LDK
//=============================
//=============================
//物件名：いい感じの土地
//物件所有者名：山田 土地太郎
//物件種別：土地
//物件価格：8000000円
//広さ：105.2㎡
//=============================

//Property < Apartment、Landをサブクラスに。
//全てのフィールド(Classが持つ変数)にgetter,setterの実装。























