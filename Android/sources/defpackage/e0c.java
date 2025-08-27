package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e0c  reason: default package */
public final class e0c extends j91 {
    public final Intent b;

    public e0c(Intent intent) {
        super(10);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0c) && Intrinsics.areEqual((Object) this.b, (Object) ((e0c) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
