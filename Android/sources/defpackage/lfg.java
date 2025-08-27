package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: lfg  reason: default package */
public enum lfg {
    OPEN("OPEN"),
    CLOSE("CLOSE"),
    REFRESH("REFRESH");
    
    public final String a;

    static {
        lfg[] lfgArr;
        w = EnumEntriesKt.enumEntries((E[]) lfgArr);
    }

    /* access modifiers changed from: public */
    lfg(String str) {
        this.a = str;
    }
}
