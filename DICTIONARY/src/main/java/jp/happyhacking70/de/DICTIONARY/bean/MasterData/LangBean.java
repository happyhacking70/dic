package jp.happyhacking70.de.DICTIONARY.bean.MasterData;

/**
 * Bean Class of language.<BR>
 * 
 * @author Takeshi YOSHIDA (happyhacking70@gmail.com)
 *
 */
public class LangBean {
	/** Name of language */
	protected String name;
	
	/** Remarks */
	protected String remarks;

	/**
	 * Getter of name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	
	
}
