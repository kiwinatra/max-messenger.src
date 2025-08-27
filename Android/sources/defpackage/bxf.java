package defpackage;

/* renamed from: bxf  reason: default package */
public final class bxf {
    public final kxf a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final wyf g;
    public final vyf h;
    public final long i;

    public bxf(axf axf) {
        this.a = axf.a;
        this.b = axf.b;
        this.c = axf.c;
        this.d = axf.d;
        this.e = axf.e;
        this.f = axf.f;
        this.g = axf.g;
        this.h = axf.h;
        this.i = axf.i;
    }

    public final boolean a() {
        return this.g == wyf.UPLOADED && this.h != null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, axf] */
    public final axf b() {
        ? obj = new Object();
        wyf wyf = wyf.UNKNOWN;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.h = this.h;
        obj.g = this.g;
        obj.f = this.f;
        obj.e = this.e;
        obj.i = this.i;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bxf.class != obj.getClass()) {
            return false;
        }
        bxf bxf = (bxf) obj;
        if (Float.compare(bxf.e, this.e) != 0 || this.f != bxf.f || this.i != bxf.i) {
            return false;
        }
        kxf kxf = bxf.a;
        kxf kxf2 = this.a;
        if (kxf2 == null ? kxf != null : !kxf2.equals(kxf)) {
            return false;
        }
        String str = bxf.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = bxf.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = bxf.d;
        String str6 = this.d;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        if (this.g != bxf.g) {
            return false;
        }
        vyf vyf = bxf.h;
        vyf vyf2 = this.h;
        return vyf2 != null ? vyf2.equals(vyf) : vyf == null;
    }

    public final int hashCode() {
        int i2 = 0;
        kxf kxf = this.a;
        int hashCode = (kxf != null ? kxf.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f2 = this.e;
        int floatToIntBits = f2 != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f2) : 0;
        long j = this.f;
        int i3 = (((hashCode4 + floatToIntBits) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        wyf wyf = this.g;
        int hashCode5 = (i3 + (wyf != null ? wyf.hashCode() : 0)) * 31;
        vyf vyf = this.h;
        if (vyf != null) {
            i2 = vyf.hashCode();
        }
        long j2 = this.i;
        return ((hashCode5 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(this.b);
        sb.append("', fileName='");
        sb.append(this.c);
        sb.append("', uploadUrl='");
        sb.append(this.d);
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", createdTime=");
        return i2a.j(sb, this.i, '}');
    }
}
