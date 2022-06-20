package ensyu_15_8;
import java.util.Calendar;

class CalendarPrint {
	private int year;
	private int month;

	// コンストラクタ
	public CalendarPrint(int year, int month) {
		this.year = year;
		this.month = month;
	}
	/*
	 * 関数名：printCalendar
	 * 説明：カレンダーを表示するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/18
	 */
	public void printCalendar() {
		// Calendarクラスのインスタンス化
		Calendar calendar = Calendar.getInstance();
		// 年、月の表示
		System.out.println(year + "年" + month + "月");
		// 曜日用の配列の宣言
		String[] weeks= {"日","月","火","水","木","金","土"};
		// 曜日の出力ループ
		for(String s:weeks) {
			// 出力
			System.out.printf("%3s",s);
		}
		// 改行
		System.out.println();
		// Calendarクラスのメソッド呼び出し
		calendar.clear();
		// Calendarクラスのメソッド呼び出し
		calendar.set(year, month -1, 1);
		// 変数に代入()
		int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
		// 変数に代入
		int day = 1 - (firstDay - 1) % 7;
		// Calendarクラスのメソッド呼び出し
		calendar.add(Calendar.MONTH, 1);
		// Calendarクラスのメソッド呼び出し
		calendar.add(Calendar.DATE, -1);
		// 変数に代入
		int lastDay = calendar.get(Calendar.DATE);
		// 表示ループ
		while (day <= lastDay) {
			for (int i = 0; i < 7 && day <= lastDay; i++) {
				// 出力
				System.out.printf(day < 1 ? "    " : "%4d", day);
				// インクリメント
				day++;
			}
			// 出力
			System.out.println();
		}
		// 出力
		System.out.println();
	}
}