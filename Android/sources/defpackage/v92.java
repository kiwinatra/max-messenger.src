package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: v92  reason: default package */
public final class v92 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ia2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Set o;
    public final /* synthetic */ boolean v = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v92(ia2 ia2, String str, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.b = ia2;
        this.c = str;
        this.o = linkedHashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v92(this.b, this.c, (LinkedHashSet) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ia2 ia2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = ia2.K0;
            c6d g = ia2.g();
            this.a = 1;
            g.getClass();
            obj = n6d.a(g.a, new ep1(g, this.c, (LinkedHashSet) this.o, 12), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        if (this.v && list != null) {
            this.a = 2;
            if (ia2.n(ia2, list, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
