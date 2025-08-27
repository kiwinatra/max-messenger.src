package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ts9  reason: default package */
public enum ts9 {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    SINGLE("awaitSingle");
    
    public final String a;

    static {
        ts9[] ts9Arr;
        w = EnumEntriesKt.enumEntries((E[]) ts9Arr);
    }

    /* access modifiers changed from: public */
    ts9(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
