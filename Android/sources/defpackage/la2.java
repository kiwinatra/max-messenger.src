package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: la2  reason: default package */
public final class la2 extends qm implements lcf {
    public final long X;
    public final int Y;
    public final long Z;
    public final long o;
    public final long v;
    public final boolean v0;
    public final long w;
    public final boolean w0;
    public final long x;
    public final bl4 x0;
    public final String y;
    public final int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public la2(long j, long j2, long j3, long j4, long j5, String str, int i, int i2, long j6, bl4 bl4, int i3) {
        super(j);
        int i4 = i3;
        String str2 = (i4 & 32) != 0 ? null : str;
        int i5 = (i4 & 64) != 0 ? 0 : i;
        int i6 = (i4 & 256) != 0 ? 0 : i2;
        long j7 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0 : j6;
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
        this.y = str2;
        this.z = i5;
        this.X = 0;
        this.Y = i6;
        this.Z = j7;
        this.v0 = false;
        this.w0 = true;
        this.x0 = bl4;
    }

    public final void e(ibf ibf) {
        tdf j;
        ma2 ma2 = (ma2) ibf;
        try {
            Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new ka2(this, ma2, (Continuation) null));
        } catch (TamErrorException unused2) {
            String name = la2.class.getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.x, name, "fail to get missed contacts for chat history", (Throwable) null);
            }
        }
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((sa2) rmVar.Z.getValue()).a(this.a, this.o, this.w, this.z, this.X, this.Y, this.Z, ma2, this.x0);
        long j2 = this.x;
        if (j2 != 0 && (j = s().j(j2)) != null) {
            rm rmVar2 = this.c;
            if (rmVar2 == null) {
                rmVar2 = null;
            }
            ((jqg) rmVar2.g.getValue()).a((qvd) j.f);
        }
    }

    public final fbf g() {
        return new yt(this.v, this.w, this.z, this.X, this.Y, this.Z, this.v0, this.w0, this.y, this.x0);
    }

    public final void h(qaf qaf) {
        vk3 m;
        if (Intrinsics.areEqual((Object) "not.found", (Object) qaf.b)) {
            a32 G = l().G(this.o);
            if (!(G == null || !G.N() || (m = G.m()) == null)) {
                m().w(m.r());
            }
        } else {
            k().c(new hj0(this.a, qaf));
        }
        long j = this.x;
        if (j == 0) {
            return;
        }
        if (qaf instanceof aaf) {
            s().n(j, gef.WAITING);
        } else {
            s().d(j);
        }
    }
}
