/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> PK_T_ARRAYS = UniqueKeys0.PK_T_ARRAYS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> PK_B2BS = UniqueKeys0.PK_B2BS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> PK_T_DIRECTORY = UniqueKeys0.PK_T_DIRECTORY;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> PK_X_TEST_CASE_64_69 = UniqueKeys0.PK_X_TEST_CASE_64_69;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> PK_X_TEST_CASE_71 = UniqueKeys0.PK_X_TEST_CASE_71;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> PK_X_TEST_CASE_85 = UniqueKeys0.PK_X_TEST_CASE_85;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> PK_X_UNUSED = UniqueKeys0.PK_X_UNUSED;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> UK_X_UNUSED_ID = UniqueKeys0.UK_X_UNUSED_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_CO_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> FK_T_BOOK_LANGUAGE_ID = ForeignKeys0.FK_T_BOOK_LANGUAGE_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> PK_T_DIRECTORY_SELF = ForeignKeys0.PK_T_DIRECTORY_SELF;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> FK_X_TEST_CASE_2025_1 = ForeignKeys0.FK_X_TEST_CASE_2025_1;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> FK_X_TEST_CASE_2025_2 = ForeignKeys0.FK_X_TEST_CASE_2025_2;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_2025_3 = ForeignKeys0.FK_X_TEST_CASE_2025_3;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_64_69A = ForeignKeys0.FK_X_TEST_CASE_64_69A;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_64_69B = ForeignKeys0.FK_X_TEST_CASE_64_69B;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> FK_X_TEST_CASE_71 = ForeignKeys0.FK_X_TEST_CASE_71;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_85 = ForeignKeys0.FK_X_TEST_CASE_85;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_UNUSED_SELF = ForeignKeys0.FK_X_UNUSED_SELF;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> PK_T_ARRAYS = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS, org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> PK_T_AUTHOR = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR, org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> PK_T_BOOK = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> UK_T_BOOK_STORE_NAME = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> PK_B2BS = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS, org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> PK_T_DATES = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES, org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> PK_T_DIRECTORY = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY, org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_EXOTIC_TYPES> PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES.T_EXOTIC_TYPES, org.jooq.test.oracle3.generatedclasses.tables.T_EXOTIC_TYPES.T_EXOTIC_TYPES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE, org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS, org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE, org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST, org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> PK_X_UNUSED = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> UK_X_UNUSED_ID = createUniqueKey(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR> FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> FK_T_BOOK_LANGUAGE_ID = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_LANGUAGE, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> FK_B2BS_BS_NAME = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.UK_T_BOOK_STORE_NAME, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> FK_B2BS_B_ID = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOK, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY, org.jooq.test.oracle3.generatedclasses.tables.records.T_DIRECTORY> PK_T_DIRECTORY_SELF = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY, org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY, org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY.PARENT_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> FK_X_TEST_CASE_2025_1 = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_85, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> FK_X_TEST_CASE_2025_2 = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_71, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_2025_3 = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_ID, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_64_69A = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.UK_X_UNUSED_ID, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_64_69B = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.UK_X_UNUSED_ID, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> FK_X_TEST_CASE_71 = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_64_69, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_TEST_CASE_85 = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85.X_UNUSED_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> FK_X_UNUSED_SELF = createForeignKey(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID_REF, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.NAME_REF);
	}
}
