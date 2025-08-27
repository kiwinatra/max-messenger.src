package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: co1  reason: default package */
public final class co1 extends g12 {
    public final Function2 w;

    public co1(Function2 function2, CoroutineContext coroutineContext, int i, cu0 cu0) {
        super(function2, coroutineContext, i, cu0, 0);
        this.w = function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.cwb r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bo1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bo1 r0 = (defpackage.bo1) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            bo1 r0 = new bo1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            cwb r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r5
            r0.o = r3
            java.lang.Object r4 = super.i(r5, r0)
            if (r4 != r1) goto L_0x0041
            return r1
        L_0x0041:
            zvb r5 = (defpackage.zvb) r5
            x02 r4 = r5.o
            boolean r4 = r4.u()
            if (r4 == 0) goto L_0x004e
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co1.i(cwb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final f12 j(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return new co1(this.w, coroutineContext, i, cu0);
    }
}
