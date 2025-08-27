package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n44  reason: default package */
public final class n44 {
    public static final String A = Integer.toString(7, 36);
    public static final String B = Integer.toString(8, 36);
    public static final String C = Integer.toString(9, 36);
    public static final String D = Integer.toString(10, 36);
    public static final String E = Integer.toString(11, 36);
    public static final String F = Integer.toString(12, 36);
    public static final String G = Integer.toString(13, 36);
    public static final String H = Integer.toString(14, 36);
    public static final String I = Integer.toString(15, 36);
    public static final String J = Integer.toString(16, 36);
    public static final String r = Integer.toString(0, 36);
    public static final String s = Integer.toString(17, 36);
    public static final String t = Integer.toString(1, 36);
    public static final String u = Integer.toString(2, 36);
    public static final String v = Integer.toString(3, 36);
    public static final String w = Integer.toString(18, 36);
    public static final String x = Integer.toString(4, 36);
    public static final String y = Integer.toString(5, 36);
    public static final String z = Integer.toString(6, 36);
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        new n44("", (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO);
        int i2 = v0g.a;
    }

    public n44(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z2, int i6, int i7, float f7) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            n79.g(bitmap2 == null);
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
        this.d = bitmap2;
        this.e = f2;
        this.f = i2;
        this.g = i3;
        this.h = f3;
        this.i = i4;
        this.j = f5;
        this.k = f6;
        this.l = z2;
        this.m = i6;
        this.n = i5;
        this.o = f4;
        this.p = i7;
        this.q = f7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.n44 a(android.os.Bundle r29) {
        /*
            r0 = r29
            java.lang.String r1 = r
            java.lang.CharSequence r1 = r0.getCharSequence(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0094
            java.lang.String r4 = s
            java.util.ArrayList r4 = r0.getParcelableArrayList(r4)
            if (r4 == 0) goto L_0x0092
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0092
            java.lang.Object r5 = r4.next()
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = defpackage.f54.a
            int r6 = r5.getInt(r6)
            java.lang.String r7 = defpackage.f54.b
            int r7 = r5.getInt(r7)
            java.lang.String r8 = defpackage.f54.c
            int r8 = r5.getInt(r8)
            java.lang.String r9 = defpackage.f54.d
            r10 = -1
            int r9 = r5.getInt(r9, r10)
            java.lang.String r10 = defpackage.f54.e
            android.os.Bundle r5 = r5.getBundle(r10)
            if (r9 == r2) goto L_0x0077
            r10 = 2
            if (r9 == r10) goto L_0x0059
            r5 = 3
            if (r9 == r5) goto L_0x0050
            goto L_0x001c
        L_0x0050:
            r27 r5 = new r27
            r5.<init>()
            r1.setSpan(r5, r6, r7, r8)
            goto L_0x001c
        L_0x0059:
            r5.getClass()
            lff r9 = new lff
            java.lang.String r10 = defpackage.lff.d
            int r10 = r5.getInt(r10)
            java.lang.String r11 = defpackage.lff.e
            int r11 = r5.getInt(r11)
            java.lang.String r12 = defpackage.lff.f
            int r5 = r5.getInt(r12)
            r9.<init>(r10, r11, r5)
            r1.setSpan(r9, r6, r7, r8)
            goto L_0x001c
        L_0x0077:
            r5.getClass()
            wad r9 = new wad
            java.lang.String r10 = defpackage.wad.c
            java.lang.String r10 = r5.getString(r10)
            r10.getClass()
            java.lang.String r11 = defpackage.wad.d
            int r5 = r5.getInt(r11)
            r9.<init>(r10, r5)
            r1.setSpan(r9, r6, r7, r8)
            goto L_0x001c
        L_0x0092:
            r12 = r1
            goto L_0x0095
        L_0x0094:
            r12 = r3
        L_0x0095:
            java.lang.String r1 = t
            java.io.Serializable r1 = r0.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L_0x00a1
            r13 = r1
            goto L_0x00a2
        L_0x00a1:
            r13 = r3
        L_0x00a2:
            java.lang.String r1 = u
            java.io.Serializable r1 = r0.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L_0x00ae
            r14 = r1
            goto L_0x00af
        L_0x00ae:
            r14 = r3
        L_0x00af:
            java.lang.String r1 = v
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r4 = 0
            if (r1 == 0) goto L_0x00bc
            r15 = r1
            goto L_0x00ca
        L_0x00bc:
            java.lang.String r1 = w
            byte[] r1 = r0.getByteArray(r1)
            if (r1 == 0) goto L_0x00c9
            int r3 = r1.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r3)
        L_0x00c9:
            r15 = r3
        L_0x00ca:
            java.lang.String r1 = x
            boolean r3 = r0.containsKey(r1)
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x00ec
            java.lang.String r3 = y
            boolean r7 = r0.containsKey(r3)
            if (r7 == 0) goto L_0x00ec
            float r1 = r0.getFloat(r1)
            int r3 = r0.getInt(r3)
            r16 = r1
            r17 = r3
            goto L_0x00f0
        L_0x00ec:
            r16 = r5
            r17 = r6
        L_0x00f0:
            java.lang.String r1 = z
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x00ff
            int r1 = r0.getInt(r1)
            r18 = r1
            goto L_0x0101
        L_0x00ff:
            r18 = r6
        L_0x0101:
            java.lang.String r1 = A
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0110
            float r1 = r0.getFloat(r1)
            r19 = r1
            goto L_0x0112
        L_0x0110:
            r19 = r5
        L_0x0112:
            java.lang.String r1 = B
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0121
            int r1 = r0.getInt(r1)
            r20 = r1
            goto L_0x0123
        L_0x0121:
            r20 = r6
        L_0x0123:
            java.lang.String r1 = D
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = C
            boolean r7 = r0.containsKey(r3)
            if (r7 == 0) goto L_0x0140
            float r1 = r0.getFloat(r1)
            int r3 = r0.getInt(r3)
            r22 = r1
            r21 = r3
            goto L_0x0144
        L_0x0140:
            r22 = r5
            r21 = r6
        L_0x0144:
            java.lang.String r1 = E
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0153
            float r1 = r0.getFloat(r1)
            r23 = r1
            goto L_0x0155
        L_0x0153:
            r23 = r5
        L_0x0155:
            java.lang.String r1 = F
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0164
            float r1 = r0.getFloat(r1)
            r24 = r1
            goto L_0x0166
        L_0x0164:
            r24 = r5
        L_0x0166:
            java.lang.String r1 = G
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L_0x0175
            int r1 = r0.getInt(r1)
            r26 = r1
            goto L_0x017a
        L_0x0175:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r26 = r1
            r2 = r4
        L_0x017a:
            java.lang.String r1 = H
            boolean r1 = r0.getBoolean(r1, r4)
            if (r1 != 0) goto L_0x0185
            r25 = r4
            goto L_0x0187
        L_0x0185:
            r25 = r2
        L_0x0187:
            java.lang.String r1 = I
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x0196
            int r1 = r0.getInt(r1)
            r27 = r1
            goto L_0x0198
        L_0x0196:
            r27 = r6
        L_0x0198:
            java.lang.String r1 = J
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x01a7
            float r0 = r0.getFloat(r1)
        L_0x01a4:
            r28 = r0
            goto L_0x01a9
        L_0x01a7:
            r0 = 0
            goto L_0x01a4
        L_0x01a9:
            n44 r0 = new n44
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n44.a(android.os.Bundle):n44");
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = f54.a;
                ArrayList arrayList = new ArrayList();
                for (wad wad : (wad[]) spanned.getSpans(0, spanned.length(), wad.class)) {
                    wad.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(wad.c, wad.a);
                    bundle2.putInt(wad.d, wad.b);
                    arrayList.add(f54.a(spanned, wad, 1, bundle2));
                }
                for (lff lff : (lff[]) spanned.getSpans(0, spanned.length(), lff.class)) {
                    lff.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(lff.d, lff.a);
                    bundle3.putInt(lff.e, lff.b);
                    bundle3.putInt(lff.f, lff.c);
                    arrayList.add(f54.a(spanned, lff, 2, bundle3));
                }
                for (r27 a2 : (r27[]) spanned.getSpans(0, spanned.length(), r27.class)) {
                    arrayList.add(f54.a(spanned, a2, 3, (Bundle) null));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(s, arrayList);
                }
            }
        }
        bundle.putSerializable(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putFloat(x, this.e);
        bundle.putInt(y, this.f);
        bundle.putInt(z, this.g);
        bundle.putFloat(A, this.h);
        bundle.putInt(B, this.i);
        bundle.putInt(C, this.n);
        bundle.putFloat(D, this.o);
        bundle.putFloat(E, this.j);
        bundle.putFloat(F, this.k);
        bundle.putBoolean(H, this.l);
        bundle.putInt(G, this.m);
        bundle.putInt(I, this.p);
        bundle.putFloat(J, this.q);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n44.class != obj.getClass()) {
            return false;
        }
        n44 n44 = (n44) obj;
        if (TextUtils.equals(this.a, n44.a) && this.b == n44.b && this.c == n44.c) {
            Bitmap bitmap = n44.d;
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == n44.e && this.f == n44.f && this.g == n44.g && this.h == n44.h && this.i == n44.i && this.j == n44.j && this.k == n44.k && this.l == n44.l && this.m == n44.m && this.n == n44.n && this.o == n44.o && this.p == n44.p && this.q == n44.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }
}
