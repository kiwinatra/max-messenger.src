package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: od0  reason: default package */
public final class od0 implements qd0 {
    public final Intent a;

    public od0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od0) && Intrinsics.areEqual((Object) this.a, (Object) ((od0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
