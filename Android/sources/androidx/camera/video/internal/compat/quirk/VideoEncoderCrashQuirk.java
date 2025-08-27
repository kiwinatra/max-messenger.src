package androidx.camera.video.internal.compat.quirk;

import android.os.Build;

public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    public final boolean a(qu1 qu1, yb0 yb0) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && qu1.h() == 0 && yb0 == yb0.d;
    }
}
