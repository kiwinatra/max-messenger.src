package defpackage;

/* renamed from: tb0  reason: default package */
public final class tb0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public tb0(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sb0, java.lang.Object] */
    public final sb0 a() {
        ? obj = new Object();
        obj.b = this.a;
        obj.a = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.f = Long.valueOf(this.e);
        obj.g = Long.valueOf(this.f);
        obj.e = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0 = (tb0) obj;
        String str = this.a;
        if (str != null ? str.equals(tb0.a) : tb0.a == null) {
            if (tr1.c(this.b, tb0.b)) {
                String str2 = tb0.c;
                String str3 = this.c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = tb0.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == tb0.e && this.f == tb0.f) {
                            String str6 = tb0.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        int i = 0;
        String str = this.a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ tr1.y(this.b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.e;
        long j2 = this.f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return wj6.n(sb, this.g, "}");
    }
}
