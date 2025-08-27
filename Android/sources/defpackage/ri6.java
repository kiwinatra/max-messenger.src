package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ri6  reason: default package */
public final class ri6 {
    public final String a;
    public final String b;
    public final ri6 c;

    public ri6(String str, String str2, ri6 ri6) {
        this.a = str;
        this.b = str2;
        this.c = ri6;
    }

    public static ri6 a(ri6 ri6, String str) {
        String str2 = ri6.a;
        ri6 ri62 = ri6.c;
        ri6.getClass();
        return new ri6(str2, str, ri62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri6)) {
            return false;
        }
        ri6 ri6 = (ri6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ri6.a) && Intrinsics.areEqual((Object) this.b, (Object) ri6.b) && Intrinsics.areEqual((Object) this.c, (Object) ri6.c);
    }

    public final int hashCode() {
        int d = g63.d(this.a.hashCode() * 31, 31, this.b);
        ri6 ri6 = this.c;
        return d + (ri6 == null ? 0 : ri6.hashCode());
    }

    public final String toString() {
        return "Result(normalized=" + this.a + ", original=" + this.b + ", noEmoji=" + this.c + ")";
    }
}
