package ensyu_12_1;

public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1 ;
	
	// コンストラクタ
	public Day() {
	}
	public Day(int year) {
		this.year = year;
	}
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
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
	 * 作成日：2022/6/15
	 */
	public int getYear() {
		return year;
	}
	/* 
	 * 関数名：getMonth
	 * 説明：月を返すメソッド
	 * パラメータ：なし
	 * 返り値：月(month)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public int getMonth() {
		return month;
	}
	/* 
	 * 関数名：getDate
	 * 説明：日を返すメソッド
	 * パラメータ：なし
	 * 返り値：日(date)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public int getDate() {
		return date;
	}
	/* 
	 * 関数名：setYear
	 * 説明：年を設定するメソッド
	 * パラメータ：年(year)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public void  setYear(int year) {
		this.year = year;
	}
	/* 
	 * 関数名：setMonth
	 * 説明：月を設定するメソッド
	 * パラメータ：月(month)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/* 
	 * 関数名：setDate
	 * 説明：日を設定するメソッド
	 * パラメータ：日(date)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public void setDate(int date) {
		this.date = date;
	}
	/* 
	 * 関数名：set
	 * 説明：年・月・日を設定するメソッド
	 * パラメータ：年(year), 月(month), 日(date)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	/* 
	 * 関数名：dayOfWeek
	 * 説明：曜日を決めるメソッド
	 * パラメータ：なし
	 * 返り値：曜日に割り振られた整数(日→0, 月→1, 火→2, 水→3, 木→4, 金→5, 土→6)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	/* 
	 * 関数名：equalTo
	 * 説明：日付が等しいか返すメソッド
	 * パラメータ：Day型のインスタンス変数(Day d)
	 * 返り値：true or false
	 * 作成者：早田
	 * 作成日：2022/6/15
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
	 * 作成日：2022/6/15
	 */
	public String toString() {
		// 配列の宣言
		String[] weekDay = {"日", "月", "火", "水", "木", "金", "土"};
		// 返却
		return String.format("%04d年%02d月%02d日（%s)", year, month, date, weekDay[dayOfWeek()]);
	}
}
