package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ylb  reason: default package */
public final class ylb extends SuspendLambda implements Function2 {
    public a32 a;
    public long b;
    public long c;
    public int o;
    public final /* synthetic */ zlb v;
    public final /* synthetic */ int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ylb(zlb zlb, int i, Continuation continuation) {
        super(2, continuation);
        this.v = zlb;
        this.w = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ylb(this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ylb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: a32} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r6 = r24
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.o
            r8 = 2
            r1 = 1
            zlb r9 = r6.v
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x001f
            if (r0 != r8) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x008c
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            long r0 = r6.c
            long r2 = r6.b
            a32 r4 = r6.a
            kotlin.ResultKt.throwOnFailure(r25)
            r21 = r0
            r19 = r2
            r18 = r4
            goto L_0x0068
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r25)
            ome r0 = r9.a
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            a32 r10 = (defpackage.a32) r10
            if (r10 != 0) goto L_0x0040
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0040:
            m72 r0 = r10.b
            long r11 = r0.a
            a89 r0 = r10.v
            if (r0 == 0) goto L_0x008f
            ha9 r0 = r0.a
            long r13 = r0.b
            r6.a = r10
            r6.b = r11
            r6.c = r13
            r6.o = r1
            long r1 = r10.a
            ur2 r0 = r9.c
            r3 = r11
            r5 = r24
            kotlin.Unit r0 = r0.a(r1, r3, r5)
            if (r0 != r7) goto L_0x0062
            return r7
        L_0x0062:
            r18 = r10
            r19 = r11
            r21 = r13
        L_0x0068:
            gaf r0 = r9.b
            osa r0 = (defpackage.osa) r0
            gc8 r0 = r0.c()
            xlb r1 = new xlb
            r23 = 0
            zlb r2 = r6.v
            int r3 = r6.w
            r15 = r1
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r21, r23)
            r2 = 0
            r6.a = r2
            r6.o = r8
            java.lang.Object r0 = defpackage.ev0.I(r0, r1, r6)
            if (r0 != r7) goto L_0x008c
            return r7
        L_0x008c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x008f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
