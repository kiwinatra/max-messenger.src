package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: d16  reason: default package */
public final class d16 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderFiltersViewModel b;
    public final /* synthetic */ qo5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d16(FolderFiltersViewModel folderFiltersViewModel, qo5 qo5, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersViewModel;
        this.c = qo5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d16(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d16) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List mutableList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FolderFiltersViewModel folderFiltersViewModel = this.b;
            List list = (List) folderFiltersViewModel.h.getValue();
            if (list == null || (mutableList = CollectionsKt.toMutableList(list)) == null) {
                return Unit.INSTANCE;
            }
            qo5 qo5 = this.c;
            folderFiltersViewModel.h.setValue(CollectionsKt.toList(kne.I(mutableList, qo5, qo5.a(qo5, !qo5.c))));
            this.a = 1;
            if (FolderFiltersViewModel.j(folderFiltersViewModel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
