package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: jn6  reason: default package */
public final class jn6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GalleryViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jn6(GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jn6 jn6 = new jn6(this.b, continuation);
        jn6.a = obj;
        return jn6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jn6) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        GalleryViewModel galleryViewModel = this.b;
        galleryViewModel.A.setValue(list.size() <= 1 ? zk6.NONE : zk6.COLLAPSED);
        xme xme = galleryViewModel.i;
        xme.getClass();
        xme.m((Object) null, list);
        return Unit.INSTANCE;
    }
}
