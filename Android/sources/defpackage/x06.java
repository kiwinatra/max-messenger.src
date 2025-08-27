package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: x06  reason: default package */
public final class x06 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderFiltersFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x06(FolderFiltersFragment folderFiltersFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        x06 x06 = new x06(this.b, continuation);
        x06.a = obj;
        return x06;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x06) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        s06 s06 = this.b.C1;
        s06.getClass();
        ((LongRoundedTitleSubtitleButton) s06.z.getValue(s06, s06.Z[7])).setSubtitle((String) this.a);
        return Unit.INSTANCE;
    }
}
