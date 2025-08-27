package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: v3e  reason: default package */
public final class v3e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ y3e b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v3e(y3e y3e, int i, Continuation continuation) {
        super(2, continuation);
        this.b = y3e;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new v3e(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = y3e.I0;
            y3e y3e = this.b;
            int b2 = wzf.b(((hq) y3e.l()).g.getString("app.privacy.chats.invite", "ALL"));
            int i2 = this.c;
            if (b2 == i2) {
                return Unit.INSTANCE;
            }
            ((hq) y3e.l()).l("app.privacy.chats.invite", wzf.f(i2));
            rl k = y3e.k();
            ? obj2 = new Object();
            obj2.o = i2;
            k.a(new n0g(obj2));
            this.a = 1;
            if (y3e.j(y3e, this) == coroutine_suspended) {
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
