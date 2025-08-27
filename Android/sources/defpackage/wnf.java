package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.view.View;
import java.io.IOException;

/* renamed from: wnf  reason: default package */
public final class wnf implements Runnable {
    public static final Object x = new Object();
    public static Boolean y;
    public static Boolean z;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object o;
    public final Object v;
    public final Object w;

    public wnf(View view, yrc yrc, View view2, vrc vrc, hqc hqc, long j) {
        this.c = yrc;
        this.o = view2;
        this.v = vrc;
        this.w = hqc;
        this.b = j;
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (x) {
            try {
                Boolean bool = z;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                z = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (x) {
            try {
                Boolean bool = y;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                y = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [android.content.BroadcastReceiver, vnf] */
    public final void run() {
        switch (this.a) {
            case 0:
                unf unf = (unf) this.w;
                Context context = (Context) this.c;
                boolean b2 = b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.v;
                if (b2) {
                    wakeLock.acquire(zi3.a);
                }
                try {
                    unf.d(true);
                    if (!((jv3) this.o).g()) {
                        unf.d(false);
                        if (!b(context)) {
                            return;
                        }
                    } else if (!a(context) || c()) {
                        if (unf.e()) {
                            unf.d(false);
                        } else {
                            unf.f(this.b);
                        }
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        ? broadcastReceiver = new BroadcastReceiver();
                        broadcastReceiver.a = this;
                        context.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                    unf.d(false);
                    if (!b(context)) {
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                    throw th;
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                Rect c2 = yrc.c((yrc) this.c, (View) this.o);
                if (c2 != null) {
                    String str = ((yrc) this.c).d;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        w78 w78 = w78.o;
                        long j = this.b;
                        a67.d(w78, str, "Play reaction effect without pending, reaction:" + ((hqc) this.w) + ", l:" + j, (Throwable) null);
                    }
                    vrc vrc = (vrc) this.v;
                    yrc.d((yrc) this.c, vrc.b, vrc.a, c2);
                    return;
                }
                return;
        }
    }

    public wnf(unf unf, Context context, jv3 jv3, long j) {
        this.w = unf;
        this.c = context;
        this.b = j;
        this.o = jv3;
        this.v = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
