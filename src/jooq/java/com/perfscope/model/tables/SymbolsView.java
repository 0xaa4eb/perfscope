/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables;


import com.perfscope.model.DefaultSchema;
import com.perfscope.model.tables.records.SymbolsViewRecord;

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
public class SymbolsView extends TableImpl<SymbolsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>symbols_view</code>
     */
    public static final SymbolsView SYMBOLS_VIEW = new SymbolsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SymbolsViewRecord> getRecordType() {
        return SymbolsViewRecord.class;
    }

    /**
     * The column <code>symbols_view.id</code>.
     */
    public final TableField<SymbolsViewRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>symbols_view.name</code>.
     */
    public final TableField<SymbolsViewRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>symbols_view.dso</code>.
     */
    public final TableField<SymbolsViewRecord, String> DSO = createField(DSL.name("dso"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>symbols_view.dso_id</code>.
     */
    public final TableField<SymbolsViewRecord, Long> DSO_ID = createField(DSL.name("dso_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>symbols_view.sym_start</code>.
     */
    public final TableField<SymbolsViewRecord, Long> SYM_START = createField(DSL.name("sym_start"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>symbols_view.sym_end</code>.
     */
    public final TableField<SymbolsViewRecord, Long> SYM_END = createField(DSL.name("sym_end"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>symbols_view.binding</code>.
     */
    public final TableField<SymbolsViewRecord, String> BINDING = createField(DSL.name("binding"), SQLDataType.VARCHAR, this, "");

    private SymbolsView(Name alias, Table<SymbolsViewRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private SymbolsView(Name alias, Table<SymbolsViewRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("CREATE VIEW symbols_view AS SELECT id,name,(SELECT short_name FROM dsos WHERE id=dso_id) AS dso,dso_id,sym_start,sym_end,CASE WHEN binding=0 THEN 'local' WHEN binding=1 THEN 'global' ELSE 'weak' END AS binding FROM symbols"), where);
    }

    /**
     * Create an aliased <code>symbols_view</code> table reference
     */
    public SymbolsView(String alias) {
        this(DSL.name(alias), SYMBOLS_VIEW);
    }

    /**
     * Create an aliased <code>symbols_view</code> table reference
     */
    public SymbolsView(Name alias) {
        this(alias, SYMBOLS_VIEW);
    }

    /**
     * Create a <code>symbols_view</code> table reference
     */
    public SymbolsView() {
        this(DSL.name("symbols_view"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public SymbolsView as(String alias) {
        return new SymbolsView(DSL.name(alias), this);
    }

    @Override
    public SymbolsView as(Name alias) {
        return new SymbolsView(alias, this);
    }

    @Override
    public SymbolsView as(Table<?> alias) {
        return new SymbolsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SymbolsView rename(String name) {
        return new SymbolsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SymbolsView rename(Name name) {
        return new SymbolsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SymbolsView rename(Table<?> name) {
        return new SymbolsView(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView where(Condition condition) {
        return new SymbolsView(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SymbolsView where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SymbolsView where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SymbolsView where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SymbolsView where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SymbolsView whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
