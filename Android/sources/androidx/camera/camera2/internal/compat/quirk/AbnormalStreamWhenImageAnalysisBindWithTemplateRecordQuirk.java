package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;

public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static boolean e() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }

    public final boolean c() {
        return e();
    }
}
