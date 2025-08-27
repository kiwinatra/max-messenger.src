package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/* renamed from: boe  reason: default package */
public class boe implements Serializable {
    public final int X;
    public final boolean Y;
    public final long Z;
    public final long a;
    public final int b;
    public final int c;
    public final String o;
    public final long v;
    public final String v0;
    public final String w;
    public final boolean w0;
    public final String x;
    public final x10 x0;
    public final String y;
    public final int y0;
    public final List z;

    public boe(h20 h20) {
        this.a = h20.a;
        this.b = h20.b;
        this.c = h20.c;
        this.o = h20.d;
        this.v = h20.e;
        this.w = h20.f;
        this.x = h20.g;
        this.y = h20.h;
        this.z = (List) h20.n;
        this.X = h20.i;
        this.Y = h20.j;
        this.Z = h20.k;
        this.v0 = (String) h20.o;
        this.w0 = h20.l;
        this.x0 = (x10) h20.p;
        this.y0 = h20.m;
    }

    public final String a() {
        boolean z2 = this.Y;
        long j = this.a;
        if (!z2) {
            return String.valueOf(j);
        }
        if (this.x0 == null) {
            Locale locale = Locale.ENGLISH;
            return wj6.i(j, "external");
        }
        Locale locale2 = Locale.ENGLISH;
        return wj6.i(j, "photo_attach");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        boe boe = (boe) obj;
        if (this.a != boe.a || this.b != boe.b || this.c != boe.c || this.v != boe.v || this.Y != boe.Y || this.Z != boe.Z || this.w0 != boe.w0) {
            return false;
        }
        String str = boe.o;
        String str2 = this.o;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = boe.w;
        String str4 = this.w;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = boe.x;
        String str6 = this.x;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = boe.y;
        String str8 = this.y;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = boe.z;
        List list2 = this.z;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        if (this.X != boe.X) {
            return false;
        }
        String str9 = boe.v0;
        String str10 = this.v0;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        x10 x10 = boe.x0;
        x10 x102 = this.x0;
        if (x102 == null ? x10 == null : x102.equals(x10)) {
            return this.y0 == boe.y0;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        int i2 = 0;
        String str = this.o;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.v;
        int i3 = (((i + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.w;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.x;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.y;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.z;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i4 = this.X;
        int y2 = i4 != 0 ? tr1.y(i4) : 0;
        long j3 = this.Z;
        int i5 = (((((hashCode5 + y2) * 31) + (this.Y ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.v0;
        int hashCode6 = (((i5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.w0 ? 1 : 0)) * 31;
        x10 x10 = this.x0;
        int hashCode7 = (hashCode6 + (x10 != null ? x10.hashCode() : 0)) * 31;
        int i6 = this.y0;
        if (i6 != 0) {
            i2 = tr1.y(i6);
        }
        return hashCode7 + i2;
    }

    public String toString() {
        return "Sticker{id=" + this.a + ", width=" + this.b + ", height=" + this.c + ", url='" + this.o + "', updateTime=" + this.v + ", mp4Url='" + this.w + "', firstUrl='" + this.x + "', previewUrl='" + this.y + "', tags=" + this.z + ", stickerType=" + rae.A(this.X) + ", external=" + this.Y + ", setId=" + this.Z + ", lottieUrl='" + this.v0 + "', audio=" + this.w0 + ", photoAttach=" + this.x0 + ", stickerAuthorType=" + rae.z(this.y0) + "}";
    }
}
