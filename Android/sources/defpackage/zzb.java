package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zzb  reason: default package */
public final class zzb extends j91 {
    public final Intent b;

    public zzb(Intent intent) {
        super(10);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzb) && Intrinsics.areEqual((Object) this.b, (Object) ((zzb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
