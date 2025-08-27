package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: g5d  reason: default package */
public enum g5d {
    END(pkc.call_finished),
    INCOMING(pkc.call_incoming),
    BEEP(pkc.call_ringing),
    BUSY(pkc.call_busy),
    CONNECTING(pkc.call_connecting),
    CONNECTED(pkc.call_connected);
    
    public final int a;

    static {
        g5d[] g5dArr;
        z = EnumEntriesKt.enumEntries((E[]) g5dArr);
    }

    /* access modifiers changed from: public */
    g5d(int i) {
        this.a = i;
    }
}
