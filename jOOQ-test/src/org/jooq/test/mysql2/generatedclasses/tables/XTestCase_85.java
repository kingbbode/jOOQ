/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1692042389;

	/**
	 * The singleton instance of <code>test2.x_test_case_85</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>test2.x_test_case_85.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.x_test_case_85.x_unused_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.x_test_case_85.x_unused_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * Create a <code>test2.x_test_case_85</code> table reference
	 */
	public XTestCase_85() {
		super("x_test_case_85", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.x_test_case_85</code> table reference
	 */
	public XTestCase_85(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_85_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_85_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85(alias);
	}
}
