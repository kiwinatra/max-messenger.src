package defpackage;

import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* renamed from: kgd  reason: default package */
public final class kgd {
    public final Lazy a;
    public final xme b = f6e.a(Boolean.FALSE);

    public kgd(Lazy lazy) {
        this.a = lazy;
    }

    public final void a(boolean z) {
        Object value;
        xme xme = this.b;
        do {
            value = xme.getValue();
            ((Boolean) value).getClass();
        } while (!xme.b(value, Boolean.valueOf(z)));
        Conversation a2 = ((jz3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        Conversation a2 = ((jz3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        Lazy lazy = this.a;
        Conversation a2 = ((jz3) lazy.getValue()).a();
        if (a2 != null && a2.isPrepared()) {
            Conversation a3 = ((jz3) lazy.getValue()).a();
            ScreenCaptureManager screenCaptureManager = a3 != null ? a3.getScreenCaptureManager() : null;
            return screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled();
        }
    }
}
