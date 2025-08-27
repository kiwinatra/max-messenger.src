package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: rq1  reason: default package */
public enum rq1 implements sq1 {
    CHAT_HEAD("CHAT_HEAD"),
    PROFILE("PROFILE"),
    ATTACH("ATTACH"),
    HISTORY("HISTORY"),
    CALL_CONTACT("CALL_CONTACT"),
    CONTACT("CONTACT"),
    RECALL("RECALL");
    
    public final String a;

    static {
        rq1[] rq1Arr;
        X = EnumEntriesKt.enumEntries((E[]) rq1Arr);
    }

    /* access modifiers changed from: public */
    rq1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
