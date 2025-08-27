package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: f6b  reason: default package */
public final class f6b {
    public final OutputConfiguration a;
    public long b = 1;

    public f6b(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f6b)) {
            return false;
        }
        f6b f6b = (f6b) obj;
        return Objects.equals(this.a, f6b.a) && this.b == f6b.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
    }
}
