package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qa1  reason: default package */
public final class qa1 {
    public final zd0 a;
    public final aj8 b;
    public final aj8 c;
    public final boolean d;
    public final ngf e;
    public final List f;
    public final ngf g;

    public qa1(zd0 zd0, aj8 aj8, aj8 aj82, boolean z, ngf ngf, List list, ngf ngf2) {
        this.a = zd0;
        this.b = aj8;
        this.c = aj82;
        this.d = z;
        this.e = ngf;
        this.f = list;
        this.g = ngf2;
    }

    public static qa1 a(qa1 qa1, zd0 zd0, aj8 aj8, aj8 aj82, boolean z, ngf ngf, ArrayList arrayList, ngf ngf2, int i) {
        qa1 qa12 = qa1;
        zd0 zd02 = (i & 1) != 0 ? qa12.a : zd0;
        aj8 aj83 = (i & 2) != 0 ? qa12.b : aj8;
        aj8 aj84 = (i & 4) != 0 ? qa12.c : aj82;
        boolean z2 = (i & 8) != 0 ? qa12.d : z;
        ngf ngf3 = (i & 16) != 0 ? qa12.e : ngf;
        List list = (i & 32) != 0 ? qa12.f : arrayList;
        ngf ngf4 = (i & 64) != 0 ? qa12.g : ngf2;
        qa1.getClass();
        return new qa1(zd02, aj83, aj84, z2, ngf3, list, ngf4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa1)) {
            return false;
        }
        qa1 qa1 = (qa1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qa1.a) && this.b == qa1.b && this.c == qa1.c && this.d == qa1.d && Intrinsics.areEqual((Object) this.e, (Object) qa1.e) && Intrinsics.areEqual((Object) this.f, (Object) qa1.f) && Intrinsics.areEqual((Object) this.g, (Object) qa1.g);
    }

    public final int hashCode() {
        int i = 0;
        zd0 zd0 = this.a;
        int g2 = i2a.g(g63.e((this.c.hashCode() + ((this.b.hashCode() + ((zd0 == null ? 0 : zd0.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (g2 + (list == null ? 0 : list.hashCode())) * 31;
        ngf ngf = this.g;
        if (ngf != null) {
            i = ngf.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}
