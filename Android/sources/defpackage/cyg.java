package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: cyg  reason: default package */
public final class cyg extends rxg {
    public final /* synthetic */ eyg c;

    public cyg(eyg eyg) {
        this.c = eyg;
    }

    public final boolean g() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        eyg eyg = this.c;
        vzg.N(i, eyg.v);
        int i2 = i + i;
        Object[] objArr = eyg.o;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.c.v;
    }
}
