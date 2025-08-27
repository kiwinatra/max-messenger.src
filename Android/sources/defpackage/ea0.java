package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ea0  reason: default package */
public final class ea0 {
    public final String a;
    public final Class b;
    public final fwd c;
    public final zzf d;
    public final Size e;
    public final hc0 f;
    public final List g;

    public ea0(String str, Class cls, fwd fwd, zzf zzf, Size size, hc0 hc0, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = cls;
            if (fwd != null) {
                this.c = fwd;
                if (zzf != null) {
                    this.d = zzf;
                    this.e = size;
                    this.f = hc0;
                    this.g = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0 = (ea0) obj;
        if (this.a.equals(ea0.a) && this.b.equals(ea0.b) && this.c.equals(ea0.c) && this.d.equals(ea0.d)) {
            Size size = ea0.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                hc0 hc0 = ea0.f;
                hc0 hc02 = this.f;
                if (hc02 != null ? hc02.equals(hc0) : hc0 == null) {
                    List list = ea0.g;
                    List list2 = this.g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        Size size = this.e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        hc0 hc0 = this.f;
        int hashCode3 = (hashCode2 ^ (hc0 == null ? 0 : hc0.hashCode())) * 1000003;
        List list = this.g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return tr1.l(sb, this.g, "}");
    }
}
