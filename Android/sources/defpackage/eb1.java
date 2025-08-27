package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: eb1  reason: default package */
public final class eb1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.b = callJoinLinkPreviewWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eb1 eb1 = new eb1(continuation, this.b);
        eb1.a = obj;
        return eb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eb1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qa1 qa1 = (qa1) this.a;
        KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        callJoinLinkPreviewWidget.getClass();
        gn1 gn1 = (gn1) callJoinLinkPreviewWidget.Y.getValue(callJoinLinkPreviewWidget, CallJoinLinkPreviewWidget.z0[6]);
        gn1.setAvatar(qa1.a);
        aj8.a.getClass();
        aj8 aj8 = qa1.c;
        gn1.setButtonAction(nfd.r(aj8) ? p0g.b : p0g.o);
        gn1.S(nfd.r(aj8), qa1.d);
        gn1.T((CharSequence) null, (String) null);
        callJoinLinkPreviewWidget.e0().setText(qa1.e.a(callJoinLinkPreviewWidget.getContext()));
        Drawable drawable = (Drawable) callJoinLinkPreviewWidget.v0.getValue();
        igf igf = new igf(ykc.call_microphone_enabled_accessibility);
        igf igf2 = new igf(ykc.call_microphone_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.h0(callJoinLinkPreviewWidget.c0(), drawable, (Drawable) callJoinLinkPreviewWidget.Z.getValue(), qa1.b, igf, igf2);
        Drawable drawable2 = (Drawable) callJoinLinkPreviewWidget.x0.getValue();
        igf igf3 = new igf(ykc.call_video_enabled_accessibility);
        igf igf4 = new igf(ykc.call_video_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.h0(callJoinLinkPreviewWidget.f0(), drawable2, (Drawable) callJoinLinkPreviewWidget.w0.getValue(), qa1.c, igf3, igf4);
        e1b d0 = callJoinLinkPreviewWidget.d0();
        d0.setAvatars(qa1.f);
        d0.setTitle(qa1.g);
        return Unit.INSTANCE;
    }
}
