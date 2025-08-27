package defpackage;

import java.util.List;

/* renamed from: px3  reason: default package */
public final class px3 extends hj0 implements gea {
    public final long c;
    public final List o;

    public px3(qaf qaf, long j, List list) {
        super(qaf);
        this.c = j;
        this.o = list;
    }

    public final long a() {
        return this.c;
    }

    public final String toString() {
        return "ControlMessageAddError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
