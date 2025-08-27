package defpackage;

import java.util.Iterator;

/* renamed from: mx5  reason: default package */
public final class mx5 extends nx5 {
    public final /* synthetic */ Iterable[] a;

    public mx5(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [gm7, java.util.Iterator, java.lang.Object] */
    public final Iterator iterator() {
        lx5 lx5 = new lx5(this, this.a.length);
        ? obj = new Object();
        obj.b = fm7.v;
        obj.c = lx5;
        return obj;
    }
}
