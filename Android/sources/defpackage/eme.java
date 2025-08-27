package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: eme  reason: default package */
public final class eme extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ome c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eme(ome ome, Continuation continuation) {
        super(2, continuation);
        this.c = ome;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eme eme = new eme(this.c, continuation);
        eme.b = obj;
        return eme;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eme) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dme dme = new dme(new Ref.BooleanRef(), (ds5) this.b);
            this.a = 1;
            if (this.c.e(dme, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
