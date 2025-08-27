package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;

/* renamed from: t06  reason: default package */
public final class t06 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderFiltersFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t06(FolderFiltersFragment folderFiltersFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t06 t06 = new t06(this.b, continuation);
        t06.a = obj;
        return t06;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t06) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        p06 p06 = this.b.D1;
        if (p06 != null) {
            p06.E(list);
        }
        return Unit.INSTANCE;
    }
}
