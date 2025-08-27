package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: k7d  reason: default package */
public final class k7d extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ Function1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k7d(o7d o7d, ued ued, Continuation continuation) {
        super(1, continuation);
        this.b = o7d;
        this.c = ued;
    }

    public final Continuation create(Continuation continuation) {
        return new k7d(this.b, (ued) this.c, continuation);
    }

    public final Object invoke(Object obj) {
        return ((k7d) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r5) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0056
        L_0x0013:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = r3
        L_0x001f:
            kotlin.coroutines.CoroutineContext r11 = r10.getContext()
            boolean r11 = defpackage.kv0.I(r11)
            if (r11 == 0) goto L_0x0099
            o7d r11 = r10.b
            rne r11 = r11.a()
            r10.a = r5
            r11.getClass()
            java.lang.String r1 = "\n            SELECT id FROM events\n            WHERE status = 0\n                AND id > ?\n            ORDER BY id ASC\n            LIMIT ?\n        "
            r8 = 2
            d7d r1 = defpackage.d7d.a(r8, r1)
            r1.k(r5, r6)
            long r6 = (long) r2
            r1.k(r8, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            qne r7 = new qne
            r8 = 2
            r7.<init>(r11, r1, r8)
            i6d r11 = r11.a
            java.lang.Object r11 = defpackage.i8b.q(r11, r6, r7, r10)
            if (r11 != r0) goto L_0x0056
            return r0
        L_0x0056:
            java.util.List r11 = (java.util.List) r11
            o7d r1 = r10.b
            java.lang.String r1 = r1.c
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x0061
            goto L_0x0077
        L_0x0061:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0077
            w78 r7 = defpackage.w78.o
            int r8 = r11.size()
            java.lang.String r9 = "Selecting batch of waiting to send logs, ids size="
            java.lang.String r8 = defpackage.wj6.h(r8, r9)
            r9 = 0
            r6.d(r7, r1, r8, r9)
        L_0x0077:
            kotlin.jvm.functions.Function1 r1 = r10.c
            r1.invoke(r11)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.lastOrNull(r11)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0089
            long r6 = r1.longValue()
            goto L_0x008a
        L_0x0089:
            r6 = r3
        L_0x008a:
            int r11 = r11.size()
            if (r11 >= r2) goto L_0x001f
            o7d r10 = r10.b
            java.lang.String r10 = r10.c
            java.lang.String r11 = "Last batch is not size of limit, stopping cycle"
            defpackage.z68.c(r10, r11, new java.lang.Object[0])
        L_0x0099:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
