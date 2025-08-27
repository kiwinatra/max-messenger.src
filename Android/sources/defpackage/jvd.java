package defpackage;

import java.util.Queue;

/* renamed from: jvd  reason: default package */
public final class jvd extends ivd {
    public final Queue x0;
    public ivd y0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jvd(defpackage.kud r20) {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            long r1 = r0.a
            java.lang.Object r3 = r0.m
            r13 = r3
            java.util.Queue r13 = (java.util.Queue) r13
            java.lang.Object r3 = r13.peek()
            ivd r3 = (defpackage.ivd) r3
            mc9 r3 = r3.o
            java.lang.Object r4 = r13.peek()
            ivd r4 = (defpackage.ivd) r4
            zf7 r4 = r4.v
            long r5 = r0.d
            boolean r7 = r0.e
            java.lang.Object r8 = r13.peek()
            ivd r8 = (defpackage.ivd) r8
            int r8 = r8.z
            java.lang.String r9 = r0.h
            java.lang.Object r10 = r13.peek()
            ivd r10 = (defpackage.ivd) r10
            long r10 = r10.Y
            java.lang.Object r12 = r13.peek()
            ivd r12 = (defpackage.ivd) r12
            java.lang.String r12 = r12.Z
            java.lang.Object r14 = r13.peek()
            ivd r14 = (defpackage.ivd) r14
            r16 = r13
            long r13 = r14.v0
            cl4 r0 = r0.k
            r17 = r0
            r0 = r19
            r18 = r16
            r15 = r17
            r0.<init>(r1, r3, r4, r5, r7, r8, r9, r10, r12, r13, r15)
            r3 = r18
            r0.x0 = r3
            java.lang.Object r1 = r3.poll()
            ivd r1 = (defpackage.ivd) r1
            r0.y0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvd.<init>(kud):void");
    }

    public final ga9 A() {
        ivd ivd = this.y0;
        ivd.a = this.a;
        ga9 A = ivd.A();
        A.H = this.y0.w0;
        return A;
    }

    public final long B(long j, a32 a32) {
        ivd ivd = this.y0;
        ivd.a = this.a;
        boolean z = ivd instanceof gvd;
        cl4 cl4 = this.w0;
        String str = this.Z;
        long j2 = this.Y;
        long j3 = a32.a;
        if (z) {
            gvd gvd = (gvd) ivd;
            fvd fvd = new fvd(j3, gvd.z0);
            fvd.m = gvd.x0;
            fvd.n = gvd.y0;
            fvd.b = gvd.o;
            fvd.c = gvd.v;
            fvd.e = gvd.x;
            fvd.o = gvd.A0;
            fvd.h = gvd.y;
            fvd.d = gvd.w;
            fvd.i = j2;
            fvd.j = str;
            fvd.g = gvd.z;
            fvd.f = gvd.v0;
            fvd.k = cl4;
            gvd gvd2 = new gvd(fvd);
            this.y0 = gvd2;
            gvd2.a = this.a;
            return gvd2.B(j, a32);
        } else if (!(ivd instanceof lvd)) {
            return super.B(j, a32);
        } else {
            lvd lvd = (lvd) ivd;
            kvd kvd = new kvd(j3, lvd.x0, lvd.y0);
            kvd.b = lvd.o;
            kvd.c = lvd.v;
            kvd.e = lvd.x;
            kvd.h = lvd.y;
            kvd.d = lvd.w;
            kvd.i = j2;
            kvd.j = str;
            kvd.g = lvd.z;
            kvd.n = lvd.z0;
            kvd.f = lvd.v0;
            kvd.k = cl4;
            lvd lvd2 = new lvd(kvd);
            this.y0 = lvd2;
            lvd2.a = this.a;
            return lvd2.B(j, a32);
        }
    }

    public final void z() {
        super.z();
        Queue queue = this.x0;
        if (!queue.isEmpty()) {
            kud kud = new kud(this.c, queue, 2);
            kud.d = this.X;
            kud.f = this.v0;
            kud.e = this.x;
            kud.h = this.y;
            kud.k = this.w0;
            v().a(new jvd(kud));
        }
    }
}
