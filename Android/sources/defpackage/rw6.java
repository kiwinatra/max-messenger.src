package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: rw6  reason: default package */
public enum rw6 implements sw6 {
    LONG_PRESS(0),
    REJECT(17);
    
    public final int a;

    static {
        rw6[] rw6Arr;
        v = EnumEntriesKt.enumEntries((E[]) rw6Arr);
    }

    /* access modifiers changed from: public */
    rw6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
