package defpackage;

import java.util.Objects;

/* renamed from: bja  reason: default package */
public final class bja extends yl0 {
    public final cla a;
    public final Object[] b;
    public int c;
    public boolean o;
    public volatile boolean v;

    public bja(cla cla, Object[] objArr) {
        this.a = cla;
        this.b = objArr;
    }

    public final void clear() {
        this.c = this.b.length;
    }

    public final void dispose() {
        this.v = true;
    }

    public final boolean f() {
        return this.v;
    }

    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    public final int p(int i) {
        this.o = true;
        return 1;
    }

    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
