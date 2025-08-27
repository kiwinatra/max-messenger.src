package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: ea3  reason: default package */
public final class ea3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ ComplaintBottomSheet o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea3(co1 co1, Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.c = co1;
        this.o = complaintBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ea3 ea3 = new ea3((co1) this.c, continuation, this.o);
        ea3.b = obj;
        return ea3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ea3) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            da3 da3 = new da3(new Ref.BooleanRef(), (ds5) this.b, this.o);
            this.a = 1;
            if (this.c.e(da3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
