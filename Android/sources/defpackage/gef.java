package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: gef  reason: default package */
public enum gef {
    WAITING(0),
    PROCESSING(10),
    FAILED(20);
    
    public static final js9 b = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v3, types: [js9, java.lang.Object] */
    static {
        gef[] gefArr;
        x = EnumEntriesKt.enumEntries((E[]) gefArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    gef(int i) {
        this.a = i;
    }
}
