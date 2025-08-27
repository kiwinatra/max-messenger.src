package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: ga  reason: default package */
public final class ga extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ha c;
    public final /* synthetic */ Set o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ga(int i, ha haVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = haVar;
        this.o = set;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ga(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ga) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ha haVar = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.b == jxa.j;
            KProperty[] kPropertyArr = ha.i;
            List list = CollectionsKt.toList(this.o);
            this.a = 1;
            if (((my2) ((qx2) haVar.b.getValue())).g(haVar.a, list, z, this) == coroutine_suspended) {
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
        n6e n6e = haVar.e;
        p33 p33 = p33.b;
        this.a = 2;
        if (n6e.a(p33, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
