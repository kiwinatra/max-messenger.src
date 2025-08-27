package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: in6  reason: default package */
public final class in6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GalleryViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in6(GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        in6 in6 = new in6(this.b, continuation);
        in6.a = obj;
        return in6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((in6) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.a;
        List list = (List) pair.component2();
        String str = GalleryViewModel.T;
        int size = list.size();
        z68.c(str, "got album and items, items size = " + size, new Object[0]);
        GalleryViewModel galleryViewModel = this.b;
        xme xme = galleryViewModel.t;
        o85 o85 = new o85(Boxing.boxBoolean(false));
        xme.getClass();
        xme.m((Object) null, o85);
        galleryViewModel.y.setValue((pm6) pair.component1());
        o85 o852 = new o85(list);
        xme xme2 = galleryViewModel.o;
        xme2.getClass();
        xme2.m((Object) null, o852);
        galleryViewModel.w.setValue(Boxing.boxBoolean(((List) ((o85) xme2.getValue()).a).isEmpty()));
        return Unit.INSTANCE;
    }
}
