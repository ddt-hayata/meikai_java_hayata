package ensyu_14_2;

class Pet {
	private String name;
	private String masterName;
	
	// コンストラクタ
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	/* 
	 * 関数名：getName
	 * 説明：ペットの名前を調べるメソッド
	 * パラメータ：なし
	 * 返り値：ペットの名前(name)
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public String getName() {
		// 返却
		return name;
	}
	
	/* 
	 * 関数名：getMasterName
	 * 説明：飼い主の名前を調べるメソッド
	 * パラメータ：なし
	 * 返り値：飼い主の名前(masterName)
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public String getMasterName() {
		// 返却
		return masterName;
	}
	
	/* 
	 * 関数名：introduce
	 * 説明：自己紹介するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void introduce() {
		// 出力
		System.out.println("■僕の名前は" + name + "です。！");
		// 出力
		System.out.println("■ご主人様は" + masterName + "です。！");
	}
}
