package defpackage;

/* renamed from: j87  reason: default package */
public final class j87 implements zzf, x97, cif {
    public static final la0 b = new la0(c87.class, (Object) null, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final la0 c = new la0(Integer.TYPE, (Object) null, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final la0 o = new la0(ka7.class, (Object) null, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public static final la0 v = new la0(f87.class, (Object) null, "camerax.core.imageAnalysis.outputImageFormat");
    public static final la0 w;
    public static final la0 x;
    public final c5b a;

    static {
        Class<Boolean> cls = Boolean.class;
        w = new la0(cls, (Object) null, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        x = new la0(cls, (Object) null, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public j87(c5b c5b) {
        this.a = c5b;
    }

    public final je3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return 35;
    }
}
