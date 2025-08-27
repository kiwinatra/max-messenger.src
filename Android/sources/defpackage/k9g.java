package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: k9g  reason: default package */
public final class k9g extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ VideoViewerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k9g(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.b = videoViewerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k9g k9g = new k9g(continuation, this.b);
        k9g.a = obj;
        return k9g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k9g) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        g4g g4g;
        n7g p0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ci2 ci2 = (ci2) this.a;
        VideoViewerWidget videoViewerWidget = this.b;
        String str = videoViewerWidget.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            boolean z = ci2.b != null;
            hr8 hr8 = ci2.a;
            long d0 = videoViewerWidget.d0();
            String c0 = videoViewerWidget.c0();
            a67.d(w78, str, StringsKt__IndentKt.trimMargin$default("Media viewer. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + hr8 + ", curMsgId:" + d0 + ", \n                        |curAttachId:" + c0 + "\n                        |", (String) null, 1, (Object) null), (Throwable) null);
        }
        hr8 hr82 = ci2.a;
        if (hr82 != null && hr82.m() == videoViewerWidget.d0() && Intrinsics.areEqual((Object) ci2.a.v(), (Object) videoViewerWidget.c0()) && (g4g = ci2.b) != null) {
            videoViewerWidget.y = g4g;
            j9g e0 = videoViewerWidget.e0();
            if (!(e0 == null || (p0 = ((ChatMediaViewerScreen) e0).p0()) == null)) {
                p0.H0(ci2.b);
            }
            jk3 jk3 = videoViewerWidget.x;
            if (jk3 != null) {
                jk3.c();
            }
            videoViewerWidget.f0().a(videoViewerWidget.z);
        }
        return Unit.INSTANCE;
    }
}
