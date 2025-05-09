/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables;


import com.perfscope.model.DefaultSchema;
import com.perfscope.model.Keys;
import com.perfscope.model.tables.records.ThreadsRecord;

import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Threads extends TableImpl<ThreadsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>threads</code>
     */
    public static final Threads THREADS = new Threads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThreadsRecord> getRecordType() {
        return ThreadsRecord.class;
    }

    /**
     * The column <code>threads.id</code>.
     */
    public final TableField<ThreadsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>threads.machine_id</code>.
     */
    public final TableField<ThreadsRecord, Long> MACHINE_ID = createField(DSL.name("machine_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>threads.process_id</code>.
     */
    public final TableField<ThreadsRecord, Long> PROCESS_ID = createField(DSL.name("process_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>threads.pid</code>.
     */
    public final TableField<ThreadsRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>threads.tid</code>.
     */
    public final TableField<ThreadsRecord, Integer> TID = createField(DSL.name("tid"), SQLDataType.INTEGER, this, "");

    private Threads(Name alias, Table<ThreadsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Threads(Name alias, Table<ThreadsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>threads</code> table reference
     */
    public Threads(String alias) {
        this(DSL.name(alias), THREADS);
    }

    /**
     * Create an aliased <code>threads</code> table reference
     */
    public Threads(Name alias) {
        this(alias, THREADS);
    }

    /**
     * Create a <code>threads</code> table reference
     */
    public Threads() {
        this(DSL.name("threads"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ThreadsRecord> getPrimaryKey() {
        return Keys.THREADS__PK_THREADS;
    }

    @Override
    public Threads as(String alias) {
        return new Threads(DSL.name(alias), this);
    }

    @Override
    public Threads as(Name alias) {
        return new Threads(alias, this);
    }

    @Override
    public Threads as(Table<?> alias) {
        return new Threads(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(String name) {
        return new Threads(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(Name name) {
        return new Threads(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(Table<?> name) {
        return new Threads(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads where(Condition condition) {
        return new Threads(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Threads where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Threads where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Threads where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Threads where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Threads whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
