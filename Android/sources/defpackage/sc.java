package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: sc  reason: default package */
public final class sc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AlbumsSelectionFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sc(AlbumsSelectionFragment albumsSelectionFragment, Continuation continuation) {
        super(2, continuation);
        this.b = albumsSelectionFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sc scVar = new sc(this.b, continuation);
        scVar.a = obj;
        return scVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sc) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AlbumsSelectionFragment albumsSelectionFragment = this.b;
        ((yk6) albumsSelectionFragment.D1.getValue()).b = (List) this.a;
        albumsSelectionFragment.B1.e().s();
        return Unit.INSTANCE;
    }
}
