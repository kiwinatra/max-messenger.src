package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* renamed from: h6b  reason: default package */
public final class h6b extends g6b {
    public final Object c() {
        Object obj = this.a;
        bs0.n(obj instanceof OutputConfiguration);
        return obj;
    }

    public final void e(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    public final void f(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    public final void h(long j) {
        if (j != -1) {
            ((OutputConfiguration) c()).setStreamUseCase(j);
        }
    }
}
