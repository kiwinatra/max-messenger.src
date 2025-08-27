package defpackage;

import java.util.AbstractMap;

/* renamed from: fc7  reason: default package */
public final class fc7 extends tb7 {
    public final /* synthetic */ gc7 c;

    public fc7(gc7 gc7) {
        this.c = gc7;
    }

    public final Object get(int i) {
        gc7 gc7 = this.c;
        return new AbstractMap.SimpleImmutableEntry(gc7.o.v.b().get(i), gc7.o.w.get(i));
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.c.o.w.size();
    }
}
