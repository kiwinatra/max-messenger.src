package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ru.ok.messages.gallery.GalleryResultViewModel;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: eo6  reason: default package */
public final class eo6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ GalleryViewModel b;
    public final /* synthetic */ Ref.BooleanRef c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo6(GalleryViewModel galleryViewModel, Ref.BooleanRef booleanRef, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = galleryViewModel;
        this.c = booleanRef;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eo6(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eo6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GalleryViewModel galleryViewModel = this.b;
            GalleryResultViewModel galleryResultViewModel = galleryViewModel.Q;
            sqd sqd = galleryViewModel.E;
            if (galleryResultViewModel != null) {
                o85 o85 = new o85(new rl6(y7e.a(sqd)));
                xme xme = galleryResultViewModel.c;
                xme.getClass();
                xme.m((Object) null, o85);
            }
            if (this.c.element || !this.o) {
                this.a = 1;
                Object I = ev0.I(((osa) galleryViewModel.o()).e(), new ep6(galleryViewModel, false, (Continuation) null), this);
                if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    I = Unit.INSTANCE;
                }
                if (I == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Ref.IntRef intRef = new Ref.IntRef();
                sqd.a.size();
                for (um6 um6 : galleryViewModel.m()) {
                    if (um6 instanceof sm6) {
                        sm6 sm6 = (sm6) um6;
                        int n = galleryViewModel.n(sm6.b);
                        sm6.c = n;
                        if (n != 0) {
                            intRef.element++;
                        }
                    }
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
