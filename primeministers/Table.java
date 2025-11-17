package primeministers;

import java.util.List;

import java.awt.image.BufferedImage;

/**
 * 表：情報テーブル。
 */
public class Table extends Object {

	/**
	 * 属性リストを記憶するフィールド。
	 */
	private Attributes attributes;

	/**
	 * 画像群を記憶するフィールド。
	 */
	private List_BufferedImage_ images;

	/**
	 * サムネイル画像群を記憶するフィールド。
	 */
	private List_BufferedImage_ thumbnails;

	/**
	 * タプル群を記憶するフィールド。
	 */
	private List<Tuple> tuples;

	/**
	 * タプルを追加する。
	 */
	public void add(Tuple aTuple) {

	}

	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes() {
		return null;
	}

	/**
	 * 属性リストを設定する。
	 */
	public void attributes(Attributes instanceOfAttributes) {

	}

	/**
	 * 画像群を応答する。
	 */
	public List_BufferedImage_ images() {
		return null;
	}

	/**
	 * 画像またはサムネイル画像の文字列を受けとって当該画像を応答する。
	 */
	private BufferedImage picture(String aString) {
		return null;
	}

	/**
	 * サムネイル画像群を応答する。
	 */
	public List<BufferedImage> thumbnails() {
		return null;
	}

	/**
	 * 自分自身を文字列にして、それを応答する。
	 */
	public String toString() {
		return null;
	}

	/**
	 * タプル群を応答する。
	 */
	public List<Tuple> tuples() {
		return null;
	}

}
