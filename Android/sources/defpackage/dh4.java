package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dh4  reason: default package */
public final class dh4 implements tf5 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public dh4(int i) {
        if ((i & 1) != 0) {
            this.b = new nce(65496, 2, "image/jpeg");
        } else {
            this.b = new fo7();
        }
    }

    private final void a() {
    }

    private final void b(long j, long j2) {
    }

    public final void U(xf5 xf5) {
        switch (this.a) {
            case 0:
                zpf B = xf5.B(0, 3);
                xf5.M(new me0(-9223372036854775807L));
                xf5.v();
                ea6 ea6 = (ea6) this.b;
                ba6 a2 = ea6.a();
                a2.m = vq9.l("text/x-unknown");
                a2.i = ea6.n;
                B.e(new ea6(a2));
                return;
            default:
                ((tf5) this.b).U(xf5);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((tf5) this.b).d(j, j2);
                return;
        }
    }

    public final int g(vf5 vf5, yl4 yl4) {
        switch (this.a) {
            case 0:
                return ((hf4) vf5).e(IntCompanionObject.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((tf5) this.b).g(vf5, yl4);
        }
    }

    public final boolean n(vf5 vf5) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((tf5) this.b).n(vf5);
        }
    }

    public final void release() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((tf5) this.b).release();
                return;
        }
    }

    public dh4(ea6 ea6) {
        this.b = ea6;
    }
}
