package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: yb0  reason: default package */
public final class yb0 {
    public static final yb0 d;
    public static final yb0 e;
    public static final yb0 f;
    public static final yb0 g;
    public static final yb0 h;
    public static final yb0 i;
    public static final yb0 j = new yb0(-1, "NONE", Collections.emptyList());
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        yb0 yb0 = new yb0(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size[]{new Size(720, 480), new Size(640, 480)})));
        d = yb0;
        yb0 yb02 = new yb0(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = yb02;
        yb0 yb03 = new yb0(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = yb03;
        yb0 yb04 = new yb0(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = yb04;
        yb0 yb05 = new yb0(0, "LOWEST", Collections.emptyList());
        h = yb05;
        yb0 yb06 = new yb0(1, "HIGHEST", Collections.emptyList());
        i = yb06;
        k = new HashSet(Arrays.asList(new yb0[]{yb05, yb06, yb0, yb02, yb03, yb04}));
        l = Arrays.asList(new yb0[]{yb04, yb03, yb02, yb0});
    }

    public yb0(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null typicalSizes");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0 = (yb0) obj;
        return this.a == yb0.a && this.b.equals(yb0.b) && this.c.equals(yb0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", typicalSizes=");
        return tr1.l(sb, this.c, "}");
    }
}
