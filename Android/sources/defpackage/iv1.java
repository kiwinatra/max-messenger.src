package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* renamed from: iv1  reason: default package */
public final class iv1 implements a5d {
    public final /* synthetic */ int b;
    public final a5d c;

    public iv1(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new pkf(j, new hv1(j));
                return;
            default:
                this.c = new iv1(j, 1);
                return;
        }
    }

    public final long a() {
        switch (this.b) {
            case 0:
                return ((pkf) ((iv1) this.c).c).b;
            default:
                return ((pkf) this.c).b;
        }
    }

    public final z4d b(gv1 gv1) {
        switch (this.b) {
            case 0:
                if (((pkf) ((iv1) this.c).c).b(gv1).b) {
                    return z4d.e;
                }
                Throwable th = (Throwable) gv1.c;
                return (!(th instanceof CameraValidator$CameraIdListIncorrectException) || ((CameraValidator$CameraIdListIncorrectException) th).a <= 0) ? z4d.d : z4d.f;
            default:
                return ((pkf) this.c).b(gv1);
        }
    }

    public final a5d c(long j) {
        switch (this.b) {
            case 0:
                return new iv1(j, 0);
            default:
                return new iv1(j, 1);
        }
    }
}
