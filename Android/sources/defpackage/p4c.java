package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p4c  reason: default package */
public final class p4c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q4c b;
    public final /* synthetic */ Map c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p4c(q4c q4c, HashMap hashMap, Continuation continuation) {
        super(2, continuation);
        this.b = q4c;
        this.c = hashMap;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p4c(this.b, (HashMap) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p4c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q4c q4c = this.b;
            if (!((rh3) q4c.y.getValue()).e()) {
                n6e n6e = q4c.X;
                Boolean boxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (n6e.a(boxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a32 a32 = (a32) ((my2) ((qx2) q4c.c.getValue())).o(q4c.b).a.getValue();
                if (a32 == null) {
                    return Unit.INSTANCE;
                }
                q4c.x0.set(((jna) ((rl) q4c.v.getValue())).o(a32.a, a32.b.a, 0, (String) null, false, (HashMap) this.c));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
