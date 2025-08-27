package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: cvd  reason: default package */
public final class cvd extends ivd {
    public static final /* synthetic */ int B0 = 0;
    public final long A0;
    public final s58 x0;
    public final float y0;
    public final boolean z0;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0.b == 0.0d) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cvd(defpackage.bvd r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            s58 r0 = r6.m
            r5.x0 = r0
            float r1 = r6.n
            r5.y0 = r1
            long r1 = r6.o
            r5.A0 = r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x002c
            s58 r0 = r6.m
            double r1 = r0.a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            double r0 = r0.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
        L_0x002c:
            r6 = 1
            r5.z0 = r6
            goto L_0x0034
        L_0x0030:
            boolean r6 = r6.l
            r5.z0 = r6
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvd.<init>(bvd):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    /* JADX WARNING: type inference failed for: r7v1, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [j10, java.lang.Object] */
    public final ga9 A() {
        ? obj = new Object();
        long m = ((qjd) i()).m();
        long j = this.A0;
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = TimeUnit.SECONDS.toMillis(j) + m;
        }
        ? obj2 = new Object();
        obj2.a = this.x0;
        obj2.g = this.y0;
        obj2.b = j;
        obj2.c = m;
        obj2.d = j2;
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        obj2.f = ((fn4) hud.d.getValue()).a();
        u10 a = obj2.a();
        ? obj3 = new Object();
        obj3.v = a;
        obj3.a = g20.v0;
        if (this.z0) {
            obj3.i = d20.v;
        }
        obj.a = CollectionsKt.listOf(obj3.a());
        w28 c = obj.c();
        ga9 ga9 = new ga9();
        ga9.g = null;
        ga9.n = c;
        return ga9;
    }

    public final long B(long j, a32 a32) {
        long B = super.B(j, a32);
        if (this.z0) {
            z68.c("cvd", "specifyLocation, start TaskLocationRequest to define location", new Object[0]);
            v().b(new vud(((qjd) i()).n(), j, this.A0 != 0));
        }
        return B;
    }
}
