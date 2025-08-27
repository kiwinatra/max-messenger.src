package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: duf  reason: default package */
public final class duf extends ibe {
    public final float A0;
    public final int B0;
    public final g1g v0 = new g1g(3, false);
    public final boolean w0;
    public final int x0;
    public final int y0;
    public final String z0;

    public duf(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.x0 = bArr[24];
            this.y0 = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.z0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, x22.c)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.B0 = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.w0 = z;
            if (z) {
                this.A0 = t0g.i(((float) ((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8))) / ((float) i), c44.DEFAULT_ASPECT_RATIO, 0.95f);
            } else {
                this.A0 = 0.85f;
            }
        } else {
            this.x0 = 0;
            this.y0 = -1;
            this.z0 = str;
            this.w0 = false;
            this.A0 = 0.85f;
            this.B0 = -1;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    public final uye a(int i, byte[] bArr, boolean z) {
        String str;
        int i2;
        int i3;
        g1g g1g = this.v0;
        g1g.F(i, bArr);
        if (g1g.c() >= 2) {
            int A = g1g.A();
            if (A == 0) {
                str = "";
            } else {
                if (g1g.c() >= 2) {
                    byte[] bArr2 = g1g.a;
                    int i4 = g1g.b;
                    char c = (char) ((bArr2[i4 + 1] & UByte.MAX_VALUE) | ((bArr2[i4] & UByte.MAX_VALUE) << 8));
                    if (c == 65279 || c == 65534) {
                        str = g1g.t(A, x22.f);
                    }
                }
                str = g1g.t(A, x22.c);
            }
            if (str.isEmpty()) {
                return fuf.b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            h(spannableStringBuilder2, this.x0, 0, 0, spannableStringBuilder.length(), 16711680);
            g(spannableStringBuilder2, this.y0, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            String str2 = this.z0;
            if (str2 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
            }
            float f = this.A0;
            while (g1g.c() >= 8) {
                int i5 = g1g.b;
                int h = g1g.h();
                int h2 = g1g.h();
                if (h2 == 1937013100) {
                    if (g1g.c() >= 2) {
                        int A2 = g1g.A();
                        int i6 = 0;
                        while (i6 < A2) {
                            if (g1g.c() >= 12) {
                                int A3 = g1g.A();
                                int A4 = g1g.A();
                                g1g.I(2);
                                int v = g1g.v();
                                g1g.I(1);
                                int h3 = g1g.h();
                                if (A4 > spannableStringBuilder.length()) {
                                    spannableStringBuilder.length();
                                    A4 = spannableStringBuilder.length();
                                }
                                int i7 = A4;
                                if (A3 >= i7) {
                                    i3 = i6;
                                    i2 = A2;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                    int i8 = i7;
                                    int i9 = A3;
                                    i3 = i6;
                                    int i10 = i8;
                                    i2 = A2;
                                    h(spannableStringBuilder3, v, this.x0, A3, i10, 0);
                                    g(spannableStringBuilder3, h3, this.y0, A3, i10, 0);
                                }
                                i6 = i3 + 1;
                                A2 = i2;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (h2 == 1952608120 && this.w0) {
                    if (g1g.c() >= 2) {
                        f = t0g.i(((float) g1g.A()) / ((float) this.B0), c44.DEFAULT_ASPECT_RATIO, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                }
                g1g.H(i5 + h);
            }
            m44 m44 = r1;
            m44 m442 = new m44(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f, 0, 0, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
            return new fuf(m44);
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
