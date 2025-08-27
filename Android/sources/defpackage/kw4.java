package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;

/* renamed from: kw4  reason: default package */
public final class kw4 implements pw4 {
    public final aw4 a(gw4 gw4, ea6 ea6) {
        if (ea6.r == null) {
            return null;
        }
        return new f85(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final void c(Looper looper, mpb mpb) {
    }

    public final int d(ea6 ea6) {
        return ea6.r != null ? 1 : 0;
    }
}
