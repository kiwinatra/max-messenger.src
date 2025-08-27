package defpackage;

import android.view.Surface;

/* renamed from: a6g  reason: default package */
public abstract class a6g {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == c44.DEFAULT_ASPECT_RATIO ? 0 : 1);
        } catch (IllegalStateException e) {
            i8b.p("Failed to call Surface.setFrameRate", e);
        }
    }
}
