/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.records;


import com.perfscope.model.tables.CbrView;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CbrViewRecord extends TableRecordImpl<CbrViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>cbr_view.id</code>.
     */
    public CbrViewRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>cbr_view.time</code>.
     */
    public CbrViewRecord setTime(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.time</code>.
     */
    public Long getTime() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cbr_view.cpu</code>.
     */
    public CbrViewRecord setCpu(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.cpu</code>.
     */
    public Integer getCpu() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>cbr_view.cbr</code>.
     */
    public CbrViewRecord setCbr(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.cbr</code>.
     */
    public Integer getCbr() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>cbr_view.mhz</code>.
     */
    public CbrViewRecord setMhz(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.mhz</code>.
     */
    public Integer getMhz() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>cbr_view.percent</code>.
     */
    public CbrViewRecord setPercent(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cbr_view.percent</code>.
     */
    public Integer getPercent() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CbrViewRecord
     */
    public CbrViewRecord() {
        super(CbrView.CBR_VIEW);
    }

    /**
     * Create a detached, initialised CbrViewRecord
     */
    public CbrViewRecord(Integer id, Long time, Integer cpu, Integer cbr, Integer mhz, Integer percent) {
        super(CbrView.CBR_VIEW);

        setId(id);
        setTime(time);
        setCpu(cpu);
        setCbr(cbr);
        setMhz(mhz);
        setPercent(percent);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CbrViewRecord
     */
    public CbrViewRecord(com.perfscope.model.tables.pojos.CbrView value) {
        super(CbrView.CBR_VIEW);

        if (value != null) {
            setId(value.getId());
            setTime(value.getTime());
            setCpu(value.getCpu());
            setCbr(value.getCbr());
            setMhz(value.getMhz());
            setPercent(value.getPercent());
            resetChangedOnNotNull();
        }
    }
}
