package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n63  reason: default package */
public final class n63 {
    public final m63 a;
    public final o63 b;
    public final r63 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    public final int[] m;

    public n63(m63 m63, o63 o63, r63 r63, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = m63;
        this.b = o63;
        this.c = r63;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = iArr;
        this.k = iArr2;
        this.l = iArr3;
        this.m = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n63)) {
            return false;
        }
        n63 n63 = (n63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) n63.a) && Intrinsics.areEqual((Object) this.b, (Object) n63.b) && Intrinsics.areEqual((Object) this.c, (Object) n63.c) && this.d == n63.d && this.e == n63.e && this.f == n63.f && this.g == n63.g && this.h == n63.h && this.i == n63.i && Intrinsics.areEqual((Object) this.j, (Object) n63.j) && Intrinsics.areEqual((Object) this.k, (Object) n63.k) && Intrinsics.areEqual((Object) this.l, (Object) n63.l) && Intrinsics.areEqual((Object) this.m, (Object) n63.m);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int h2 = rae.h(-1, rae.h(this.i, rae.h(1543503872, rae.h(-871625458, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int hashCode3 = Arrays.hashCode(this.k);
        int hashCode4 = Arrays.hashCode(this.l);
        return Arrays.hashCode(this.m) + ((hashCode4 + ((hashCode3 + ((Arrays.hashCode(this.j) + h2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.j);
        String arrays2 = Arrays.toString(this.k);
        String arrays3 = Arrays.toString(this.l);
        String arrays4 = Arrays.toString(this.m);
        StringBuilder sb = new StringBuilder("CommonBackgroundColors(chatBackground=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", skeleton=");
        sb.append(this.c);
        sb.append(", surfaceGround=");
        sb.append(this.d);
        sb.append(", capsule=");
        sb.append(this.e);
        sb.append(", capsuleSecondary=");
        sb.append(this.f);
        sb.append(", capsuleOutside=");
        sb.append(this.g);
        sb.append(", chatFab=");
        sb.append(this.h);
        sb.append(", overlayHard=-871625458, neutralFade=1543503872, stickerBlank=");
        sb.append(this.i);
        sb.append(", contrastStatic=-1, capsuleGradient=");
        sb.append(arrays);
        sb.append(", capsuleSecondaryGradient=");
        sb.append(arrays2);
        sb.append(", glassLightGradient=");
        sb.append(arrays3);
        sb.append(", spaceThemeGradient=");
        return wj6.n(sb, arrays4, ")");
    }
}
