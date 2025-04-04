/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.records;


import com.perfscope.model.tables.ThreadsView;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThreadsViewRecord extends TableRecordImpl<ThreadsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>threads_view.id</code>.
     */
    public ThreadsViewRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>threads_view.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>threads_view.machine_id</code>.
     */
    public ThreadsViewRecord setMachineId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>threads_view.machine_id</code>.
     */
    public Long getMachineId() {
        return (Long) get(1);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public ThreadsViewRecord setHostOrGuest(Object value) {
        set(2, value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getHostOrGuest() {
        return get(2);
    }

    /**
     * Setter for <code>threads_view.process_id</code>.
     */
    public ThreadsViewRecord setProcessId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>threads_view.process_id</code>.
     */
    public Long getProcessId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>threads_view.pid</code>.
     */
    public ThreadsViewRecord setPid(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>threads_view.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>threads_view.tid</code>.
     */
    public ThreadsViewRecord setTid(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>threads_view.tid</code>.
     */
    public Integer getTid() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThreadsViewRecord
     */
    public ThreadsViewRecord() {
        super(ThreadsView.THREADS_VIEW);
    }

    /**
     * Create a detached, initialised ThreadsViewRecord
     */
    public ThreadsViewRecord(Integer id, Long machineId, Object hostOrGuest, Long processId, Integer pid, Integer tid) {
        super(ThreadsView.THREADS_VIEW);

        setId(id);
        setMachineId(machineId);
        setHostOrGuest(hostOrGuest);
        setProcessId(processId);
        setPid(pid);
        setTid(tid);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ThreadsViewRecord
     */
    public ThreadsViewRecord(com.perfscope.model.tables.pojos.ThreadsView value) {
        super(ThreadsView.THREADS_VIEW);

        if (value != null) {
            setId(value.getId());
            setMachineId(value.getMachineId());
            setHostOrGuest(value.getHostOrGuest());
            setProcessId(value.getProcessId());
            setPid(value.getPid());
            setTid(value.getTid());
            resetChangedOnNotNull();
        }
    }
}
