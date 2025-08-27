package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: rc0  reason: default package */
public final class rc0 {
    public int a;
    public final Executor b;
    public final xv1 c;
    public final Rect d;
    public final Matrix e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;

    public rc0(Executor executor, xv1 xv1, Rect rect, Matrix matrix, int i2, int i3, int i4, List list) {
        this.a = ((CaptureFailedRetryQuirk) nn4.a.g(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor != null) {
            this.b = executor;
            this.c = xv1;
            this.d = rect;
            if (matrix != null) {
                this.e = matrix;
                this.f = i2;
                this.g = i3;
                this.h = i4;
                if (list != null) {
                    this.i = list;
                    return;
                }
                throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
            }
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        throw new NullPointerException("Null appExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rc0)) {
            return false;
        }
        rc0 rc0 = (rc0) obj;
        if (this.b.equals(rc0.b)) {
            xv1 xv1 = rc0.c;
            xv1 xv12 = this.c;
            if (xv12 != null ? xv12.equals(xv1) : xv1 == null) {
                if (this.d.equals(rc0.d) && this.e.equals(rc0.e) && this.f == rc0.f && this.g == rc0.g && this.h == rc0.h && this.i.equals(rc0.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        xv1 xv1 = this.c;
        return this.i.hashCode() ^ ((((((((((((hashCode ^ (xv1 == null ? 0 : xv1.hashCode())) * 583896283) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.b);
        sb.append(", inMemoryCallback=");
        sb.append(this.c);
        sb.append(", onDiskCallback=null, outputFileOptions=null, cropRect=");
        sb.append(this.d);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", rotationDegrees=");
        sb.append(this.f);
        sb.append(", jpegQuality=");
        sb.append(this.g);
        sb.append(", captureMode=");
        sb.append(this.h);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return tr1.l(sb, this.i, "}");
    }
}
