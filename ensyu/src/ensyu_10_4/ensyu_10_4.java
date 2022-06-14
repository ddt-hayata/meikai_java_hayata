/*
 * 日付クラス台版を以下のように改良せよ。
 * ・引数を受け取らないコンストラクタによるインスタンスの生成時は、
 * 西暦1年1月1日で初期化するのではなく、プログラム実行時の日付で初期化する。
 * ・引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する。
 * (たとえば、13月→12月、9月31→9月30日に調整する。)
 * さらに、以下に示すメソッドを追加すること。
 * ・年内での経過日数(その年の元旦から数えて何日目であるか)を示すメソッド
 * ・年内の残り日数を求めるメソッド
 * ・他の日付との前後関係を判定するインスタンスメソッド
 * ・他の日付との前後関係を判定するクラスメソッド
 * ・日付を一つ後ろに進めるメソッド
 * ・次の日の日付を返すメソッド
 * ・日付を一つ前に戻すメソッド
 * ・前の日の日付を返すメソッド
 * ・日付をn日後ろに進めるメソッド
 * ・n日後の日付を返却するメソッド
 * ・日付をn日前に戻すメソッド
 * ・n日前の日付を返却するメソッド
 */
package ensyu_10_4;
import java.util.Scanner;

public class ensyu_10_4 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// インスタンス化
		Day firstDate = new Day();
		
		// 出力
		System.out.println(firstDate.toString());
		// 出力
		System.out.println(firstDate.toString()	 + "は" + firstDate.getYear() + "年の1月1日から" + firstDate.elapsedDays() + "日です。");
		// 出力
		System.out.println(firstDate.toString()	 + "の今年の残り日数は" + firstDate.remainderDays() + "日です。");
		// 改行文の出力
		System.out.println("");
		// 出力
		System.out.println("次の日は" + firstDate.getAdvanceDay() + "です。");
		// 出力
		System.out.println("前の日は" + firstDate.getReturnDay() + "です。");
		// 改行文の出力
		System.out.println("");
		// 出力
		System.out.println("好きな年月日を入力してください。");
		// 出力
		System.out.print("年：");
		// 変数に代入
		int year = scanner.nextInt();
		// 出力
		System.out.print("月：");
		// 変数に代入
		int month = scanner.nextInt();
		// 出力
		System.out.print("日：");
		// 変数に代入
		int date = scanner.nextInt();
		// インスタンス化
		Day secondDate = new Day(year, month, date);
		// 出力
		System.out.println(secondDate.toString());
		// 改行文の出力
		System.out.println("");
		// 出力
		System.out.print("何日進めますか？：");
		int advanceDays = scanner.nextInt();
		// 出力
		System.out.println(advanceDays + "日進めた日は" + secondDate.getAdvanceDays(advanceDays) + "です。");
		// 出力
		System.out.print("何日戻しますか？：");
		int returnDays = scanner.nextInt();
		// 出力
		System.out.println(returnDays + "日戻した日は" + secondDate.returnDays(returnDays) + "です。");
		
		// インスタンスメソッドを呼び出し、その結果をもとに出力
		if (firstDate.contextDays(secondDate) == 1) {
			// 出力
			System.out.println(firstDate.toString() + "は" + secondDate.toString() + "よりも前です。");
		} else if (firstDate.contextDays(secondDate) == 2) {
			// 出力
			System.out.println(firstDate.toString() + "は" + secondDate.toString() + "と同じです。");
		} else if (firstDate.contextDays(secondDate) == 3) {
			// 出力
			System.out.println(firstDate.toString() + "は" + secondDate.toString() + "よりも後です。");
		}
	}
}
