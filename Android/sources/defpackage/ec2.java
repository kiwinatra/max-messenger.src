package defpackage;

/* renamed from: ec2  reason: default package */
public final class ec2 {
    public static final ec2 i = new ec2(new Object());
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;

    public ec2(dc2 dc2) {
        this.a = dc2.a;
        this.b = dc2.b;
        this.c = dc2.c;
        this.d = dc2.d;
        this.e = dc2.e;
        this.f = dc2.f;
        this.g = dc2.g;
        this.h = dc2.h;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dc2, java.lang.Object] */
    public final dc2 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ec2.class != obj.getClass()) {
            return false;
        }
        ec2 ec2 = (ec2) obj;
        if (this.a != ec2.a || this.b != ec2.b || this.c != ec2.c || this.d != ec2.d || this.e != ec2.e || this.f != ec2.f || this.g != ec2.g) {
            return false;
        }
        String str = ec2.h;
        String str2 = this.h;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.g;
        int i2 = ((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31;
        String str = this.h;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatLocation{contactServerId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", messageTime=");
        sb.append(iq.U(Long.valueOf(this.d)));
        sb.append(", livePeriod=");
        sb.append(this.e);
        sb.append(", startTime=");
        sb.append(iq.U(Long.valueOf(this.f)));
        sb.append(", endTime=");
        sb.append(iq.U(Long.valueOf(this.g)));
        sb.append(", deviceId='");
        return wj6.n(sb, this.h, "'}");
    }
}
