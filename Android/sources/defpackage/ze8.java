package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ze8  reason: default package */
public enum ze8 {
    CLEAR_HISTORY(hfc.selector_clear_history, if8.a, (int) null),
    HIDE_MENU(hfc.ic_arrow_down_miui, (int) null, (int) null);
    
    public final int a;
    public final if8 b;
    public boolean c;
    public boolean o;
    public final Class v;

    static {
        ze8[] ze8Arr;
        z = EnumEntriesKt.enumEntries((E[]) ze8Arr);
    }

    /* access modifiers changed from: public */
    ze8(int i, if8 if8, Class cls) {
        this.a = i;
        this.b = if8;
        this.c = false;
        this.o = true;
        this.v = cls;
    }
}
