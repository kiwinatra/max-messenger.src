package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;

/* renamed from: jw4  reason: default package */
public final class jw4 implements ow4 {
    public final zv4 a(fw4 fw4, ca6 ca6) {
        if (ca6.x0 == null) {
            return null;
        }
        return new e85(new DrmSession$DrmSessionException(new Exception(), 6001));
    }

    public final int b(ca6 ca6) {
        return ca6.x0 != null ? 1 : 0;
    }

    public final void c(Looper looper, lpb lpb) {
    }
}
