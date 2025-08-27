package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s5e  reason: default package */
public final class s5e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ t5e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s5e(t5e t5e, Continuation continuation) {
        super(2, continuation);
        this.b = t5e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s5e(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s5e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6 A[LOOP:0: B:26:0x00c0->B:28:0x00c6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r5) goto L_0x001c
            if (r1 != r4) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0073
        L_0x0014:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x005b
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r11)
            t5e r11 = r10.b
            r11.o = r3
            double r6 = java.lang.Math.random()
            r8 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0036
            r1 = r5
            goto L_0x0037
        L_0x0036:
            r1 = r3
        L_0x0037:
            r11.v = r1
            t5e r11 = r10.b
            kotlin.Lazy r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            gaf r11 = (defpackage.gaf) r11
            osa r11 = (defpackage.osa) r11
            gc8 r11 = r11.c()
            gc8 r11 = r11.t0()
            r5e r1 = new r5e
            r1.<init>(r4, r2)
            r10.a = r5
            java.lang.Object r11 = defpackage.ev0.I(r11, r1, r10)
            if (r11 != r0) goto L_0x005b
            return r0
        L_0x005b:
            a67 r11 = defpackage.z68.b
            boolean r1 = r11 instanceof defpackage.kva
            if (r1 == 0) goto L_0x0064
            kva r11 = (defpackage.kva) r11
            goto L_0x0065
        L_0x0064:
            r11 = r2
        L_0x0065:
            if (r11 != 0) goto L_0x006a
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x006a:
            r10.a = r4
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L_0x0073
            return r0
        L_0x0073:
            java.lang.String r11 = (java.lang.String) r11
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            t5e r11 = r10.b
            kotlin.Lazy r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            android.content.Context r11 = (android.content.Context) r11
            tm4 r1 = defpackage.tm4.a
            q4 r1 = r1.getAccessor()
            java.lang.Class<po5> r4 = defpackage.po5.class
            java.lang.Object r1 = r1.g(r4)
            po5 r1 = (defpackage.po5) r1
            android.net.Uri r0 = r1.f(r11, r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.SEND"
            r1.<init>(r4)
            java.lang.String r4 = "*/*"
            r1.setType(r4)
            java.lang.String r4 = "android.intent.extra.STREAM"
            r1.putExtra(r4, r0)
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)
            android.content.pm.PackageManager r2 = r11.getPackageManager()
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r2.queryIntentActivities(r1, r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00c0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00d5
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r4 = r4.packageName
            r5 = 3
            r11.grantUriPermission(r4, r0, r5)
            goto L_0x00c0
        L_0x00d5:
            r11.startActivity(r1)
            t5e r10 = r10.b
            r10.v = r3
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
