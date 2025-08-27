package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: g7b  reason: default package */
public abstract class g7b {
    public final long a;
    public final p7b b;
    public final Drawable c;
    public final String d;

    public g7b(long j, p7b p7b, Drawable drawable, String str) {
        this.a = j;
        this.b = p7b;
        this.c = drawable;
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g7b g7b = (g7b) obj;
        if (this.a != g7b.a || this.b != g7b.b) {
            return false;
        }
        Drawable drawable = g7b.c;
        Drawable drawable2 = this.c;
        if (drawable2 == null ? drawable != null : !drawable2.equals(drawable)) {
            return false;
        }
        String str = g7b.d;
        String str2 = this.d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        int i = 0;
        Drawable drawable = this.c;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Page{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", iconUrl='");
        return wj6.n(sb, this.d, "'}");
    }
}
