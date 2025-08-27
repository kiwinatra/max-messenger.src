package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n75  reason: default package */
public final class n75 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o75 c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n75(o75 o75, String str, Continuation continuation) {
        super(2, continuation);
        this.c = o75;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n75 n75 = new n75(this.c, this.o, continuation);
        n75.b = obj;
        return n75;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n75) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        o75 o75 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            o75.z = true;
            Lazy lazy = m65.a;
            String a2 = m65.a(this.o);
            if (!e14.f(d142)) {
                Unit unit = Unit.INSTANCE;
                o75.z = false;
                return unit;
            }
            a33 a33 = (a33) ((x23) o75.b.getValue());
            boolean areEqual = Intrinsics.areEqual((Object) a33.g.getString("app.pin_" + a33.s(), (String) null), (Object) a2);
            s85 s85 = o75.v;
            if (!areEqual) {
                xag.h(s85, p75.b);
                Unit unit2 = Unit.INSTANCE;
                o75.z = false;
                return unit2;
            }
            xag.h(s85, p75.a);
            this.b = d142;
            this.a = 1;
            if (xk4.b(1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 = d142;
        } else if (i == 1) {
            d14 = (d14) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                o75.z = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (e14.f(d14)) {
            xag.h(o75.w, Unit.INSTANCE);
        }
        o75.z = false;
        return Unit.INSTANCE;
    }
}
