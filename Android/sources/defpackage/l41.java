package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: l41  reason: default package */
public final class l41 extends ContinuationImpl {
    public CallDialogViewModel a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ CallDialogViewModel o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l41(CallDialogViewModel callDialogViewModel, Continuation continuation) {
        super(continuation);
        this.o = callDialogViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return CallDialogViewModel.j(this.o, this);
    }
}
