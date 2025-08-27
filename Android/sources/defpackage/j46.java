package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: j46  reason: default package */
public final class j46 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderSettingsFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j46(FolderSettingsFragment folderSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j46 j46 = new j46(this.b, continuation);
        j46.a = obj;
        return j46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j46) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        FolderSettingsFragment folderSettingsFragment = this.b;
        bs0.K(new ps5(folderSettingsFragment.i3().j, new h46(folderSettingsFragment, (Continuation) null), 5), d14);
        bs0.K(new ps5(new on2(folderSettingsFragment.i3().l, 28), new i46(folderSettingsFragment, (Continuation) null), 5), d14);
        return Unit.INSTANCE;
    }
}
