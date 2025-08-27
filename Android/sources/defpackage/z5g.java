package defpackage;

import android.view.Surface;

/* renamed from: z5g  reason: default package */
public abstract class z5g {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == c44.DEFAULT_ASPECT_RATIO ? 0 : 1);
        } catch (IllegalStateException e) {
            iq.a("Failed to call Surface.setFrameRate", e);
        }
    }
}
