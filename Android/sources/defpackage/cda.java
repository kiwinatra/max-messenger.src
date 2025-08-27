package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cda  reason: default package */
public final class cda extends sda {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ cda(int i) {
        this.e = i;
    }

    public final void b(tgg tgg) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) tgg.b).setBigContentTitle((CharSequence) this.c).bigText((CharSequence) this.f);
                if (this.a) {
                    bigText.setSummaryText((CharSequence) this.d);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) tgg.b).setBigContentTitle((CharSequence) this.c);
                if (this.a) {
                    bigContentTitle.setSummaryText((CharSequence) this.d);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                return;
        }
    }

    public final String e() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
