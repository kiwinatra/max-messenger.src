package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: x04  reason: default package */
public final class x04 extends q29 {
    public pp0 m;

    public final void g() {
        super.g();
        pp0 pp0 = this.m;
        if (pp0 != null) {
            aje aje = (aje) pp0.g;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            pp0.g = null;
            if (((pm7) pp0.f) == null) {
                pp0.f = ev0.v((d14) pp0.d, (CoroutineContext) null, (f14) null, new op0(pp0, (Continuation) null), 3);
            }
        }
    }

    public final void h() {
        super.h();
        pp0 pp0 = this.m;
        if (pp0 == null) {
            return;
        }
        if (((aje) pp0.g) == null) {
            bi4 bi4 = dq4.a;
            pp0.g = ev0.v((d14) pp0.d, lc8.a.t0(), (f14) null, new np0(pp0, (Continuation) null), 2);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Unit m(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.w04
            if (r0 == 0) goto L_0x0013
            r0 = r5
            w04 r0 = (defpackage.w04) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            w04 r0 = new w04
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r0.c
            if (r0 == 0) goto L_0x0031
            r4 = 1
            if (r0 != r4) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            r4 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
        L_0x0034:
            r4.getClass()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x04.m(kotlin.coroutines.Continuation):kotlin.Unit");
    }
}
