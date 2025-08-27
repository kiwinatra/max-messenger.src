package defpackage;

/* renamed from: qa0  reason: default package */
public final class qa0 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public qa0(int i, String str, int i2, int i3, int i4, int i5) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0 = (qa0) obj;
        return this.a == qa0.a && this.b.equals(qa0.b) && this.c == qa0.c && this.d == qa0.d && this.e == qa0.e && this.f == qa0.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return wj6.l(sb, this.f, "}");
    }
}
