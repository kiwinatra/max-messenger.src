package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nz4  reason: default package */
public final class nz4 implements a05 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final c63 e;
    public final String f;
    public final int g;

    public nz4(String str, long j, CharSequence charSequence, String str2, c63 c63, String str3, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = c63;
        this.f = str3;
        this.g = i;
    }

    public static nz4 c(nz4 nz4, String str, c63 c63, String str2, int i) {
        if ((i & 8) != 0) {
            str = nz4.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            c63 = nz4.e;
        }
        c63 c632 = c63;
        if ((i & 32) != 0) {
            str2 = nz4.f;
        }
        return new nz4(nz4.a, nz4.b, nz4.c, str3, c632, str2, nz4.g);
    }

    public final boolean a(a05 a05) {
        if (a05 == null || !(a05 instanceof nz4)) {
            return false;
        }
        nz4 nz4 = (nz4) a05;
        return !Intrinsics.areEqual((Object) this.d, (Object) nz4.d) || !Intrinsics.areEqual((Object) this.f, (Object) nz4.f) || this.g != nz4.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = ((defpackage.nz4) r3).g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.a05 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0011
            boolean r1 = r3 instanceof defpackage.nz4
            if (r1 != 0) goto L_0x0008
            goto L_0x0011
        L_0x0008:
            nz4 r3 = (defpackage.nz4) r3
            int r3 = r3.g
            int r2 = r2.g
            if (r2 == r3) goto L_0x0011
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz4.b(a05):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz4)) {
            return false;
        }
        nz4 nz4 = (nz4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nz4.a) && this.b == nz4.b && Intrinsics.areEqual((Object) this.c, (Object) nz4.c) && Intrinsics.areEqual((Object) this.d, (Object) nz4.d) && Intrinsics.areEqual((Object) this.e, (Object) nz4.e) && Intrinsics.areEqual((Object) this.f, (Object) nz4.f) && this.g == nz4.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int e2 = wj6.e(this.c, wzf.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int hashCode = (e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c63 c63 = this.e;
        int hashCode2 = (hashCode + (c63 == null ? 0 : c63.a.hashCode())) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return tr1.y(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditChatProfileUiModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", titleError=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", chatType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "PRIVATE" : "PUBLIC");
        sb.append(")");
        return sb.toString();
    }
}
