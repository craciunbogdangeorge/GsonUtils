package com.apecs.util;

import java.util.Date;

public class IndexMeter {
	/**
	 * The id for the datastore key.
	 *
	 * We use automatic id assignment for entities of Index class.
	 */
	private Long id;

	/**
	 * The name-value pair representing an entry for the indexes list.
	 *
	 * The string is the name of the measured item (e.g. water), and the integer
	 * is the actual value of the meter (e.g. 1729).
	 *
	 * Example: {"key":"sampleKey","value":1729}
	 *
	 * Note: This field is used only when a single name-value entry is enough to
	 * store all the information required for an IndexMeter and for testing
	 * purposes.
	 */
	private String nameValueEntry;

	/**
	 * The list containing all the name-value entry pairs.
	 * 
	 * Example: [{"key":"sampleKey","value":1729}, {"key":"sampleKey0","value":0}, {"key":"sampleKey1","value":1}]
	 */
	private String nameValueEntriesList;

	/**
	 * The indexes related to this index meter object.
	 *
	 * The string is a representation of the date (month and year), and the list
	 * contains all the name-value entry pairs.
	 *
	 * Example: {"key":"August, 2015", "value": nameValueEntriesList.toString()}
	 */
	private String indexesMap;

	/**
	 * The date when this index meter was created.
	 */
	private Date date;

	@SuppressWarnings("unused")
	private String providerUserId;

	/**
	 * Just making the default constructor private.
	 */
	@SuppressWarnings("unused")
	private IndexMeter() {
	}

	public IndexMeter(final long id, final String providerUserId,
			final String nameValueEntry) {
		this.id = id;
		this.providerUserId = providerUserId;
		this.nameValueEntry = nameValueEntry;
		// updateWithIndexMeterForm(indexMeterForm);
	}

	/**
	 * Getter for id.
	 *
	 * @return id.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Getter for the name-value entry.
	 *
	 * @return nameValueEntry.
	 */
	public String getNameValueEntry() {
		return nameValueEntry;
	}

	/**
	 * Getter for the list of name-value entries.
	 *
	 * @return nameValueEntriesList.
	 */
	public String getNameValueEntriesList() {
		return nameValueEntriesList;
	}

	/**
	 * Getter for the indexes map.
	 *
	 * @return indexesMap.
	 */
	public String getIndexesMap() {
		return indexesMap;
	}

	/**
	 * Getter for date.
	 *
	 * @return date.
	 */
	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Id: " + id + "\n")
				.append("nameValueEntry: ").append(nameValueEntry).append("\n");

		if (nameValueEntriesList != null) {
			stringBuilder.append("nameValueEntriesList: ")
					.append(nameValueEntriesList).append("\n");
		}

		if (indexesMap != null) {
			stringBuilder.append("indexesMap: ").append(indexesMap)
					.append("\n");
		}

		if (date != null) {
			stringBuilder.append("date: ").append(date.toString()).append("\n");
		}

		return stringBuilder.toString();
	}
}
