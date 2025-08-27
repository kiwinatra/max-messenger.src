package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t  reason: default package */
public final class t extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation continuation) {
        super(2, continuation);
        this.b = vVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme xme = this.b.c;
            int i2 = ena.b;
            igf igf = new igf(fna.b);
            vpa vpa = kv0.f;
            if (vpa == null) {
                vpa = null;
            }
            vpa.getClass();
            List listOf = CollectionsKt.listOf(new oae(i2, igf, new mgf("25.6.4")));
            this.a = 1;
            xme.setValue(listOf);
            if (Unit.INSTANCE == coroutine_suspended) {
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
