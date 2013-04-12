/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_AUTHOR extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1444410123;

	/**
	 * The singleton instance of <code>T_AUTHOR</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR T_AUTHOR = new org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR.class;
	}

	/**
	 * The column <code>T_AUTHOR.ID</code>. The author ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_AUTHOR.ADDRESS</code>. The author's address
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> ADDRESS = createField("ADDRESS", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType(), this);

	/**
	 * Create a <code>T_AUTHOR</code> table reference
	 */
	public T_AUTHOR() {
		super("T_AUTHOR", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_AUTHOR</code> table reference
	 */
	public T_AUTHOR(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR(alias);
	}
}
