package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageFragment;

/* renamed from: l26  reason: default package */
public final class l26 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderPageFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l26(FolderPageFragment folderPageFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderPageFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l26 l26 = new l26(this.b, continuation);
        l26.a = obj;
        return l26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l26) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        FolderPageFragment folderPageFragment = this.b;
        bs0.K(new ps5(folderPageFragment.i3().l, new h26(folderPageFragment, (Continuation) null), 5), d14);
        on2 on2 = new on2(folderPageFragment.i3().n, 28);
        bs0.K(new k26(new ps5(new on2(on2, 28), new i26(on2, (Continuation) null, folderPageFragment), 5), 0), d14);
        return Unit.INSTANCE;
    }
}
