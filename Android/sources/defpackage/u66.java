package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u66  reason: default package */
public final class u66 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ w66 b;
    public final /* synthetic */ zx5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u66(zx5 zx5, w66 w66, Continuation continuation) {
        super(2, continuation);
        this.b = w66;
        this.c = zx5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u66(this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u66) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            w66 w66 = this.b;
            List list = (List) w66.v.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((g0g) listIterator.previous()).b == f0g.b) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            zx5 a2 = zx5.a(this.c, (String) null, i + 1, (List) null, 262135);
            this.a = 1;
            if (u82.e(w66.b, a2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
