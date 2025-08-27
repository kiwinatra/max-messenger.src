package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ml5  reason: default package */
public final class ml5 {
    public final File a;

    public ml5(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ml5)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((ml5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
