/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables;


import com.perfscope.model.DefaultSchema;
import com.perfscope.model.Keys;
import com.perfscope.model.tables.records.DsosRecord;

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
public class Dsos extends TableImpl<DsosRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dsos</code>
     */
    public static final Dsos DSOS = new Dsos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DsosRecord> getRecordType() {
        return DsosRecord.class;
    }

    /**
     * The column <code>dsos.id</code>.
     */
    public final TableField<DsosRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dsos.machine_id</code>.
     */
    public final TableField<DsosRecord, Long> MACHINE_ID = createField(DSL.name("machine_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>dsos.short_name</code>.
     */
    public final TableField<DsosRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>dsos.long_name</code>.
     */
    public final TableField<DsosRecord, String> LONG_NAME = createField(DSL.name("long_name"), SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>dsos.build_id</code>.
     */
    public final TableField<DsosRecord, String> BUILD_ID = createField(DSL.name("build_id"), SQLDataType.VARCHAR(64), this, "");

    private Dsos(Name alias, Table<DsosRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Dsos(Name alias, Table<DsosRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>dsos</code> table reference
     */
    public Dsos(String alias) {
        this(DSL.name(alias), DSOS);
    }

    /**
     * Create an aliased <code>dsos</code> table reference
     */
    public Dsos(Name alias) {
        this(alias, DSOS);
    }

    /**
     * Create a <code>dsos</code> table reference
     */
    public Dsos() {
        this(DSL.name("dsos"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<DsosRecord> getPrimaryKey() {
        return Keys.DSOS__PK_DSOS;
    }

    @Override
    public Dsos as(String alias) {
        return new Dsos(DSL.name(alias), this);
    }

    @Override
    public Dsos as(Name alias) {
        return new Dsos(alias, this);
    }

    @Override
    public Dsos as(Table<?> alias) {
        return new Dsos(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dsos rename(String name) {
        return new Dsos(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dsos rename(Name name) {
        return new Dsos(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dsos rename(Table<?> name) {
        return new Dsos(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos where(Condition condition) {
        return new Dsos(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Dsos where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Dsos where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Dsos where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Dsos where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Dsos whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
