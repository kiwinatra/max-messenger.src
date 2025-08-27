package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: eq8  reason: default package */
public final class eq8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaGalleryWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eq8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.b = mediaGalleryWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eq8 eq8 = new eq8(this.b, continuation);
        eq8.a = obj;
        return eq8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eq8) create((cm6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        cm6 cm6 = (cm6) this.a;
        if (!(cm6 instanceof xl6)) {
            if (cm6 instanceof yl6) {
                MediaGalleryWidget mediaGalleryWidget = this.b;
                ((edb) mediaGalleryWidget.a.getValue()).g(new eng(mediaGalleryWidget, 1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
