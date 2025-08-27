package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: uf0  reason: default package */
public final class uf0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BacklogWorker a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(2, continuation);
        this.a = backlogWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uf0(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uf0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxInt(this.a.e().g().count(0));
    }
}
