package ensyu_9_4;

 public class Human {
	// 名前
	private String name;
	// 年齢
	private int age;
	// 身長
	private double height;
	// 体重
	private double weight;
	// 誕生日
	private Day birthday;
	
	// コンストラクタ
	Human(String name, int age, double height, double weight, Day day) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(day);
	}
	/* 
	 * 関数名：getName
	 * 説明：名前を返すメソッド
	 * パラメータ：なし
	 * 返り値：名前(name)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String getName() {
		// 返却
		return name;
	}
	/* 
	 * 関数名：getAge
	 * 説明：年齢を返すメソッド
	 * パラメータ：なし
	 * 返り値：年齢(age)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public int getAge() {
		// 返却
		return age;
	}
	/* 
	 * 関数名：getHeight
	 * 説明：身長を返すメソッド
	 * パラメータ：なし
	 * 返り値：身長(height)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public double getHeight() {
		// 返却
		return height;
	}
	/* 
	 * 関数名：getWeight
	 * 説明：体重を返すメソッド
	 * パラメータ：なし
	 * 返り値：身長(weight)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public double getWeight() {
		// 返却
		return weight;
	}
	/* 
	 * 関数名：getBirthday
	 * 説明：引出後の残高を返すメソッド
	 * パラメータ：引出金額(outMoney)
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public Day getBirthday() {
		// 返却
		return new Day(birthday);
		}
	
}
