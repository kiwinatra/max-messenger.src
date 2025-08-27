package defpackage;

import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.View;
import androidx.mediarouter.app.d;

/* renamed from: gv8  reason: default package */
public final class gv8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ gv8(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    public final void onClick(View view) {
        PendingIntent sessionActivity;
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return;
            case 1:
                d dVar = this.b;
                MediaControllerCompat mediaControllerCompat = dVar.a1;
                if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dVar.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        sessionActivity.toString();
                        return;
                    }
                } else {
                    return;
                }
            default:
                d dVar2 = this.b;
                boolean z = !dVar2.m1;
                dVar2.m1 = z;
                if (z) {
                    dVar2.M0.setVisibility(0);
                }
                dVar2.s1 = dVar2.m1 ? dVar2.t1 : dVar2.u1;
                dVar2.t(true);
                return;
        }
    }
}
