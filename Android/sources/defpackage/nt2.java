package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.SequencesKt;

/* renamed from: nt2  reason: default package */
public final class nt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wt2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nt2(wt2 wt2, Continuation continuation) {
        super(2, continuation);
        this.b = wt2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nt2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nt2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wt2 wt2 = this.b;
            z68.c(wt2.x0, "loadNext", new Object[0]);
            ss2 ss2 = (ss2) wt2.v0.getValue();
            boolean isEmpty = ss2.a.isEmpty();
            boolean z = ss2.b;
            if (!isEmpty || !z) {
                List list = ss2.a;
                if ((!list.isEmpty()) && z) {
                    Iterator it = SequencesKt.filter(CollectionsKt.asSequence(list), new gl1(20)).iterator();
                    if (!it.hasNext()) {
                        l = null;
                    } else {
                        Long valueOf = Long.valueOf(((xk2) it.next()).Y);
                        while (it.hasNext()) {
                            Long valueOf2 = Long.valueOf(((xk2) it.next()).Y);
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                        l = valueOf;
                    }
                    wt2.f(l != null ? l.longValue() : LongCompanionObject.MAX_VALUE);
                }
            } else {
                this.a = 1;
                if (wt2.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
