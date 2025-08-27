package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: vh9  reason: default package */
public final class vh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vh9 vh9 = new vh9(continuation, this.b);
        vh9.a = obj;
        return vh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (r8 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3.b, (java.lang.Object) r1) == false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.a
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            kotlin.reflect.KProperty[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            one.me.sdk.messagewrite.MessageWriteWidget r11 = r11.b
            v0f r0 = r11.i0()
            xme r1 = r0.G0
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            xme r0 = r0.H0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = ""
        L_0x0029:
            v0f r0 = r11.i0()
            i69 r0 = r0.w
            dc9 r2 = r11.d0()
            r0.getClass()
            java.lang.CharSequence r3 = r2.getText()
            ome r4 = r2.getMessagePosition()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r5 = kotlin.text.StringsKt.isBlank(r1)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x0052
            goto L_0x00fc
        L_0x0052:
            if (r3 == 0) goto L_0x00fc
            boolean r5 = kotlin.text.StringsKt.isBlank(r3)
            if (r5 == 0) goto L_0x005c
            goto L_0x00fc
        L_0x005c:
            int r1 = r1.length()
            int r5 = r3.length()
            if (r1 > r5) goto L_0x0068
            goto L_0x00fc
        L_0x0068:
            android.text.SpannableStringBuilder r0 = r0.b
            r0.clear()
            r0.clearSpans()
            r0.append(r3)
            int r1 = r0.length()
            java.lang.Class<j0f> r3 = defpackage.j0f.class
            java.lang.Object[] r1 = r0.getSpans(r6, r1, r3)
            j0f[] r1 = (defpackage.j0f[]) r1
            if (r1 == 0) goto L_0x009e
            int r3 = r1.length
            r5 = r6
        L_0x0083:
            if (r5 >= r3) goto L_0x009a
            r8 = r1[r5]
            int r9 = r0.getSpanStart(r8)
            int r10 = r0.getSpanEnd(r8)
            if (r9 > r4) goto L_0x0097
            if (r4 > r10) goto L_0x0097
            int r10 = r10 - r9
            if (r10 <= 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            int r5 = r5 + 1
            goto L_0x0083
        L_0x009a:
            r8 = r7
        L_0x009b:
            if (r8 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r8 = r7
        L_0x009f:
            if (r8 == 0) goto L_0x00fc
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            r4 = -1
            if (r1 == r4) goto L_0x00cc
            if (r3 == r4) goto L_0x00cc
            if (r1 <= r3) goto L_0x00b1
            goto L_0x00cc
        L_0x00b1:
            java.lang.CharSequence r1 = r0.subSequence(r1, r3)
            java.lang.String r1 = r1.toString()
            o0f r3 = r8.b
            java.lang.CharSequence r5 = r3.o
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            if (r5 != 0) goto L_0x00fc
            java.lang.CharSequence r3 = r3.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00cc
            goto L_0x00fc
        L_0x00cc:
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            defpackage.ld8.m0(r0, r5, r1, r3)
            android.text.SpannableStringBuilder r0 = r0.delete(r1, r3)
            r2.setText(r0)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.length()
            goto L_0x00ec
        L_0x00eb:
            r0 = r6
        L_0x00ec:
            if (r1 <= r4) goto L_0x00f1
            if (r1 > r0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r1 = r0
        L_0x00f2:
            l40 r0 = new l40
            r3 = 13
            r0.<init>(r2, r1, r3)
            r2.post(r0)
        L_0x00fc:
            v0f r0 = r11.i0()
            dc9 r1 = r11.d0()
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = r1.toString()
            goto L_0x0110
        L_0x010f:
            r1 = r7
        L_0x0110:
            xme r0 = r0.G0
        L_0x0112:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r0.b(r2, r1)
            if (r2 == 0) goto L_0x0112
            v0f r0 = r11.i0()
            xme r0 = r0.K0
            r0.setValue(r7)
            mh9 r11 = r11.h0()
            kotlin.Lazy r0 = r11.y
            java.lang.Object r0 = r0.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            f14 r1 = defpackage.f14.b
            fh9 r2 = new fh9
            r2.<init>(r11, r12, r7)
            jx3 r12 = r11.a
            aje r12 = defpackage.ev0.u(r12, r0, r1, r2)
            kotlin.reflect.KProperty[] r0 = defpackage.mh9.K0
            r0 = r0[r6]
            wie r1 = r11.Y
            r1.setValue(r11, r0, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
