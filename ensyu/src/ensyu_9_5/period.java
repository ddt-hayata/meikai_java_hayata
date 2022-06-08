/*
 * 開始日と終了日とから構成される《期間》を表すクラスperiodを作成せよ。
 * コンストラクタやメソッドは自由に定義すること。
 */
package ensyu_9_5;

public class period {
	private Day from;
	private Day to;
	private String projectName;
	private String content;
	private int projectPersons;
	
	// コンストラクタ
	public period(String projectName, String content, int projectPersons, Day from, Day to) {
		this.projectName = projectName;
		this.content = content;
		this.projectPersons = projectPersons;
		this.from = new Day(from);
		this.to = new Day(to);
	}
	/* 
	 * 関数名：getProjectName
	 * 説明：案件名を返すメソッド
	 * パラメータ：なし
	 * 返り値：案件名(projectName)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String getProjectName() {
		// 返却
		return projectName;
	}
	/* 
	 * 関数名：getContent
	 * 説明：内容を返すメソッド
	 * パラメータ：なし
	 * 返り値：内容(content)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String getContent() {
		// 返却
		return content;
	}
	/* 
	 * 関数名：getProjectPersons
	 * 説明：人数を返すメソッド
	 * パラメータ：なし
	 * 返り値：人数(projectPersons)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public int getProjectPersons() {
		// 返却
		return projectPersons;
	}
	/* 
	 * 関数名：getFrom
	 * 説明：開始日を返すメソッド
	 * パラメータ：なし
	 * 返り値：開始日(from)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public Day getFrom() {
		// 返却
		return new Day(from);
	}
	/* 
	 * 関数名：getTo
	 * 説明：開始日を返すメソッド
	 * パラメータ：なし
	 * 返り値：終了日(to)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public Day getTo() {
		// 返却
		return new Day(to);
	}
}
