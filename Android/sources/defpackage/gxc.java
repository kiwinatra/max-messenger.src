package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: gxc  reason: default package */
public final class gxc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ RecordControlsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gxc(Continuation continuation, RecordControlsWidget recordControlsWidget, byte[] bArr) {
        super(2, continuation);
        this.b = bArr;
        this.c = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gxc(continuation, this.c, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gxc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.a
            if (r2 == 0) goto L_0x0018
            if (r2 != r0) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00a0
        L_0x0010:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 0
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r2 = r12.c
            byte[] r3 = r12.b
            if (r3 == 0) goto L_0x0081
            android.animation.IntEvaluator r4 = defpackage.c80.D0
            kotlin.reflect.KProperty[] r4 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.g1
            c80 r4 = r2.F0()
            int r4 = r4.getPeaksCount()
            int r5 = r3.length
            if (r5 != 0) goto L_0x0032
            goto L_0x0082
        L_0x0032:
            byte[] r5 = new byte[r4]
            r6 = 0
            r7 = r6
        L_0x0036:
            if (r7 >= r4) goto L_0x007f
            if (r7 == 0) goto L_0x0078
            int r8 = r3.length
            if (r8 != r0) goto L_0x003e
            goto L_0x0078
        L_0x003e:
            int r8 = r4 + -1
            if (r7 != r8) goto L_0x0047
            int r8 = r3.length
            int r8 = r8 - r0
            byte r8 = r3[r8]
            goto L_0x007a
        L_0x0047:
            float r8 = (float) r7
            float r9 = (float) r4
            float r8 = r8 / r9
            int r9 = r3.length
            int r9 = r9 - r0
            float r9 = (float) r9
            float r8 = r8 * r9
            int r9 = (int) r8
            int r10 = r9 + 1
            int r11 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r3)
            if (r9 >= r11) goto L_0x0076
            int r11 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r3)
            if (r10 >= r11) goto L_0x0076
            float r11 = (float) r9
            float r8 = r8 - r11
            byte r9 = r3[r9]
            byte r10 = r3[r10]
            android.animation.IntEvaluator r11 = defpackage.c80.D0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r8 = r11.evaluate(r8, r9, r10)
            int r8 = r8.intValue()
            goto L_0x007a
        L_0x0076:
            r8 = r6
            goto L_0x007a
        L_0x0078:
            byte r8 = r3[r6]
        L_0x007a:
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r7 + r0
            goto L_0x0036
        L_0x007f:
            r3 = r5
            goto L_0x0082
        L_0x0081:
            r3 = r13
        L_0x0082:
            kotlin.reflect.KProperty[] r4 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.g1
            kotlin.Lazy r4 = r2.v
            java.lang.Object r4 = r4.getValue()
            gaf r4 = (defpackage.gaf) r4
            osa r4 = (defpackage.osa) r4
            gc8 r4 = r4.c()
            fxc r5 = new fxc
            r5.<init>(r13, r2, r3)
            r12.a = r0
            java.lang.Object r12 = defpackage.ev0.I(r4, r5, r12)
            if (r12 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
