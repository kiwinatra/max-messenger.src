package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: agg  reason: default package */
public enum agg {
    SUCCESS("success"),
    DOWNLOADING("downloading"),
    CANCELLED("cancelled");
    
    public final String a;

    static {
        agg[] aggArr;
        w = EnumEntriesKt.enumEntries((E[]) aggArr);
    }

    /* access modifiers changed from: public */
    agg(String str) {
        this.a = str;
    }
}
