package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ha0  reason: default package */
public final class ha0 {
    public final Executor a;
    public final Handler b;

    public ha0(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0 = (ha0) obj;
        return this.a.equals(ha0.a) && this.b.equals(ha0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
