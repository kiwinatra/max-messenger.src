package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* renamed from: vr6  reason: default package */
public final class vr6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GifViewerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.b = gifViewerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vr6 vr6 = new vr6(continuation, this.b);
        vr6.a = obj;
        return vr6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vr6) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        g4g g4g;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ci2 ci2 = (ci2) this.a;
        GifViewerWidget gifViewerWidget = this.b;
        String str = gifViewerWidget.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            boolean z = ci2.b != null;
            hr8 hr8 = ci2.a;
            long d0 = gifViewerWidget.d0();
            String c0 = gifViewerWidget.c0();
            a67.d(w78, str, StringsKt__IndentKt.trimMargin$default("Media viewer. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + hr8 + ", curMsgId:" + d0 + ", \n                        |curAttachId:" + c0 + "\n                        |", (String) null, 1, (Object) null), (Throwable) null);
        }
        hr8 hr82 = ci2.a;
        if (hr82 != null && hr82.m() == gifViewerWidget.d0() && Intrinsics.areEqual((Object) ci2.a.v(), (Object) gifViewerWidget.c0()) && (g4g = ci2.b) != null) {
            gifViewerWidget.y = g4g;
            n7g f0 = gifViewerWidget.f0();
            if (f0 != null) {
                f0.g(c44.DEFAULT_ASPECT_RATIO);
            }
            n7g f02 = gifViewerWidget.f0();
            if (f02 != null) {
                f02.K0(true);
            }
            n7g f03 = gifViewerWidget.f0();
            if (f03 != null) {
                f03.H0(ci2.b);
            }
            jk3 jk3 = gifViewerWidget.x;
            if (jk3 != null) {
                jk3.c();
            }
            gifViewerWidget.g0().a(gifViewerWidget.z);
        }
        return Unit.INSTANCE;
    }
}
