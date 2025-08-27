package defpackage;

/* renamed from: abc  reason: default package */
public final class abc {
    public final ir8 a;
    public final long b;
    public final long c;

    public abc(ir8 ir8, long j, long j2) {
        this.a = ir8;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abc)) {
            return false;
        }
        abc abc = (abc) obj;
        return this.b == abc.b && this.a.equals(abc.a) && this.c == abc.c;
    }

    public final int hashCode() {
        long j = this.b;
        int hashCode = this.a.hashCode();
        long j2 = this.c;
        return ((hashCode + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
