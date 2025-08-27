package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: mh2  reason: default package */
public final class mh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mh2 mh2 = new mh2(continuation, this.b);
        mh2.a = obj;
        return mh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yh2 yh2 = (yh2) this.a;
        KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
        hf7 o0 = this.b.o0();
        o0.x.setText(yh2.a);
        o0.y.setText(yh2.b);
        CharSequence charSequence = yh2.c;
        int length = charSequence.length();
        Lazy lazy = o0.y0;
        Lazy lazy2 = o0.x0;
        if (length > 0) {
            y7e.c(o0, (View) lazy2.getValue(), -1);
            y7e.c(o0, (View) lazy.getValue(), -1);
            ((View) lazy2.getValue()).setVisibility(0);
            ((View) lazy.getValue()).setVisibility(0);
            ((TextView) lazy2.getValue()).setText(charSequence);
        } else if (y7e.L(lazy2)) {
            ((View) lazy2.getValue()).setVisibility(8);
            ((View) lazy.getValue()).setVisibility(8);
            ((TextView) lazy2.getValue()).setText((CharSequence) null);
        }
        Lazy lazy3 = o0.z;
        if (lazy3.isInitialized()) {
            ((xob) lazy3.getValue()).a(yh2.d);
        }
        return Unit.INSTANCE;
    }
}
