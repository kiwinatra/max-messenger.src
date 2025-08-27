package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a6c  reason: default package */
public final class a6c extends h6c {
    public final Intent a;

    public a6c(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6c) && Intrinsics.areEqual((Object) this.a, (Object) ((a6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.a + ")";
    }
}
