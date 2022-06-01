/*
 * 整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを
 * 確認するプログラムを作成せよ。
 */
package ensyu_7_11;
import java.util.Scanner;
public class ensyu_7_11 {
	/*
	 * 関数名：printBits
	 * 説明：int型のビット構成を表示するメソッド
	 * パラメータ：入力された整数値(number)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/5/30
	 */
	static void printBits(int number) {
		// 出力ループ
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((number >>> i & 1) == 1) ? '1' : '0');
		}
		// 改行文出力
		System.out.println();
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("整数x：");
		// 変数に代入
	    int number = scanner.nextInt();
	    // 出力
	    System.out.print("シフトするビット数n：");
	    // 変数に代入
	    int shiftNumber = scanner.nextInt();
	    // 出力
	    System.out.print("x = ");
	    // メソッドの呼び出し
	    printBits(number);
	    // 出力
	    System.out.print("\nx << n = ");
	    // メソッドの呼び出し
	    printBits(number << shiftNumber);
	    // 出力
	    System.out.print("\nx >> n = ");
	    // メソッドの呼び出し
	    printBits(number >> shiftNumber);
	    
	    // 乗算用変数
	    int multiplicationNumber = number;
	    // 除算用変数
	    int divisionNumber = number;
	    
	    // 乗算作成ループ
	    for(int i = 1; i <= shiftNumber; i++) {
	    	multiplicationNumber = multiplicationNumber * 2;
	    }
	    // 出力
	    System.out.print("\naの2のべき乗での乗算：");
	    // メソッドの呼び出し
	    printBits(multiplicationNumber);
	    
	    // 除算作成ループ
	    for(int i = 1; i <= shiftNumber; i++){
	    	divisionNumber = divisionNumber / 2;
	    }
	    System.out.print("\naの2のべき乗での除算：");
	    // 出力
	    printBits(divisionNumber);
	    // メソッドの呼び出し
	    System.out.println();
	}
}
