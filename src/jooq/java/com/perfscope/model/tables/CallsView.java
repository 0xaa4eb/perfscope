/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables;


import com.perfscope.model.DefaultSchema;
import com.perfscope.model.tables.records.CallsViewRecord;

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
public class CallsView extends TableImpl<CallsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>calls_view</code>
     */
    public static final CallsView CALLS_VIEW = new CallsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CallsViewRecord> getRecordType() {
        return CallsViewRecord.class;
    }

    /**
     * The column <code>calls_view.id</code>.
     */
    public final TableField<CallsViewRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>calls_view.thread_id</code>.
     */
    public final TableField<CallsViewRecord, Long> THREAD_ID = createField(DSL.name("thread_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.pid</code>.
     */
    public final TableField<CallsViewRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>calls_view.tid</code>.
     */
    public final TableField<CallsViewRecord, Integer> TID = createField(DSL.name("tid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>calls_view.command</code>.
     */
    public final TableField<CallsViewRecord, String> COMMAND = createField(DSL.name("command"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>calls_view.call_path_id</code>.
     */
    public final TableField<CallsViewRecord, Long> CALL_PATH_ID = createField(DSL.name("call_path_id"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<CallsViewRecord, Object> IP = createField(DSL.name("ip"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>calls_view.symbol_id</code>.
     */
    public final TableField<CallsViewRecord, Long> SYMBOL_ID = createField(DSL.name("symbol_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.symbol</code>.
     */
    public final TableField<CallsViewRecord, String> SYMBOL = createField(DSL.name("symbol"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>calls_view.call_time</code>.
     */
    public final TableField<CallsViewRecord, Long> CALL_TIME = createField(DSL.name("call_time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.return_time</code>.
     */
    public final TableField<CallsViewRecord, Long> RETURN_TIME = createField(DSL.name("return_time"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<CallsViewRecord, Object> ELAPSED_TIME = createField(DSL.name("elapsed_time"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>calls_view.branch_count</code>.
     */
    public final TableField<CallsViewRecord, Long> BRANCH_COUNT = createField(DSL.name("branch_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.insn_count</code>.
     */
    public final TableField<CallsViewRecord, Long> INSN_COUNT = createField(DSL.name("insn_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.cyc_count</code>.
     */
    public final TableField<CallsViewRecord, Long> CYC_COUNT = createField(DSL.name("cyc_count"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<CallsViewRecord, Object> IPC = createField(DSL.name("IPC"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>calls_view.call_id</code>.
     */
    public final TableField<CallsViewRecord, Long> CALL_ID = createField(DSL.name("call_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.return_id</code>.
     */
    public final TableField<CallsViewRecord, Long> RETURN_ID = createField(DSL.name("return_id"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<CallsViewRecord, Object> FLAGS = createField(DSL.name("flags"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>calls_view.parent_call_path_id</code>.
     */
    public final TableField<CallsViewRecord, Long> PARENT_CALL_PATH_ID = createField(DSL.name("parent_call_path_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>calls_view.parent_id</code>.
     */
    public final TableField<CallsViewRecord, Long> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.BIGINT, this, "");

    private CallsView(Name alias, Table<CallsViewRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private CallsView(Name alias, Table<CallsViewRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        CREATE VIEW calls_view AS SELECT calls.id,thread_id,(SELECT pid FROM threads WHERE id = thread_id) AS pid,(SELECT tid FROM threads WHERE id = thread_id) AS tid,(SELECT comm FROM comms WHERE id = comm_id) AS command,call_path_id,printf("%x", ip) AS ip,symbol_id,(SELECT name FROM symbols WHERE id = symbol_id) AS symbol,call_time,return_time,return_time - call_time AS elapsed_time,branch_count,insn_count,cyc_count,CASE WHEN cyc_count=0 THEN CAST(0 AS FLOAT) ELSE ROUND(CAST(insn_count AS FLOAT) / cyc_count, 2) END AS IPC,call_id,return_id,CASE WHEN flags=0 THEN '' WHEN flags=1 THEN 'no call' WHEN flags=2 THEN 'no return' WHEN flags=3 THEN 'no call/return' WHEN flags=6 THEN 'jump' ELSE flags END AS flags,parent_call_path_id,calls.parent_id FROM calls INNER JOIN call_paths ON call_paths.id = call_path_id
        """), where);
    }

    /**
     * Create an aliased <code>calls_view</code> table reference
     */
    public CallsView(String alias) {
        this(DSL.name(alias), CALLS_VIEW);
    }

    /**
     * Create an aliased <code>calls_view</code> table reference
     */
    public CallsView(Name alias) {
        this(alias, CALLS_VIEW);
    }

    /**
     * Create a <code>calls_view</code> table reference
     */
    public CallsView() {
        this(DSL.name("calls_view"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public CallsView as(String alias) {
        return new CallsView(DSL.name(alias), this);
    }

    @Override
    public CallsView as(Name alias) {
        return new CallsView(alias, this);
    }

    @Override
    public CallsView as(Table<?> alias) {
        return new CallsView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CallsView rename(String name) {
        return new CallsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CallsView rename(Name name) {
        return new CallsView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CallsView rename(Table<?> name) {
        return new CallsView(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView where(Condition condition) {
        return new CallsView(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CallsView where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CallsView where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CallsView where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CallsView where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CallsView whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
