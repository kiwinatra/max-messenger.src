package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: ifa  reason: default package */
public final class ifa extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ NotificationsImagesProvider c;
    public final /* synthetic */ Uri o;
    public final /* synthetic */ qx0 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ifa(NotificationsImagesProvider notificationsImagesProvider, Uri uri, uae uae, Continuation continuation) {
        super(2, continuation);
        this.c = notificationsImagesProvider;
        this.o = uri;
        this.v = uae;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ifa ifa = new ifa(this.c, this.o, (uae) this.v, continuation);
        ifa.b = obj;
        return ifa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ifa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        NotificationsImagesProvider notificationsImagesProvider = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            this.b = d142;
            this.a = 1;
            UriMatcher uriMatcher = NotificationsImagesProvider.a;
            notificationsImagesProvider.getClass();
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            i0 g = ld9.B().g(qa7.a(this.o), (Object) null, uub.o);
            lw1.k(new ek5(g, 1));
            g.m(new kfa(lw1, 0), io1.a);
            Object t = lw1.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                t = Unit.INSTANCE;
            }
            if (t == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 = d142;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.b = null;
        this.a = 2;
        obj = NotificationsImagesProvider.a(notificationsImagesProvider, (uae) this.v, d14, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
