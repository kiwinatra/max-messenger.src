package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yx2  reason: default package */
public final class yx2 extends SuspendLambda implements Function2 {
    public tz9 a;
    public int b;
    public final /* synthetic */ tz9 c;
    public final /* synthetic */ ay2 o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yx2(xme xme, Continuation continuation, ay2 ay2, long j) {
        super(2, continuation);
        this.c = xme;
        this.o = ay2;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yx2((xme) this.c, continuation, this.o, this.v);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yx2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        tz9 tz9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        long j = this.v;
        ay2 ay2 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tz9 tz92 = this.c;
            this.a = tz92;
            this.b = 1;
            Object e = ay2.e(ay2, j, this);
            if (e == coroutine_suspended) {
                return coroutine_suspended;
            }
            tz9 tz93 = tz92;
            obj = e;
            tz9 = tz93;
        } else if (i == 1) {
            tz9 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        a32 a322 = null;
        if (a32 == null) {
            ((jna) ((rl) ((Lazy) ay2.c).getValue())).l(j);
            a32 = null;
        }
        if (a32 != null) {
            ((tz9) ((ConcurrentHashMap) ay2.x).computeIfAbsent(Boxing.boxLong(a32.a), new zx2(new hw2(1, a32)))).setValue(a32);
            a322 = a32;
        }
        tz9.setValue(a322);
        return Unit.INSTANCE;
    }
}
