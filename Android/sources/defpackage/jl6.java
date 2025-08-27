package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: jl6  reason: default package */
public final class jl6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ GalleryFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl6(etc etc, Continuation continuation, GalleryFragment galleryFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jl6 jl6 = new jl6((etc) this.b, continuation, this.o);
        jl6.a = obj;
        return jl6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jl6) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Unit unit = (Unit) a2;
            GalleryViewModel k3 = this.o.k3();
            KProperty[] kPropertyArr = GalleryViewModel.S;
            k3.l(false);
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
