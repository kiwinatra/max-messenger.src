package defpackage;

import androidx.camera.core.ImageCaptureException;

/* renamed from: qc0  reason: default package */
public final class qc0 {
    public final int a;
    public final ImageCaptureException b;

    public qc0(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qc0)) {
            return false;
        }
        qc0 qc0 = (qc0) obj;
        return this.a == qc0.a && this.b.equals(qc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
