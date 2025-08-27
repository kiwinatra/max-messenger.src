package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: m2g  reason: default package */
public enum m2g {
    SMALL(12, 2),
    BIG(16, 4);
    
    public final int a;
    public final int b;

    static {
        m2g[] m2gArr;
        w = EnumEntriesKt.enumEntries((E[]) m2gArr);
    }

    /* access modifiers changed from: public */
    m2g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
