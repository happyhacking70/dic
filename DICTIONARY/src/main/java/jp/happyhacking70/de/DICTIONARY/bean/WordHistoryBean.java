package jp.happyhacking70.de.DICTIONARY.bean;

import java.sql.Date;

/**
 * @author Takeshi YOSHIDA (happyhacking70@gmail.com)
 *
 */
public class WordHistoryBean extends WordBean implements HistoryIntf {
	/** Name of updater */
	protected String updater;
	
	/**
	 * Name of channel used when updating.
	 * How this record was updated.
	 */
	protected String channel;
	
	/** Date Time of update */
	protected Date updateDateTime;
	
	/** Comment */
	protected String comment;

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#getUpdater()
	 */
	public String getUpdater() {
		return updater;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#setUpdater(java.lang.String)
	 */
	public void setUpdater(String updater) {
		this.updater = updater;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#getChannel()
	 */
	public String getChannel() {
		return channel;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#setChannel(java.lang.String)
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#getUpdateDateTime()
	 */
	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#setUpdateDateTime(java.sql.Date)
	 */
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#getComment()
	 */
	public String getComment() {
		return comment;
	}

	/* (non-Javadoc)
	 * @see jp.happyhacking70.de.DICTIONARY.bean.HistoryIntf#setComment(java.lang.String)
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
