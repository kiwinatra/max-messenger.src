package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: ba3  reason: default package */
public final class ba3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ComplaintBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba3(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.b = complaintBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ba3 ba3 = new ba3(continuation, this.b);
        ba3.a = obj;
        return ba3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ba3) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (ja3) this.a, (Object) ja3.a)) {
            ((e0b) this.b.o.getValue()).j();
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
