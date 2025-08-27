package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;

/* renamed from: g76  reason: default package */
public final class g76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g76(FoldersPickerFragment foldersPickerFragment, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g76 g76 = new g76(this.b, continuation);
        g76.a = obj;
        return g76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g76) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        FoldersPickerFragment foldersPickerFragment = this.b;
        bs0.K(new ps5(foldersPickerFragment.i3().m, new d76(foldersPickerFragment, (Continuation) null), 5), d14);
        on2 on2 = new on2(foldersPickerFragment.i3().o, 28);
        bs0.K(new k26(new ps5(new on2(on2, 28), new e76(on2, (Continuation) null, foldersPickerFragment), 5), 1), d14);
        return Unit.INSTANCE;
    }
}
