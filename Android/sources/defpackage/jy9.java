package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.media.service.OneMeMediaSessionService;

/* renamed from: jy9  reason: default package */
public final class jy9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ xy9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy9(xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.b = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jy9(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jy9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [oo8, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = xy9.L;
            this.a = 1;
            if (xk4.c(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = xy9.N;
        xy9 xy9 = this.b;
        qo8 qo8 = xy9.o;
        if (qo8 == null || !qo8.c.isConnected()) {
            z68.c("xy9", "connect", new Object[0]);
            xy9.k(true);
            Context context = xy9.a;
            oxd oxd = new oxd(context, new ComponentName(context, OneMeMediaSessionService.class));
            Bundle bundle = Bundle.EMPTY;
            Looper w = v0g.w();
            ? obj2 = new Object();
            yo8 yo8 = new yo8(w);
            v0g.W(new Handler(w), new mo8(yo8, new qo8(context, oxd, bundle, obj2, w, yo8, oxd.a.e() ? new ox0(3, (Object) new k74(context)) : null), 0));
            yo8.d(new x55((Object) xy9, (Object) yo8, (Object) null, 22), iw3.a(context));
        } else {
            z68.c("xy9", "connect request rejected, already connected", new Object[0]);
            xy9.i(xy9);
            xy9.x();
        }
        return Unit.INSTANCE;
    }
}
