package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: ol6  reason: default package */
public final class ol6 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ GalleryFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol6(GalleryFragment galleryFragment, Continuation continuation) {
        super(2, continuation);
        this.b = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ol6 ol6 = new ol6(this.b, continuation);
        ol6.a = ((Boolean) obj).booleanValue();
        return ol6;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ol6) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        cl6 cl6 = this.b.E1;
        cl6.getClass();
        ((View) cl6.w.getValue(cl6, cl6.y[3])).setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }
}
