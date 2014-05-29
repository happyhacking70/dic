package jp.happyhacking70.de.DICTIONARY.bean;

import java.sql.Date;


/**
 * Interface for bean class of records on change history table.
 * 
 * @author Takeshi YOSHIDA (happyhacking70@gmail.com)
 *
 */
public interface HistoryIntf {

		/**
		 * Getter of updater
		 * @return updater
		 */
		public abstract String getUpdater();

		/**
		 * Setter of updater
		 * @param updater the updater to set
		 */
		public abstract void setUpdater(String updater);

		/**
		 * Getter of channel
		 * @return channel
		 */
		public abstract String getChannel();

		/**
		 * Setter of channel
		 * @param channel the channel to set
		 */
		public abstract void setChannel(String channel);

		/**
		 * Getter of updateDateTime
		 * @return updateDateTime
		 */
		public abstract Date getUpdateDateTime();

		/**
		 * Setter of updateDateTime
		 * @param updateDateTime the updateDateTime to set
		 */
		public abstract void setUpdateDateTime(Date updateDateTime);

		/**
		 * Getter of comment
		 * @return comment
		 */
		public abstract String getComment();

		/**
		 * Setter of comment
		 * @param comment the comment to set
		 */
		public abstract void setComment(String comment);
		
}
