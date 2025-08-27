package defpackage;

import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ac1  reason: default package */
public final class ac1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallLinkInfoScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.b = callLinkInfoScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ac1 ac1 = new ac1(continuation, this.b);
        ac1.a = obj;
        return ac1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ac1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        tb1 tb1 = (tb1) this.a;
        KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        callLinkInfoScreen.getClass();
        KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
        ((TextView) callLinkInfoScreen.X.getValue(callLinkInfoScreen, kPropertyArr2[3])).setText(tb1.e.a(callLinkInfoScreen.getContext()));
        ((TextView) callLinkInfoScreen.Y.getValue(callLinkInfoScreen, kPropertyArr2[4])).setText(tb1.f.a(callLinkInfoScreen.getContext()));
        callLinkInfoScreen.x0.G(tb1.g);
        h3b h3b = (h3b) callLinkInfoScreen.z.getValue(callLinkInfoScreen, kPropertyArr2[2]);
        CharSequence a2 = tb1.e.a(callLinkInfoScreen.getContext());
        if (a2 == null) {
            a2 = "";
        }
        h3b.setTitle(a2);
        OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) callLinkInfoScreen.w0.getValue(callLinkInfoScreen, kPropertyArr2[7]);
        int i = OneMeAvatarView.E0;
        gd0 gd0 = tb1.b;
        oneMeAvatarView.f(gd0, true);
        oneMeAvatarView.setAvatarUrl(tb1.a);
        if (gd0 == null) {
            oneMeAvatarView.setCustomPlaceholder((ee0) callLinkInfoScreen.o.getValue());
            oneMeAvatarView.setCustomOverlay((be0) null);
        } else {
            oneMeAvatarView.setCustomPlaceholder((ee0) null);
            oneMeAvatarView.setCustomOverlay((be0) callLinkInfoScreen.v.getValue());
        }
        TextView textView = (TextView) callLinkInfoScreen.Z.getValue(callLinkInfoScreen, kPropertyArr2[5]);
        textView.setText(tb1.d.getText().a(textView.getContext()));
        textView.setOnLongClickListener(new yb1(0, tb1, callLinkInfoScreen));
        ct.G(textView, 300, new vb1(tb1, callLinkInfoScreen));
        OneMeButton oneMeButton = (OneMeButton) callLinkInfoScreen.v0.getValue(callLinkInfoScreen, kPropertyArr2[6]);
        oneMeButton.setText(tb1.h.getTitle().a(oneMeButton.getContext()));
        ct.G(oneMeButton, 300, new vb1(callLinkInfoScreen, tb1));
        return Unit.INSTANCE;
    }
}
