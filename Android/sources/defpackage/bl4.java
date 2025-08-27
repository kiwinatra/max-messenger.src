package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntriesKt;

/* renamed from: bl4  reason: default package */
public enum bl4 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);
    
    public static final bk3 o = null;
    public final byte a;
    public final Lazy b;
    public final Lazy c;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, bk3] */
    static {
        bl4[] bl4Arr;
        y = EnumEntriesKt.enumEntries((E[]) bl4Arr);
        o = new Object();
    }

    /* access modifiers changed from: public */
    bl4(byte b2) {
        this.a = b2;
        this.b = LazyKt.lazy(new al4(this, 0));
        this.c = LazyKt.lazy(new al4(this, 1));
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
