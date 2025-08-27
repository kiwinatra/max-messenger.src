package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: g6b  reason: default package */
public class g6b {
    public final Object a;

    public g6b(Object obj) {
        this.a = obj;
    }

    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    public Object c() {
        Object obj = this.a;
        bs0.n(obj instanceof f6b);
        return ((f6b) obj).a;
    }

    public final Surface d() {
        return ((OutputConfiguration) c()).getSurface();
    }

    public void e(long j) {
        ((f6b) this.a).b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g6b)) {
            return false;
        }
        return Objects.equals(this.a, ((g6b) obj).a);
    }

    public void f(int i) {
    }

    public final void g(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }

    public void h(long j) {
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
