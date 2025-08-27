package defpackage;

import java.util.List;

/* renamed from: zub  reason: default package */
public final class zub extends hj0 implements gea {
    public static final qaf v = new qaf("privacy.restricted", (String) null, (String) null);
    public final long c;
    public final List o;

    public zub(long j, List list) {
        super(v);
        this.c = j;
        this.o = list;
    }

    public final long a() {
        return this.c;
    }

    public final String toString() {
        return "PrivacyRestrictedError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
