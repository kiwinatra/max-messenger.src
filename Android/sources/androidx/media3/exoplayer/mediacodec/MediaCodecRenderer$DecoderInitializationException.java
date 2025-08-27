package androidx.media3.exoplayer.mediacodec;

public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final on8 c;
    public final String o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer$DecoderInitializationException(ea6 ea6, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + ea6, mediaCodecUtil$DecoderQueryException, ea6.n, z, (on8) null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, on8 on8, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = on8;
        this.o = str3;
    }
}
