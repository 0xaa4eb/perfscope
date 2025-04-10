/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables;


import com.perfscope.model.DefaultSchema;
import com.perfscope.model.tables.records.MachinesViewRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachinesView extends TableImpl<MachinesViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>machines_view</code>
     */
    public static final MachinesView MACHINES_VIEW = new MachinesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MachinesViewRecord> getRecordType() {
        return MachinesViewRecord.class;
    }

    /**
     * The column <code>machines_view.id</code>.
     */
    public final TableField<MachinesViewRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>machines_view.pid</code>.
     */
    public final TableField<MachinesViewRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>machines_view.root_dir</code>.
     */
    public final TableField<MachinesViewRecord, String> ROOT_DIR = createField(DSL.name("root_dir"), SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>machines_view.host_or_guest</code>.
     */
    public final TableField<MachinesViewRecord, String> HOST_OR_GUEST = createField(DSL.name("host_or_guest"), SQLDataType.VARCHAR, this, "");

    private MachinesView(Name alias, Table<MachinesViewRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private MachinesView(Name alias, Table<MachinesViewRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("CREATE VIEW machines_view AS SELECT id,pid,root_dir,CASE WHEN id=0 THEN 'unknown' WHEN pid=-1 THEN 'host' ELSE 'guest' END AS host_or_guest FROM machines"), where);
    }

    /**
     * Create an aliased <code>machines_view</code> table reference
     */
    public MachinesView(String alias) {
        this(DSL.name(alias), MACHINES_VIEW);
    }

    /**
     * Create an aliased <code>machines_view</code> table reference
     */
    public MachinesView(Name alias) {
        this(alias, MACHINES_VIEW);
    }

    /**
     * Create a <code>machines_view</code> table reference
     */
    public MachinesView() {
        this(DSL.name("machines_view"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public MachinesView as(String alias) {
        return new MachinesView(DSL.name(alias), this);
    }

    @Override
    public MachinesView as(Name alias) {
        return new MachinesView(alias, this);
    }

    @Override
    public MachinesView as(Table<?> alias) {
        return new MachinesView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MachinesView rename(String name) {
        return new MachinesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachinesView rename(Name name) {
        return new MachinesView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachinesView rename(Table<?> name) {
        return new MachinesView(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView where(Condition condition) {
        return new MachinesView(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public MachinesView where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public MachinesView where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public MachinesView where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public MachinesView where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public MachinesView whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
