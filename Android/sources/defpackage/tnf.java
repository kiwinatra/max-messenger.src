package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: tnf  reason: default package */
public final /* synthetic */ class tnf implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ jv3 o;
    public final /* synthetic */ kwd v;

    public /* synthetic */ tnf(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, jv3 jv3, kwd kwd) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = firebaseMessaging;
        this.o = jv3;
        this.v = kwd;
    }

    public final Object call() {
        snf snf;
        Context context = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        jv3 jv3 = this.o;
        kwd kwd = this.v;
        synchronized (snf.class) {
            try {
                WeakReference weakReference = snf.c;
                snf = weakReference != null ? (snf) weakReference.get() : null;
                if (snf == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    snf snf2 = new snf(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    synchronized (snf2) {
                        snf2.a = soc.l(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    }
                    snf.c = new WeakReference(snf2);
                    snf = snf2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new unf(firebaseMessaging, jv3, snf, kwd, context, (ScheduledThreadPoolExecutor) scheduledExecutorService);
    }
}
