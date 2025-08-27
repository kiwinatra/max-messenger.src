package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: m28  reason: default package */
public final class m28 extends SuspendLambda implements Function2 {
    public n28 a;
    public kf0 b;
    public m1g c;
    public boolean o;
    public int v;
    public final /* synthetic */ n28 w;
    public final /* synthetic */ kf0 x;
    public final /* synthetic */ Context y;
    public final /* synthetic */ boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m28(n28 n28, kf0 kf0, Context context, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.w = n28;
        this.x = kf0;
        this.y = context;
        this.z = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m28(this.w, this.x, this.y, this.z, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m28) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.v
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            boolean r0 = r10.o
            m1g r1 = r10.c
            kf0 r2 = r10.b
            n28 r10 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0077
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r11)
            n28 r11 = r10.w
            r11.getClass()
            android.util.LruCache r1 = defpackage.qhf.a
            r1 = 0
            kf0 r3 = r10.x
            if (r3 != 0) goto L_0x0030
            r4 = r1
            goto L_0x0038
        L_0x0030:
            android.util.LruCache r4 = defpackage.qhf.a
            java.lang.Object r4 = r4.get(r3)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L_0x0038:
            if (r4 == 0) goto L_0x003b
            return r4
        L_0x003b:
            kotlin.Lazy r4 = r11.b
            java.lang.Object r5 = r4.getValue()
            ff0 r5 = (defpackage.ff0) r5
            r5.getClass()
            android.content.Context r5 = r10.y
            java.util.LinkedHashMap r6 = defpackage.ff0.b(r5, r3)
            java.lang.Object r6 = r6.get(r3)
            m1g r6 = (defpackage.m1g) r6
            if (r6 == 0) goto L_0x0092
            boolean r7 = r10.z
            l1g r8 = r6.a
            if (r8 == 0) goto L_0x007e
            java.lang.Object r1 = r4.getValue()
            ff0 r1 = (defpackage.ff0) r1
            r10.a = r11
            r10.b = r3
            r10.c = r6
            r10.o = r7
            r10.v = r2
            java.lang.Object r10 = r1.c(r5, r8, r10)
            if (r10 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r2 = r3
            r1 = r6
            r0 = r7
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x0077:
            o5f r11 = (defpackage.o5f) r11
            r7 = r0
            r6 = r1
            r3 = r2
            r1 = r11
            r11 = r10
        L_0x007e:
            uhf r10 = new uhf
            thf r0 = defpackage.ld8.B0(r6, r1)
            r10.<init>(r0)
            if (r7 == 0) goto L_0x0091
            r11.getClass()
            android.util.LruCache r11 = defpackage.qhf.a
            defpackage.qhf.a(r3, r10)
        L_0x0091:
            r1 = r10
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m28.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
