package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: sb7  reason: default package */
public final class sb7 extends tb7 {
    public final transient int c;
    public final transient int o;
    public final /* synthetic */ tb7 v;

    public sb7(tb7 tb7, int i, int i2) {
        this.v = tb7;
        this.c = i;
        this.o = i2;
    }

    public final Object[] e() {
        return this.v.e();
    }

    public final int f() {
        return this.v.g() + this.c + this.o;
    }

    public final int g() {
        return this.v.g() + this.c;
    }

    public final Object get(int i) {
        b0h.g(i, this.o);
        return this.v.get(i + this.c);
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean l() {
        return true;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int size() {
        return this.o;
    }

    /* renamed from: y */
    public final tb7 subList(int i, int i2) {
        b0h.j(i, i2, this.o);
        int i3 = this.c;
        return this.v.subList(i + i3, i2 + i3);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
