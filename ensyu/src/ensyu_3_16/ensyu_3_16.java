package ensyu_3_16;

import java.util.Scanner;

public class ensyu_3_16 {
	
	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数a：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("整数b：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("整数c：");
		
		// 変数に代入
		int thirdNumber = scanner.nextInt();
		
		if (firstNumber < secondNumber && firstNumber < thirdNumber) {
			
			// コンソールに出力
			System.out.println(firstNumber);
			
			if (secondNumber < thirdNumber) {
				
				// コンソールに出力
				System.out.println(secondNumber);
				
				// コンソールに出力
				System.out.println(thirdNumber);
				
			} else {
				
				// コンソールに出力
				System.out.println(thirdNumber);
				
				// コンソールに出力
				System.out.println(secondNumber);
			}
			
		} else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
			
			// コンソールに出力
			System.out.println(secondNumber);
			
			if (firstNumber < thirdNumber) {
			
				// コンソールに出力
				System.out.println(firstNumber);
				
				// コンソールに出力
				System.out.println(thirdNumber);
							
			} else {
							
				// コンソールに出力
				System.out.println(thirdNumber);
				
				// コンソールに出力
				System.out.println(firstNumber);
			}
			
		} else if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
			
			// コンソールに出力
			System.out.println(thirdNumber);
					
			if (firstNumber < secondNumber) {
			
				// コンソールに出力
				System.out.println(firstNumber);
				
				// コンソールに出力
				System.out.println(secondNumber);
						
			} else {
						
				// コンソールに出力
				System.out.println(secondNumber);
				
				// コンソールに出力
				System.out.println(firstNumber);
			}
			
		}
		// コンソールに出力
		System.out.println("昇順(小さい順)にソートしました。");
		
	}
	
}