package defpackage;

/* renamed from: ol0  reason: default package */
public abstract class ol0 implements f4g {
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;
    public final zy f;
    public final boolean g;
    public final int h;
    public final int i;

    public ol0(int i2, int i3, long j, long j2, long j3, zy zyVar, String str, boolean z, boolean z2) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = z;
        this.e = j3;
        this.f = zyVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ol0 ol0 = (ol0) obj;
        if (this.a != ol0.a || this.b != ol0.b || this.c != ol0.c || this.e != ol0.e || this.g != ol0.g || this.h != ol0.h || this.i != ol0.i) {
            return false;
        }
        String str = ol0.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        zy zyVar = ol0.f;
        zy zyVar2 = this.f;
        return zyVar2 != null ? zyVar2.equals(zyVar) : zyVar == null;
    }

    public long g() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31;
        int i3 = 0;
        String str = this.d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.e;
        int i4 = (((i2 + hashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        zy zyVar = this.f;
        if (zyVar != null) {
            i3 = zyVar.hashCode();
        }
        return ((((((i4 + i3) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i;
    }

    public long i() {
        return 0;
    }
}
