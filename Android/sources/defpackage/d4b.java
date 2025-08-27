package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d4b  reason: default package */
public final class d4b extends v5a {
    public final Intent b;
    public final Uri c;

    public d4b(Intent intent, Uri uri) {
        super(Unit.INSTANCE);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4b)) {
            return false;
        }
        d4b d4b = (d4b) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) d4b.b) && Intrinsics.areEqual((Object) this.c, (Object) d4b.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
