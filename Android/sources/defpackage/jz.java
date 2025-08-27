package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jz  reason: default package */
public final class jz {
    public final CharSequence a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public jz(CharSequence charSequence, String str, Integer num, Integer num2) {
        this.a = charSequence;
        this.b = str;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jzVar.a) && Intrinsics.areEqual((Object) this.b, (Object) jzVar.b) && Intrinsics.areEqual((Object) this.c, (Object) jzVar.c) && Intrinsics.areEqual((Object) this.d, (Object) jzVar.d);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "AttachDescription(description=" + this.a + ", image=" + this.b + ", placeholder=" + this.c + ", count=" + this.d + ")";
    }
}
