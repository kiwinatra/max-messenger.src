package defpackage;

import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: q11  reason: default package */
public final class q11 {
    public final Lazy a;

    public q11(Lazy lazy) {
        this.a = lazy;
    }

    public final CameraManager a() {
        Conversation a2 = ((jz3) this.a.getValue()).a();
        if (a2 != null) {
            return a2.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager a2 = a();
        return a2 != null && a2.isCapturingFromFrontCamera();
    }
}
