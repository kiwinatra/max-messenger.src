package defpackage;

/* renamed from: da6  reason: default package */
public final class da6 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public da6(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = 30;
        this.e = -1;
        this.f = true;
        this.g = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || da6.class != obj.getClass()) {
            return false;
        }
        da6 da6 = (da6) obj;
        if (this.a != da6.a || this.c != da6.c || this.d != da6.d || this.e != da6.e || this.f != da6.f || this.g != da6.g) {
            return false;
        }
        String str = da6.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return ((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 29791) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format{itag=");
        sb.append(this.a);
        sb.append(", ext='");
        sb.append(this.b);
        sb.append("', height=");
        sb.append(this.c);
        sb.append(", fps=");
        sb.append(this.d);
        sb.append(", vCodec=null, aCodec=null, audioBitrate=");
        sb.append(this.e);
        sb.append(", isDashContainer=");
        sb.append(this.f);
        sb.append(", isHlsContent=");
        return wzf.l(sb, this.g, '}');
    }

    public da6(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = -1;
        this.d = 30;
        this.e = i2;
        this.f = true;
        this.g = false;
    }

    public da6(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = 30;
        this.e = i3;
        this.f = false;
        this.g = false;
    }

    public da6(int i, int i2, int i3) {
        this.a = i;
        this.b = "mp4";
        this.c = i2;
        this.d = 30;
        this.e = i3;
        this.f = false;
        this.g = true;
    }

    public da6(String str, int i, int i2, Object obj) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.e = -1;
        this.d = 60;
        this.f = true;
        this.g = false;
    }
}
