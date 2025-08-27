package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: bwd  reason: default package */
public final class bwd extends awd {
    /* JADX WARNING: type inference failed for: r0v4, types: [bwd, awd] */
    public static bwd d(zzf zzf, Size size) {
        if (((ws1) zzf.k(zzf.l0, (Object) null)) != null) {
            ? awd = new awd();
            fwd fwd = (fwd) zzf.k(zzf.j0, (Object) null);
            je3 je3 = c5b.c;
            int i = fwd.a().g.c;
            if (fwd != null) {
                i = fwd.g.c;
                for (CameraDevice.StateCallback stateCallback : fwd.c) {
                    ArrayList arrayList = awd.c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : fwd.d) {
                    ArrayList arrayList2 = awd.d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                awd.b.a(fwd.g.e);
                je3 = fwd.g.b;
            }
            u40 u40 = awd.b;
            u40.getClass();
            u40.f = pz9.d(je3);
            if (zzf instanceof cub) {
                Rational rational = dub.a;
                if (((PreviewPixelHDRnetQuirk) qn4.a.g(PreviewPixelHDRnetQuirk.class)) != null && !dub.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    pz9 c = pz9.c();
                    c.f(vs1.o0(CaptureRequest.TONEMAP_MODE), 2);
                    awd.b.c(new wie(9, (Object) c5b.a(c)));
                }
            }
            awd.b.c = ((Integer) zzf.k(vs1.c, Integer.valueOf(i))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) zzf.k(vs1.v, new CameraDevice.StateCallback());
            ArrayList arrayList3 = awd.c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) zzf.k(vs1.w, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = awd.d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            ax1 ax1 = new ax1((CameraCaptureSession.CaptureCallback) zzf.k(vs1.x, new CameraCaptureSession.CaptureCallback()));
            awd.b.b(ax1);
            ArrayList arrayList5 = awd.e;
            if (!arrayList5.contains(ax1)) {
                arrayList5.add(ax1);
            }
            int P = zzf.P();
            if (P != 0) {
                u40 u402 = awd.b;
                u402.getClass();
                if (P != 0) {
                    ((pz9) u402.f).f(zzf.t0, Integer.valueOf(P));
                }
            }
            int V = zzf.V();
            if (V != 0) {
                u40 u403 = awd.b;
                u403.getClass();
                if (V != 0) {
                    ((pz9) u403.f).f(zzf.s0, Integer.valueOf(V));
                }
            }
            pz9 c2 = pz9.c();
            la0 la0 = vs1.y;
            c2.f(la0, (String) zzf.k(la0, (Object) null));
            la0 la02 = vs1.o;
            Long l = (Long) zzf.k(la02, -1L);
            l.getClass();
            c2.f(la02, l);
            awd.b.c(c2);
            awd.b.c(er7.F(zzf).E());
            return awd;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) zzf.k(cdf.g0, zzf.toString())));
    }

    public final void a(je3 je3) {
        this.b.c(je3);
    }

    public final void b(lk4 lk4, vy4 vy4, int i) {
        kwd a = dc0.a(lk4);
        a.c = null;
        if (vy4 != null) {
            a.f = vy4;
            a.d = Integer.valueOf(i);
            this.a.add(a.b());
            ((HashSet) this.b.e).add(lk4);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final fwd c() {
        return new fwd(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), this.f, this.g, this.h, this.i);
    }
}
