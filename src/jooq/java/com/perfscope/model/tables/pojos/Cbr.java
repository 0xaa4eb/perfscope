/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cbr implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final Integer cbr;
    private final Integer mhz;
    private final Integer percent;

    public Cbr(Cbr value) {
        this.id = value.id;
        this.cbr = value.cbr;
        this.mhz = value.mhz;
        this.percent = value.percent;
    }

    public Cbr(
        Integer id,
        Integer cbr,
        Integer mhz,
        Integer percent
    ) {
        this.id = id;
        this.cbr = cbr;
        this.mhz = mhz;
        this.percent = percent;
    }

    /**
     * Getter for <code>cbr.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>cbr.cbr</code>.
     */
    public Integer getCbr() {
        return this.cbr;
    }

    /**
     * Getter for <code>cbr.mhz</code>.
     */
    public Integer getMhz() {
        return this.mhz;
    }

    /**
     * Getter for <code>cbr.percent</code>.
     */
    public Integer getPercent() {
        return this.percent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Cbr other = (Cbr) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.cbr == null) {
            if (other.cbr != null)
                return false;
        }
        else if (!this.cbr.equals(other.cbr))
            return false;
        if (this.mhz == null) {
            if (other.mhz != null)
                return false;
        }
        else if (!this.mhz.equals(other.mhz))
            return false;
        if (this.percent == null) {
            if (other.percent != null)
                return false;
        }
        else if (!this.percent.equals(other.percent))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.cbr == null) ? 0 : this.cbr.hashCode());
        result = prime * result + ((this.mhz == null) ? 0 : this.mhz.hashCode());
        result = prime * result + ((this.percent == null) ? 0 : this.percent.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cbr (");

        sb.append(id);
        sb.append(", ").append(cbr);
        sb.append(", ").append(mhz);
        sb.append(", ").append(percent);

        sb.append(")");
        return sb.toString();
    }
}
