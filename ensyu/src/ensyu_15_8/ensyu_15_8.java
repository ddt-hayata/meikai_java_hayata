/*
 * コマンドライン引数で指定された月のカレンダーを表示するプログラム作成せよ。
 * コマンドラインから年のみが読み込まれた場合は、
 * その年の1月から12月までのカレンダーを表示して、
 * 年と月が与えられた場合は、その月のカレンダーを表示して、
 * 年も月も与えられなかったら、現在の月のカレンダーを表示すること。
 */
package ensyu_15_8;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class ensyu_15_8 {

	public static void main(String[] args) {
		// GregorianCalendarクラスのインスタンス化
		GregorianCalendar today = new GregorianCalendar();
		// 変数に年を代入
		int year = today.get(YEAR);
		// 変数に月を代入
		int month = today.get(MONTH) + 1;
		// 引数が年だけの場合
		if (args.length == 1) {
			// 変数に引数の値を代入
			year = Integer.parseInt(args[0]);
			// 変数に代入
			month = 0;
			for (month = 1; month <= 12; month++) {
				// インスタンス化
				CalendarPrint calendarPrint = new CalendarPrint(year, month);
				// メソッド呼び出し
				calendarPrint.printCalendar();
			}
		// 引数が年と月両方の場合
		} else if (args.length == 2) {
			// 変数に引数の値を代入
			year = Integer.parseInt(args[0]);
			// 変数に引数の値を代入
			month = Integer.parseInt(args[1]);
			/// インスタンス化
			CalendarPrint calendarPrint = new CalendarPrint(year, month);
			// メソッド呼び出し
			calendarPrint.printCalendar();
		// 引数がない場合
		} else {
			// インスタンス化
			CalendarPrint calendarPrint = new CalendarPrint(year, month);
			// メソッド呼び出し
			calendarPrint.printCalendar();
		}
	}
}
