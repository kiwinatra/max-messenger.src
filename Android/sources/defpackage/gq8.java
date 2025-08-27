package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: gq8  reason: default package */
public final class gq8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaGalleryWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.b = mediaGalleryWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gq8 gq8 = new gq8(this.b, continuation);
        gq8.a = obj;
        return gq8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gq8) create((gm6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gm6 gm6 = (gm6) this.a;
        boolean z = gm6 instanceof dm6;
        MediaGalleryWidget mediaGalleryWidget = this.b;
        if (z) {
            KProperty[] kPropertyArr = MediaGalleryWidget.x;
            mediaGalleryWidget.c0().z0(0);
            gp6.k(mediaGalleryWidget.e0(), true, 2);
        } else if (gm6 instanceof fm6) {
            KProperty[] kPropertyArr2 = MediaGalleryWidget.x;
            gp6 e0 = mediaGalleryWidget.e0();
            tqd tqd = ((fm6) gm6).a;
            e0.getClass();
            e0.n(tqd.a, true);
        } else if (gm6 instanceof em6) {
            KProperty[] kPropertyArr3 = MediaGalleryWidget.x;
            gp6 e02 = mediaGalleryWidget.e0();
            wk6 wk6 = ((em6) gm6).a;
            e02.getClass();
            z68.c("gp6", "selectAlbum " + wk6, new Object[0]);
            ((nd) e02.H0.getValue()).e("MEDIA_SEND_ALBUM_CHANGED");
            xme xme = e02.z0;
            wk6 wk62 = (wk6) xme.getValue();
            if (!Intrinsics.areEqual((Object) wk62, (Object) wk6)) {
                try {
                    Result.Companion companion = Result.Companion;
                    pm7 pm7 = e02.F0;
                    if (pm7 != null) {
                        pm7.b((CancellationException) null);
                    }
                    aje aje = e02.G0;
                    if (aje != null) {
                        aje.b((CancellationException) null);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    Result.m23constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                Boolean bool = Boolean.FALSE;
                xme xme2 = e02.x0;
                xme2.getClass();
                xme2.m((Object) null, bool);
                xme.setValue(wk6);
                e02.Z.setValue(CollectionsKt.emptyList());
                e02.G0 = xag.g(e02, e02.o, (f14) null, new po6(wk62, e02, wk6, (Continuation) null), 2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
