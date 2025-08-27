package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fc9  reason: default package */
public final class fc9 implements gc9 {
    public final long a;
    public final Layout b;
    public final Layout c;

    public fc9(long j, Layout layout, Layout layout2) {
        this.a = j;
        this.b = layout;
        this.c = layout2;
    }

    public final Layout a() {
        return this.b;
    }

    public final Layout b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc9)) {
            return false;
        }
        fc9 fc9 = (fc9) obj;
        return this.a == fc9.a && Intrinsics.areEqual((Object) this.b, (Object) fc9.b) && Intrinsics.areEqual((Object) this.c, (Object) fc9.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", bodyLayout=" + this.b + ", forwardedTitleLayout=" + this.c + ")";
    }
}
