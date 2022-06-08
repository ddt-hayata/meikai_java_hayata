/*
 * 演習8-1で作成した《人間クラス》に、誕生日フィールドとtoStringメソッドを追加せよ。
 * ※コンストラクタを変更したり、誕生日ゲッタなどのメソッドを追加したりすること。
 */
package ensyu_9_4;

public class ensyu_9_4_main {

	public static void main(String[] args) {
		// インスタンス化
		Day birthday1 = new Day(2000, 10, 20);
		// インスタンス化
		Day birthday2 = new Day(1990, 1, 31);
		// インスタンス化
		Human person1 = new Human("佐藤", 30, 170, 65, birthday1);
		// インスタンス化
		Human person2 = new Human("鈴木", 40, 171, 70, birthday2);
		
		// 出力
		System.out.println(person1.getName() + "さん");
		// 出力
		System.out.println(person1.getAge() + "歳");
		// 出力
		System.out.println(person1.getHeight() + "cm");
		// 出力
		System.out.println(person1.getWeight() + "kg");
		// 出力
		System.out.println(person1.getBirthday().toString());
		
		// 出力
		System.out.println(person2.getName() + "さん");
		// 出力
		System.out.println(person2.getAge() + "歳");
		// 出力
		System.out.println(person2.getHeight() + "cm");
		// 出力
		System.out.println(person2.getWeight() + "kg");
		// 出力
		System.out.println(person2.getBirthday().toString());
	}

}
