package primeministers;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public class IO extends Object {

	/**
	 * テーブル（表：スプレッドシート）を記憶するフィールド。
	 */
	private Table table;

	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes() {
		return null;
	}

	/**
	 * ファイルやディレクトリを削除するクラスメソッド。
	 */
	public static void deleteFirlOrDirectory(File aFile) {

	}

	/**
	 * 指定された文字列をHTML内に記述できる正式な文字列に変換して応答する。
	 */
	public static String htmlCanonicalString(String aString) {
		return null;
	}

	/**
	 * 指定されたファイルからテキストを読み込んで、それを行リストにして応答するクラスメソッド。
	 */
	public static List<String> readTextFromFile(File aFile) {
		return null;
	}

	/**
	 * 指定されたファイル文字列からテキストを読み込んで、それを行リストにして応答するクラスメソッド。
	 */
	public static List<String> readTextFromFile(String fileString) {
		return null;
	}

	/**
	 * 指定されたURL文字列からテキストを読み込んで、それを行リストにして応答するクラスメソッド。
	 */
	public static List<String> readTextFromURL(String urlString) {
		return null;
	}

	/**
	 * 指定されたURLからテキストを読み込んで、それを行リストにして応答するクラスメソッド。
	 */
	public static List<String> readTextFromURL(URL aURL) {
		return null;
	}

	/**
	 * 文字列をセパレータで分割したトークン列を応答するクラスメソッド。
	 */
	public static List<String> splitString(String string, String separators) {
		return null;
	}

	/**
	 * テーブルを応答する。
	 */
	public Table table() {
		return null;
	}

	public List<Tuple> tuples() {
		return null;
	}

	/**
	 * 指定された行リストを、指定されたファイルに書き出すクラスメソッド。
	 */
	public static void writeText(List<String> aCollection, File aFile) {

	}

	/**
	 * 指定された行リストを、指定されたファイル名のファイルに書き出すクラスメソッド。
	 */
	public static void writeText(List<String> aCollection, String fileString) {

	}

}
