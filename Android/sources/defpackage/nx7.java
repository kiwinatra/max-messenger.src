package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nx7  reason: default package */
public final class nx7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ by7 c;
    public final /* synthetic */ Uri o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nx7(by7 by7, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.c = by7;
        this.o = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nx7 nx7 = new nx7(this.c, this.o, continuation);
        nx7.b = obj;
        return nx7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nx7) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (by7.a(this.c, (ds5) this.b, this.o, this) == coroutine_suspended) {
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
