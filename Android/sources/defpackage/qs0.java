package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qs0  reason: default package */
public final class qs0 {
    public final ps0 a;
    public final rs0 b;
    public final vs0 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int[] l;

    public qs0(ps0 ps0, rs0 rs0, vs0 vs0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        this.a = ps0;
        this.b = rs0;
        this.c = vs0;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs0)) {
            return false;
        }
        qs0 qs0 = (qs0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qs0.a) && Intrinsics.areEqual((Object) this.b, (Object) qs0.b) && Intrinsics.areEqual((Object) this.c, (Object) qs0.c) && this.d == qs0.d && this.e == qs0.e && this.f == qs0.f && this.g == qs0.g && this.h == qs0.h && this.i == qs0.i && this.j == qs0.j && this.k == qs0.k && Intrinsics.areEqual((Object) this.l, (Object) qs0.l);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Arrays.hashCode(this.l) + rae.h(this.k, rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.l);
        return "BubbleBackgroundColors(botButton=" + this.a + ", focus=" + this.b + ", reaction=" + this.c + ", bubble=" + this.d + ", action=" + this.e + ", actionFade=" + this.f + ", actionSecondary=" + this.g + ", surfaceSecondary=" + this.h + ", iconItem=" + this.i + ", mention=" + this.j + ", mentionPressed=" + this.k + ", bubbleGradient=" + arrays + ")";
    }
}
