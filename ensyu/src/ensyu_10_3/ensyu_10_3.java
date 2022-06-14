package ensyu_10_3;
import java.util.Scanner;

public class ensyu_10_3 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("二値の値を入力せよ。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		int doubleFirstNumber = scanner.nextInt();
		// 出力
		System.out.print("y：");
		// 変数に代入
		int doubleSecondNumber = scanner.nextInt();
		// 出力
		System.out.println("二値の最小値は" + MinMax.doubleMin(doubleFirstNumber, doubleSecondNumber) + "です。");
		// 出力
		System.out.println("二値の最大値は" + MinMax.doubleMax(doubleFirstNumber, doubleSecondNumber) + "です。");
		
		// 出力
		System.out.println("三値の値を入力せよ。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		int tripleFirstNumber = scanner.nextInt();
		// 出力
		System.out.print("y：");
		// 変数に代入
		int tripleSecondNumber = scanner.nextInt();
		// 出力
		System.out.print("z：");
		// 変数に代入
		int triplethirddNumber = scanner.nextInt();
		// 出力
		System.out.println("三値の最小値は" + MinMax.tripleMin(tripleFirstNumber, tripleSecondNumber, triplethirddNumber) + "です。");
		// 出力
		System.out.println("三値の最大値は" + MinMax.tripleMax(tripleFirstNumber, tripleSecondNumber, triplethirddNumber) + "です。");
		
		// 出力
		System.out.print("配列の要素数：");
		// 変数に代入
		int elementNumber = scanner.nextInt();
		// 配列の宣言
		int[] array = new int[elementNumber];
		// 	入力ループ
		for (int i = 0; i < array.length; i++) {
			// 出力
			System.out.print("array[" + i + "] = ");
			// 配列に代入
			array[i] = scanner.nextInt();
		}
		// 出力
		System.out.println("配列の最小値は" + MinMax.arrayMin(array) + "です。");
		// 出力
		System.out.println("配列の最大値は" + MinMax.arrayMax(array) + "です。");
	}
	
}