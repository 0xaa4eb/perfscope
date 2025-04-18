/*
 * This file is generated by jOOQ.
 */
package com.perfscope.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SamplesView implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final Long time;
    private final Integer cpu;
    private final Integer pid;
    private final Integer tid;
    private final String command;
    private final String event;
    private final Object ipHex;
    private final String symbol;
    private final Long symOffset;
    private final String dsoShortName;
    private final Object toIpHex;
    private final String toSymbol;
    private final Long toSymOffset;
    private final String toDsoShortName;
    private final String branchTypeName;
    private final Boolean inTx;
    private final Long insnCount;
    private final Long cycCount;
    private final Object ipc;
    private final Integer flags;

    public SamplesView(SamplesView value) {
        this.id = value.id;
        this.time = value.time;
        this.cpu = value.cpu;
        this.pid = value.pid;
        this.tid = value.tid;
        this.command = value.command;
        this.event = value.event;
        this.ipHex = value.ipHex;
        this.symbol = value.symbol;
        this.symOffset = value.symOffset;
        this.dsoShortName = value.dsoShortName;
        this.toIpHex = value.toIpHex;
        this.toSymbol = value.toSymbol;
        this.toSymOffset = value.toSymOffset;
        this.toDsoShortName = value.toDsoShortName;
        this.branchTypeName = value.branchTypeName;
        this.inTx = value.inTx;
        this.insnCount = value.insnCount;
        this.cycCount = value.cycCount;
        this.ipc = value.ipc;
        this.flags = value.flags;
    }

    public SamplesView(
        Integer id,
        Long time,
        Integer cpu,
        Integer pid,
        Integer tid,
        String command,
        String event,
        Object ipHex,
        String symbol,
        Long symOffset,
        String dsoShortName,
        Object toIpHex,
        String toSymbol,
        Long toSymOffset,
        String toDsoShortName,
        String branchTypeName,
        Boolean inTx,
        Long insnCount,
        Long cycCount,
        Object ipc,
        Integer flags
    ) {
        this.id = id;
        this.time = time;
        this.cpu = cpu;
        this.pid = pid;
        this.tid = tid;
        this.command = command;
        this.event = event;
        this.ipHex = ipHex;
        this.symbol = symbol;
        this.symOffset = symOffset;
        this.dsoShortName = dsoShortName;
        this.toIpHex = toIpHex;
        this.toSymbol = toSymbol;
        this.toSymOffset = toSymOffset;
        this.toDsoShortName = toDsoShortName;
        this.branchTypeName = branchTypeName;
        this.inTx = inTx;
        this.insnCount = insnCount;
        this.cycCount = cycCount;
        this.ipc = ipc;
        this.flags = flags;
    }

    /**
     * Getter for <code>samples_view.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>samples_view.time</code>.
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * Getter for <code>samples_view.cpu</code>.
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * Getter for <code>samples_view.pid</code>.
     */
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Getter for <code>samples_view.tid</code>.
     */
    public Integer getTid() {
        return this.tid;
    }

    /**
     * Getter for <code>samples_view.command</code>.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Getter for <code>samples_view.event</code>.
     */
    public String getEvent() {
        return this.event;
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
    public Object getIpHex() {
        return this.ipHex;
    }

    /**
     * Getter for <code>samples_view.symbol</code>.
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * Getter for <code>samples_view.sym_offset</code>.
     */
    public Long getSymOffset() {
        return this.symOffset;
    }

    /**
     * Getter for <code>samples_view.dso_short_name</code>.
     */
    public String getDsoShortName() {
        return this.dsoShortName;
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
    public Object getToIpHex() {
        return this.toIpHex;
    }

    /**
     * Getter for <code>samples_view.to_symbol</code>.
     */
    public String getToSymbol() {
        return this.toSymbol;
    }

    /**
     * Getter for <code>samples_view.to_sym_offset</code>.
     */
    public Long getToSymOffset() {
        return this.toSymOffset;
    }

    /**
     * Getter for <code>samples_view.to_dso_short_name</code>.
     */
    public String getToDsoShortName() {
        return this.toDsoShortName;
    }

    /**
     * Getter for <code>samples_view.branch_type_name</code>.
     */
    public String getBranchTypeName() {
        return this.branchTypeName;
    }

    /**
     * Getter for <code>samples_view.in_tx</code>.
     */
    public Boolean getInTx() {
        return this.inTx;
    }

    /**
     * Getter for <code>samples_view.insn_count</code>.
     */
    public Long getInsnCount() {
        return this.insnCount;
    }

    /**
     * Getter for <code>samples_view.cyc_count</code>.
     */
    public Long getCycCount() {
        return this.cycCount;
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
    public Object getIpc() {
        return this.ipc;
    }

    /**
     * Getter for <code>samples_view.flags</code>.
     */
    public Integer getFlags() {
        return this.flags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SamplesView other = (SamplesView) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.time == null) {
            if (other.time != null)
                return false;
        }
        else if (!this.time.equals(other.time))
            return false;
        if (this.cpu == null) {
            if (other.cpu != null)
                return false;
        }
        else if (!this.cpu.equals(other.cpu))
            return false;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.tid == null) {
            if (other.tid != null)
                return false;
        }
        else if (!this.tid.equals(other.tid))
            return false;
        if (this.command == null) {
            if (other.command != null)
                return false;
        }
        else if (!this.command.equals(other.command))
            return false;
        if (this.event == null) {
            if (other.event != null)
                return false;
        }
        else if (!this.event.equals(other.event))
            return false;
        if (this.ipHex == null) {
            if (other.ipHex != null)
                return false;
        }
        else if (!this.ipHex.equals(other.ipHex))
            return false;
        if (this.symbol == null) {
            if (other.symbol != null)
                return false;
        }
        else if (!this.symbol.equals(other.symbol))
            return false;
        if (this.symOffset == null) {
            if (other.symOffset != null)
                return false;
        }
        else if (!this.symOffset.equals(other.symOffset))
            return false;
        if (this.dsoShortName == null) {
            if (other.dsoShortName != null)
                return false;
        }
        else if (!this.dsoShortName.equals(other.dsoShortName))
            return false;
        if (this.toIpHex == null) {
            if (other.toIpHex != null)
                return false;
        }
        else if (!this.toIpHex.equals(other.toIpHex))
            return false;
        if (this.toSymbol == null) {
            if (other.toSymbol != null)
                return false;
        }
        else if (!this.toSymbol.equals(other.toSymbol))
            return false;
        if (this.toSymOffset == null) {
            if (other.toSymOffset != null)
                return false;
        }
        else if (!this.toSymOffset.equals(other.toSymOffset))
            return false;
        if (this.toDsoShortName == null) {
            if (other.toDsoShortName != null)
                return false;
        }
        else if (!this.toDsoShortName.equals(other.toDsoShortName))
            return false;
        if (this.branchTypeName == null) {
            if (other.branchTypeName != null)
                return false;
        }
        else if (!this.branchTypeName.equals(other.branchTypeName))
            return false;
        if (this.inTx == null) {
            if (other.inTx != null)
                return false;
        }
        else if (!this.inTx.equals(other.inTx))
            return false;
        if (this.insnCount == null) {
            if (other.insnCount != null)
                return false;
        }
        else if (!this.insnCount.equals(other.insnCount))
            return false;
        if (this.cycCount == null) {
            if (other.cycCount != null)
                return false;
        }
        else if (!this.cycCount.equals(other.cycCount))
            return false;
        if (this.ipc == null) {
            if (other.ipc != null)
                return false;
        }
        else if (!this.ipc.equals(other.ipc))
            return false;
        if (this.flags == null) {
            if (other.flags != null)
                return false;
        }
        else if (!this.flags.equals(other.flags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.time == null) ? 0 : this.time.hashCode());
        result = prime * result + ((this.cpu == null) ? 0 : this.cpu.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.tid == null) ? 0 : this.tid.hashCode());
        result = prime * result + ((this.command == null) ? 0 : this.command.hashCode());
        result = prime * result + ((this.event == null) ? 0 : this.event.hashCode());
        result = prime * result + ((this.ipHex == null) ? 0 : this.ipHex.hashCode());
        result = prime * result + ((this.symbol == null) ? 0 : this.symbol.hashCode());
        result = prime * result + ((this.symOffset == null) ? 0 : this.symOffset.hashCode());
        result = prime * result + ((this.dsoShortName == null) ? 0 : this.dsoShortName.hashCode());
        result = prime * result + ((this.toIpHex == null) ? 0 : this.toIpHex.hashCode());
        result = prime * result + ((this.toSymbol == null) ? 0 : this.toSymbol.hashCode());
        result = prime * result + ((this.toSymOffset == null) ? 0 : this.toSymOffset.hashCode());
        result = prime * result + ((this.toDsoShortName == null) ? 0 : this.toDsoShortName.hashCode());
        result = prime * result + ((this.branchTypeName == null) ? 0 : this.branchTypeName.hashCode());
        result = prime * result + ((this.inTx == null) ? 0 : this.inTx.hashCode());
        result = prime * result + ((this.insnCount == null) ? 0 : this.insnCount.hashCode());
        result = prime * result + ((this.cycCount == null) ? 0 : this.cycCount.hashCode());
        result = prime * result + ((this.ipc == null) ? 0 : this.ipc.hashCode());
        result = prime * result + ((this.flags == null) ? 0 : this.flags.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SamplesView (");

        sb.append(id);
        sb.append(", ").append(time);
        sb.append(", ").append(cpu);
        sb.append(", ").append(pid);
        sb.append(", ").append(tid);
        sb.append(", ").append(command);
        sb.append(", ").append(event);
        sb.append(", ").append(ipHex);
        sb.append(", ").append(symbol);
        sb.append(", ").append(symOffset);
        sb.append(", ").append(dsoShortName);
        sb.append(", ").append(toIpHex);
        sb.append(", ").append(toSymbol);
        sb.append(", ").append(toSymOffset);
        sb.append(", ").append(toDsoShortName);
        sb.append(", ").append(branchTypeName);
        sb.append(", ").append(inTx);
        sb.append(", ").append(insnCount);
        sb.append(", ").append(cycCount);
        sb.append(", ").append(ipc);
        sb.append(", ").append(flags);

        sb.append(")");
        return sb.toString();
    }
}
