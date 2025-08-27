package defpackage;

import android.view.Surface;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: l9g  reason: default package */
public final class l9g extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ VideoViewerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9g(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.b = videoViewerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l9g l9g = new l9g(continuation, this.b);
        l9g.a = obj;
        return l9g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l9g) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        n7g p0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p85 p85 = (p85) this.a;
        KProperty[] kPropertyArr = VideoViewerWidget.X;
        VideoViewerWidget videoViewerWidget = this.b;
        videoViewerWidget.getClass();
        if (p85 instanceof k85) {
            k85 k85 = (k85) p85;
            if (k85.a.m() == videoViewerWidget.d0() && Intrinsics.areEqual((Object) k85.a.v(), (Object) videoViewerWidget.c0())) {
                z68.c(videoViewerWidget.a, "Media viewer. Clear prev page", new Object[0]);
                g4g g4g = videoViewerWidget.y;
                boolean z = g4g != null && g4g.c();
                videoViewerWidget.y = null;
                j9g e0 = videoViewerWidget.e0();
                if (!(e0 == null || (p0 = ((ChatMediaViewerScreen) e0).p0()) == null)) {
                    aj2 aj2 = (aj2) videoViewerWidget.o.getValue();
                    long d0 = videoViewerWidget.d0();
                    String c0 = videoViewerWidget.c0();
                    long F0 = p0.F0();
                    long G0 = p0.G0();
                    aj2.getClass();
                    caa caa = caa.a;
                    f14 f14 = f14.a;
                    ri2 ri2 = r4;
                    ri2 ri22 = new ri2(aj2, d0, c0, F0, G0, z, (Continuation) null);
                    ev0.u(aj2.a, caa, f14.c, ri2);
                    p0.pause();
                    p0.L0((Surface) null);
                    p0.M0();
                }
                videoViewerWidget.f0().b();
            }
        }
        return Unit.INSTANCE;
    }
}
