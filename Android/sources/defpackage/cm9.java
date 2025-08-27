package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cm9  reason: default package */
public final class cm9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ en9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cm9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.o = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cm9 cm9 = new cm9(this.o, this.c, continuation);
        cm9.b = obj;
        return cm9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 1
            en9 r6 = r10.o
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0025
            if (r1 == r2) goto L_0x0021
            if (r1 != r4) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a6
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0071
        L_0x0025:
            java.lang.Object r1 = r10.b
            mk4 r1 = (defpackage.mk4) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0066
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            d14 r11 = (defpackage.d14) r11
            java.util.List r1 = r10.c
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x00a9
            long r7 = r1.longValue()
            gaf r1 = r6.w
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            bm9 r9 = new bm9
            r9.<init>(r6, r7, r3)
            nk4 r1 = defpackage.ev0.d(r11, r1, r9, r2)
            kotlin.Lazy r11 = r6.J0
            java.lang.Object r11 = r11.getValue()
            wc9 r11 = (defpackage.wc9) r11
            r10.b = r1
            r10.a = r5
            java.lang.Object r11 = r11.a(r7, r10)
            if (r11 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r10.b = r3
            r10.a = r2
            java.lang.Object r11 = r1.a(r10)
            if (r11 != r0) goto L_0x0071
            return r0
        L_0x0071:
            ha9 r11 = (defpackage.ha9) r11
            if (r11 == 0) goto L_0x00a6
            r10.a = r4
            kotlin.reflect.KProperty[] r1 = defpackage.en9.A1
            r6.getClass()
            long r1 = r11.o
            r3 = 1
            long r1 = r1 - r3
            s85 r11 = r6.r1
            r11.getClass()
            dwf r3 = new dwf
            r3.<init>(r1)
            sz9 r11 = r11.b
            java.lang.Object r10 = r11.a(r3, r10)
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r11) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x009a:
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r11) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x00a3:
            if (r10 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00a9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
