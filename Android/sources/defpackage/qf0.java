package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: qf0  reason: default package */
public final class qf0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf0(Ref.ObjectRef objectRef, List list, Continuation continuation) {
        super(2, continuation);
        this.a = objectRef;
        this.b = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qf0(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qf0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((BacklogWorker) this.a.element).e().g().contains(this.b));
    }
}
