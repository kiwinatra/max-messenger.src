package defpackage;

import java.util.Arrays;

/* renamed from: ib0  reason: default package */
public final class ib0 extends s78 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final s6a g;

    public ib0(long j, Integer num, long j2, byte[] bArr, String str, long j3, mb0 mb0) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = mb0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78 = (s78) obj;
        if (this.a == ((ib0) s78).a && ((num = this.b) != null ? num.equals(((ib0) s78).b) : ((ib0) s78).b == null)) {
            ib0 ib0 = (ib0) s78;
            if (this.c == ib0.c) {
                if (Arrays.equals(this.d, s78 instanceof ib0 ? ((ib0) s78).d : ib0.d)) {
                    String str = ib0.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == ib0.f) {
                            s6a s6a = ib0.g;
                            s6a s6a2 = this.g;
                            if (s6a2 == null) {
                                if (s6a == null) {
                                    return true;
                                }
                            } else if (s6a2.equals(s6a)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        s6a s6a = this.g;
        if (s6a != null) {
            i2 = s6a.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
