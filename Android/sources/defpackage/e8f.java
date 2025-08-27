package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e8f  reason: default package */
public final class e8f extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ f8f c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e8f(f8f f8f, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = f8f;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e8f(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e8f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r5) goto L_0x0026
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x019f
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001f:
            long r4 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0136
        L_0x0026:
            long r5 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0056
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r12)
            f8f r12 = r11.c
            java.lang.String r12 = r12.a
            java.lang.String r1 = "start init vendor services"
            defpackage.z68.c(r12, r1, new java.lang.Object[0])
            long r6 = java.lang.System.nanoTime()
            f8f r12 = r11.c
            r11.a = r6
            r11.b = r5
            cxe r12 = r12.j()
            xt6 r12 = (defpackage.xt6) r12
            kotlin.Lazy r12 = r12.c
            r12.getValue()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r5 = r6
        L_0x0056:
            pf6 r12 = defpackage.zl4.a
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            r12.getClass()
            android.util.DisplayMetrics r12 = r1.getDisplayMetrics()
            int r12 = r12.densityDpi
            switch(r12) {
                case 120: goto L_0x0088;
                case 140: goto L_0x0085;
                case 160: goto L_0x0082;
                case 180: goto L_0x007f;
                case 200: goto L_0x007f;
                case 220: goto L_0x007f;
                case 240: goto L_0x007c;
                case 260: goto L_0x0079;
                case 280: goto L_0x0079;
                case 300: goto L_0x0079;
                case 320: goto L_0x0076;
                case 340: goto L_0x0073;
                case 360: goto L_0x0073;
                case 400: goto L_0x0073;
                case 420: goto L_0x0073;
                case 440: goto L_0x0073;
                case 480: goto L_0x0070;
                case 560: goto L_0x006d;
                case 600: goto L_0x006d;
                case 640: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r12 = r2
            goto L_0x008a
        L_0x006a:
            zl4 r12 = defpackage.zl4.x
            goto L_0x008a
        L_0x006d:
            zl4 r12 = defpackage.zl4.x
            goto L_0x008a
        L_0x0070:
            zl4 r12 = defpackage.zl4.w
            goto L_0x008a
        L_0x0073:
            zl4 r12 = defpackage.zl4.w
            goto L_0x008a
        L_0x0076:
            zl4 r12 = defpackage.zl4.v
            goto L_0x008a
        L_0x0079:
            zl4 r12 = defpackage.zl4.v
            goto L_0x008a
        L_0x007c:
            zl4 r12 = defpackage.zl4.o
            goto L_0x008a
        L_0x007f:
            zl4 r12 = defpackage.zl4.o
            goto L_0x008a
        L_0x0082:
            zl4 r12 = defpackage.zl4.c
            goto L_0x008a
        L_0x0085:
            zl4 r12 = defpackage.zl4.c
            goto L_0x008a
        L_0x0088:
            zl4 r12 = defpackage.zl4.b
        L_0x008a:
            if (r12 == 0) goto L_0x00dd
            f8f r1 = r11.c
            java.lang.String r1 = r1.a
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0095
            goto L_0x00aa
        L_0x0095:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00aa
            w78 r8 = defpackage.w78.o
            java.lang.String r9 = r12.name()
            java.lang.String r10 = "Density is "
            java.lang.String r9 = defpackage.a81.m(r10, r9)
            r7.d(r8, r1, r9, r2)
        L_0x00aa:
            f8f r1 = r11.c
            e24 r1 = r1.d()
            lq r1 = (defpackage.lq) r1
            r1.getClass()
            kotlin.Lazy r1 = defpackage.lq.d
            java.lang.Object r1 = r1.getValue()
            kof r1 = (defpackage.kof) r1
            if (r1 == 0) goto L_0x00dd
            java.lang.String r12 = r12.name()
            kof r1 = defpackage.kof.a
            java.lang.String r1 = "density"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r1, r12)
            java.util.Map r12 = kotlin.collections.MapsKt.mapOf(r12)
            boolean r1 = defpackage.kof.b
            if (r1 == 0) goto L_0x00d4
            goto L_0x00dd
        L_0x00d4:
            kxd r1 = defpackage.kof.e     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r1 = r2
        L_0x00da:
            r1.f(r12)     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            f8f r12 = r11.c
            e24 r12 = r12.d()
            f8f r1 = r11.c
            kotlin.Lazy r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            vpa r1 = (defpackage.vpa) r1
            r1.getClass()
            r1 = 6355(0x18d3, float:8.905E-42)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r7 = "version_code"
            r12.b(r7, r1)
            f8f r12 = r11.c
            e24 r12 = r12.d()
            f8f r1 = r11.c
            kotlin.Lazy r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            vpa r1 = (defpackage.vpa) r1
            r1.getClass()
            r12.getClass()
            f8f r12 = r11.c
            x23 r12 = r12.c()
            qjd r12 = (defpackage.qjd) r12
            jha r12 = r12.t()
            co1 r12 = defpackage.kv0.h(r12)
            bx r1 = new bx
            f8f r7 = r11.c
            r8 = 13
            r1.<init>((int) r8, (java.lang.Object) r7)
            r11.a = r5
            r11.b = r4
            java.lang.Object r12 = r12.e(r1, r11)
            if (r12 != r0) goto L_0x0135
            return r0
        L_0x0135:
            r4 = r5
        L_0x0136:
            f8f r12 = r11.c
            java.lang.String r12 = r12.a
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x013f
            goto L_0x0161
        L_0x013f:
            boolean r6 = r1.c()
            if (r6 == 0) goto L_0x0161
            w78 r6 = defpackage.w78.o
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion
            long r7 = java.lang.System.nanoTime()
            long r7 = r7 - r4
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.NANOSECONDS
            long r4 = kotlin.time.DurationKt.toDuration((long) r7, (kotlin.time.DurationUnit) r4)
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r4)
            java.lang.String r5 = "init time "
            java.lang.String r4 = defpackage.a81.m(r5, r4)
            r1.d(r6, r12, r4, r2)
        L_0x0161:
            boolean r12 = r11.o
            if (r12 == 0) goto L_0x019f
            f8f r12 = r11.c
            r11.b = r3
            java.lang.String r1 = r12.a
            java.lang.String r3 = "checkTokenChanged"
            defpackage.z68.c(r1, r3, new java.lang.Object[0])
            x23 r1 = r12.c()
            qjd r1 = (defpackage.qjd) r1
            ls7 r1 = r1.g
            java.lang.String r3 = "user.fcmToken"
            java.lang.String r1 = r1.getString(r3, r2)
            if (r1 == 0) goto L_0x019a
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0187
            goto L_0x019a
        L_0x0187:
            a8f r2 = new a8f
            r2.<init>(r1, r12)
            java.lang.Object r11 = r12.h(r2, r11)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L_0x019c
        L_0x019a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x019c:
            if (r11 != r0) goto L_0x019f
            return r0
        L_0x019f:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
