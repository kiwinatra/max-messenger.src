package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bl5  reason: default package */
public final class bl5 implements o00 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final Layout e;
    public final vk5 f;
    public final ngf g;
    public final String h;
    public final zk5 i;
    public final al5 j;
    public final p87 k;
    public final b3g l;
    public final boolean m;
    public final ome n;

    public bl5(long j2, long j3, String str, String str2, Layout layout, vk5 vk5, ngf ngf, String str3, zk5 zk5, al5 al5, p87 p87, b3g b3g, boolean z, xme xme) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = layout;
        this.f = vk5;
        this.g = ngf;
        this.h = str3;
        this.i = zk5;
        this.j = al5;
        this.k = p87;
        this.l = b3g;
        this.m = z;
        this.n = xme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl5)) {
            return false;
        }
        bl5 bl5 = (bl5) obj;
        return this.b == bl5.b && this.a == bl5.a && Intrinsics.areEqual((Object) this.c, (Object) bl5.c) && Intrinsics.areEqual((Object) this.d, (Object) bl5.d) && Intrinsics.areEqual((Object) this.e, (Object) bl5.e) && this.f == bl5.f && Intrinsics.areEqual((Object) this.g, (Object) bl5.g) && Intrinsics.areEqual((Object) this.h, (Object) bl5.h) && this.j == bl5.j && Intrinsics.areEqual((Object) this.k, (Object) bl5.k) && Intrinsics.areEqual((Object) this.l, (Object) bl5.l) && this.m == bl5.m && Intrinsics.areEqual((Object) this.i, (Object) bl5.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + g63.d(g63.d(wzf.i(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d)) * 31)) * 31;
        int i2 = 0;
        ngf ngf = this.g;
        int hashCode2 = (hashCode + (ngf != null ? ngf.hashCode() : 0)) * 31;
        String str = this.h;
        int hashCode3 = (this.j.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        p87 p87 = this.k;
        int hashCode4 = (hashCode3 + (p87 != null ? p87.hashCode() : 0)) * 31;
        b3g b3g = this.l;
        int e2 = g63.e((hashCode4 + (b3g != null ? b3g.hashCode() : 0)) * 31, 31, this.m);
        zk5 zk5 = this.i;
        if (zk5 != null) {
            i2 = zk5.hashCode();
        }
        return e2 + i2;
    }

    public final String toString() {
        return "FileAttachModel(fileId=" + this.a + ", messageId=" + this.b + ", attachLocalId=" + this.c + ", fileName=" + this.d + ", fileNameLayout=" + this.e + ", extension=" + this.f + ", size=" + this.g + ", localPath=" + this.h + ", state=" + this.i + ", type=" + this.j + ", imageAttachConfig=" + this.k + ", videoAttachConfig=" + this.l + ", hasText=" + this.m + ", stateFlow=" + this.n + ")";
    }
}
