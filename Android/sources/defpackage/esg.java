package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* renamed from: esg  reason: default package */
public final class esg {
    public final qt1 a;
    public final fsg b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e = false;
    public final boolean f = false;
    public obd g;
    public fx1 h;
    public za7 i;
    public ImageWriter j;

    /* JADX WARNING: type inference failed for: r7v6, types: [f7a, fsg] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ts1, java.lang.Object] */
    public esg(qt1 qt1) {
        boolean z;
        boolean z2 = false;
        this.a = qt1;
        int[] iArr = (int[]) qt1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr[i2] == 4) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        z = false;
        this.e = z;
        this.f = qn4.a.g(ZslDisablerQuirk.class) != null ? true : z2;
        this.b = new f7a(3, (ts1) new Object());
    }
}
