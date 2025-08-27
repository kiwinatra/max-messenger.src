package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: qw6  reason: default package */
public enum qw6 implements sw6 {
    VIRTUAL_KEY(1),
    KEYBOARD_TAP(3),
    CONTEXT_CLICK(6),
    GESTURE_START(12),
    CONFIRM(16);
    
    public final int a;

    static {
        qw6[] qw6Arr;
        y = EnumEntriesKt.enumEntries((E[]) qw6Arr);
    }

    /* access modifiers changed from: public */
    qw6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
