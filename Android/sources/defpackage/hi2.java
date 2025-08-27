package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hi2  reason: default package */
public final class hi2 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ aj2 c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hi2(aj2 aj2, int i, Continuation continuation) {
        super(2, continuation);
        this.c = aj2;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hi2(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hi2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        aj2 aj2 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            g4g g4g = ((ci2) aj2.U0.a.getValue()).b;
            String str = aj2.Z;
            if (g4g == null) {
                z68.c(str, "Can't load frame for preview because videoContent is null", new Object[0]);
                return Unit.INSTANCE;
            }
            Lazy lazy = aj2.B0;
            if (!Intrinsics.areEqual((Object) ((fe6) lazy.getValue()).h().a, (Object) g4g)) {
                ((fe6) lazy.getValue()).k(new ce6(g4g, 6));
                if (!((fe6) lazy.getValue()).i()) {
                    z68.c(str, "Can't load frame for preview because can't extract frame", new Object[0]);
                    return Unit.INSTANCE;
                }
                ((fe6) lazy.getValue()).prepare();
            }
            long j2 = aj2.K0.get();
            int i2 = (g4g.e() > 0 ? 1 : (g4g.e() == 0 ? 0 : -1));
            int i3 = this.o;
            if (i2 == 0 || Math.abs((double) (j2 - ((long) i3))) > ((double) g4g.e()) * 0.01d) {
                xme xme = aj2.P0;
                yh2 a2 = yh2.a((yh2) xme.getValue(), new xh2((de6) null, true, false, 5));
                xme.getClass();
                xme.m((Object) null, a2);
                j = (long) i3;
                this.a = j;
                this.b = 1;
                obj2 = ((fe6) lazy.getValue()).j(j, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            long j3 = this.a;
            ResultKt.throwOnFailure(obj);
            j = j3;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme2 = aj2.P0;
        yh2 a3 = yh2.a((yh2) xme2.getValue(), new xh2((de6) obj2, false, false, 6));
        xme2.getClass();
        xme2.m((Object) null, a3);
        aj2.K0.updateAndGet(new gi2(j));
        return Unit.INSTANCE;
    }
}
