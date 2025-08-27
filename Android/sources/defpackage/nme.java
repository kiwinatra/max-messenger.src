package defpackage;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* renamed from: nme  reason: default package */
public final class nme implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public final Object c;
    public final Object o;

    public nme(j09 j09) {
        this.o = j09;
        this.c = new mme(j09, this);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.o).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            return ((FirebaseMessaging) this.o).a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                j09 j09 = (j09) this.o;
                ((Function1) j09.c).invoke((mme) this.c);
                ((Handler) j09.k).removeCallbacks(this);
                ((Handler) j09.k).postDelayed(this, 1000);
                this.b++;
                return;
            case 1:
                eud j = eud.j();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.o;
                boolean q = j.q(firebaseMessaging.b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                if (q) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = true;
                    }
                    if (!firebaseMessaging.h.g()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                        }
                        if (!eud.j().q(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else if (!eud.j().p(firebaseMessaging.b) || a()) {
                        if (b()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                        } else {
                            firebaseMessaging.h(this.b);
                        }
                        if (!eud.j().q(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else {
                        ao aoVar = new ao();
                        aoVar.b = this;
                        ((FirebaseMessaging) ((nme) aoVar.b).o).b.registerReceiver(aoVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!eud.j().q(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                } catch (IOException e) {
                    try {
                        e.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!eud.j().q(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (eud.j().q(firebaseMessaging.b)) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (!((uqf) this.o).o) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ((uqf) this.o).getClass();
                    long a2 = lfd.a(timeUnit);
                    long j2 = this.b;
                    if (j2 > a2) {
                        try {
                            Thread.sleep(j2 - a2);
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            n54.D(e2);
                            return;
                        }
                    }
                    if (!((uqf) this.o).o) {
                        ((Runnable) this.c).run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public nme(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j5a("firebase-iid-executor", 0));
        this.o = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public nme(Runnable runnable, uqf uqf, long j) {
        this.c = runnable;
        this.o = uqf;
        this.b = j;
    }
}
