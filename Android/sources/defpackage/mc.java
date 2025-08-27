package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: mc  reason: default package */
public final class mc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ AlbumsSelectionFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mc(etc etc, Continuation continuation, AlbumsSelectionFragment albumsSelectionFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = albumsSelectionFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mc mcVar = new mc((etc) this.b, continuation, this.o);
        mcVar.a = obj;
        return mcVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mc) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            AlbumsSelectionFragment albumsSelectionFragment = this.o;
            if (booleanValue) {
                albumsSelectionFragment.B1.e().t();
            } else {
                ExtraActionsView e = albumsSelectionFragment.B1.e();
                if (e.w == null) {
                    e.l((Runnable) null, true);
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
