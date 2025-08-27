package defpackage;

/* renamed from: qq3  reason: default package */
public final class qq3 {
    public static final qq3 e = new vy(s58.x).d();
    public final long a;
    public final long b;
    public final s58 c;
    public final String d;

    public qq3(vy vyVar) {
        this.a = vyVar.b;
        this.b = vyVar.c;
        this.c = (s58) vyVar.v;
        this.d = (String) vyVar.o;
    }

    public static vy a(s58 s58) {
        return new vy(s58);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qq3.class != obj.getClass()) {
            return false;
        }
        qq3 qq3 = (qq3) obj;
        if (this.a != qq3.a || this.b != qq3.b) {
            return false;
        }
        s58 s58 = qq3.c;
        s58 s582 = this.c;
        if (s582 == null ? s58 != null : !s582.equals(s58)) {
            return false;
        }
        String str = qq3.d;
        String str2 = this.d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        int i2 = 0;
        s58 s58 = this.c;
        int hashCode = (i + (s58 != null ? s58.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactLocation{contactServerId=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(iq.U(Long.valueOf(this.b)));
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", deviceId='");
        return wj6.n(sb, this.d, "'}");
    }
}
