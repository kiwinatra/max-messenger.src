package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s6d  reason: default package */
public final class s6d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z6d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Collection o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s6d(z6d z6d, long j, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.b = z6d;
        this.c = j;
        this.o = collection;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s6d(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            aj9 d = this.b.d();
            List list = CollectionsKt.toList(this.o);
            this.a = 1;
            d.getClass();
            if (i8b.r(d.a, new gu4(d, list, this.c, 1), this) == coroutine_suspended) {
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
