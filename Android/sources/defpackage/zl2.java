package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zl2  reason: default package */
public final class zl2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ em2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zl2(em2 em2, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = em2;
        this.c = j;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zl2(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zl2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            em2 em2 = this.b;
            Long j = em2.j();
            if (j == null) {
                return Unit.INSTANCE;
            }
            long longValue = j.longValue();
            List listOf = CollectionsKt.listOf(Boxing.boxLong(this.c));
            this.a = 1;
            if (((tl4) em2.m.getValue()).a(em2.a, longValue, listOf, this.o) == coroutine_suspended) {
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
