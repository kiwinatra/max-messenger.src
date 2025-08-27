package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* renamed from: kda  reason: default package */
public final class kda extends sda {
    public int[] e;
    public MediaSessionCompat.Token f;

    public final void b(tgg tgg) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) tgg.b;
        if (i >= 34) {
            sca.d(builder, sca.b(yca.a(sca.a(), (CharSequence) null, 0, (PendingIntent) null, Boolean.FALSE), this.e, this.f));
        } else {
            sca.d(builder, sca.b(sca.a(), this.e, this.f));
        }
    }

    public final RemoteViews h() {
        return null;
    }

    public final RemoteViews i() {
        return null;
    }
}
