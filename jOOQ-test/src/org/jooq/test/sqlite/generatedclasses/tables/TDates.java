/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TDates extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -1545085388;

	/**
	 * The singleton instance of <code>t_dates</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TDates T_DATES = new org.jooq.test.sqlite.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>t_dates.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_DATES);

	/**
	 * The column <code>t_dates.d</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("d", org.jooq.impl.SQLDataType.DATE, T_DATES);

	/**
	 * The column <code>t_dates.t</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("t", org.jooq.impl.SQLDataType.TIME, T_DATES);

	/**
	 * The column <code>t_dates.ts</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("ts", org.jooq.impl.SQLDataType.TIMESTAMP, T_DATES);

	/**
	 * The column <code>t_dates.d_int</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("d_int", org.jooq.impl.SQLDataType.INTEGER, T_DATES);

	/**
	 * The column <code>t_dates.ts_bigint</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("ts_bigint", org.jooq.impl.SQLDataType.BIGINT, T_DATES);

	/**
	 * No further instances allowed
	 */
	private TDates() {
		super("t_dates", org.jooq.test.sqlite.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> getPrimaryKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_DATES);
	}
}
