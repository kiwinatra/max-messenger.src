package defpackage;

import android.graphics.Point;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1f  reason: default package */
public final class z1f implements b2f {
    public final zuf a;
    public final Point b;
    public final ClickableSpan c;

    public z1f(zuf zuf, Point point, ClickableSpan clickableSpan) {
        this.a = zuf;
        this.b = point;
        this.c = clickableSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1f)) {
            return false;
        }
        z1f z1f = (z1f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z1f.a) && Intrinsics.areEqual((Object) this.b, (Object) z1f.b) && Intrinsics.areEqual((Object) this.c, (Object) z1f.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ClickableSpan clickableSpan = this.c;
        return hashCode + (clickableSpan == null ? 0 : clickableSpan.hashCode());
    }

    public final String toString() {
        return "NamePicker(suggestUiItem=" + this.a + ", point=" + this.b + ", span=" + this.c + ")";
    }
}
