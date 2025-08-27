package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;

/* renamed from: z06  reason: default package */
public final class z06 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderFiltersFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z06(FolderFiltersFragment folderFiltersFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        z06 z06 = new z06(this.b, continuation);
        z06.a = obj;
        return z06;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        FolderFiltersFragment folderFiltersFragment = this.b;
        bs0.K(new ps5(new on2(folderFiltersFragment.h3().i, 28), new t06(folderFiltersFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(new on2(folderFiltersFragment.h3().k, 28), new u06(folderFiltersFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(new on2(folderFiltersFragment.h3().m, 28), new v06(folderFiltersFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(new on2(folderFiltersFragment.h3().o, 28), new w06(folderFiltersFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(folderFiltersFragment.h3().q, new x06(folderFiltersFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(new on2(folderFiltersFragment.h3().s, 28), new y06(folderFiltersFragment, (Continuation) null), 5), d14);
        return Unit.INSTANCE;
    }
}
