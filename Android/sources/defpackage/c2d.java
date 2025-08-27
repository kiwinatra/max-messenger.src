package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: c2d  reason: default package */
public enum c2d {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");
    
    public static final v02 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v3, types: [v02, java.lang.Object] */
    static {
        c2d[] c2dArr;
        y = EnumEntriesKt.enumEntries((E[]) c2dArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    c2d(String str) {
        this.a = str;
    }
}
