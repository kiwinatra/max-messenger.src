package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* renamed from: nfb  reason: default package */
public final class nfb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PhotoViewerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nfb(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.b = photoViewerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nfb nfb = new nfb(continuation, this.b);
        nfb.a = obj;
        return nfb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nfb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p85 p85 = (p85) this.a;
        KProperty[] kPropertyArr = PhotoViewerWidget.v;
        PhotoViewerWidget photoViewerWidget = this.b;
        photoViewerWidget.getClass();
        if (p85 instanceof j85) {
            j85 j85 = (j85) p85;
            if (Intrinsics.areEqual((Object) j85.a.v(), (Object) photoViewerWidget.c0()) && j85.a.m() == photoViewerWidget.d0()) {
                hr8 t = photoViewerWidget.f0().t(photoViewerWidget.d0(), photoViewerWidget.c0());
                yq8 yq8 = t instanceof yq8 ? (yq8) t : null;
                if (yq8 != null) {
                    if (photoViewerWidget.e0().getFailure()) {
                        photoViewerWidget.f0().v(photoViewerWidget.d0(), photoViewerWidget.c0());
                        photoViewerWidget.e0().r(yq8.o, photoViewerWidget.e0().getFailure());
                    } else {
                        photoViewerWidget.f0().w(photoViewerWidget.d0(), photoViewerWidget.c0());
                    }
                }
            }
        } else if (p85 instanceof l85) {
            l85 l85 = (l85) p85;
            if (Intrinsics.areEqual((Object) l85.a.w, (Object) photoViewerWidget.c0())) {
                yq8 yq82 = l85.a;
                if (yq82.a == photoViewerWidget.d0()) {
                    photoViewerWidget.e0().r(yq82.o, true);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
