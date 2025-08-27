package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: j88  reason: default package */
public final class j88 extends qm implements lcf {
    public final long X;
    public final long Y;
    public final kcf Z = new kcf();
    public final String o;
    public final long v;
    public final long w;
    public final long x;
    public final String y;
    public final long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j88(long j, String str, long j2, long j3, long j4, String str2, long j5, long j6, long j7) {
        super(j);
        this.o = str;
        this.v = j2;
        this.w = j3;
        this.x = j4;
        this.y = str2;
        this.z = j5;
        this.X = j6;
        this.Y = j7;
    }

    public final kcf a() {
        return this.Z;
    }

    public final void e(ibf ibf) {
        Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new i88(this, (l88) ibf, (Continuation) null));
    }

    public final fbf g() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return new k88(this.o, ((fn4) rmVar.b.getValue()).d(), this.v, this.w, this.x, this.y, this.z, this.X, this.Y);
    }

    public final void h(qaf qaf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((z88) rmVar.o.getValue()).a(qaf);
    }
}
