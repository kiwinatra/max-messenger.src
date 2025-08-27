package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: gva  reason: default package */
public final class gva {
    public final String a;
    public final Regex b;
    public final Regex c;
    public final int d;
    public final int e;

    public gva(String str, Regex regex, Regex regex2, int i, int i2) {
        regex = (i2 & 2) != 0 ? null : regex;
        regex2 = (i2 & 4) != 0 ? null : regex2;
        i = (i2 & 16) != 0 ? ConstantsKt.DEFAULT_BUFFER_SIZE : i;
        this.a = str;
        this.b = regex;
        this.c = regex2;
        this.d = 50;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gva = (gva) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gva.a) && Intrinsics.areEqual((Object) this.b, (Object) gva.b) && Intrinsics.areEqual((Object) this.c, (Object) gva.c) && this.d == gva.d && this.e == gva.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        Regex regex = this.b;
        int hashCode2 = (hashCode + (regex == null ? 0 : regex.hashCode())) * 31;
        Regex regex2 = this.c;
        if (regex2 != null) {
            i = regex2.hashCode();
        }
        return Integer.hashCode(this.e) + rae.h(this.d, (hashCode2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target(logName=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        sb.append(this.c);
        sb.append(", maxBufferEntriesCount=");
        sb.append(this.d);
        sb.append(", sizeLimitKb=");
        return wj6.l(sb, this.e, ")");
    }
}
