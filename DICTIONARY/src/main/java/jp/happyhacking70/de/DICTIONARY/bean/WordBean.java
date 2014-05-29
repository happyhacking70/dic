package jp.happyhacking70.de.DICTIONARY.bean;

/**
 * Bean Class of Word.
 * 
 * @author happyhacking70@gmail.com
 *
 */
public class WordBean {
	
	/** Word */
	protected String word;
	
	/** Meanings of word */
	protected String meanings;
	
	/** Basic Type */
	protected String basicType;
	
	/** Precision */
	protected int precision;
	
	/** Scale */
	protected int scale;
	
	/** Length */
	protected int length;
	
	/** Remarks */
	protected String remarks;

	/**
	 * Getter of word
	 * @return word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Setter of word
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * Getter of meanings
	 * @return meanings
	 */
	public String getMeanings() {
		return meanings;
	}

	/**
	 * Setter of meanings
	 * @param meanings the meanings to set
	 */
	public void setMeanings(String meanings) {
		this.meanings = meanings;
	}

	/**
	 * Getter of remarks
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * Setter of remarks
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * Getter of basicType
	 * @return basicType
	 */
	public String getBasicType() {
		return basicType;
	}

	/**
	 * Setter of basicType
	 * @param basicType the basicType to set
	 */
	public void setBasicType(String basicType) {
		this.basicType = basicType;
	}

	/**
	 * Getter of precision
	 * @return precision
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * Setter of precision
	 * @param precision the precision to set
	 */
	public void setPrecision(int precision) {
		this.precision = precision;
	}

	/**
	 * Getter of scale
	 * @return scale
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * Setter of scale
	 * @param scale the scale to set
	 */
	public void setScale(int scale) {
		this.scale = scale;
	}

	/**
	 * Getter of length
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Setter of length
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	


	

}
