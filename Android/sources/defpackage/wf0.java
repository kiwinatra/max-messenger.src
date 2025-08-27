package defpackage;

import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: wf0  reason: default package */
public final class wf0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BacklogWorker a;
    public final /* synthetic */ HashSet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wf0(BacklogWorker backlogWorker, HashSet hashSet, Continuation continuation) {
        super(2, continuation);
        this.a = backlogWorker;
        this.b = hashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wf0(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wf0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.e().g().updateState(0, CollectionsKt.toList(this.b));
        return Unit.INSTANCE;
    }
}
