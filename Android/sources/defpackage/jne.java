package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jne  reason: default package */
public final class jne {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = IntCompanionObject.MAX_VALUE;
    public float g = c44.DEFAULT_ASPECT_RATIO;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public boolean k;
    public TextUtils.TruncateAt l = null;

    public jne(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i2;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        int i2 = this.f;
        TextPaint textPaint = this.b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.j);
        obtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f2 = this.g;
        if (!(f2 == c44.DEFAULT_ASPECT_RATIO && this.h == 1.0f)) {
            obtain.setLineSpacing(f2, this.h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        return obtain.build();
    }
}
