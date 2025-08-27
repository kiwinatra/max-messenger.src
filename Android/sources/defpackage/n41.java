package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: n41  reason: default package */
public final class n41 extends ContinuationImpl {
    public CallDialogViewModel a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CallDialogViewModel c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n41(CallDialogViewModel callDialogViewModel, Continuation continuation) {
        super(continuation);
        this.c = callDialogViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return CallDialogViewModel.k(this.c, this);
    }
}
