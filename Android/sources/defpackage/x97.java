package defpackage;

import android.util.Size;
import java.util.List;

/* renamed from: x97  reason: default package */
public interface x97 extends btc {
    public static final la0 F = new la0(ct.class, (Object) null, "camerax.core.imageOutput.targetAspectRatio");
    public static final la0 G;
    public static final la0 H;
    public static final la0 I;
    public static final la0 J;
    public static final la0 K;
    public static final la0 L;
    public static final la0 M;
    public static final la0 N = new la0(w3d.class, (Object) null, "camerax.core.imageOutput.resolutionSelector");
    public static final la0 O;

    static {
        Class cls = Integer.TYPE;
        G = new la0(cls, (Object) null, "camerax.core.imageOutput.targetRotation");
        H = new la0(cls, (Object) null, "camerax.core.imageOutput.appTargetRotation");
        I = new la0(cls, (Object) null, "camerax.core.imageOutput.mirrorMode");
        Class<Size> cls2 = Size.class;
        J = new la0(cls2, (Object) null, "camerax.core.imageOutput.targetResolution");
        K = new la0(cls2, (Object) null, "camerax.core.imageOutput.defaultResolution");
        L = new la0(cls2, (Object) null, "camerax.core.imageOutput.maxResolution");
        Class<List> cls3 = List.class;
        M = new la0(cls3, (Object) null, "camerax.core.imageOutput.supportedResolutions");
        O = new la0(cls3, (Object) null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void X(x97 x97) {
        boolean u = x97.u(F);
        boolean z = ((Size) x97.k(J, (Object) null)) != null;
        if (u && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((w3d) x97.k(N, (Object) null)) == null) {
        } else {
            if (u || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    int Y(int i) {
        return ((Integer) k(G, Integer.valueOf(i))).intValue();
    }
}
