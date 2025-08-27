package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o94  reason: default package */
public final class o94 {
    public final long a;
    public final ngf b;
    public final int c;
    public final ngf d;
    public final ev0 e;

    public o94(long j, ngf ngf, int i, ngf ngf2, ev0 ev0) {
        this.a = j;
        this.b = ngf;
        this.c = i;
        this.d = ngf2;
        this.e = ev0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o94)) {
            return false;
        }
        o94 o94 = (o94) obj;
        return this.a == o94.a && Intrinsics.areEqual((Object) this.b, (Object) o94.b) && this.c == o94.c && Intrinsics.areEqual((Object) this.d, (Object) o94.d) && Intrinsics.areEqual((Object) this.e, (Object) o94.e);
    }

    public final int hashCode() {
        int h = rae.h(this.c, i2a.g(Long.hashCode(this.a) * 31, 31, this.b), 31);
        ngf ngf = this.d;
        return this.e.hashCode() + ((h + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugSettingItem(itemId=" + this.a + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o94(long j, ngf ngf, int i, ngf ngf2, ev0 ev0, int i2) {
        this(j, ngf, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : ngf2, (i2 & 16) != 0 ? l94.m : ev0);
    }
}
