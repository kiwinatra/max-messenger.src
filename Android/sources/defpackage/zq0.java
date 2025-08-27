package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: zq0  reason: default package */
public final class zq0 {
    public static final zq0 c = new zq0(false, false);
    public boolean a;
    public boolean b;

    public /* synthetic */ zq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public zq0(ykb ykb, int i) {
        boolean z;
        switch (i) {
            case 4:
                boolean z2 = false;
                this.b = false;
                this.a = ykb.g(AutoFlashUnderExposedQuirk.class) != null ? true : z2;
                return;
            case 6:
                Iterator it = ykb.h(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (it.hasNext()) {
                        z = ((CaptureIntentPreviewQuirk) it.next()).c() ? true : z;
                    } else {
                        z = false;
                    }
                }
                this.a = z;
                this.b = ykb.e(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.a = ykb.e(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = qn4.a.g(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                return;
        }
    }
}
