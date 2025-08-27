package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: hl6  reason: default package */
public final class hl6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ GalleryFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl6(etc etc, Continuation continuation, GalleryFragment galleryFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hl6 hl6 = new hl6((etc) this.b, continuation, this.o);
        hl6.a = obj;
        return hl6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hl6) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            boolean booleanValue = ((Boolean) a2).booleanValue();
            z68.c("GalleryFragment", "isItemsLoading = " + booleanValue, new Object[0]);
            this.o.E1.e().setRefreshingNext(booleanValue);
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
