package defpackage;

import java.util.Objects;

/* renamed from: qq7  reason: default package */
public class qq7 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public qq7(fc4 fc4) {
        this.a = (String) fc4.d;
        this.b = (String) fc4.e;
        this.c = (String) fc4.f;
        this.d = fc4.a;
        this.e = fc4.b;
        this.f = fc4.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qq7 qq7 = (qq7) obj;
        return this.d == qq7.d && this.e == qq7.e && this.f == qq7.f && this.a.equals(qq7.a) && this.b.equals(qq7.b) && Objects.equals(this.c, qq7.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }
}
