package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f4b  reason: default package */
public final class f4b extends h4b {
    public final Intent a;
    public final Uri b;

    public f4b(Intent intent, Uri uri) {
        this.a = intent;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4b)) {
            return false;
        }
        f4b f4b = (f4b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) f4b.a) && Intrinsics.areEqual((Object) this.b, (Object) f4b.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.a + ", uri=" + this.b + ")";
    }
}
