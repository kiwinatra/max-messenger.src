package androidx.media3.exoplayer.source;

import java.io.IOException;

public final class ClippingMediaSource$IllegalClippingException extends IOException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource$IllegalClippingException(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
