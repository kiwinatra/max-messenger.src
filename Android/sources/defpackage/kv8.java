package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.d;

/* renamed from: kv8  reason: default package */
public final class kv8 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public kv8(d dVar) {
        this.a = dVar;
    }

    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        int id = view.getId();
        int i = 1;
        d dVar = this.a;
        if (id == 16908313 || id == 16908314) {
            if (dVar.z.g()) {
                if (id == 16908313) {
                    i = 2;
                }
                dVar.x.getClass();
                sw8.g(i);
            }
            dVar.dismiss();
        } else if (id == ufc.mr_control_playback_ctrl) {
            if (dVar.a1 != null && (playbackStateCompat = dVar.c1) != null) {
                int i2 = 0;
                if (playbackStateCompat.getState() != 3) {
                    i = 0;
                }
                if (i != 0 && (dVar.c1.getActions() & 514) != 0) {
                    dVar.a1.getTransportControls().pause();
                    i2 = wlc.mr_controller_pause;
                } else if (i != 0 && (dVar.c1.getActions() & 1) != 0) {
                    dVar.a1.getTransportControls().stop();
                    i2 = wlc.mr_controller_stop;
                } else if (i == 0 && (dVar.c1.getActions() & 516) != 0) {
                    dVar.a1.getTransportControls().play();
                    i2 = wlc.mr_controller_play;
                }
                AccessibilityManager accessibilityManager = dVar.v1;
                if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.setPackageName(dVar.X.getPackageName());
                    obtain.setClassName(kv8.class.getName());
                    obtain.getText().add(dVar.X.getString(i2));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }
        } else if (id == ufc.mr_close) {
            dVar.dismiss();
        }
    }
}
