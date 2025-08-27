package defpackage;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: dze  reason: default package */
public abstract class dze extends ty implements uye {
    public long c;
    public uye o;
    public long v;

    public final void A(long j, uye uye, long j2) {
        this.c = j;
        this.o = uye;
        if (j2 != LongCompanionObject.MAX_VALUE) {
            j = j2;
        }
        this.v = j;
    }

    public final int d(long j) {
        uye uye = this.o;
        uye.getClass();
        return uye.d(j - this.v);
    }

    public final long k(int i) {
        uye uye = this.o;
        uye.getClass();
        return uye.k(i) + this.v;
    }

    public final List p(long j) {
        uye uye = this.o;
        uye.getClass();
        return uye.p(j - this.v);
    }

    public final int t() {
        uye uye = this.o;
        uye.getClass();
        return uye.t();
    }

    public abstract void z();
}
