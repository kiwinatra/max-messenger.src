package defpackage;

/* renamed from: s3g  reason: default package */
public final class s3g implements zzf, x97, cif {
    public static final la0 b = new la0(h7g.class, (Object) null, "camerax.video.VideoCapture.videoOutput");
    public static final la0 c = new la0(bj6.class, (Object) null, "camerax.video.VideoCapture.videoEncoderInfoFinder");
    public static final la0 o = new la0(Boolean.class, (Object) null, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");
    public final c5b a;

    public s3g(c5b c5b) {
        bs0.n(c5b.a.containsKey(b));
        this.a = c5b;
    }

    public final je3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return 34;
    }
}
