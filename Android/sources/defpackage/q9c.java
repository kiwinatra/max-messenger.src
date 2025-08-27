package defpackage;

import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* renamed from: q9c  reason: default package */
public final class q9c implements ProximityTracker {
    public final Lazy a;

    public q9c(Lazy lazy) {
        this.a = lazy;
    }

    public final boolean getCanUseSpeaker() {
        Lazy lazy = this.a;
        return ((p9c) lazy.getValue()).f != null && !((p9c) lazy.getValue()).e;
    }

    public final void startTrackingProximity() {
        ((p9c) this.a.getValue()).a();
    }

    public final void stopTrackingProximity() {
        ((p9c) this.a.getValue()).b();
    }
}
