package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: b8f  reason: default package */
public final class b8f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ f8f b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b8f(f8f f8f, Continuation continuation) {
        super(2, continuation);
        this.b = f8f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b8f(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b8f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FirebaseMessaging instance;
        s7h s7h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        f8f f8f = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cxe j = f8f.j();
            this.a = 1;
            xt6 xt6 = (xt6) j;
            if (xt6.a()) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                xga xga = FirebaseMessaging.k;
                synchronized (FirebaseMessaging.class) {
                    instance = FirebaseMessaging.getInstance(hp5.b());
                }
                if (instance.e() == null) {
                    s7h = hsg.o((Object) null);
                } else {
                    qdf qdf = new qdf();
                    Executors.newSingleThreadExecutor(new j5a("Firebase-Messaging-Network-Io", 0)).execute(new qp5(instance, qdf, 0));
                    s7h = qdf.a;
                }
                s7h.i(new p7d(14, (Object) safeContinuation, (Object) xt6));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (orThrow != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    orThrow = Unit.INSTANCE;
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new StoreServicesInfo$ServicesNotAvailableException();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((qjd) f8f.c()).l("user.fcmToken", (String) null);
        ((qjd) f8f.c()).l("user.pushDeviceType", (String) null);
        return Unit.INSTANCE;
    }
}
