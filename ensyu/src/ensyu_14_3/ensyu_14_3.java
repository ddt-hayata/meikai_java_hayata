/*
 * クラスDVDPlayerを利用するプログラム例を作成せよ。
 */
package ensyu_14_3;

public class ensyu_14_3 {

	public static void main(String[] args) {
		// インスタンス化
		DVDPlayer dvdPlayer = new DVDPlayer();
		// メソッドの呼びだし
		dvdPlayer.play();
		// メソッドの呼びだし
		dvdPlayer.stop();
		// メソッドの呼びだし
		dvdPlayer.slow();
	}
}
