package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;

/* renamed from: w06  reason: default package */
public final class w06 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FolderFiltersFragment a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w06(FolderFiltersFragment folderFiltersFragment, Continuation continuation) {
        super(2, continuation);
        this.a = folderFiltersFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new w06(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w06) create((r5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((z16) this.a.B1).n1();
        return Unit.INSTANCE;
    }
}
