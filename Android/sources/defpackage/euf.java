package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: euf  reason: default package */
public final class euf implements ize {
    public final l8b a = new l8b();
    public final boolean b;
    public final int c;
    public final int o;
    public final String v;
    public final float w;
    public final int x;

    public euf(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.o = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.v = "Serif".equals(new String(bArr, 43, bArr.length - 43, x22.c)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.x = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.b = z;
            if (z) {
                this.w = v0g.i(((float) ((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8))) / ((float) i), c44.DEFAULT_ASPECT_RATIO, 0.95f);
            } else {
                this.w = 0.85f;
            }
        } else {
            this.c = 0;
            this.o = -1;
            this.v = str;
            this.b = false;
            this.w = 0.85f;
            this.x = -1;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public final void m(byte[] bArr, int i, int i2, hze hze, pk3 pk3) {
        String str;
        int i3 = i;
        pk3 pk32 = pk3;
        l8b l8b = this.a;
        l8b.E(i3 + i2, bArr);
        l8b.G(i3);
        int i4 = 2;
        boolean z = false;
        n79.g(l8b.a() >= 2);
        int A = l8b.A();
        if (A == 0) {
            str = "";
        } else {
            int i5 = l8b.b;
            Charset C = l8b.C();
            int i6 = A - (l8b.b - i5);
            if (C == null) {
                C = x22.c;
            }
            str = l8b.s(i6, C);
        }
        if (str.isEmpty()) {
            lx5 lx5 = tb7.b;
            pk32.accept(new q44(-9223372036854775807L, -9223372036854775807L, k0d.v));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        b(spannableStringBuilder2, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder2, this.o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str2 = this.v;
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.w;
        while (l8b.a() >= 8) {
            int i7 = l8b.b;
            int g = l8b.g();
            int g2 = l8b.g();
            if (g2 == 1937013100) {
                n79.g(l8b.a() >= i4 ? true : z);
                int A2 = l8b.A();
                int i8 = z;
                while (i8 < A2) {
                    n79.g(l8b.a() >= 12 ? true : z);
                    int A3 = l8b.A();
                    int A4 = l8b.A();
                    l8b.H(i4);
                    int u = l8b.u();
                    l8b.H(1);
                    int g3 = l8b.g();
                    if (A4 > spannableStringBuilder.length()) {
                        StringBuilder o2 = wj6.o(A4, "Truncating styl end (", ") to cueText.length() (");
                        o2.append(spannableStringBuilder.length());
                        o2.append(").");
                        i8b.V(o2.toString());
                        A4 = spannableStringBuilder.length();
                    }
                    if (A3 >= A4) {
                        i8b.V("Ignoring styl with start (" + A3 + ") >= end (" + A4 + ").");
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        int i9 = A3;
                        int i10 = A4;
                        b(spannableStringBuilder3, u, this.c, i9, i10, 0);
                        a(spannableStringBuilder3, g3, this.o, i9, i10, 0);
                    }
                    i8++;
                    i4 = 2;
                    z = false;
                }
            } else if (g2 != 1952608120 || !this.b) {
                i4 = 2;
            } else {
                i4 = 2;
                n79.g(l8b.a() >= 2);
                f = v0g.i(((float) l8b.A()) / ((float) this.x), c44.DEFAULT_ASPECT_RATIO, 0.95f);
            }
            l8b.G(i7 + g);
            z = false;
        }
        pk32.accept(new q44(-9223372036854775807L, -9223372036854775807L, tb7.t(new n44(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f, 0, 0, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO))));
    }

    public final int q() {
        return 2;
    }
}
