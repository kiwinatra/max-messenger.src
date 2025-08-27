package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: m9d  reason: default package */
public final class m9d {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final qae a = new qae(0);
    public final Context b;
    public final ila c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public k0h g;

    public m9d(Context context) {
        this.b = context;
        this.c = new ila(context);
        this.e = new Messenger(new jxg(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final s7h a(Bundle bundle) {
        String num;
        synchronized (m9d.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        qdf qdf = new qdf();
        synchronized (this.a) {
            this.a.put(num, qdf);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (m9d.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, exg.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            qdf.a.b(ep4.o, new w28((Object) this, (Object) num, (Object) this.d.schedule(new haf(19, (Object) qdf), 30, TimeUnit.SECONDS), 20));
            return qdf.a;
        }
        if (this.c.h() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        qdf.a.b(ep4.o, new w28((Object) this, (Object) num, (Object) this.d.schedule(new haf(19, (Object) qdf), 30, TimeUnit.SECONDS), 20));
        return qdf.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                qdf qdf = (qdf) this.a.remove(str);
                if (qdf != null) {
                    qdf.b(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
