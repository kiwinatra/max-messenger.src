package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ydb  reason: default package */
public final class ydb {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public ydb(long j2, long j3, int i2, String str, long j4, String str2, String str3, String str4, String str5, int i3) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = str;
        this.e = j4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydb)) {
            return false;
        }
        ydb ydb = (ydb) obj;
        return this.a == ydb.a && this.b == ydb.b && this.c == ydb.c && Intrinsics.areEqual((Object) this.d, (Object) ydb.d) && this.e == ydb.e && Intrinsics.areEqual((Object) this.f, (Object) ydb.f) && Intrinsics.areEqual((Object) this.g, (Object) ydb.g) && Intrinsics.areEqual((Object) this.h, (Object) ydb.h) && Intrinsics.areEqual((Object) this.i, (Object) ydb.i) && this.j == ydb.j;
    }

    public final int hashCode() {
        int i2 = wzf.i(g63.d(rae.h(this.c, wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        int i3 = 0;
        String str = this.f;
        int d2 = g63.d((i2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode = (d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return tr1.y(this.j) + ((hashCode + i3) * 31);
    }

    public final String toString() {
        return "PhoneEntity(id=" + this.a + ", phonebookId=" + this.b + ", contactId=" + this.c + ", phone=" + this.d + ", serverPhone=" + this.e + ", email=" + this.f + ", firstName=" + this.g + ", lastName=" + this.h + ", avatarPath=" + this.i + ", type=" + i2a.s(this.j) + ")";
    }
}
