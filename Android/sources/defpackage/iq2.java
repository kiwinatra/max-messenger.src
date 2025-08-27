package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: iq2  reason: default package */
public final class iq2 extends j91 {
    public final Intent b;

    public iq2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq2) && Intrinsics.areEqual((Object) this.b, (Object) ((iq2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropPhoto(data=" + this.b + ")";
    }
}
