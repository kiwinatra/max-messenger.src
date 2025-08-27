package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: gg7  reason: default package */
public class gg7 {
    public final InputConfiguration a;

    public gg7(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gg7)) {
            return false;
        }
        return Objects.equals(this.a, ((gg7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
