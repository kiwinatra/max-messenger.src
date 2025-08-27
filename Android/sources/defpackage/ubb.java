package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ubb  reason: default package */
public enum ubb {
    TIMEOUT(0),
    LEAVE_APP(1),
    LEAVE_SCREEN(2);
    
    public final int a;

    static {
        ubb[] ubbArr;
        w = EnumEntriesKt.enumEntries((E[]) ubbArr);
    }

    /* access modifiers changed from: public */
    ubb(int i) {
        this.a = i;
    }
}
