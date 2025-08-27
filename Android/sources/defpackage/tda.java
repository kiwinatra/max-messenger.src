package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: tda  reason: default package */
public abstract class tda {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static qca e(ArrayList<Parcelable> arrayList, int i) {
        a1d[] a1dArr;
        int i2;
        IconCompat iconCompat = null;
        Notification.Action action = (Notification.Action) arrayList.get(i);
        RemoteInput[] g = rca.g(action);
        boolean z = false;
        if (g == null) {
            a1dArr = null;
        } else {
            a1d[] a1dArr2 = new a1d[g.length];
            for (int i3 = 0; i3 < g.length; i3++) {
                RemoteInput remoteInput = g[i3];
                a1dArr2[i3] = new a1d(rca.h(remoteInput), rca.f(remoteInput), rca.b(remoteInput), rca.a(remoteInput), wca.c(remoteInput), rca.d(remoteInput), (HashSet) null);
            }
            a1dArr = a1dArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = rca.c(action).getBoolean("android.support.allowGeneratedReplies") || uca.a(action);
        boolean z3 = rca.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int a = vca.a(action);
        boolean e = wca.e(action);
        if (i4 >= 31) {
            z = xca.a(action);
        }
        boolean z4 = z;
        if (tca.a(action) != null || (i2 = action.icon) == 0) {
            if (tca.a(action) != null) {
                Icon a2 = tca.a(action);
                PorterDuff.Mode mode = IconCompat.k;
                if (!(x67.c(a2) == 2 && x67.a(a2) == 0)) {
                    iconCompat = v67.a(a2);
                }
            }
            return new qca(iconCompat, action.title, action.actionIntent, rca.c(action), a1dArr, (a1d[]) null, z2, a, z3, e, z4);
        }
        CharSequence charSequence = action.title;
        PendingIntent pendingIntent = action.actionIntent;
        Bundle c = rca.c(action);
        if (i2 != 0) {
            iconCompat = IconCompat.d((Resources) null, "", i2);
        }
        return new qca(iconCompat, charSequence, pendingIntent, c, a1dArr, (a1d[]) null, z2, a, z3, e, z4);
    }
}
