package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kde  reason: default package */
public final class kde extends AtomicInteger implements mq4 {
    public final gce a;
    public final zi6 b;
    public final lde[] c;
    public Object[] o;

    public kde(int i, zi6 zi6, gce gce) {
        super(i);
        this.a = gce;
        this.b = zi6;
        lde[] ldeArr = new lde[i];
        for (int i2 = 0; i2 < i; i2++) {
            ldeArr[i2] = new lde(this, i2);
        }
        this.c = ldeArr;
        this.o = new Object[i];
    }

    public final void a(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            lde[] ldeArr = this.c;
            int length = ldeArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                lde lde = ldeArr[i2];
                lde.getClass();
                qq4.a(lde);
            }
            while (true) {
                i++;
                if (i < length) {
                    lde lde2 = ldeArr[i];
                    lde2.getClass();
                    qq4.a(lde2);
                } else {
                    this.o = null;
                    this.a.onError(th);
                    return;
                }
            }
        } else {
            n54.D(th);
        }
    }

    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (lde lde : this.c) {
                lde.getClass();
                qq4.a(lde);
            }
            this.o = null;
        }
    }

    public final boolean f() {
        return get() <= 0;
    }
}
