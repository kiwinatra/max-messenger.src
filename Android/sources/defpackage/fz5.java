package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: fz5  reason: default package */
public final class fz5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderEditFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fz5(FolderEditFragment folderEditFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fz5 fz5 = new fz5(this.b, continuation);
        fz5.a = obj;
        return fz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fz5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        FolderEditFragment folderEditFragment = this.b;
        on2 on2 = new on2(folderEditFragment.j3().g, 28);
        bs0.K(new on2(new ps5(new on2(on2, 28), new dz5(on2, (Continuation) null, folderEditFragment), 5), 29), d14);
        bs0.K(new ps5(folderEditFragment.j3().i, new cz5(folderEditFragment, (Continuation) null), 5), d14);
        return Unit.INSTANCE;
    }
}
