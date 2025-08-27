package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: cx8  reason: default package */
public final class cx8 {
    public final ly8 a;
    public final int b;
    public final int c;
    public final bx8 d;
    public final Bundle e;

    public cx8(ly8 ly8, int i, int i2, boolean z, bx8 bx8, Bundle bundle) {
        this.a = ly8;
        this.b = i;
        this.c = i2;
        this.d = bx8;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cx8)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cx8 cx8 = (cx8) obj;
        bx8 bx8 = this.d;
        return (bx8 == null && cx8.d == null) ? this.a.equals(cx8.a) : v0g.a(bx8, cx8.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        ly8 ly8 = this.a;
        sb.append(ly8.a.a);
        sb.append(", uid=");
        return wj6.l(sb, ly8.a.c, "}");
    }
}
