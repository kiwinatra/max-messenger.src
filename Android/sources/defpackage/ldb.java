package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* renamed from: ldb  reason: default package */
public final class ldb {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ldb)) {
            return false;
        }
        ldb ldb = (ldb) obj;
        String str = this.d;
        String str2 = ldb.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(ldb.a)) && Objects.equals(this.c, ldb.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(ldb.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(ldb.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(new Object[]{this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }
}
