/*
 * 図形クラス群をテストするプログラムを作成せよ。
 * List13-9と同じく、Shape型の配列を利用して、インスタンスの生成と表示を行うこと。
 * ただし、個々の要素が参照するインスタンスは、プログラム内で与えるものではなく、
 * キーボードから読み込むようにすること。
 */
package ensyu_13_2;

import java.util.Scanner;

public class ensyu_13_2 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 出力
		System.out.print("図形は何個：");
		// 入力値を代入
		int arrayNumber = scanner.nextInt();
		// 配列の宣言
		Shape[] shapeArray = new Shape[arrayNumber];
		
		// 図形の個数分、なんの図形か選択
		for (int i = 0, j = 1; i < arrayNumber; i++, j++) {
			// 出力
			System.out.print
			(j + "番の図形の種類（1…点 / 2…水平直線 / 3…垂直直線 /"
				+ " 4…長方形 / 5…直角二等辺三角形(左下直角) / 6…直角二等辺三角形(左上直角) /"
				+ " 7…直角二等辺三角形(右下直角) / 8…直角二等辺三角形(右上直角)）：");
			// 入力値を代入
			int shapeNumber = scanner.nextInt();
			
			if (shapeNumber == 1) {
				// インスタンス化
				shapeArray[i] = new Point();
			} else if (shapeNumber == 2) { 
				// 出力
				System.out.print("長さ：");
				// 入力値を代入
				int horzLineLength = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new HorzLine(horzLineLength);
			} else if (shapeNumber == 3) {
				// 出力
				System.out.print("長さ：");
				// 入力値を代入
				int virtLineLength = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new VirtLine(virtLineLength);
			} else if (shapeNumber == 4) {
				// 出力
				System.out.print("幅：");
				// 入力値を代入
				int rectangleWidth = scanner.nextInt();
				// 出力
				System.out.print("高さ：");
				// 入力値を代入
				int rectangleHeight = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new Rectangle(rectangleWidth, rectangleHeight);
			} else if (shapeNumber == 5) {
				/// 出力
				System.out.print("高さ：");
				// 入力値を代入
				int bottomLeftHeight = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new BottomLeftTriangle(bottomLeftHeight);
			} else if (shapeNumber == 6) {
				/// 出力
				System.out.print("高さ：");
				// 入力値を代入
				int topLeftTriangleHeight = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new TopLeftTriangle(topLeftTriangleHeight);
			} else if (shapeNumber == 7) {
				/// 出力
				System.out.print("高さ：");
				// 入力値を代入
				int bottomRightTriangleHeight = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new BottomRightTriangle(bottomRightTriangleHeight);
			} else if (shapeNumber == 8) {
				/// 出力
				System.out.print("高さ：");
				// 入力値を代入
				int topRightHeight = scanner.nextInt();
				// インスタンス化
				shapeArray[i] = new TopRightTriangle(topRightHeight);
			}
		}
		
		// Shapeクラスのprintメソッドの呼び出し
		for (Shape s : shapeArray) {
			s.print();
			System.out.println();
		}
	}
}
