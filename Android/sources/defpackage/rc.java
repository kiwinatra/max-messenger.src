package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: rc  reason: default package */
public final class rc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AlbumsSelectionFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc(AlbumsSelectionFragment albumsSelectionFragment, Continuation continuation) {
        super(2, continuation);
        this.b = albumsSelectionFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rc rcVar = new rc(this.b, continuation);
        rcVar.a = obj;
        return rcVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rc) create((pm6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pm6 pm6 = (pm6) this.a;
        AlbumsSelectionFragment albumsSelectionFragment = this.b;
        if (pm6 == null) {
            albumsSelectionFragment.B1.d().setText(((uk6) albumsSelectionFragment.i3().m.Z.getValue()).f().a);
        } else {
            albumsSelectionFragment.B1.d().setText(pm6.c);
        }
        return Unit.INSTANCE;
    }
}
