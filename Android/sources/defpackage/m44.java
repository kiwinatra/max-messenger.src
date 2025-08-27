package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: m44  reason: default package */
public final class m44 implements jv0 {
    public static final m44 A0 = new m44("", (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
    public static final zb2 B0 = new zb2(25);
    public final float X;
    public final float Y;
    public final boolean Z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap o;
    public final float v;
    public final int v0;
    public final int w;
    public final int w0;
    public final int x;
    public final float x0;
    public final float y;
    public final int y0;
    public final int z;
    public final float z0;

    public m44(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            y64.g(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.o = bitmap2;
        this.v = f;
        this.w = i;
        this.x = i2;
        this.y = f2;
        this.z = i3;
        this.X = f4;
        this.Y = f5;
        this.Z = z2;
        this.v0 = i5;
        this.w0 = i4;
        this.x0 = f3;
        this.y0 = i6;
        this.z0 = f6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, k44] */
    public final k44 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.o;
        obj.c = this.b;
        obj.d = this.c;
        obj.e = this.v;
        obj.f = this.w;
        obj.g = this.x;
        obj.h = this.y;
        obj.i = this.z;
        obj.j = this.w0;
        obj.k = this.x0;
        obj.l = this.X;
        obj.m = this.Y;
        obj.n = this.Z;
        obj.o = this.v0;
        obj.p = this.y0;
        obj.q = this.z0;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m44.class != obj.getClass()) {
            return false;
        }
        m44 m44 = (m44) obj;
        if (TextUtils.equals(this.a, m44.a) && this.b == m44.b && this.c == m44.c) {
            Bitmap bitmap = m44.o;
            Bitmap bitmap2 = this.o;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.v == m44.v && this.w == m44.w && this.x == m44.x && this.y == m44.y && this.z == m44.z && this.X == m44.X && this.Y == m44.Y && this.Z == m44.Z && this.v0 == m44.v0 && this.w0 == m44.w0 && this.x0 == m44.x0 && this.y0 == m44.y0 && this.z0 == m44.z0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Float.valueOf(this.v), Integer.valueOf(this.w), Integer.valueOf(this.x), Float.valueOf(this.y), Integer.valueOf(this.z), Float.valueOf(this.X), Float.valueOf(this.Y), Boolean.valueOf(this.Z), Integer.valueOf(this.v0), Integer.valueOf(this.w0), Float.valueOf(this.x0), Integer.valueOf(this.y0), Float.valueOf(this.z0)});
    }
}
