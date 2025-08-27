package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zee  reason: default package */
public final class zee extends SuspendLambda implements Function2 {
    public afe a;
    public Function2 b;
    public Iterator c;
    public lg7 o;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ List x;
    public final /* synthetic */ afe y;
    public final /* synthetic */ Function2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zee(ArrayList arrayList, afe afe, p2c p2c, Continuation continuation) {
        super(2, continuation);
        this.x = arrayList;
        this.y = afe;
        this.z = p2c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zee zee = new zee((ArrayList) this.x, this.y, (p2c) this.z, continuation);
        zee.w = obj;
        return zee;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zee) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.v
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            lg7 r1 = r10.o
            java.util.Iterator r5 = r10.c
            kotlin.jvm.functions.Function2 r6 = r10.b
            afe r7 = r10.a
            java.lang.Object r8 = r10.w
            d14 r8 = (defpackage.d14) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0083
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r10.w
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0052
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.w
            d14 r11 = (defpackage.d14) r11
            r1 = r11
        L_0x0037:
            boolean r11 = defpackage.e14.f(r1)
            if (r11 == 0) goto L_0x0090
            r10.w = r1
            r10.a = r2
            r10.b = r2
            r10.c = r2
            r10.o = r2
            r10.v = r4
            r5 = 1800(0x708, double:8.893E-321)
            java.lang.Object r11 = defpackage.xk4.b(r5, r10)
            if (r11 != r0) goto L_0x0052
            return r0
        L_0x0052:
            java.util.List r11 = r10.x
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            afe r5 = r10.y
            kotlin.jvm.functions.Function2 r6 = r10.z
            r7 = r5
            r5 = r11
        L_0x0060:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0037
            java.lang.Object r11 = r5.next()
            lg7 r11 = (defpackage.lg7) r11
            r10.w = r1
            r10.a = r7
            r10.b = r6
            r10.c = r5
            r10.o = r11
            r10.v = r3
            r8 = 80
            java.lang.Object r8 = defpackage.xk4.b(r8, r10)
            if (r8 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r8 = r1
            r1 = r11
        L_0x0083:
            d14 r11 = r7.a
            yee r9 = new yee
            r9.<init>(r6, r1, r2)
            r1 = 3
            defpackage.ev0.v(r11, r2, r2, r9, r1)
            r1 = r8
            goto L_0x0060
        L_0x0090:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zee.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
