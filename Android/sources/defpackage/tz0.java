package defpackage;

import java.util.Map;
import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: tz0  reason: default package */
public final class tz0 implements MediaMuteManagerListener {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ uz0 b;
    public final /* synthetic */ Lazy c;

    public tz0(Lazy lazy, uz0 uz0, Lazy lazy2) {
        this.a = lazy;
        this.b = uz0;
        this.c = lazy2;
    }

    public final void onMuteChanged(vz9 vz9) {
        ft8 ft8 = (ft8) vz9.a.get(et8.b);
        boolean z = false;
        uz0 uz0 = this.b;
        if (ft8 != null) {
            q11 q11 = (q11) this.a.getValue();
            boolean z2 = ft8 == ft8.a;
            CameraManager a2 = q11.a();
            if (a2 != null) {
                a2.setCameraEnabled(z2);
            }
            uz0.c.d(db.a);
        }
        et8 et8 = et8.a;
        Map map = vz9.a;
        ft8 ft82 = (ft8) map.get(et8);
        Lazy lazy = this.c;
        if (ft82 != null) {
            ((o01) ((m01) lazy.getValue())).e(ft82 == ft8.a);
            uz0.c.d(eb.a);
        }
        ft8 ft83 = (ft8) map.get(et8.c);
        if (ft83 != null) {
            m01 m01 = (m01) lazy.getValue();
            if (ft83 == ft8.a) {
                z = true;
            }
            ((o01) m01).e(z);
            uz0.c.d(fb.a);
        }
    }

    public final void onMuteStateInitialized(vz9 vz9) {
    }
}
