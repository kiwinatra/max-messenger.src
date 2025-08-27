package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o28  reason: default package */
public final class o28 extends SuspendLambda implements Function2 {
    public kf0 a;
    public m1g b;
    public int c;
    public final /* synthetic */ srd o;
    public final /* synthetic */ Context v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o28(srd srd, Context context, Continuation continuation) {
        super(2, continuation);
        this.o = srd;
        this.v = context;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o28(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o28) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.c
            r2 = 0
            r3 = 1
            srd r4 = r8.o
            if (r1 == 0) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            m1g r0 = r8.b
            kf0 r8 = r8.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ca
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r4.c
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r9 = r9.getValue()
            tcf r9 = (defpackage.tcf) r9
            boolean r9 = r9.g()
            java.lang.Object r1 = r4.o
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            x23 r1 = (defpackage.x23) r1
            java.lang.String r9 = defpackage.nf0.b(r1, r9)
            android.content.Context r1 = r8.v
            if (r9 != 0) goto L_0x0058
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            js9 r9 = defpackage.fu4.k
            fu4 r9 = r9.e(r1)
            k2b r9 = r9.f()
            df0 r9 = r9.c()
            int r9 = r9.i
            r8.<init>(r9)
            return r8
        L_0x0058:
            kf0 r5 = new kf0
            r5.<init>(r9)
            android.util.LruCache r9 = defpackage.qhf.a
            android.util.LruCache r9 = defpackage.qhf.a
            java.lang.Object r9 = r9.get(r5)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            java.lang.String r6 = "LoadThemeBackgroundUseCase"
            if (r9 == 0) goto L_0x0082
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Load theme "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r0 = " from cache."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            defpackage.z68.c(r6, r8, new java.lang.Object[0])
            return r9
        L_0x0082:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = "Theme "
            r9.<init>(r7)
            r9.append(r5)
            java.lang.String r7 = " not cached, start loading from source."
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            defpackage.z68.c(r6, r9, new java.lang.Object[0])
            java.lang.Object r9 = r4.b
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r6 = r9.getValue()
            ff0 r6 = (defpackage.ff0) r6
            r6.getClass()
            java.util.LinkedHashMap r6 = defpackage.ff0.b(r1, r2)
            java.lang.Object r6 = r6.get(r5)
            m1g r6 = (defpackage.m1g) r6
            if (r6 == 0) goto L_0x00cf
            l1g r7 = r6.a
            if (r7 == 0) goto L_0x00cf
            java.lang.Object r9 = r9.getValue()
            ff0 r9 = (defpackage.ff0) r9
            r8.a = r5
            r8.b = r6
            r8.c = r3
            java.lang.Object r9 = r9.c(r1, r7, r8)
            if (r9 != r0) goto L_0x00c8
            return r0
        L_0x00c8:
            r8 = r5
            r0 = r6
        L_0x00ca:
            o5f r9 = (defpackage.o5f) r9
            r5 = r8
            r6 = r0
            goto L_0x00d0
        L_0x00cf:
            r9 = r2
        L_0x00d0:
            if (r6 == 0) goto L_0x00e3
            thf r8 = defpackage.ld8.B0(r6, r9)
            uhf r2 = new uhf
            r2.<init>(r8)
            r4.getClass()
            android.util.LruCache r8 = defpackage.qhf.a
            defpackage.qhf.a(r5, r2)
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o28.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
