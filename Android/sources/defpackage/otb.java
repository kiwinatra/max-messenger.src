package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: otb  reason: default package */
public final class otb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ptb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public otb(ptb ptb, Continuation continuation) {
        super(2, continuation);
        this.c = ptb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        otb otb = new otb(this.c, continuation);
        otb.b = obj;
        return otb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((otb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r9.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x009a
        L_0x0014:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            d14 r10 = (defpackage.d14) r10
            r1 = r10
        L_0x0024:
            boolean r10 = defpackage.e14.f(r1)
            if (r10 == 0) goto L_0x00c8
            java.util.TimeZone r10 = java.util.TimeZone.getDefault()
            java.util.Calendar r10 = java.util.Calendar.getInstance(r10)
            r3 = 13
            int r10 = r10.get(r3)
            kotlin.time.Duration$Companion r3 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MINUTES
            long r4 = kotlin.time.DurationKt.toDuration((int) r2, (kotlin.time.DurationUnit) r3)
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.SECONDS
            long r6 = kotlin.time.DurationKt.toDuration((int) r10, (kotlin.time.DurationUnit) r6)
            long r4 = kotlin.time.Duration.m1388minusLRDsOJo(r4, r6)
            kotlin.time.Duration r10 = kotlin.time.Duration.m1351boximpl(r4)
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
            long r4 = r4.m1456getZEROUwyO8pc()
            kotlin.time.Duration r4 = kotlin.time.Duration.m1351boximpl(r4)
            long r5 = kotlin.time.DurationKt.toDuration((int) r2, (kotlin.time.DurationUnit) r3)
            kotlin.time.Duration r3 = kotlin.time.Duration.m1351boximpl(r5)
            java.lang.Comparable r10 = kotlin.ranges.RangesKt___RangesKt.coerceIn(r10, r4, r3)
            kotlin.time.Duration r10 = (kotlin.time.Duration) r10
            long r3 = r10.m1408unboximpl()
            ptb r10 = r9.c
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x0079
            goto L_0x008f
        L_0x0079:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x008f
            w78 r6 = defpackage.w78.o
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r3)
            java.lang.String r8 = "delay = "
            java.lang.String r7 = defpackage.a81.m(r8, r7)
            r8 = 0
            r5.d(r6, r10, r7, r8)
        L_0x008f:
            r9.b = r1
            r9.a = r2
            java.lang.Object r10 = defpackage.xk4.c(r3, r9)
            if (r10 != r0) goto L_0x009a
            return r0
        L_0x009a:
            ptb r10 = r9.c
            java.util.concurrent.ConcurrentHashMap r10 = r10.o
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x00a6:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0024
            java.lang.Object r3 = r10.next()
            tz9 r3 = (defpackage.tz9) r3
            java.lang.Object r4 = r3.getValue()
            mtb r4 = (defpackage.mtb) r4
            if (r4 != 0) goto L_0x00bb
            goto L_0x00a6
        L_0x00bb:
            mtb r5 = new mtb
            int r6 = r4.a
            int r4 = r4.b
            r5.<init>(r6, r4)
            r3.setValue(r5)
            goto L_0x00a6
        L_0x00c8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
