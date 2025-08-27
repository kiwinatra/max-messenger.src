package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.gallery.view.MediaPermissionsView;

/* renamed from: ll6  reason: default package */
public final class ll6 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ GalleryFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ll6(GalleryFragment galleryFragment, Continuation continuation) {
        super(2, continuation);
        this.b = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ll6 ll6 = new ll6(this.b, continuation);
        ll6.a = ((Boolean) obj).booleanValue();
        return ll6;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ll6) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        cl6 cl6 = this.b.E1;
        cl6.getClass();
        int i = 0;
        MediaPermissionsView mediaPermissionsView = (MediaPermissionsView) cl6.c.getValue(cl6, cl6.y[0]);
        if (!z) {
            i = 8;
        }
        mediaPermissionsView.setVisibility(i);
        return Unit.INSTANCE;
    }
}
