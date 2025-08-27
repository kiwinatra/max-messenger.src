package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import one.me.pinbars.PinBarsWidget;

/* renamed from: hlb  reason: default package */
public final class hlb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PinBarsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hlb(View view, PinBarsWidget pinBarsWidget, Continuation continuation) {
        super(2, continuation);
        this.b = view;
        this.c = pinBarsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hlb hlb = new hlb(this.b, this.c, continuation);
        hlb.a = obj;
        return hlb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hlb) create((emb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        emb emb = (emb) this.a;
        boolean z = emb instanceof dmb;
        View view = this.b;
        PinBarsWidget pinBarsWidget = this.c;
        if (!z) {
            ((ViewGroup) view).removeView(view.findViewById(axa.a));
            pinBarsWidget.v = null;
            return Unit.INSTANCE;
        }
        if (pinBarsWidget.v == null) {
            pinBarsWidget.getClass();
            cxa cxa = new cxa(pinBarsWidget.getContext(), (AttributeSet) null);
            cxa.setId(axa.a);
            cxa.setCloseBtnClickListener(new clb(pinBarsWidget, 5));
            cxa.setOnClickListener(new clb(pinBarsWidget, 6));
            b0h.H(cxa, new sa(3, (Continuation) null, 26));
            pinBarsWidget.v = cxa;
            ((ViewGroup) view).addView(pinBarsWidget.v, RangesKt.coerceAtMost(0, ((ViewGroup) view).getChildCount()));
        }
        cxa cxa2 = pinBarsWidget.v;
        if (cxa2 == null) {
            return Unit.INSTANCE;
        }
        dmb dmb = (dmb) emb;
        CharSequence a2 = dmb.b.a(pinBarsWidget.getContext());
        if (a2 == null) {
            a2 = "";
        }
        cxa2.setSubtitle(a2);
        cxa2.setCloseButtonVisibility(dmb.c);
        return Unit.INSTANCE;
    }
}
