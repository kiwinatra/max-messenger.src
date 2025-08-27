package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ek  reason: default package */
public final class ek extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gk b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ek(gk gkVar, Continuation continuation) {
        super(2, continuation);
        this.b = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ek(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ek) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[LOOP:0: B:23:0x007e->B:25:0x0084, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.a
            r3 = 3
            r4 = 2
            r5 = 1
            gk r6 = r7.b
            if (r2 == 0) goto L_0x0028
            if (r2 == r5) goto L_0x0024
            if (r2 == r4) goto L_0x0020
            if (r2 != r3) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0078
        L_0x0018:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0054
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x003e
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.reflect.KProperty[] r8 = defpackage.gk.p
            kotlin.Lazy r8 = r6.i
            java.lang.Object r8 = r8.getValue()
            bsc r8 = (defpackage.bsc) r8
            r7.a = r5
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r1) goto L_0x003e
            return r1
        L_0x003e:
            asc r8 = (defpackage.asc) r8
            if (r8 == 0) goto L_0x004d
            r7.a = r4
            kotlin.reflect.KProperty[] r2 = defpackage.gk.p
            java.lang.Object r8 = r6.f(r8, r7)
            if (r8 != r1) goto L_0x0054
            return r1
        L_0x004d:
            java.lang.String r8 = r6.f
            java.lang.String r2 = "Didn't find section with Reactions. Warmup"
            defpackage.z68.c(r8, r2, new java.lang.Object[0])
        L_0x0054:
            kotlin.reflect.KProperty[] r8 = defpackage.gk.p
            pi r8 = r6.h()
            r7.a = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM animoji"
            d7d r2 = defpackage.d7d.a(r0, r2)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            oi r4 = new oi
            r4.<init>(r8, r2, r0)
            i6d r8 = r8.a
            java.lang.Object r8 = defpackage.i8b.q(r8, r3, r4, r7)
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r7 = r8.iterator()
        L_0x007e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0097
            java.lang.Object r8 = r7.next()
            dj r8 = (defpackage.dj) r8
            kotlin.reflect.KProperty[] r0 = defpackage.gk.p
            r6.getClass()
            hi r8 = defpackage.gk.l(r8)
            r6.j(r8)
            goto L_0x007e
        L_0x0097:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
