package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.b;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* renamed from: dt6  reason: default package */
public final class dt6 extends et6 {
    public static final Object c = new Object();
    public static final dt6 d = new Object();

    public static AlertDialog d(Context context, int i, lwg lwg, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(pvg.c(i, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = pvg.b(i, context);
        if (b != null) {
            builder.setPositiveButton(b, lwg);
        }
        String d2 = pvg.d(i, context);
        if (d2 != null) {
            builder.setTitle(d2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [w75, android.app.DialogFragment] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b) {
                ed6 v = ((b) activity).v();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                vzg.n(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.B1 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.C1 = onCancelListener;
                }
                supportErrorDialogFragment.Y2(v, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        vzg.n(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final boolean c(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new awg(super.a(i, activity, "d"), activity, i2), onCancelListener);
        if (d2 == null) {
            return false;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new dwg(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String f = i == 6 ? pvg.f(context, "common_google_play_services_resolution_required_title") : pvg.d(i, context);
            if (f == null) {
                f = context.getResources().getString(wmc.common_google_play_services_notification_ticker);
            }
            String e = (i == 6 || i == 19) ? pvg.e(context, "common_google_play_services_resolution_required_text", pvg.a(context)) : pvg.c(i, context);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            vzg.m(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            eda eda = new eda(context, (String) null);
            eda.u = true;
            eda.i(16, true);
            eda.e = eda.c(f);
            cda cda = new cda(0);
            cda.f = eda.c(e);
            eda.q(cda);
            PackageManager packageManager = context.getPackageManager();
            if (b59.r == null) {
                b59.r = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (b59.r.booleanValue()) {
                eda.F.icon = context.getApplicationInfo().icon;
                eda.k = 2;
                if (b59.K(context)) {
                    eda.b.add(new qca(pfc.common_full_open_on_phone, resources.getString(wmc.common_open_on_phone), pendingIntent));
                } else {
                    eda.g = pendingIntent;
                }
            } else {
                eda.F.icon = 17301642;
                eda.F.tickerText = eda.c(resources.getString(wmc.common_google_play_services_notification_ticker));
                eda.F.when = System.currentTimeMillis();
                eda.g = pendingIntent;
                eda.e(e);
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(wmc.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            eda.z = "com.google.android.gms.availability";
            Notification b = eda.b();
            if (i == 1 || i == 2 || i == 3) {
                ot6.a.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b);
        }
    }

    public final void g(Activity activity, av7 av7, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new gwg(super.a(i, activity, "d"), av7), onCancelListener);
        if (d2 != null) {
            e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
