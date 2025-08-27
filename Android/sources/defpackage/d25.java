package defpackage;

import java.util.List;

/* renamed from: d25  reason: default package */
public class d25 {
    public final List a;
    public final int b;

    public d25(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d25 d25 = (d25) obj;
        if (this.b != d25.b) {
            return false;
        }
        return this.a.equals(d25.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
