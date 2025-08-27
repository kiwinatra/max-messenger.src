package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: xt6  reason: default package */
public final class xt6 implements cxe {
    public final Context a;
    public final String b = xt6.class.getName();
    public final Lazy c;
    public int d;
    public int e;
    public final String f;

    public xt6(Context context, Lazy lazy, Lazy lazy2) {
        this.a = context;
        this.c = LazyKt.lazy(new sz0((Object) this, lazy2, lazy, 2));
        this.d = -1;
        this.e = -1;
        this.f = "Google Play Services";
    }

    public final boolean a() {
        return c() == 0;
    }

    public final Object b(d8f d8f) {
        FirebaseMessaging instance;
        if (a()) {
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(d8f));
            xga xga = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                instance = FirebaseMessaging.getInstance(hp5.b());
            }
            instance.getClass();
            qdf qdf = new qdf();
            instance.f.execute(new qp5(instance, qdf, 1));
            qdf.a.i(new zqd(14, this, safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(d8f);
            }
            return orThrow;
        }
        throw new StoreServicesInfo$ServicesNotAvailableException();
    }

    public final int c() {
        if (this.d == -1) {
            this.d = dt6.d.b(et6.a, this.a);
        }
        return this.d;
    }

    public final int d() {
        if (this.e == -1) {
            Object obj = dt6.c;
            Context context = this.a;
            int i = ot6.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.e = i2;
        }
        return this.e;
    }
}
