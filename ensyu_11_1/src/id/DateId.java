package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {
	private static int counter;
	private int id;
	
	static {
		// GregorianCalendarクラスのインスタンス化
		GregorianCalendar today = new GregorianCalendar();
		// 変数に代入
		int year = today.get(YEAR);
		// 変数に代入
		int month = today.get(MONTH) + 1;
		// 変数に代入
		int date = today.get(DATE);
		
		System.out.printf("今日は%04d年%02d月%02d日です。 \n", year, month, date);
		counter = year * 1000000 + month * 10000 + date * 100;
	}
	
	// コンストラクタ
	public DateId() {
		// インクリメント後に代入
		id = ++counter;
	}
	
	/* 
	 * 関数名：getId
	 * 説明：識別番号を取得するメソッド
	 * パラメータ：なし
	 * 返り値：識別番号(id)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public int getId() {
		return id;
	}
}
