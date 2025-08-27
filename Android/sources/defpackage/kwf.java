package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: kwf  reason: default package */
public final class kwf implements n9d {
    public final List a;
    public final boolean b;

    public kwf(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kwf.class != obj.getClass()) {
            return false;
        }
        kwf kwf = (kwf) obj;
        return this.b == kwf.b && this.a.equals(kwf.a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateDisplayLayoutV2Command{layouts=");
        sb.append(this.a);
        sb.append(", isSnapshot=");
        return wzf.l(sb, this.b, '}');
    }
}
