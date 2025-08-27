package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.gallery.GalleryResultViewModel;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: qo6  reason: default package */
public final class qo6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ GalleryViewModel o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo6(sbd sbd, Continuation continuation, GalleryViewModel galleryViewModel) {
        super(2, continuation);
        this.b = sbd;
        this.o = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qo6 qo6 = new qo6((sbd) this.b, continuation, this.o);
        qo6.a = obj;
        return qo6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qo6) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Pair pair = (Pair) a2;
            int intValue = ((Number) pair.component1()).intValue();
            um6 um6 = (um6) pair.component2();
            boolean areEqual = Intrinsics.areEqual((Object) um6, (Object) qm6.b);
            GalleryViewModel galleryViewModel = this.o;
            if (areEqual) {
                boolean e = n54.e(galleryViewModel.c, n54.e);
                xme xme = galleryViewModel.C;
                if (e) {
                    o85 o85 = new o85(wl6.a);
                    xme.getClass();
                    xme.m((Object) null, o85);
                    GalleryResultViewModel galleryResultViewModel = galleryViewModel.Q;
                    if (galleryResultViewModel != null) {
                        z68.c("GalleryResultViewModel", "onCameraClicked()", new Object[0]);
                        galleryResultViewModel.g.k(new r5a());
                    }
                } else {
                    o85 o852 = new o85(wl6.b);
                    xme.getClass();
                    xme.m((Object) null, o852);
                }
            } else if (um6 instanceof sm6) {
                pl6 pl6 = galleryViewModel.m;
                sqd sqd = galleryViewModel.E;
                if (pl6.w) {
                    sqd.a();
                    sqd.u(cvg.M(((sm6) um6).b));
                    ev0.v(b0h.C(galleryViewModel), ((osa) galleryViewModel.o()).a().plus(galleryViewModel.h), (f14) null, new ln6(galleryViewModel, (Continuation) null), 2);
                } else {
                    xme xme2 = galleryViewModel.C;
                    o85 o853 = new o85(new am6(intValue, pl6.b ? intValue - 1 : intValue, (sm6) um6));
                    xme2.getClass();
                    xme2.m((Object) null, o853);
                }
            } else {
                throw new NoWhenBranchMatchedException();
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
