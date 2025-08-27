package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: vn9  reason: default package */
public final class vn9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vn9 vn9 = new vn9(continuation, this.b);
        vn9.a = obj;
        return vn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vn9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uy4 uy4 = (uy4) this.a;
        MessagesListWidget messagesListWidget = this.b;
        bwf bwf = messagesListWidget.A0;
        if (bwf != null) {
            bwf.x = uy4;
            FrameLayout frameLayout = bwf.w;
            TextView textView = null;
            KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                tr2.f.b(textView, bwf.x);
            }
        }
        v74 v74 = messagesListWidget.B0;
        if (v74 != null) {
            v74.b = uy4;
        }
        nwe nwe = messagesListWidget.C0;
        if (nwe != null) {
            nwe.j();
        }
        messagesListWidget.h0().a0();
        messagesListWidget.h0().invalidate();
        return Unit.INSTANCE;
    }
}
