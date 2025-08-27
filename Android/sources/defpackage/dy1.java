package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: dy1  reason: default package */
public final class dy1 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d = 15;
    public int e = 0;
    public int f = 0;
    public int g;
    public int h;

    public dy1(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.h = i2;
    }

    public final void a(char c2) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c2);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 1;
            while (size >= 0) {
                by1 by1 = (by1) arrayList.get(size);
                int i = by1.c;
                if (i == length) {
                    by1.c = i - 1;
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    public final n44 c(int i) {
        float f2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append(10);
            i2++;
        }
        spannableStringBuilder.append(d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f2 = ((((float) i3) / 32.0f) * 0.8f) + 0.1f;
        } else {
            f2 = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        return new n44(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (Layout.Alignment) null, (Bitmap) null, (float) i6, 1, IntCompanionObject.MIN_VALUE, f2, i5, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i5 >= arrayList.size()) {
                break;
            }
            by1 by1 = (by1) arrayList.get(i5);
            boolean z2 = by1.b;
            int i7 = by1.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = fy1.B[i7];
                }
                z = z3;
            }
            int i8 = by1.c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((by1) arrayList.get(i5)).c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (!(i == -1 || i == length)) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (!(i2 == -1 || i2 == length)) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (!(i6 == length || i3 == -1)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
