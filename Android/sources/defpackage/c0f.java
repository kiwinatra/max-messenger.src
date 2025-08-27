package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c0f  reason: default package */
public final class c0f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ b33 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0f(b33 b33, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.b = b33;
        this.c = str;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c0f(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        b33 b33 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) b33.x;
            String str = this.c;
            boolean areEqual = Intrinsics.areEqual((Object) str, (Object) (String) b33.v);
            int i2 = this.o;
            if (areEqual && (num = (Integer) b33.y) != null && num.intValue() == i2 && list != null) {
                return list;
            }
            this.a = 1;
            su3 su3 = (su3) b33.o;
            obj = ev0.I(((osa) su3.c).a(), new pu3(su3, str, i2, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b33.x = (List) obj;
        return obj;
    }
}
