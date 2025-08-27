package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kta  reason: default package */
public final class kta extends SuspendLambda implements Function2 {
    public jta a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lta o;
    public final /* synthetic */ String v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kta(lta lta, String str, Continuation continuation) {
        super(2, continuation);
        this.o = lta;
        this.v = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kta kta = new kta(this.o, this.v, continuation);
        kta.c = obj;
        return kta;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kta) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: cwb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.b
            java.lang.String r3 = r11.v
            r4 = 2
            lta r5 = r11.o
            if (r2 == 0) goto L_0x0029
            if (r2 == r0) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00a9
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001f:
            jta r2 = r11.a
            java.lang.Object r6 = r11.c
            cwb r6 = (defpackage.cwb) r6
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0053
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.c
            r6 = r12
            cwb r6 = (defpackage.cwb) r6
            jta r2 = new jta
            r2.<init>(r3, r6)
            int r12 = defpackage.lta.f
            et4 r12 = r5.a()
            r12.getClass()
            java.util.concurrent.CopyOnWriteArraySet r12 = r12.e
            r12.add(r2)
            long r7 = defpackage.lta.e
            r11.c = r6
            r11.a = r2
            r11.b = r0
            java.lang.Object r12 = defpackage.xk4.c(r7, r11)
            if (r12 != r1) goto L_0x0053
            return r1
        L_0x0053:
            int r12 = defpackage.lta.f
            et4 r12 = r5.a()
            java.util.List r12 = r12.l
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0061:
            boolean r7 = r12.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r12.next()
            r9 = r7
            rr4 r9 = (defpackage.rr4) r9
            ht4 r9 = r9.a
            java.lang.String r9 = r9.a
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r9 == 0) goto L_0x0061
            goto L_0x007b
        L_0x007a:
            r7 = r8
        L_0x007b:
            if (r7 != 0) goto L_0x0097
            r12 = r6
            zvb r12 = (defpackage.zvb) r12
            r12.getClass()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            long r9 = defpackage.lta.e
            java.lang.String r7 = kotlin.time.Duration.m1402toStringimpl(r9)
            java.lang.String r9 = "download not started after "
            java.lang.String r7 = defpackage.a81.m(r9, r7)
            r3.<init>(r7)
            r12.p(r3)
        L_0x0097:
            vra r12 = new vra
            r12.<init>(r0, r5, r2)
            r11.c = r8
            r11.a = r8
            r11.b = r4
            java.lang.Object r11 = defpackage.wvb.a(r6, r12, r11)
            if (r11 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kta.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
