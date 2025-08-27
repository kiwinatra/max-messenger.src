package defpackage;

import java.util.List;

/* renamed from: zc0  reason: default package */
public final class zc0 implements i65 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final qa0 e;
    public final sa0 f;

    public zc0(int i, int i2, List list, List list2, qa0 qa0, sa0 sa0) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                this.e = qa0;
                if (sa0 != null) {
                    this.f = sa0;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
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
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0 = (zc0) obj;
        if (this.a == zc0.a && this.b == zc0.b && this.c.equals(zc0.c) && this.d.equals(zc0.d)) {
            qa0 qa0 = zc0.e;
            qa0 qa02 = this.e;
            if (qa02 != null ? qa02.equals(qa0) : qa0 == null) {
                if (this.f.equals(zc0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        qa0 qa0 = this.e;
        return this.f.hashCode() ^ ((hashCode ^ (qa0 == null ? 0 : qa0.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
