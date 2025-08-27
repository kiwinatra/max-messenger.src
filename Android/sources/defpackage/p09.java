package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: p09  reason: default package */
public final class p09 extends sda {
    public final ex8 e;
    public int[] f;

    public p09(ex8 ex8) {
        this.e = ex8;
    }

    public final void b(tgg tgg) {
        if (v0g.a >= 21) {
            Notification.MediaStyle a = o09.a();
            int[] iArr = this.f;
            ex8 ex8 = this.e;
            Notification.MediaStyle b = o09.b(a, iArr, ex8);
            Notification.Builder builder = (Notification.Builder) tgg.b;
            o09.c(builder, b);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", ex8.a.j.b());
            builder.addExtras(bundle);
        }
    }

    public final RemoteViews h() {
        if (v0g.a >= 21) {
            return null;
        }
        int min = Math.min(((eda) this.b).b.size(), 5);
        RemoteViews c = c(min <= 3 ? mjc.media3_notification_template_big_media_narrow : mjc.media3_notification_template_big_media);
        c.removeAllViews(vic.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(vic.media_actions, p((qca) ((eda) this.b).b.get(i)));
            }
        }
        c.setViewVisibility(vic.cancel_action, 8);
        return c;
    }

    public final RemoteViews i() {
        if (v0g.a >= 21) {
            return null;
        }
        RemoteViews c = c(mjc.media3_notification_template_media);
        int size = ((eda) this.b).b.size();
        int[] iArr = this.f;
        if (iArr != null) {
            int min = Math.min(iArr.length, 3);
            c.removeAllViews(vic.media_actions);
            if (min > 0) {
                int i = 0;
                while (i < min) {
                    if (i < size) {
                        c.addView(vic.media_actions, p((qca) ((eda) this.b).b.get(iArr[i])));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                    }
                }
            }
        }
        c.setViewVisibility(vic.end_padder, 0);
        c.setViewVisibility(vic.cancel_action, 8);
        return c;
    }

    public final RemoteViews p(qca qca) {
        boolean z = qca.j == null;
        RemoteViews remoteViews = new RemoteViews(((eda) this.b).a.getPackageName(), mjc.media3_notification_media_action);
        IconCompat a = qca.a();
        if (a != null) {
            remoteViews.setImageViewResource(vic.action0, a.e());
        }
        if (!z) {
            remoteViews.setOnClickPendingIntent(vic.action0, qca.j);
        }
        remoteViews.setContentDescription(vic.action0, qca.i);
        return remoteViews;
    }

    public final void q(int... iArr) {
        this.f = iArr;
    }
}
