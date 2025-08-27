package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fbc  reason: default package */
public final class fbc implements ibc {
    public final File a;

    public fbc(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbc) && Intrinsics.areEqual((Object) this.a, (Object) ((fbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartRecordVideo(file=" + this.a + ")";
    }
}
