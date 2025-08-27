package defpackage;

/* renamed from: z87  reason: default package */
public final class z87 implements zzf, x97, fl7 {
    public static final la0 X;
    public static final la0 Y = new la0(x87.class, (Object) null, "camerax.core.imageCapture.screenFlash");
    public static final la0 Z = new la0(Boolean.class, (Object) null, "camerax.core.useCase.isPostviewEnabled");
    public static final la0 b;
    public static final la0 c;
    public static final la0 o = new la0(zw1.class, (Object) null, "camerax.core.imageCapture.captureBundle");
    public static final la0 v;
    public static final la0 w;
    public static final la0 x = new la0(ka7.class, (Object) null, "camerax.core.imageCapture.imageReaderProxyProvider");
    public static final la0 y = new la0(Boolean.TYPE, (Object) null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
    public static final la0 z;
    public final c5b a;

    static {
        Class cls = Integer.TYPE;
        b = new la0(cls, (Object) null, "camerax.core.imageCapture.captureMode");
        c = new la0(cls, (Object) null, "camerax.core.imageCapture.flashMode");
        Class<Integer> cls2 = Integer.class;
        v = new la0(cls2, (Object) null, "camerax.core.imageCapture.bufferFormat");
        w = new la0(cls2, (Object) null, "camerax.core.imageCapture.outputFormat");
        z = new la0(cls, (Object) null, "camerax.core.imageCapture.flashType");
        X = new la0(cls, (Object) null, "camerax.core.imageCapture.jpegCompressionQuality");
    }

    public z87(c5b c5b) {
        this.a = c5b;
    }

    public final je3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return ((Integer) n(m97.D)).intValue();
    }
}
