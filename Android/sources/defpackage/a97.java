package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* renamed from: a97  reason: default package */
public final class a97 extends ds1 {
    public static final a97 c = new a97(new Object());
    public final wc8 b;

    public a97(wc8 wc8) {
        this.b = wc8;
    }

    public final void a(zzf zzf, u40 u40) {
        super.a(zzf, u40);
        if (zzf instanceof z87) {
            z87 z87 = (z87) zzf;
            pz9 c2 = pz9.c();
            la0 la0 = z87.b;
            if (z87.u(la0)) {
                wc8 wc8 = this.b;
                int intValue = ((Integer) z87.n(la0)).intValue();
                wc8.getClass();
                if (((ImageCapturePixelHDRPlusQuirk) qn4.a.g(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        c2.f(vs1.o0(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        c2.f(vs1.o0(key2), Boolean.FALSE);
                    }
                }
            }
            u40.c(new wie(9, (Object) c5b.a(c2)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
