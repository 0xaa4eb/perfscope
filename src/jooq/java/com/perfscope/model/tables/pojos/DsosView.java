/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DsosView implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final Long machineId;
    private final Object hostOrGuest;
    private final String shortName;
    private final String longName;
    private final String buildId;

    public DsosView(DsosView value) {
        this.id = value.id;
        this.machineId = value.machineId;
        this.hostOrGuest = value.hostOrGuest;
        this.shortName = value.shortName;
        this.longName = value.longName;
        this.buildId = value.buildId;
    }

    public DsosView(
        Integer id,
        Long machineId,
        Object hostOrGuest,
        String shortName,
        String longName,
        String buildId
    ) {
        this.id = id;
        this.machineId = machineId;
        this.hostOrGuest = hostOrGuest;
        this.shortName = shortName;
        this.longName = longName;
        this.buildId = buildId;
    }

    /**
     * Getter for <code>dsos_view.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>dsos_view.machine_id</code>.
     */
    public Long getMachineId() {
        return this.machineId;
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
        return this.hostOrGuest;
    }

    /**
     * Getter for <code>dsos_view.short_name</code>.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Getter for <code>dsos_view.long_name</code>.
     */
    public String getLongName() {
        return this.longName;
    }

    /**
     * Getter for <code>dsos_view.build_id</code>.
     */
    public String getBuildId() {
        return this.buildId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final DsosView other = (DsosView) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.machineId == null) {
            if (other.machineId != null)
                return false;
        }
        else if (!this.machineId.equals(other.machineId))
            return false;
        if (this.hostOrGuest == null) {
            if (other.hostOrGuest != null)
                return false;
        }
        else if (!this.hostOrGuest.equals(other.hostOrGuest))
            return false;
        if (this.shortName == null) {
            if (other.shortName != null)
                return false;
        }
        else if (!this.shortName.equals(other.shortName))
            return false;
        if (this.longName == null) {
            if (other.longName != null)
                return false;
        }
        else if (!this.longName.equals(other.longName))
            return false;
        if (this.buildId == null) {
            if (other.buildId != null)
                return false;
        }
        else if (!this.buildId.equals(other.buildId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.machineId == null) ? 0 : this.machineId.hashCode());
        result = prime * result + ((this.hostOrGuest == null) ? 0 : this.hostOrGuest.hashCode());
        result = prime * result + ((this.shortName == null) ? 0 : this.shortName.hashCode());
        result = prime * result + ((this.longName == null) ? 0 : this.longName.hashCode());
        result = prime * result + ((this.buildId == null) ? 0 : this.buildId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DsosView (");

        sb.append(id);
        sb.append(", ").append(machineId);
        sb.append(", ").append(hostOrGuest);
        sb.append(", ").append(shortName);
        sb.append(", ").append(longName);
        sb.append(", ").append(buildId);

        sb.append(")");
        return sb.toString();
    }
}
