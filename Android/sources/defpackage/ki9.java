package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ki9  reason: default package */
public final class ki9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ki9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ki9 ki9 = new ki9(continuation, this.b);
        ki9.a = obj;
        return ki9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ki9) create((ta) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r8 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            ta r9 = (defpackage.ta) r9
            kotlin.reflect.KProperty[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            one.me.sdk.messagewrite.MessageWriteWidget r8 = r8.b
            dc9 r0 = r8.d0()
            r0.requestFocus()
            hf8 r8 = r8.y0
            if (r8 == 0) goto L_0x00a0
            int r0 = r9.a
            java.lang.String r1 = r9.c
            if (r1 != 0) goto L_0x0021
            goto L_0x00a0
        L_0x0021:
            android.widget.EditText r8 = r8.a
            android.text.Editable r2 = r8.getText()
            if (r2 == 0) goto L_0x00a0
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0031
            goto L_0x00a0
        L_0x0031:
            int r9 = r9.b
            java.lang.Class<ky7> r3 = defpackage.ky7.class
            java.lang.Object[] r3 = r2.getSpans(r0, r9, r3)
            ky7[] r3 = (defpackage.ky7[]) r3
            r4 = 0
            if (r3 == 0) goto L_0x0081
            int r5 = r3.length
            if (r5 != 0) goto L_0x0042
            goto L_0x0081
        L_0x0042:
            java.util.Iterator r3 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r3)
        L_0x0046:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r3.next()
            ky7 r5 = (defpackage.ky7) r5
            int r6 = r2.getSpanStart(r5)
            int r7 = r2.getSpanEnd(r5)
            if (r6 != r0) goto L_0x0046
            if (r7 != r9) goto L_0x0046
            r2.removeSpan(r5)
            boolean r3 = r8.isInEditMode()
            if (r3 == 0) goto L_0x006a
            vi4 r8 = defpackage.vi4.f0
            goto L_0x0074
        L_0x006a:
            android.content.Context r8 = r8.getContext()
            kotlin.Lazy r3 = defpackage.scf.b0
            scf r8 = defpackage.j4b.k0(r8)
        L_0x0074:
            int r8 = r8.l
            ky7 r3 = new ky7
            r3.<init>(r1, r8)
            r3.c = r4
            defpackage.te8.B(r2, r3, r0, r9)
            goto L_0x00a0
        L_0x0081:
            boolean r3 = r8.isInEditMode()
            if (r3 == 0) goto L_0x008a
            vi4 r8 = defpackage.vi4.f0
            goto L_0x0094
        L_0x008a:
            android.content.Context r8 = r8.getContext()
            kotlin.Lazy r3 = defpackage.scf.b0
            scf r8 = defpackage.j4b.k0(r8)
        L_0x0094:
            int r8 = r8.l
            ky7 r3 = new ky7
            r3.<init>(r1, r8)
            r3.c = r4
            defpackage.te8.B(r2, r3, r0, r9)
        L_0x00a0:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
