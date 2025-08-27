package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pd0  reason: default package */
public final class pd0 implements qd0 {
    public final Intent a;

    public pd0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd0) && Intrinsics.areEqual((Object) this.a, (Object) ((pd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CropAvatarScreenIntentReady(intent=" + this.a + ")";
    }
}
