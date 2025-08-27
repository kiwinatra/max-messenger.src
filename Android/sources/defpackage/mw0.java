package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: mw0  reason: default package */
public final class mw0 extends f5b implements Serializable {
    public final yi6 a;
    public final f5b b;

    public mw0(yi6 yi6, f5b f5b) {
        this.a = yi6;
        f5b.getClass();
        this.b = f5b;
    }

    public final int compare(Object obj, Object obj2) {
        yi6 yi6 = this.a;
        return this.b.compare(yi6.apply(obj), yi6.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0 = (mw0) obj;
        return this.a.equals(mw0.a) && this.b.equals(mw0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
