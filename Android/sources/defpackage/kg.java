package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kg  reason: default package */
public final class kg implements qx0 {
    public final boolean a;
    public final String b;

    public kg(int i, boolean z) {
        this.a = z;
        this.b = wj6.h(i, "anim://");
    }

    public final boolean a(Uri uri) {
        return StringsKt__StringsJVMKt.startsWith$default(uri.toString(), this.b, false, 2, (Object) null);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!this.a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) kg.class, (Object) obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.b, (Object) ((kg) obj).b);
    }

    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
