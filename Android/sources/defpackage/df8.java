package defpackage;

import java.io.Serializable;
import kotlin.enums.EnumEntriesKt;

/* renamed from: df8  reason: default package */
public enum df8 implements Serializable {
    SYSTEM(0),
    CUSTOM(1);
    
    public static final gga b = null;
    public final int a;

    static {
        df8[] df8Arr;
        w = EnumEntriesKt.enumEntries((E[]) df8Arr);
        b = new gga(14);
    }

    /* access modifiers changed from: public */
    df8(int i) {
        this.a = i;
    }
}
