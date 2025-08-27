package defpackage;

import androidx.fragment.app.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: fl6  reason: default package */
public final class fl6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ GalleryFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl6(etc etc, Continuation continuation, GalleryFragment galleryFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fl6 fl6 = new fl6((etc) this.b, continuation, this.o);
        fl6.a = obj;
        return fl6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fl6) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        b M1;
        ed6 v;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            bm6 bm6 = (bm6) a2;
            if (!Intrinsics.areEqual((Object) bm6, (Object) wl6.a)) {
                boolean areEqual = Intrinsics.areEqual((Object) bm6, (Object) wl6.b);
                GalleryFragment galleryFragment = this.o;
                if (areEqual) {
                    n54.O(galleryFragment, n54.e, 158, qad.O6);
                } else if (bm6 instanceof am6) {
                    GalleryFragment.h3(galleryFragment, ((am6) bm6).c, ((am6) bm6).b, ((am6) bm6).a);
                } else if (bm6 instanceof zl6) {
                    ActAvatarCrop.T(galleryFragment, ((zl6) bm6).a, ((zl6) bm6).b, false, true, false);
                } else if (Intrinsics.areEqual((Object) bm6, (Object) wl6.c)) {
                    galleryFragment.j3().e.k(new r5a());
                    if (!(!galleryFragment.k3().m.a || (M1 = galleryFragment.M1()) == null || (v = M1.v()) == null)) {
                        v.T();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
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
