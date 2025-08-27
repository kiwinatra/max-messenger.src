package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: pw6  reason: default package */
public enum pw6 implements sw6 {
    CLOCK_TICK(4);
    
    public final int a;

    static {
        pw6[] pw6Arr;
        o = EnumEntriesKt.enumEntries((E[]) pw6Arr);
    }

    /* access modifiers changed from: public */
    pw6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
