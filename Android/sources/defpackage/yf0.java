package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: yf0  reason: default package */
public final class yf0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BacklogWorker a;
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf0(BacklogWorker backlogWorker, int i, Continuation continuation) {
        super(2, continuation);
        this.a = backlogWorker;
        this.b = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yf0(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yf0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.a.e().g().getItemsForRunning(this.b);
    }
}
