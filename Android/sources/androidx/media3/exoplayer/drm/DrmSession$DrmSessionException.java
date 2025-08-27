package androidx.media3.exoplayer.drm;

import java.io.IOException;

public class DrmSession$DrmSessionException extends IOException {
    public final int a;

    public DrmSession$DrmSessionException(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
