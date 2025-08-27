package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x2e  reason: default package */
public final class x2e extends j91 {
    public final Intent b;

    public x2e(Intent intent) {
        super(15);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2e) && Intrinsics.areEqual((Object) this.b, (Object) ((x2e) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
