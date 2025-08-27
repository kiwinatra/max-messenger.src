package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: cpb  reason: default package */
public final class cpb {
    public static final /* synthetic */ KProperty[] i = {rae.s(cpb.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;", 0)};
    public final dy9 a;
    public final u50 b;
    public final jx3 c;
    public final wie d = o5a.U();
    public final xme e = f6e.a((Object) null);
    public final etc f;
    public final bpa g;
    public final AtomicReference h;

    public cpb(gaf gaf, dy9 dy9, u50 u50) {
        this.a = dy9;
        this.b = u50;
        this.c = e14.a(((osa) gaf).a());
        this.f = ((xy9) dy9).K;
        this.g = new bpa(1, this);
        this.h = new AtomicReference((Object) null);
    }

    public final void a() {
        KProperty[] kPropertyArr = i;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.d;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        this.e.setValue((Object) null);
        ((xy9) this.a).u(this.g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r12 = this;
            r0 = r12
            u50 r0 = r0.b
            dy9 r0 = r0.a
            xy9 r0 = (defpackage.xy9) r0
            cy9 r1 = r0.n()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.util.Map r1 = r1.c
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Object r1 = r1.get(r3)
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            boolean r3 = r1 instanceof java.lang.Long
            if (r3 == 0) goto L_0x0021
            r2 = r1
            java.lang.Long r2 = (java.lang.Long) r2
        L_0x0021:
            if (r2 == 0) goto L_0x0028
            long r1 = r2.longValue()
            goto L_0x002a
        L_0x0028:
            r1 = 0
        L_0x002a:
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
            boolean r2 = r0.A
            if (r2 == 0) goto L_0x0036
            r0.w()
            goto L_0x005d
        L_0x0036:
            if (r1 != 0) goto L_0x0040
            boolean r2 = r0.z
            if (r2 == 0) goto L_0x0040
            r0.q()
            goto L_0x005d
        L_0x0040:
            if (r1 != 0) goto L_0x004a
            boolean r1 = r0.y
            if (r1 == 0) goto L_0x004a
            r0.r()
            goto L_0x005d
        L_0x004a:
            zx9 r1 = new zx9
            r3 = r1
            r4 = r13
            r6 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r3.<init>(r4, r6, r8, r9, r10, r11)
            r0.s(r1)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpb.b(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void c() {
        aje v = ev0.v(this.c, (CoroutineContext) null, (f14) null, new apb(this, (Continuation) null), 3);
        this.d.setValue(this, i[0], v);
    }
}
