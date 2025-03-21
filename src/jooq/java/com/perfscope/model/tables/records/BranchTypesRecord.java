/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.records;


import com.perfscope.model.tables.BranchTypes;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BranchTypesRecord extends UpdatableRecordImpl<BranchTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>branch_types.id</code>.
     */
    public BranchTypesRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>branch_types.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>branch_types.name</code>.
     */
    public BranchTypesRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>branch_types.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BranchTypesRecord
     */
    public BranchTypesRecord() {
        super(BranchTypes.BRANCH_TYPES);
    }

    /**
     * Create a detached, initialised BranchTypesRecord
     */
    public BranchTypesRecord(Integer id, String name) {
        super(BranchTypes.BRANCH_TYPES);

        setId(id);
        setName(name);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BranchTypesRecord
     */
    public BranchTypesRecord(com.perfscope.model.tables.pojos.BranchTypes value) {
        super(BranchTypes.BRANCH_TYPES);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            resetChangedOnNotNull();
        }
    }
}
