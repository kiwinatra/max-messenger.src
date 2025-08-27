package defpackage;

import android.util.Range;

/* renamed from: zzf  reason: default package */
public interface zzf extends cdf, m97 {
    public static final la0 j0 = new la0(fwd.class, (Object) null, "camerax.core.useCase.defaultSessionConfig");
    public static final la0 k0 = new la0(bx1.class, (Object) null, "camerax.core.useCase.defaultCaptureConfig");
    public static final la0 l0 = new la0(ws1.class, (Object) null, "camerax.core.useCase.sessionConfigUnpacker");
    public static final la0 m0 = new la0(ds1.class, (Object) null, "camerax.core.useCase.captureConfigUnpacker");
    public static final la0 n0;
    public static final la0 o0 = new la0(Range.class, (Object) null, "camerax.core.useCase.targetFrameRate");
    public static final la0 p0;
    public static final la0 q0;
    public static final la0 r0 = new la0(b0g.class, (Object) null, "camerax.core.useCase.captureType");
    public static final la0 s0;
    public static final la0 t0;

    static {
        Class cls = Integer.TYPE;
        n0 = new la0(cls, (Object) null, "camerax.core.useCase.surfaceOccupancyPriority");
        Class cls2 = Boolean.TYPE;
        p0 = new la0(cls2, (Object) null, "camerax.core.useCase.zslDisabled");
        q0 = new la0(cls2, (Object) null, "camerax.core.useCase.highResolutionDisabled");
        s0 = new la0(cls, (Object) null, "camerax.core.useCase.previewStabilizationMode");
        t0 = new la0(cls, (Object) null, "camerax.core.useCase.videoStabilizationMode");
    }

    b0g O() {
        return (b0g) n(r0);
    }

    int P() {
        return ((Integer) k(t0, 0)).intValue();
    }

    int V() {
        return ((Integer) k(s0, 0)).intValue();
    }
}
