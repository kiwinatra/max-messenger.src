package defpackage;

import android.net.Uri;

/* renamed from: r64  reason: default package */
public final class r64 extends ol0 {
    public final String j;
    public final int k;
    public final int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r64(String str, String str2, long j2, long j3, long j4, boolean z, zy zyVar, boolean z2, int i, int i2, int i3, int i4) {
        super(i, i2, j3, j2, j4, zyVar, str, z, z2);
        this.j = str2;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r64.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r64 r64 = (r64) obj;
        if (this.k == r64.k && this.l == r64.l) {
            return this.j.equals(r64.j);
        }
        return false;
    }

    public final int f() {
        return 2;
    }

    public final int getHeight() {
        return this.l;
    }

    public final int getWidth() {
        return this.k;
    }

    public final Uri h() {
        return Uri.parse(this.j);
    }

    public final int hashCode() {
        return ((g63.d(super.hashCode() * 31, 31, this.j) + this.k) * 31) + this.l;
    }
}
