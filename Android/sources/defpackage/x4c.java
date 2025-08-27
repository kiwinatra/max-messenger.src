package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x4c  reason: default package */
public final class x4c extends j91 {
    public final Intent b;

    public x4c(Intent intent) {
        super(12);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4c) && Intrinsics.areEqual((Object) this.b, (Object) ((x4c) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
