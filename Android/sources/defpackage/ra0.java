package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ra0  reason: default package */
public final class ra0 implements i65 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public ra0(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public static ra0 e(int i, int i2, List list, List list2) {
        return new ra0(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0 = (ra0) obj;
        return this.a == ra0.a && this.b == ra0.b && this.c.equals(ra0.c) && this.d.equals(ra0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return tr1.l(sb, this.d, "}");
    }
}
