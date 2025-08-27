package defpackage;

import android.os.SystemClock;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kd7  reason: default package */
public final class kd7 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yd7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.o = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kd7 kd7 = new kd7(this.o, continuation);
        kd7.c = obj;
        return kd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        yd7 yd7 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = yd7.C0;
            int i2 = yd7.v0.get();
            z68.c(str, "prefetch " + i2 + ": start load real albums", new Object[0]);
            jd7 jd7 = new jd7(yd7, (Continuation) null);
            this.c = d142;
            this.a = elapsedRealtime;
            this.b = 1;
            Object d = e14.d(jd7, this);
            if (d == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = elapsedRealtime;
            d14 d143 = d142;
            obj = d;
            d14 = d143;
        } else if (i == 1) {
            j = this.a;
            d14 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        xme xme = yd7.Y;
        o85 o85 = new o85(list);
        xme.getClass();
        xme.m((Object) null, o85);
        String str2 = yd7.C0;
        int i3 = yd7.v0.get();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        z68.c(str2, "prefetch " + i3 + ": finish load real albums, time = " + elapsedRealtime2 + "ms", new Object[0]);
        return Unit.INSTANCE;
    }
}
