package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;

/* renamed from: jt4  reason: default package */
public abstract class jt4 extends Service {
    public static final HashMap z = new HashMap();
    public final String a = null;
    public final int b = 0;
    public final int c = 0;
    public it4 o;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;

    public static void a(jt4 jt4, List list) {
        jt4.getClass();
    }

    public static boolean b(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    public final void c() {
        it4 it4 = this.o;
        it4.getClass();
        if (!it4.b.k) {
            if (v0g.a >= 28 || !this.x) {
                this.y |= stopSelfResult(this.v);
                return;
            }
            stopSelf();
            this.y = true;
        }
    }

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        String str = this.a;
        if (str != null && v0g.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.b), 2);
            int i = this.c;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap hashMap = z;
        it4 it4 = (it4) hashMap.get(cls);
        boolean z2 = true;
        if (it4 == null) {
            int i2 = v0g.a;
            et4 et4 = (et4) ko8.a.getAccessor().g(et4.class);
            et4.c(false);
            it4 it42 = new it4(getApplicationContext(), et4, false, cls);
            hashMap.put(cls, it42);
            it4 = it42;
        }
        this.o = it4;
        if (it4.e != null) {
            z2 = false;
        }
        n79.n(z2);
        it4.e = this;
        if (it4.b.h) {
            v0g.p((xp4) null).postAtFrontOfQueue(new bk4(6, it4, this));
        }
    }

    public final void onDestroy() {
        it4 it4 = this.o;
        it4.getClass();
        boolean z2 = false;
        if (it4.e == this) {
            z2 = true;
        }
        n79.n(z2);
        it4.e = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        this.v = i2;
        this.x = false;
        if (intent != null) {
            str2 = intent.getAction();
            str = intent.getStringExtra("content_id");
            this.w |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str2);
        } else {
            str2 = null;
            str = null;
        }
        if (str2 == null) {
            str2 = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        it4 it4 = this.o;
        it4.getClass();
        et4 et4 = it4.b;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -2068303304:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1192305801:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c2 = 1;
                    break;
                }
                break;
            case -659421309:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c2 = 2;
                    break;
                }
                break;
            case -238450692:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c2 = 3;
                    break;
                }
                break;
            case 32678949:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c2 = 4;
                    break;
                }
                break;
            case 464223742:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c2 = 5;
                    break;
                }
                break;
            case 829812082:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c2 = 6;
                    break;
                }
                break;
            case 845668953:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1746253622:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                intent.getClass();
                if (intent.hasExtra("stop_reason")) {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    et4.f++;
                    et4.c.obtainMessage(4, intExtra, 0, str).sendToTarget();
                    break;
                } else {
                    i8b.o("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                }
            case 1:
                if (str != null) {
                    et4.f++;
                    et4.c.obtainMessage(8, str).sendToTarget();
                    break;
                } else {
                    i8b.o("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case 2:
            case 3:
                break;
            case 4:
                et4.c(false);
                break;
            case 5:
                et4.f++;
                et4.c.obtainMessage(9).sendToTarget();
                break;
            case 6:
                intent.getClass();
                ht4 ht4 = (ht4) intent.getParcelableExtra("download_request");
                if (ht4 != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    et4.f++;
                    et4.c.obtainMessage(7, intExtra2, 0, ht4).sendToTarget();
                    break;
                } else {
                    i8b.o("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case 7:
                intent.getClass();
                l3d l3d = (l3d) intent.getParcelableExtra("requirements");
                if (l3d != null) {
                    if (!l3d.equals((l3d) et4.m.d)) {
                        sb0 sb0 = et4.m;
                        ao aoVar = (ao) sb0.f;
                        aoVar.getClass();
                        Context context = (Context) sb0.b;
                        context.unregisterReceiver(aoVar);
                        sb0.f = null;
                        if (v0g.a >= 24 && ((n3d) sb0.g) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            n3d n3d = (n3d) sb0.g;
                            n3d.getClass();
                            connectivityManager.unregisterNetworkCallback(n3d);
                            sb0.g = null;
                        }
                        sb0 sb02 = new sb0(et4.a, et4.d, l3d);
                        et4.m = sb02;
                        et4.b(et4.m, sb02.d());
                        break;
                    }
                } else {
                    i8b.o("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case 8:
                et4.c(true);
                break;
            default:
                i8b.o("Ignored unrecognized action: ".concat(str2));
                break;
        }
        int i3 = v0g.a;
        this.y = false;
        if (et4.g == 0 && et4.f == 0) {
            c();
        }
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        this.x = true;
    }
}
