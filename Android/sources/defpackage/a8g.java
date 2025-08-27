package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a8g  reason: default package */
public final class a8g implements t9d {
    public final z7g a;

    public a8g(z7g z7g) {
        this.a = z7g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8g) && Intrinsics.areEqual((Object) this.a, (Object) ((a8g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
