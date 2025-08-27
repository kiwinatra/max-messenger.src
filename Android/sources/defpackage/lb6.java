package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: lb6  reason: default package */
public final class lb6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ForwardPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb6(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.b = forwardPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lb6 lb6 = new lb6(continuation, this.b);
        lb6.a = obj;
        return lb6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lb6) create((bb6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bb6 bb6 = (bb6) this.a;
        if (bb6 instanceof za6) {
            za6 za6 = (za6) bb6;
            Long l = za6.a;
            if (l != null) {
                long longValue = l.longValue();
                ra6 ra6 = ra6.b;
                ra6.W0().d();
                ra6.W0().b(wj6.j(longValue, ":chats?id=", "&type=local&from_forward=true"), (Bundle) null);
            } else {
                ra6.b.W0().d();
            }
            qc7 qc7 = (qc7) ia6.a.getAccessor().j(qc7.class);
            if (qc7 != null) {
                ta6 ta6 = za6.b;
                qc7.f(ta6.a, ta6.b);
            }
        } else if (bb6 instanceof ab6) {
            ForwardPickerScreen forwardPickerScreen = this.b;
            forwardPickerScreen.x0 = new cb6(forwardPickerScreen, 4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
