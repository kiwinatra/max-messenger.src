package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: gu8  reason: default package */
public final class gu8 extends xag {
    public final ddb X;
    public final s85 Y;
    public final etc Z;
    public final ql6 b;
    public final opd c;
    public final om6 o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final ddb z;

    public gu8(ql6 ql6, opd opd, om6 om6) {
        ut8 ut8 = ut8.a;
        Lazy h = ut8.getAccessor().h(gaf.class);
        Lazy h2 = ut8.getAccessor().h(ln5.class);
        Lazy h3 = ut8.getAccessor().h(bud.class);
        Lazy h4 = ut8.getAccessor().h(Context.class);
        this.b = ql6;
        this.c = opd;
        this.o = om6;
        this.v = h;
        this.w = h2;
        this.x = h3;
        this.y = h4;
        String[] strArr = edb.m;
        ddb ddb = new ddb(strArr);
        this.z = ddb;
        ddb ddb2 = new ddb(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.X = ddb2;
        this.Y = new s85(0);
        this.Z = bs0.X(new on2(new wb(25, new i21(new i21(ddb, ddb2, new cl8(3, (Continuation) null, 2), 4), opd.x, new t86(3, (Continuation) null, 1), 4), this), 28), this.a, z6e.a, new ov3(new igf(ql6.y ? tva.b : tva.a)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.gu8 r4, java.io.File r5, android.net.Uri r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.du8
            if (r0 == 0) goto L_0x0013
            r0 = r7
            du8 r0 = (defpackage.du8) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            du8 r0 = new du8
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            gu8 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0061
        L_0x002b:
            r5 = move-exception
            goto L_0x0068
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x002b }
            boolean r7 = r5.exists()     // Catch:{ all -> 0x002b }
            if (r7 != 0) goto L_0x0061
            if (r6 == 0) goto L_0x0061
            kotlin.Lazy r7 = r4.y     // Catch:{ all -> 0x002b }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x002b }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ all -> 0x002b }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x002b }
            java.io.InputStream r6 = r7.openInputStream(r6)     // Catch:{ all -> 0x002b }
            if (r6 == 0) goto L_0x0061
            wc8 r7 = defpackage.wc8.c     // Catch:{ all -> 0x002b }
            r0.a = r4     // Catch:{ all -> 0x002b }
            r0.o = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = r7.q(r5, r6, r0)     // Catch:{ all -> 0x002b }
            if (r5 != r1) goto L_0x0061
            goto L_0x0087
        L_0x0061:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0072
        L_0x0068:
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)
        L_0x0072:
            java.lang.Throwable r5 = kotlin.Result.m26exceptionOrNullimpl(r5)
            if (r5 == 0) goto L_0x0085
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "failed to copy picked image"
            defpackage.z68.f(r4, r6, r5)
        L_0x0085:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu8.j(gu8, java.io.File, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
