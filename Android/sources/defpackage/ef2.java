package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ef2  reason: default package */
public final class ef2 extends mf2 {
    public final Intent b;
    public final Uri c;

    public ef2(Intent intent, Uri uri) {
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef2)) {
            return false;
        }
        ef2 ef2 = (ef2) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) ef2.b) && Intrinsics.areEqual((Object) this.c, (Object) ef2.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
