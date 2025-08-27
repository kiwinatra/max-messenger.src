package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: xh9  reason: default package */
public final class xh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xh9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xh9 xh9 = new xh9(continuation, this.b);
        xh9.a = obj;
        return xh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0f o0f = (o0f) this.a;
        sze sze = o0f.x;
        sze sze2 = sze.c;
        Unit unit = null;
        MessageWriteWidget messageWriteWidget = this.b;
        if (sze == sze2) {
            KProperty[] kPropertyArr = MessageWriteWidget.C0;
            mh9 h0 = messageWriteWidget.h0();
            CharSequence h = o0f.h();
            KProperty[] kPropertyArr2 = mh9.K0;
            h0.r(h, false);
            messageWriteWidget.d0().setText((CharSequence) null);
        } else {
            KProperty[] kPropertyArr3 = MessageWriteWidget.C0;
            v0f i0 = messageWriteWidget.i0();
            i0.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o0f.h().toString());
            int i = j0f.w;
            q0f q0f = new q0f(i0, 0);
            spannableStringBuilder.toString();
            spannableStringBuilder.setSpan(new j0f(i0.v, o0f, q0f), 0, spannableStringBuilder.length(), 17);
            sa9 sa9 = sa9.a;
            CharSequence b2 = ((yva) i0.A0.getValue()).b(spannableStringBuilder, new ta9(o0f.a, spannableStringBuilder.length()), false, true);
            i69 i69 = messageWriteWidget.i0().w;
            dc9 d0 = messageWriteWidget.d0();
            i69.getClass();
            int intValue = ((Number) d0.getMessagePosition().getValue()).intValue();
            CharSequence text = d0.getText();
            SpannableString valueOf = text != null ? SpannableString.valueOf(text) : null;
            j0f a2 = valueOf != null ? i69.a(valueOf, intValue, o0f) : null;
            bc9 bc9 = d0.c;
            if (!(valueOf == null || a2 == null)) {
                int spanStart = valueOf.getSpanStart(a2);
                int spanEnd = valueOf.getSpanEnd(a2);
                Editable text2 = bc9.getText();
                if (text2 != null) {
                    text2.replace(spanStart, spanEnd, b2, 0, b2.length());
                }
                Editable text3 = bc9.getText();
                if (text3 == null) {
                    d0.setText(" ");
                } else {
                    text3.append(" ");
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                int length = o0f.v.length();
                Editable text4 = bc9.getText();
                if (text4 != null) {
                    int max = Math.max(bc9.getSelectionStart(), 0);
                    text4.replace(Math.max(max - length, 0), max, b2, 0, b2.length());
                }
                Editable text5 = bc9.getText();
                if (text5 == null) {
                    d0.setText(" ");
                } else {
                    text5.append(" ");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
