package defpackage;

/* renamed from: i72  reason: default package */
public final class i72 {
    public final String a;
    public final long b;
    public final long c;

    public i72(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i72.class != obj.getClass()) {
            return false;
        }
        i72 i72 = (i72) obj;
        if (this.b != i72.b || this.c != i72.c) {
            return false;
        }
        String str = i72.a;
        String str2 = this.a;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        long j2 = this.c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{text='");
        sb.append(vzg.y(this.a));
        sb.append("', time=");
        sb.append(this.b);
        sb.append(", id=");
        return i2a.j(sb, this.c, '}');
    }
}
