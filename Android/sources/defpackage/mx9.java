package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: mx9  reason: default package */
public final class mx9 implements s2f, Serializable {
    public final int a;

    public mx9(int i) {
        m5a.m(i, "expectedValuesPerKey");
        this.a = i;
    }

    public final Object get() {
        return new ArrayList(this.a);
    }
}
