package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hc9  reason: default package */
public final class hc9 implements kc9 {
    public final Layout a;
    public final Layout b;
    public final long c;
    public final CharSequence d;
    public final String e;

    public hc9(Layout layout, Layout layout2, long j, CharSequence charSequence, String str) {
        this.a = layout;
        this.b = layout2;
        this.c = j;
        this.d = charSequence;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc9)) {
            return false;
        }
        hc9 hc9 = (hc9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) hc9.a) && Intrinsics.areEqual((Object) this.b, (Object) hc9.b) && this.c == hc9.c && Intrinsics.areEqual((Object) this.d, (Object) hc9.d) && Intrinsics.areEqual((Object) this.e, (Object) hc9.e);
    }

    public final int hashCode() {
        int e2 = wj6.e(this.d, wzf.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        return e2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactTitleLayout=");
        sb.append(this.a);
        sb.append(", contactNameLayout=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", nameForAbbreviation=");
        sb.append(this.d);
        sb.append(", url=");
        return wj6.n(sb, this.e, ")");
    }
}
