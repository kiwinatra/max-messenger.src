package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ve5  reason: default package */
public final class ve5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ye5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ve5(ye5 ye5, String str, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.o = ye5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ve5 ve5 = new ve5(this.o, this.c, continuation);
        ve5.b = obj;
        return ve5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ve5) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005b
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004f
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.b
            r1 = r7
            ds5 r1 = (defpackage.ds5) r1
            np2 r7 = new np2
            x3b r4 = defpackage.x3b.EXTERNAL_CALLBACK
            r5 = 14
            r7.<init>((defpackage.x3b) r4, (int) r5)
            java.lang.String r4 = "url"
            java.lang.String r5 = r6.c
            r7.t(r4, r5)
            ye5 r4 = r6.o
            kotlin.Lazy r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ocf r4 = (defpackage.ocf) r4
            r6.b = r1
            r6.a = r3
            java.lang.Object r7 = r4.e(r7, r6)
            if (r7 != r0) goto L_0x004f
            return r0
        L_0x004f:
            r3 = 0
            r6.b = r3
            r6.a = r2
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x005b
            return r0
        L_0x005b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
