package defpackage;

import android.text.TextUtils;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pgf  reason: default package */
public final class pgf {
    public final float a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final TextUtils.TruncateAt f;
    public final a89 g;
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgf(float f2, CharSequence charSequence, boolean z, boolean z2, int i2) {
        this(f2, charSequence, z, (i2 & 8) != 0 ? false : z2, IntCompanionObject.MAX_VALUE, (TextUtils.TruncateAt) null, (a89) null, 0, 0);
    }

    public static pgf a(pgf pgf, CharSequence charSequence, int i2, int i3) {
        if ((i3 & 2) != 0) {
            charSequence = pgf.b;
        }
        CharSequence charSequence2 = charSequence;
        boolean z = (i3 & 8) != 0 ? pgf.d : false;
        if ((i3 & 16) != 0) {
            i2 = pgf.e;
        }
        return new pgf(pgf.a, charSequence2, pgf.c, z, i2, pgf.f, pgf.g, pgf.h, pgf.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgf)) {
            return false;
        }
        pgf pgf = (pgf) obj;
        return Float.compare(this.a, pgf.a) == 0 && Intrinsics.areEqual((Object) this.b, (Object) pgf.b) && this.c == pgf.c && this.d == pgf.d && this.e == pgf.e && this.f == pgf.f && Intrinsics.areEqual((Object) this.g, (Object) pgf.g) && this.h == pgf.h && this.i == pgf.i;
    }

    public final int hashCode() {
        int h2 = rae.h(this.e, g63.e(g63.e(wj6.e(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
        int i2 = 0;
        TextUtils.TruncateAt truncateAt = this.f;
        int hashCode = (h2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        a89 a89 = this.g;
        if (a89 != null) {
            i2 = a89.hashCode();
        }
        return Integer.hashCode(this.i) + rae.h(this.h, (hashCode + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreprocessTextResult(textSize=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", includeFontPadding=");
        sb.append(this.c);
        sb.append(", postProcessing=");
        sb.append(this.d);
        sb.append(", maxLines=");
        sb.append(this.e);
        sb.append(", truncateAt=");
        sb.append(this.f);
        sb.append(", replied=");
        sb.append(this.g);
        sb.append(", startPadding=");
        sb.append(this.h);
        sb.append(", endPadding=");
        return wj6.l(sb, this.i, ")");
    }

    public pgf(float f2, CharSequence charSequence, boolean z, boolean z2, int i2, TextUtils.TruncateAt truncateAt, a89 a89, int i3, int i4) {
        this.a = f2;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = truncateAt;
        this.g = a89;
        this.h = i3;
        this.i = i4;
        this.j = i2 != Integer.MAX_VALUE;
    }
}
