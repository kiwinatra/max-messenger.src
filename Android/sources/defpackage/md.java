package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: md  reason: default package */
public enum md {
    COLD_START("COLD_START"),
    WARM_START("WARM_START"),
    GO("GO");
    
    public final String a;

    static {
        md[] mdVarArr;
        w = EnumEntriesKt.enumEntries((E[]) mdVarArr);
    }

    /* access modifiers changed from: public */
    md(String str) {
        this.a = str;
    }
}
