package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;

/* renamed from: y06  reason: default package */
public final class y06 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ FolderFiltersFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y06(FolderFiltersFragment folderFiltersFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y06 y06 = new y06(this.b, continuation);
        y06.a = ((Boolean) obj).booleanValue();
        return y06;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((y06) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        FolderFiltersFragment folderFiltersFragment = this.b;
        if (z) {
            s06 s06 = folderFiltersFragment.C1;
            s06.getClass();
            ((RecyclerView) s06.w.getValue(s06, s06.Z[4])).setVisibility(0);
            folderFiltersFragment.C1.d().setVisibility(0);
        } else {
            s06 s062 = folderFiltersFragment.C1;
            s062.getClass();
            ((RecyclerView) s062.w.getValue(s062, s06.Z[4])).setVisibility(8);
            folderFiltersFragment.C1.d().setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
