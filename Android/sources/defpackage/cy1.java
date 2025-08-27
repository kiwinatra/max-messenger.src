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

/* renamed from: cy1  reason: default package */
public final class cy1 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d = 15;
    public int e = 0;
    public int f = 0;
    public int g;
    public int h;

    public cy1(int i, int i2) {
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
                ay1 ay1 = (ay1) arrayList.get(size);
                int i = ay1.c;
                if (i == length) {
                    ay1.c = i - 1;
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    public final m44 c(int i) {
        float f2;
        int i2 = this.e + this.f;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i4);
            int i5 = t0g.a;
            if (charSequence.length() > i3) {
                charSequence = charSequence.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(10);
            i4++;
        }
        SpannableString d2 = d();
        int i6 = t0g.a;
        int length = d2.length();
        CharSequence charSequence2 = d2;
        if (length > i3) {
            charSequence2 = d2.subSequence(0, i3);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i3 - spannableStringBuilder.length();
        int i7 = i2 - length2;
        int i8 = i;
        int i9 = i8 != Integer.MIN_VALUE ? i8 : (this.g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) ? (this.g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i9 != 1) {
            if (i9 == 2) {
                i2 = 32 - length2;
            }
            f2 = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
        } else {
            f2 = 0.5f;
        }
        float f3 = f2;
        int i10 = this.d;
        if (i10 > 7) {
            i10 -= 17;
        } else if (this.g == 1) {
            i10 -= this.h - 1;
        }
        return new m44(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (Layout.Alignment) null, (Bitmap) null, (float) i10, 1, IntCompanionObject.MIN_VALUE, f3, i9, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
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
            ay1 ay1 = (ay1) arrayList.get(i5);
            boolean z2 = ay1.b;
            int i7 = ay1.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = ey1.J0[i7];
                }
                z = z3;
            }
            int i8 = ay1.c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((ay1) arrayList.get(i5)).c : length)) {
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
