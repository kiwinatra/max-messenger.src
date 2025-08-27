package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: ml6  reason: default package */
public final class ml6 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ GalleryFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ml6(GalleryFragment galleryFragment, Continuation continuation) {
        super(2, continuation);
        this.b = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ml6 ml6 = new ml6(this.b, continuation);
        ml6.a = ((Boolean) obj).booleanValue();
        return ml6;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ml6) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.E1.d().setVisibility(this.a ? 0 : 8);
        return Unit.INSTANCE;
    }
}
