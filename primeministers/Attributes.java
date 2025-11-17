package primeministers;

import java.util.List;

/**
 * 属性リスト：情報テーブルを入出力する際の属性情報を記憶。
 */
public class Attributes extends Object {

	/**
	 * ベースとなるディレクトリを記憶する（クラス変数）フィールド。
	 */
	private static String baseDirectory;

	/**
	 * 属性リストのキー群を記憶する（インスタンス変数）フィールド。
	 */
	private int keys;

	/**
	 * 属性リストの名前群を記憶する（インスタンス変数）フィールド。
	 */
	private int names;


	/**
	 * 指定されたインデックスに対応する名前を応答する。
	 */
	protected String at(int index) {
		return null;
	}

	/**
	 * ページのためのディレクトリを応答する。
	 */
	abstract String baseDirectory();

	/**
	 * ページのためのディレクトリ（存在しなければ作成して）を応答する。
	 */
	public String baseDirectory(String kindString) {
		return null;
	}

	/**
	 * 情報の在処(URL)を文字列で応答する。
	 */
	abstract String baseUrl();

	/**
	 * 標題文字列を応答する。
	 */
	abstract String captionString();

	/**
	 * 情報を記したCSVファイルの在処(URL)を文字列で応答する。
	 */
	abstract String csvUrl();

	/**
	 * ベースとなるディレクトリの記憶を水に流す。
	 */
	public static void flushBaseDirectory() {

	}

	/**
	 * ページのためのローカルなHTMLのインデックスファイル(index.html)を文字列で応答する。
	 */
	public String indexHTML() {
		return null;
	}

	/**
	 * 指定されたキー文字列のインデックスを応答する。
	 */
	protected int indexOf(String aString) {
		return 0;
	}

	/**
	 * 在位日数のインデックスを応答する。
	 */
	public int indexOfDays() {
		return 0;
	}

	/**
	 * 画像のインデックスを応答する。
	 */
	public int indexOfImage() {
		return 0;
	}

	/**
	 * ふりがなのインデックスを応答する。
	 */
	public int indexOfKana() {
		return 0;
	}

	/**
	 * 氏名のインデックスを応答する。
	 */
	public int indexOfName() {
		return 0;
	}

	/**
	 * 番号のインデックスを応答する。
	 */
	public int indexOfNo() {
		return 0;
	}

	/**
	 * 在位期間のインデックスを応答する。
	 */
	public int indexOfPeriod() {
		return 0;
	}

	/**
	 * 縮小画像のインデックスを応答する。
	 */
	public int indexOfThumbnail() {
		return 0;
	}

	/**
	 * 指定されたインデックスに対応するキーを応答する。
	 */
	protected String keyAt(int index) {
		return null;
	}

	/**
	 * キー群を応答する。
	 */
	public int keys() {
		return null;
	}

	/**
	 * 指定されたインデックスに対応する名前を応答する。
	 */
	protected String nameAt(int index) {
		return null;
	}

	/**
	 * 名前群を応答する。
	 */
	public int names() {
		return null;
	}

	/**
	 * 名前群を設定する。
	 */
	public void names(List_String_ aCollection) {

	}

	/**
	 * 属性リストの長さを応答する。
	 */
	public int size() {
		return 0;
	}

	/**
	 * タイトル文字列を応答する。
	 */
	abstract String titleString();

	/**
	 * 自分自身を文字列にして、それを応答する。
	 */
	public String toString() {
		return null;
	}

}
