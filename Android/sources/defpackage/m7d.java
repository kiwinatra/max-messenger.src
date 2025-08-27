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

/* renamed from: m7d  reason: default package */
public final class m7d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ r78 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m7d(o7d o7d, long j, Continuation continuation) {
        super(2, continuation);
        r78 r78 = r78.SENDING;
        this.b = o7d;
        this.c = j;
        this.o = r78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m7d(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m7d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List listOf = CollectionsKt.listOf(Boxing.boxLong(this.c));
            this.a = 1;
            o7d o7d = this.b;
            Object I = ev0.I(((osa) o7d.a).b(), new n7d(o7d, listOf, this.o, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
