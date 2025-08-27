package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.list.FoldersListScreen;

/* renamed from: q66  reason: default package */
public final class q66 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersListScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q66(FoldersListScreen foldersListScreen, Continuation continuation) {
        super(2, continuation);
        this.b = foldersListScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q66 q66 = new q66(this.b, continuation);
        q66.a = obj;
        return q66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q66) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = FoldersListScreen.x;
        FoldersListScreen foldersListScreen = this.b;
        foldersListScreen.getClass();
        ((l66) ((RecyclerView) foldersListScreen.w.getValue(foldersListScreen, FoldersListScreen.x[0])).getAdapter()).H((List) this.a, new ne4(28, foldersListScreen));
        return Unit.INSTANCE;
    }
}
