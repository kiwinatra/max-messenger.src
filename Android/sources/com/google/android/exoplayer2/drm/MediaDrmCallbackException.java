package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

public final class MediaDrmCallbackException extends IOException {
    public final Map a;

    public MediaDrmCallbackException(p74 p74, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = map;
    }
}
