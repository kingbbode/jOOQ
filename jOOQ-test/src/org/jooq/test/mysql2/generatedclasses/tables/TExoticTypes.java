/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1799975882;

	/**
	 * The singleton instance of <code>test2.t_exotic_types</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>test2.t_exotic_types.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.t_exotic_types.UU</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, this);

	/**
	 * Create a <code>test2.t_exotic_types</code> table reference
	 */
	public TExoticTypes() {
		super("t_exotic_types", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.t_exotic_types</code> table reference
	 */
	public TExoticTypes(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TExoticTypes(alias);
	}
}
