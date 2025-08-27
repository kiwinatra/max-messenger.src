package defpackage;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: dl6  reason: default package */
public final class dl6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ GalleryFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl6(vo6 vo6, Continuation continuation, GalleryFragment galleryFragment) {
        super(2, continuation);
        this.b = vo6;
        this.o = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dl6 dl6 = new dl6((vo6) this.b, continuation, this.o);
        dl6.a = obj;
        return dl6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dl6) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        GalleryFragment galleryFragment = this.o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            List list = (List) a2;
            int size = list.size();
            z68.c("GalleryFragment", "uiItems: handleEvent, size = " + size, new Object[0]);
            galleryFragment.E1.e().setVisibility(list.isEmpty() ^ true ? 0 : 8);
            ((jk6) galleryFragment.D1.getValue()).G(list);
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
