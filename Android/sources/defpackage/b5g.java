package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import java.io.IOException;
import java.util.Objects;

/* renamed from: b5g  reason: default package */
public final class b5g extends j3h implements a5g {
    public static final es1 c = new es1(16);
    public final MediaCodecInfo.VideoCapabilities b;

    public b5g(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.a).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.b = videoCapabilities;
    }

    public static b5g n1(uc0 uc0) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        LruCache lruCache = h43.a;
        String str = uc0.a;
        LruCache lruCache2 = h43.a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        if (mediaCodecInfo == null) {
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache2) {
                        lruCache2.put(str, codecInfo);
                    }
                    mediaCodec.release();
                    mediaCodecInfo = codecInfo;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException | IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th2) {
                th = th2;
                mediaCodec = null;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        }
        return new b5g(mediaCodecInfo, uc0.a);
    }

    public final int D0() {
        return this.b.getWidthAlignment();
    }

    public final Range E0() {
        return this.b.getBitrateRange();
    }

    public final boolean F0() {
        return true;
    }

    public final Range I0(int i) {
        try {
            return this.b.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw (th instanceof IllegalArgumentException ? th : new IllegalArgumentException(th));
        }
    }

    public final Range K0(int i) {
        try {
            return this.b.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw (th instanceof IllegalArgumentException ? th : new IllegalArgumentException(th));
        }
    }

    public final int L0() {
        return this.b.getHeightAlignment();
    }

    public final Range M0() {
        return this.b.getSupportedWidths();
    }

    public final boolean P0(int i, int i2) {
        return this.b.isSizeSupported(i, i2);
    }

    public final Range R0() {
        return this.b.getSupportedHeights();
    }
}
