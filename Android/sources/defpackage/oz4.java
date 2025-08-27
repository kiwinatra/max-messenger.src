package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: oz4  reason: default package */
public final class oz4 implements a05 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final c63 e;
    public final String f;
    public final c63 g;
    public final String h;
    public final ngf i;
    public final String j;
    public final m0g k;
    public final boolean l;
    public final Long m;

    public oz4(String str, long j2, String str2, CharSequence charSequence, c63 c63, String str3, c63 c632, String str4, ngf ngf, String str5, m0g m0g, boolean z, Long l2) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = charSequence;
        this.e = c63;
        this.f = str3;
        this.g = c632;
        this.h = str4;
        this.i = ngf;
        this.j = str5;
        this.k = m0g;
        this.l = z;
        this.m = l2;
    }

    public static oz4 c(oz4 oz4, String str, c63 c63, String str2, c63 c632, String str3, ngf ngf, m0g m0g, boolean z, Long l2, int i2) {
        oz4 oz42 = oz4;
        int i3 = i2;
        return new oz4(oz42.a, oz42.b, (i3 & 4) != 0 ? oz42.c : str, oz42.d, (i3 & 16) != 0 ? oz42.e : c63, (i3 & 32) != 0 ? oz42.f : str2, (i3 & 64) != 0 ? oz42.g : c632, (i3 & Uuid.SIZE_BITS) != 0 ? oz42.h : str3, (i3 & 256) != 0 ? oz42.i : ngf, oz42.j, (i3 & 1024) != 0 ? oz42.k : m0g, (i3 & 2048) != 0 ? oz42.l : z, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? oz42.m : l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.a05 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0034
            boolean r1 = r5 instanceof defpackage.oz4
            if (r1 != 0) goto L_0x0008
            goto L_0x0034
        L_0x0008:
            oz4 r5 = (defpackage.oz4) r5
            java.lang.String r1 = r4.h
            java.lang.String r2 = r5.h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            m0g r1 = r4.k
            m0g r3 = r5.k
            if (r3 == r1) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.f
            java.lang.String r4 = r4.f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz4.a(a05):boolean");
    }

    public final boolean b(a05 a05) {
        if (a05 == null || !(a05 instanceof oz4)) {
            return false;
        }
        oz4 oz4 = (oz4) a05;
        return (oz4.k != this.k) || (Intrinsics.areEqual((Object) oz4.e, (Object) this.e) ^ true) || (Intrinsics.areEqual((Object) oz4.g, (Object) this.g) ^ true) || !Intrinsics.areEqual((Object) this.i, (Object) oz4.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz4)) {
            return false;
        }
        oz4 oz4 = (oz4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) oz4.a) && this.b == oz4.b && Intrinsics.areEqual((Object) this.c, (Object) oz4.c) && Intrinsics.areEqual((Object) this.d, (Object) oz4.d) && Intrinsics.areEqual((Object) this.e, (Object) oz4.e) && Intrinsics.areEqual((Object) this.f, (Object) oz4.f) && Intrinsics.areEqual((Object) this.g, (Object) oz4.g) && Intrinsics.areEqual((Object) this.h, (Object) oz4.h) && Intrinsics.areEqual((Object) this.i, (Object) oz4.i) && Intrinsics.areEqual((Object) this.j, (Object) oz4.j) && this.k == oz4.k && this.l == oz4.l && Intrinsics.areEqual((Object) this.m, (Object) oz4.m);
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int i3 = wzf.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        c63 c63 = this.e;
        int hashCode3 = (hashCode2 + (c63 == null ? 0 : c63.a.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c63 c632 = this.g;
        int hashCode5 = (hashCode4 + (c632 == null ? 0 : c632.a.hashCode())) * 31;
        String str4 = this.h;
        int g2 = i2a.g((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (g2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        m0g m0g = this.k;
        int e2 = g63.e((hashCode6 + (m0g == null ? 0 : m0g.hashCode())) * 31, 31, this.l);
        Long l2 = this.m;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return e2 + i2;
    }

    public final String toString() {
        return "EditContactProfileUiModel(avatarUrl=" + this.a + ", contactId=" + this.b + ", firstName=" + this.c + ", abbreviation=" + this.d + ", firstNameError=" + this.e + ", lastName=" + this.f + ", lastNameError=" + this.g + ", description=" + this.h + ", shortLink=" + this.i + ", phoneNumber=" + this.j + ", inactiveTtl=" + this.k + ", isInDeleteState=" + this.l + ", removeProfileTimestamp=" + this.m + ")";
    }
}
