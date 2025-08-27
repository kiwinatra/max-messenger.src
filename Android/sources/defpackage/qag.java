package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* renamed from: qag  reason: default package */
public final class qag extends RestrictedSuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qag(View view, Continuation continuation) {
        super(2, continuation);
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qag qag = new qag(this.c, continuation);
        qag.b = obj;
        return qag;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qag) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.sequences.SequenceScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.a
            android.view.View r2 = r5.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x0014:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001c:
            java.lang.Object r1 = r5.b
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0037
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            r5.b = r1
            r5.a = r4
            java.lang.Object r6 = r1.yield(r2, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x004f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            mag r6 = new mag
            r4 = 1
            r6.<init>(r4, r2)
            r2 = 0
            r5.b = r2
            r5.a = r3
            java.lang.Object r5 = r1.yieldAll(r6, (kotlin.coroutines.Continuation<? super kotlin.Unit>) r5)
            if (r5 != r0) goto L_0x004f
            return r0
        L_0x004f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qag.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
