package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tjg  reason: default package */
public final class tjg {
    public final byte[] a;
    public final String b;
    public final String c;

    public tjg(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjg)) {
            return false;
        }
        tjg tjg = (tjg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tjg.a) && Intrinsics.areEqual((Object) this.b, (Object) tjg.b) && Intrinsics.areEqual((Object) this.c, (Object) tjg.c);
    }

    public final int hashCode() {
        int i = 0;
        byte[] bArr = this.a;
        int hashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder p = tr1.p("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=");
        p.append(this.b);
        p.append(", fileMimeType=");
        return wj6.n(p, this.c, ")");
    }
}
