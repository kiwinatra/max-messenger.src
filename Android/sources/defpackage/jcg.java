package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: jcg  reason: default package */
public final class jcg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function3 c;
    public final /* synthetic */ View o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jcg(Function3 function3, View view, Continuation continuation) {
        super(2, continuation);
        this.c = function3;
        this.o = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jcg jcg = new jcg(this.c, this.o, continuation);
        jcg.b = obj;
        return jcg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jcg) create((k2b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.c.invoke(this.o, (k2b) this.b, this) == coroutine_suspended) {
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
