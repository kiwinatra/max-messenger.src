package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: yog  reason: default package */
public final class yog {
    public final UUID a;
    public final xog b;
    public final t64 c;
    public final HashSet d;
    public final t64 e;
    public final int f;
    public final int g;

    public yog(UUID uuid, xog xog, t64 t64, ArrayList arrayList, t64 t642, int i, int i2) {
        this.a = uuid;
        this.b = xog;
        this.c = t64;
        this.d = new HashSet(arrayList);
        this.e = t642;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yog.class != obj.getClass()) {
            return false;
        }
        yog yog = (yog) obj;
        if (this.f == yog.f && this.g == yog.g && this.a.equals(yog.a) && this.b == yog.b && this.c.equals(yog.c) && this.d.equals(yog.d)) {
            return this.e.equals(yog.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return ((((this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
