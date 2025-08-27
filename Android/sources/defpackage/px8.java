package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: px8  reason: default package */
public final class px8 {
    public static int d;
    public final kx8 a;
    public final xe8 b;
    public final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r8v2, types: [kx8, jx8] */
    public px8(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i = r09.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                    componentName = null;
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            ? jx8 = new jx8(context, str, bundle);
            this.a = jx8;
            Looper myLooper = Looper.myLooper();
            jx8.c(new f0(3), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            jx8.a.setMediaButtonReceiver(pendingIntent);
            this.b = new xe8(context, jx8.c);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = px8.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public final ly8 b() {
        return new ly8(this.a.a.getCurrentControllerInfo());
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.AbstractCollection, java.util.List] */
    public final void c(mob mob) {
        kx8 kx8 = this.a;
        kx8.g = mob;
        synchronized (kx8.d) {
            for (int beginBroadcast = kx8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((e67) kx8.f.getBroadcastItem(beginBroadcast)).g(mob);
                } catch (RemoteException unused) {
                }
            }
            kx8.f.finishBroadcast();
        }
        MediaSession mediaSession = kx8.a;
        if (mob.Z == null) {
            PlaybackState.Builder d2 = iob.d();
            iob.x(d2, mob.a, mob.b, mob.o, mob.y);
            iob.u(d2, mob.c);
            iob.s(d2, mob.v);
            iob.v(d2, mob.x);
            for (lob lob : mob.z) {
                PlaybackState.CustomAction customAction = lob.v;
                if (customAction == null) {
                    PlaybackState.CustomAction.Builder e = iob.e(lob.a, lob.b, lob.c);
                    iob.w(e, lob.o);
                    customAction = iob.b(e);
                }
                if (customAction != null) {
                    iob.a(d2, customAction);
                }
            }
            iob.t(d2, mob.X);
            job.b(d2, mob.Y);
            mob.Z = iob.c(d2);
        }
        mediaSession.setPlaybackState(mob.Z);
    }
}
