package ensyu_10_4;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

class Day {
	// GregorianCalendarクラスのインスタンス化
	GregorianCalendar today = new GregorianCalendar();
	private int year = today.get(YEAR);
	private int month = today.get(MONTH) + 1;
	private int date = today.get(DATE);
	
	/* 
	 * 関数名：isLeap
	 * 説明：閏年を返すメソッド
	 * パラメータ：なし
	 * 返り値：true or false
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public static boolean isLeap(int year) {
		// 返却
		return year * 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	// コンストラクタ                          
	public Day() {
	}
	
	public Day(int year) {
		// 年が不正の場合
		if (year < 1) {
			this.year = 1;
		} else {
			this.year = year;
		}
	}
	public Day(int year, int month) {
		this(year);
		// 月が不正な値の場合
		if (month > 12) {
			this.month = 12;
		} else if (month < 1) {
			this.month = 1;
		} else {
			this.month = month;
		}
	}
	public Day(int year, int month, int date) {
		this(year, month);
		// 日が不正な値の場合
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31) {
			this.date = 31;
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			this.date = 30;
		} else if (month == 2 && isLeap(year) == true && date > 29) {
			this.date = 29;
		} else if (month == 2 && isLeap(year) == false && date > 28) {
			this.date = 28;
		} else if (date < 1) {
			this.date = 1;
		} else {
			this.date = date;
		}
	}
	
	public Day(Day d) {
		this(d.year, d.month, d.date);
	 }
	
	/* 
	 * 関数名：getYear
	 * 説明：年を返すメソッド
	 * パラメータ：なし
	 * 返り値：年(year)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int getYear() {
		// 返却
		return year;
	}
	/* 
	 * 関数名：getMonth
	 * 説明：月を返すメソッド
	 * パラメータ：なし
	 * 返り値：月(month)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int getMonth() {
		// 返却
		return month;
	}
	/* 
	 * 関数名：getDate
	 * 説明：日を返すメソッド
	 * パラメータ：なし
	 * 返り値：日(date)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int getDate() {
		// 返却
		return date;
	}
	/* 
	 * 関数名：getAdvanceDay
	 * 説明：1日進めた日付を返すメソッド
	 * パラメータ：なし
	 * 返り値：Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day getAdvanceDay() {
		// 返却
		return advanceDay();
	}
	/* 
	 * 関数名：getAdvanceDays
	 * 説明：n日進めた日付を返すメソッド
	 * パラメータ：なし
	 * 返り値：Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day getAdvanceDays(int n) {
		// 返却
		return advanceDays(n);
	}
	/* 
	 * 関数名：getReturnDay
	 * 説明：1日戻した日付を返すメソッド
	 * パラメータ：なし
	 * 返り値：Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day getReturnDay() {
		// 返却
		return returnDay();
	}
	/* 
	 * 関数名：getReturnDays
	 * 説明：n日戻した日付を返すメソッド
	 * パラメータ：なし
	 * 返り値：Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day getReturnDays() {
		// 返却
		return returnDay();
	}
	/* 
	 * 関数名：setYear
	 * 説明：年を設定するメソッド
	 * パラメータ：年(year)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public void  setYear(int year) {
		// this参照
		this.year = year;
	}
	/* 
	 * 関数名：setMonth
	 * 説明：月を設定するメソッド
	 * パラメータ：月(month)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public void setMonth(int month) {
		// this参照
		this.month = month;
	}
	/* 
	 * 関数名：setDate
	 * 説明：日を設定するメソッド
	 * パラメータ：日(date)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public void setDate(int date) {
		// this参照
		this.date = date;
	}
	/* 
	 * 関数名：set
	 * 説明：年・月・日を設定するメソッド
	 * パラメータ：年(year), 月(month), 日(date)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public void set(int year, int month, int date) {
		// this参照
		this.year = year;
		this.month = month;
		this.date = date;
	}
	// 閏年か？
	public boolean isLeap() {
		// 返却
		return isLeap(year);
	}
	
	/* 
	 * 関数名：dayOfWeek
	 * 説明：曜日を決めるメソッド
	 * パラメータ：なし
	 * 返り値：曜日に割り振られた整数(日→0, 月→1, 火→2, 水→3, 木→4, 金→5, 土→6)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public int dayOfWeek() {
		// 代入
		int y = year;
		// 代入
		int m = month;
		// 条件式
		if (m == 1 || m == 2) {
			// ディクリメント
			y--;
			// 加算
			m += 12;
		}
		// 返却
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	/* 
	 * 関数名：equalTo
	 * 説明：日付が等しいか返すメソッド
	 * パラメータ：Day型のインスタンス変数(Day d)
	 * 返り値：true or false
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	/* 
	 * 関数名：toString
	 * 説明：文字列の表現を返すメソッド
	 * パラメータ：なし
	 * 返り値：formatされた表現("%04d年%02d月%02d日（%s)", year, month, date, weekDay[dayOfWeek()])
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String toString() {
		// 配列の宣言
		String[] weekDay = {"日", "月", "火", "水", "木", "金", "土"};
		// 返却
		return String.format("%04d年%02d月%02d日（%s）", year, month, date, weekDay[dayOfWeek()]);
	}
	
	/* 
	 * 関数名：elapsedDays
	 * 説明：年内の経過日数を返すメソッド
	 * パラメータ：年(year),月(month),日(date)
	 * 返り値：経過日数(days)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int elapsedDays() {
		// 返却用変数
		int days = 0;
		// 変数に代入
		int daysYear = year;
		// 変数に代入
		int daysMonth = month;
		// 変数に代入
		int daysDate = date;
		// 1月の場合、日付をそのまま代入
		if (daysMonth == 1) {
			days = daysDate;
		// 2月の場合、1月の日付を足して代入
		} else if (daysMonth == 2) {
			days = daysDate + 31;
		// 3月の場合、1,2月の日付を足して代入
		} else if (daysMonth == 3) {
			days = daysDate + 31 + 28;
		// 4月の場合、1,2,3月の日付を足して代入
		} else if (daysMonth == 4) {
			days = daysDate + 31 + 28 + 31;
		// 5月の場合、1,2,3,4月の日付を足して代入
		} else if (daysMonth == 5) {
			days = daysDate + 31 + 28 + 31 + 30;
		// 6月の場合、1,2,3,4,5月の日付を足して代入
		} else if (daysMonth == 6) {
			days = daysDate + 31 + 28 + 31 + 30 + 31;
		// 7月の場合、1,2,3,4,5,6月の日付を足して代入
		} else if (daysMonth == 7) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30;
		// 8月の場合、1,2,3,4,5,6,7月の日付を足して代入
		} else if (daysMonth == 8) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30 + 31;
		// 9月の場合、1,2,3,4,5,6,7,8月の日付を足して代入
		} else if (daysMonth == 9) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		// 10月の場合、1,2,3,4,5,6,7,8,9月の日付を足して代入
		} else if (daysMonth == 10) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		// 11月の場合、1,2,3,4,5,6,7,8,9,10月の日付を足して代入
		} else if (daysMonth == 11) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		// 12月の場合、1,2,3,4,5,6,7,8,9,10,11月の日付を足して代入
		} else if (daysMonth == 12) {
			days = daysDate + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		// 閏年の場合、1日足す
		if (isLeap(daysYear) == true) {
			days = days + 1;
		}
		// 返却
		return days;
	}
	
	/* 
	 * 関数名：remainderDays
	 * 説明：年内の残り日数を返すメソッド
	 * パラメータ：年(year),月(month),日(date)
	 * 返り値：残り日数(days)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int remainderDays() {
		// 返却用変数
		int days = 0;
		// 閏年ではない場合
		if (isLeap(year) == false) {
			// 代入
			days = 365 - elapsedDays();
		// 閏年の場合
		} else if (isLeap(year) == true){
			// 代入
			days = 366 - elapsedDays();
		}
		// 返却
		return days;
	}
	
	/* 
	 * 関数名：advanceDay
	 * 説明：日付を1日進めて返すメソッド
	 * パラメータ：なし
	 * 返り値：1日進めた日付 Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day advanceDay() {
		// 変数に代入
		int daysYear = year;
		// 変数に代入
		int daysMonth = month;
		// 変数に代入
		int daysDate = date;
		if ((daysMonth == 1 || daysMonth == 3 || daysMonth == 5 || daysMonth == 7 ||
				daysMonth == 8 || daysMonth == 10 || daysMonth == 12) && daysDate + 1 > 31) {
			// 代入
			daysMonth = daysMonth + 1;
			// 代入
			daysDate = 1;
			// daysMonthが12より大きくになってしまう場合
			if (daysMonth > 12) {
				// 代入
				daysYear = daysYear + 1;
				// 代入
				daysMonth = 1;
			}
		} else if ((daysMonth == 4 || daysMonth == 6 || daysMonth == 9 || daysMonth == 11) &&
					daysDate + 1 > 30) {
			// 代入
			daysMonth = daysMonth + 1;
			// 代入
			daysDate = 1;
		// 閏年の場合
		} else if (month == 2 && isLeap(year) == true && daysDate + 1 > 29) {
			// 代入
			daysMonth = 3;
			// 代入
			daysDate = 1;
		// 閏年ではない場合
		} else if (month == 2 && isLeap(year) == false && daysDate + 1 > 28) {
			// 代入
			daysMonth = 3;
			// 代入
			daysDate = 1;
		} else {
			// 代入
			daysDate = daysDate + 1;
		}
		// 返却
		return new Day(daysYear, daysMonth, daysDate);
 	}
	/* 
	 * 関数名：advanceDays
	 * 説明：日付をn日進めて返すメソッド
	 * パラメータ：進める日数(n)
	 * 返り値：n日進めた日付 Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day advanceDays(int n) {
		// 変数に代入
		int daysYear = year;
		// 変数に代入
		int daysMonth = month;
		// 変数に代入
		int daysDate = date;
		if ((daysMonth == 1 || daysMonth == 3 || daysMonth == 5 || daysMonth == 7 ||
				daysMonth == 8 || daysMonth == 10 || daysMonth == 12) && daysDate + n > 31) {
			// 代入
			daysMonth = daysMonth + 1;
			// 代入
			daysDate = n - (31 - daysDate);
			// daysMonthが12より大きくになってしまう場合
			if (daysMonth > 12) {
				// 代入
				daysYear = daysYear + 1;
				// 代入
				daysMonth = 1;
			}
		} else if ((daysMonth == 4 || daysMonth == 6 || daysMonth == 9 || daysMonth == 11) &&
					daysDate + n > 30) {
			// 代入
			daysMonth = daysMonth + 1;
			// 代入
			daysDate = n - (30 - daysDate);
		} else if (month == 2 && isLeap(year) == true && daysDate + n > 29) {
			// 代入
			daysMonth = 3;
			// 代入
			daysDate = n - (29 - daysDate);
		} else if (month == 2 && isLeap(year) == false && daysDate + n > 28) {
			// 代入
			daysMonth = 3;
			// 代入
			daysDate = n - (28 - daysDate);
		} else {
			// 代入
			daysDate = daysDate + n;
		}
		// 返却
		return new Day(daysYear, daysMonth, daysDate);
 	}
	/* 
	 * 関数名：returnDay
	 * 説明：日付を1日戻して返すメソッド
	 * パラメータ：年(year),月(month),日(date)
	 * 返り値：1日戻した日付 Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day returnDay() {
		// 変数に代入
		int daysYear = year;
		// 変数に代入
		int daysMonth = month;
		// 変数に代入
		int daysDate = date;
		if ((daysMonth == 1 || daysMonth == 2 || daysMonth == 4 || daysMonth == 6 ||
				daysMonth == 8 || daysMonth == 9 || daysMonth == 11) && daysDate - 1 < 1) {
			// 代入
			daysMonth = daysMonth - 1;
			// 代入
			daysDate = 31;
			// daysMonthが1より小さくになってしまう場合
			if (daysMonth < 1) {
				// 代入
				daysYear = daysYear - 1;
				// 代入
				daysMonth = 12;
			}
		} else if ((daysMonth == 5 || daysMonth == 7 || daysMonth == 10 || daysMonth == 12) &&
					daysDate - 1 < 1) {
			// 代入
			daysMonth = daysMonth - 1;
			// 代入
			daysDate = 30;
		} else if (month == 3 && isLeap(year) == true && daysDate - 1 < 0) {
			// 代入
			daysMonth = 2;
			// 代入
			daysDate = 29;
		} else if (month == 2 && isLeap(year) == false && daysDate - 1 < 0) {
			// 代入
			daysMonth = 2;
			// 代入
			daysDate = 28;
		} else {
			// 代入
			daysDate = daysDate - 1;
		}
		// 返却
		return new Day(daysYear, daysMonth, daysDate);
 	}
	/* 
	 * 関数名：returnDays
	 * 説明：日付をn日戻した返すメソッド
	 * パラメータ：戻す日数(n)
	 * 返り値：n日戻した日付 Day(daysYear, daysMonth, daysDate)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public Day returnDays(int n) {
		// 変数に代入
		int daysYear = year;
		// 変数に代入
		int daysMonth = month;
		// 変数に代入
		int daysDate = date;
		if ((daysMonth == 1 || daysMonth == 2 || daysMonth == 4 || daysMonth == 6 ||
				daysMonth == 8 || daysMonth == 9 || daysMonth == 11) && daysDate - n < 1) {
			// 代入
			daysMonth = daysMonth - 1;
			// 代入
			daysDate = 31 + (daysDate - n);
			// daysMonthが1より小さくになってしまう場合
			if (daysMonth < 1) {
				// 代入
				daysYear = daysYear - 1;
				// 代入
				daysMonth = 12;
			}
		} else if ((daysMonth == 5 || daysMonth == 7 || daysMonth == 10 || daysMonth == 12) &&
					daysDate - n < 1) {
			// 代入
			daysMonth = daysMonth - 1;
			// 代入
			daysDate = 30 + (daysDate - n);
		} else if (month == 3 && isLeap(year) == true && daysDate - n < 0) {
			// 代入
			daysMonth = 2;
			// 代入
			daysDate = 29 + (daysDate - n);
		} else if (month == 2 && isLeap(year) == false && daysDate - n < 0) {
			// 代入
			daysMonth = 2;
			// 代入
			daysDate = 28 + (daysDate - n);
		} else {
			// 代入
			daysDate = daysDate - n;
		}
		// 返却
		return new Day(daysYear, daysMonth, daysDate);
 	}
	/* 
	 * 関数名：contextDays
	 * 説明：他の日付との前後関係を返すメソッド
	 * パラメータ：
	 * 返り値：true or false
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	public int contextDays(Day d) {
		// 年を比較した条件式
		if (this.year < d.year) {
			// 返却
			return 1;
		// 年・月を比較した条件式
		} else if (this.year == d.year && this.month < d.month) {
			// 返却
			return 1;
		// 年・月・日を比較した条件式
		} else if (this.year == d.year && this.month == d.month && this.date < d.date) {
			// 返却
			return 1;
		// 年月日が全て同じ場合
		} else if (this.year == d.year && this.month == d.month && this.date == d.date) {
			// 返却
			return 2;
		// 年を比較した条件式
		} else if (this.year > d.year){
			// 返却
			return 3;
		// 年・月を比較した条件式
		} else if (this.year == d.year && this.month > d.month) {
			// 返却
			return 3;
		// 年・月・日を比較した条件式
		} else if (this.year == d.year && this.month == d.month && this.date > d.date) {
			// 返却
			return 3;
		}
		// 返却
		return 0;
	}
}
