package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

public final class MediaDrmCallbackException extends IOException {
    public final Map a;

    public MediaDrmCallbackException(q74 q74, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = map;
    }
}
