package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: e6b  reason: default package */
public final class e6b {
    public final g6b a;

    public e6b(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new g6b(new OutputConfiguration(i, surface));
        } else {
            this.a = new g6b(new f6b(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e6b)) {
            return false;
        }
        return this.a.equals(((e6b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public e6b(OutputConfiguration outputConfiguration) {
        this.a = new g6b(outputConfiguration);
    }

    public e6b(g6b g6b) {
        this.a = g6b;
    }
}
