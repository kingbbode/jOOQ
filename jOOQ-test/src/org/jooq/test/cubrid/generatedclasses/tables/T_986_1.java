/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_986_1 extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = 437689482;

	/**
	 * The singleton instance of <code>t_986_1</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.cubrid.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record.class;
	}

	/**
	 * The column <code>t_986_1.ref</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER, T_986_1);

	/**
	 * No further instances allowed
	 */
	private T_986_1() {
		super("t_986_1", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_986_1__PK_986;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_986_1__PK_986);
	}
}
