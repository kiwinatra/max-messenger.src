package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: y38  reason: default package */
public final class y38 implements fe6 {
    public static final /* synthetic */ KProperty[] i = {rae.s(y38.class, "framesJob", "getFramesJob()Lkotlinx/coroutines/Job;", 0)};
    public ce6 a = ce6.d;
    public final String b = y38.class.getName();
    public final jx3 c;
    public final xme d;
    public final wie e;
    public final Lazy f;
    public final int g;
    public volatile long h;

    public y38(gaf gaf, ccb ccb) {
        int i2;
        this.c = e14.a(((osa) gaf).b().plus(new x38(this)));
        this.d = f6e.a(CollectionsKt.emptyList());
        this.e = o5a.U();
        this.f = LazyKt.lazy(new ck7(13));
        int ordinal = ccb.a.ordinal();
        if (ordinal == 0) {
            i2 = 5;
        } else if (ordinal == 1) {
            i2 = 10;
        } else if (ordinal == 2) {
            i2 = 20;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.g = i2;
    }

    public final ce6 h() {
        return this.a;
    }

    public final boolean i() {
        g4g g4g = this.a.a;
        if (g4g == null) {
            return false;
        }
        Uri h2 = g4g.h();
        int i2 = v0g.a;
        String scheme = h2.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.v38
            if (r0 == 0) goto L_0x0013
            r0 = r12
            v38 r0 = (defpackage.v38) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            v38 r0 = new v38
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r9 = r0.b
            y38 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0069
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r12)
            int r12 = r9.g
            int r12 = r12 - r3
            double r4 = (double) r12
            float r10 = (float) r10
            long r11 = r9.h
            int r2 = r9.g
            long r6 = (long) r2
            long r11 = r11 / r6
            float r11 = (float) r11
            float r10 = r10 / r11
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            double r10 = (double) r10
            double r10 = java.lang.Math.min(r4, r10)
            int r10 = (int) r10
            xme r11 = r9.d
            eu5 r12 = new eu5
            r2 = 3
            r12.<init>(r11, r10, r2)
            r0.a = r9
            r0.b = r10
            r0.v = r3
            java.lang.Object r12 = defpackage.bs0.C(r12, r0)
            if (r12 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0069:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x007f
            de6 r11 = new de6
            java.lang.Object r9 = r12.get(r9)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            ce6 r10 = r10.a
            int r12 = r10.b
            int r10 = r10.c
            r11.<init>(r12, r10, r9)
            goto L_0x0080
        L_0x007f:
            r11 = 0
        L_0x0080:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y38.j(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void prepare() {
        g4g g4g = this.a.a;
        if (g4g == null) {
            z68.f(this.b, "You should call init before prepare!", (Throwable) null);
            return;
        }
        aje v = ev0.v(this.c, (CoroutineContext) null, (f14) null, new w38(this, g4g, (Continuation) null), 3);
        this.e.setValue(this, i[0], v);
    }
}
