package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: qe9  reason: default package */
public enum qe9 {
    ACTIVE(0),
    DELETED(10),
    EDITED(20),
    DELAYED_FIRE_ERROR(30);
    
    public static final sq6 b = null;
    public final int a;

    static {
        qe9[] qe9Arr;
        y = EnumEntriesKt.enumEntries((E[]) qe9Arr);
        b = new sq6(15);
    }

    /* access modifiers changed from: public */
    qe9(int i) {
        this.a = i;
    }
}
