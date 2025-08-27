package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u21  reason: default package */
public final class u21 {
    public final Bundle a;
    public final List b;
    public final Point c;

    public u21(Bundle bundle, List list, Point point) {
        this.a = bundle;
        this.b = list;
        this.c = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21 = (u21) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u21.a) && Intrinsics.areEqual((Object) this.b, (Object) u21.b) && Intrinsics.areEqual((Object) this.c, (Object) u21.c);
    }

    public final int hashCode() {
        int i = 0;
        Bundle bundle = this.a;
        int i2 = rae.i(this.b, (bundle == null ? 0 : bundle.hashCode()) * 31, 31);
        Point point = this.c;
        if (point != null) {
            i = point.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", anchor=" + this.c + ")";
    }
}
