package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.util.LangUtils;

/* renamed from: cy4  reason: default package */
public final class cy4 extends ibe {
    public final /* synthetic */ int v0;
    public final Object w0;

    /* JADX WARNING: type inference failed for: r1v8, types: [ic3, java.lang.Object] */
    public cy4(List list) {
        this.v0 = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        byte b = ((bArr[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
        byte b2 = (bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & KotlinVersion.MAX_COMPONENT_VALUE) << 8);
        ? obj = new Object();
        Paint paint = new Paint();
        obj.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        obj.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        obj.c = new Canvas();
        obj.o = new fy4(719, 575, 0, 719, 0, 575);
        obj.v = new dy4(0, new int[]{0, -1, -16777216, -8421505}, ic3.k(), ic3.l());
        obj.w = new py4(b, b2, 0);
        this.w0 = obj;
    }

    public final uye a(int i, byte[] bArr, boolean z) {
        ty1 ty1;
        py4 py4;
        List list;
        int i2;
        ty1 ty12;
        char c;
        char c2;
        int i3;
        fy4 fy4;
        ArrayList arrayList;
        int i4;
        py4 py42;
        Paint paint;
        ly4 ly4;
        int i5;
        int i6;
        int i7;
        int i8;
        m44 m44;
        int i9 = i;
        byte[] bArr2 = bArr;
        int i10 = 0;
        Object obj = this.w0;
        int i11 = 8;
        int i12 = 1;
        switch (this.v0) {
            case 0:
                ic3 ic3 = (ic3) obj;
                if (z) {
                    py4 py43 = (py4) ic3.w;
                    py43.c.clear();
                    py43.d.clear();
                    py43.e.clear();
                    py43.f.clear();
                    py43.g.clear();
                    py43.h = null;
                    py43.i = null;
                }
                ic3.getClass();
                ky1 ky1 = new ky1(bArr2, (byte) 0, i9, 1);
                while (true) {
                    int b = ky1.b();
                    py4 = (py4) ic3.w;
                    if (b < 48 || ky1.i(i11) != 15) {
                        iy4 iy4 = (iy4) py4.i;
                    } else {
                        int i13 = ky1.i(i11);
                        int i14 = 16;
                        int i15 = ky1.i(16);
                        int i16 = ky1.i(16);
                        int f = ky1.f() + i16;
                        if (i16 * 8 > ky1.b()) {
                            ky1.t(ky1.b());
                        } else {
                            switch (i13) {
                                case 16:
                                    if (i15 == py4.a) {
                                        iy4 iy42 = (iy4) py4.i;
                                        int i17 = 8;
                                        ky1.i(8);
                                        int i18 = ky1.i(4);
                                        int i19 = ky1.i(2);
                                        ky1.t(2);
                                        int i20 = i16 - 2;
                                        SparseArray sparseArray = new SparseArray();
                                        while (i20 > 0) {
                                            int i21 = ky1.i(i17);
                                            ky1.t(i17);
                                            i20 -= 6;
                                            sparseArray.put(i21, new jy4(ky1.i(16), ky1.i(16)));
                                            i17 = 8;
                                        }
                                        iy4 iy43 = new iy4(i18, i19, sparseArray);
                                        if (i19 == 0) {
                                            if (!(iy42 == null || iy42.a == i18)) {
                                                py4.i = iy43;
                                                break;
                                            }
                                        } else {
                                            py4.i = iy43;
                                            py4.c.clear();
                                            py4.d.clear();
                                            py4.e.clear();
                                            break;
                                        }
                                    }
                                    break;
                                case LangUtils.HASH_SEED /*17*/:
                                    iy4 iy44 = (iy4) py4.i;
                                    if (i15 == py4.a && iy44 != null) {
                                        int i22 = ky1.i(i11);
                                        ky1.t(4);
                                        boolean h = ky1.h();
                                        ky1.t(3);
                                        int i23 = ky1.i(16);
                                        int i24 = ky1.i(16);
                                        ky1.i(3);
                                        int i25 = ky1.i(3);
                                        ky1.t(2);
                                        int i26 = ky1.i(i11);
                                        int i27 = ky1.i(i11);
                                        int i28 = ky1.i(4);
                                        int i29 = ky1.i(2);
                                        ky1.t(2);
                                        int i30 = i16 - 10;
                                        SparseArray sparseArray2 = new SparseArray();
                                        while (i30 > 0) {
                                            int i31 = ky1.i(i14);
                                            int i32 = ky1.i(2);
                                            ky1.i(2);
                                            int i33 = ky1.i(12);
                                            ky1.t(4);
                                            int i34 = ky1.i(12);
                                            int i35 = i30 - 6;
                                            if (i32 == 1 || i32 == 2) {
                                                ky1.i(8);
                                                ky1.i(8);
                                                i30 -= 8;
                                            } else {
                                                i30 = i35;
                                            }
                                            sparseArray2.put(i31, new ny4(i33, i34));
                                            i14 = 16;
                                        }
                                        ly4 ly42 = new ly4(i22, h, i23, i24, i25, i26, i27, i28, i29, sparseArray2);
                                        SparseArray sparseArray3 = py4.c;
                                        if (iy44.b == 0 && (ly4 = (ly4) sparseArray3.get(i22)) != null) {
                                            int i36 = 0;
                                            while (true) {
                                                SparseArray sparseArray4 = ly4.j;
                                                if (i36 < sparseArray4.size()) {
                                                    ly42.j.put(sparseArray4.keyAt(i36), (ny4) sparseArray4.valueAt(i36));
                                                    i36++;
                                                }
                                            }
                                        }
                                        sparseArray3.put(ly42.a, ly42);
                                        break;
                                    }
                                case 18:
                                    if (i15 != py4.a) {
                                        if (i15 == py4.b) {
                                            dy4 v = ic3.v(ky1, i16);
                                            py4.f.put(v.a, v);
                                            break;
                                        }
                                    } else {
                                        dy4 v2 = ic3.v(ky1, i16);
                                        py4.d.put(v2.a, v2);
                                        break;
                                    }
                                    break;
                                case 19:
                                    if (i15 != py4.a) {
                                        if (i15 == py4.b) {
                                            gy4 w = ic3.w(ky1);
                                            py4.g.put(w.a, w);
                                            break;
                                        }
                                    } else {
                                        gy4 w2 = ic3.w(ky1);
                                        py4.e.put(w2.a, w2);
                                        break;
                                    }
                                    break;
                                case 20:
                                    if (i15 == py4.a) {
                                        ky1.t(4);
                                        boolean h2 = ky1.h();
                                        ky1.t(3);
                                        int i37 = ky1.i(16);
                                        int i38 = ky1.i(16);
                                        if (h2) {
                                            int i39 = ky1.i(16);
                                            int i40 = ky1.i(16);
                                            int i41 = ky1.i(16);
                                            i8 = i39;
                                            i5 = ky1.i(16);
                                            i7 = i40;
                                            i6 = i41;
                                        } else {
                                            i8 = i10;
                                            i6 = i8;
                                            i7 = i37;
                                            i5 = i38;
                                        }
                                        py4.h = new fy4(i37, i38, i8, i7, i6, i5);
                                        break;
                                    }
                                    break;
                            }
                            ky1.u(f - ky1.f());
                        }
                        i10 = 0;
                        i11 = 8;
                    }
                }
                iy4 iy45 = (iy4) py4.i;
                if (iy45 == null) {
                    list = Collections.emptyList();
                    ty12 = ty1;
                    i2 = 1;
                } else {
                    fy4 fy42 = (fy4) py4.h;
                    if (fy42 == null) {
                        fy42 = (fy4) ic3.o;
                    }
                    Bitmap bitmap = (Bitmap) ic3.x;
                    Canvas canvas = (Canvas) ic3.c;
                    if (!(bitmap != null && fy42.a + 1 == bitmap.getWidth() && fy42.b + 1 == ((Bitmap) ic3.x).getHeight())) {
                        Bitmap createBitmap = Bitmap.createBitmap(fy42.a + 1, fy42.b + 1, Bitmap.Config.ARGB_8888);
                        ic3.x = createBitmap;
                        canvas.setBitmap(createBitmap);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i42 = 0;
                    while (true) {
                        SparseArray sparseArray5 = iy45.c;
                        if (i42 < sparseArray5.size()) {
                            canvas.save();
                            jy4 jy4 = (jy4) sparseArray5.valueAt(i42);
                            ly4 ly43 = (ly4) py4.c.get(sparseArray5.keyAt(i42));
                            int i43 = jy4.a + fy42.c;
                            int i44 = jy4.b + fy42.e;
                            int min = Math.min(ly43.c + i43, fy42.d);
                            int i45 = ly43.d;
                            int i46 = i44 + i45;
                            canvas.clipRect(i43, i44, min, Math.min(i46, fy42.f));
                            SparseArray sparseArray6 = py4.d;
                            int i47 = ly43.f;
                            dy4 dy4 = (dy4) sparseArray6.get(i47);
                            if (dy4 == null && (dy4 = (dy4) py4.f.get(i47)) == null) {
                                dy4 = (dy4) ic3.v;
                            }
                            int i48 = 0;
                            while (true) {
                                SparseArray sparseArray7 = ly43.j;
                                iy4 iy46 = iy45;
                                if (i48 < sparseArray7.size()) {
                                    int keyAt = sparseArray7.keyAt(i48);
                                    ny4 ny4 = (ny4) sparseArray7.valueAt(i48);
                                    ty1 ty13 = ty1;
                                    gy4 gy4 = (gy4) py4.e.get(keyAt);
                                    if (gy4 == null) {
                                        gy4 = (gy4) py4.g.get(keyAt);
                                    }
                                    if (gy4 != null) {
                                        if (gy4.b) {
                                            py42 = py4;
                                            paint = null;
                                        } else {
                                            paint = (Paint) ic3.a;
                                            py42 = py4;
                                        }
                                        int i49 = ny4.a + i43;
                                        int i50 = ny4.b + i44;
                                        i4 = i42;
                                        int i51 = ly43.e;
                                        arrayList = arrayList2;
                                        fy4 = fy42;
                                        int[] iArr = i51 == 3 ? dy4.d : i51 == 2 ? dy4.c : dy4.b;
                                        int i52 = i51;
                                        int i53 = i49;
                                        Paint paint2 = paint;
                                        Canvas canvas2 = canvas;
                                        ic3.u(gy4.c, iArr, i52, i53, i50, paint2, canvas2);
                                        ic3.u(gy4.d, iArr, i52, i53, i50 + 1, paint2, canvas2);
                                    } else {
                                        fy4 = fy42;
                                        arrayList = arrayList2;
                                        i4 = i42;
                                        py42 = py4;
                                    }
                                    i48++;
                                    iy45 = iy46;
                                    py4 = py42;
                                    ty1 = ty13;
                                    i42 = i4;
                                    arrayList2 = arrayList;
                                    fy42 = fy4;
                                } else {
                                    ty1 ty14 = ty1;
                                    fy4 fy43 = fy42;
                                    ArrayList arrayList3 = arrayList2;
                                    int i54 = i42;
                                    py4 py44 = py4;
                                    boolean z2 = ly43.b;
                                    int i55 = ly43.c;
                                    if (z2) {
                                        int i56 = ly43.e;
                                        c2 = 3;
                                        if (i56 == 3) {
                                            i3 = dy4.d[ly43.g];
                                            c = 2;
                                        } else {
                                            c = 2;
                                            i3 = i56 == 2 ? dy4.c[ly43.h] : dy4.b[ly43.i];
                                        }
                                        Paint paint3 = (Paint) ic3.b;
                                        paint3.setColor(i3);
                                        canvas.drawRect((float) i43, (float) i44, (float) (i43 + i55), (float) i46, paint3);
                                    } else {
                                        c2 = 3;
                                        c = 2;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) ic3.x, i43, i44, i55, i45);
                                    fy4 fy44 = fy43;
                                    float f2 = (float) fy44.a;
                                    float f3 = (float) fy44.b;
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.add(new m44((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i44) / f3, 0, 0, ((float) i43) / f2, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, ((float) i55) / f2, ((float) i45) / f3, false, -16777216, IntCompanionObject.MIN_VALUE, c44.DEFAULT_ASPECT_RATIO));
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    canvas.restore();
                                    py4 = py44;
                                    char c3 = c2;
                                    fy42 = fy44;
                                    char c4 = c;
                                    i42 = i54 + 1;
                                    i12 = 1;
                                    arrayList2 = arrayList4;
                                    iy45 = iy46;
                                    ty1 = ty14;
                                }
                            }
                        } else {
                            ty1 ty15 = ty1;
                            i2 = i12;
                            list = Collections.unmodifiableList(arrayList2);
                            ty12 = ty15;
                        }
                    }
                }
                return new ty1(i2, list);
            default:
                g1g g1g = (g1g) obj;
                g1g.F(i9, bArr2);
                ArrayList arrayList5 = new ArrayList();
                while (g1g.c() > 0) {
                    if (g1g.c() >= 8) {
                        int h3 = g1g.h();
                        if (g1g.h() == 1987343459) {
                            int i57 = h3 - 8;
                            CharSequence charSequence = null;
                            k44 k44 = null;
                            while (i57 > 0) {
                                if (i57 >= 8) {
                                    int h4 = g1g.h();
                                    int h5 = g1g.h();
                                    int i58 = h4 - 8;
                                    byte[] bArr3 = g1g.a;
                                    int i59 = g1g.b;
                                    int i60 = t0g.a;
                                    String str = new String(bArr3, i59, i58, x22.c);
                                    g1g.I(i58);
                                    i57 = (i57 - 8) - i58;
                                    if (h5 == 1937011815) {
                                        lmg lmg = new lmg();
                                        mmg.e(str, lmg);
                                        k44 = lmg.a();
                                    } else if (h5 == 1885436268) {
                                        charSequence = mmg.f((String) null, str.trim(), Collections.emptyList());
                                    }
                                } else {
                                    throw new Exception("Incomplete vtt cue box header found.");
                                }
                            }
                            if (charSequence == null) {
                                charSequence = "";
                            }
                            if (k44 != null) {
                                k44.a = charSequence;
                                m44 = k44.a();
                            } else {
                                Pattern pattern = mmg.a;
                                lmg lmg2 = new lmg();
                                lmg2.c = charSequence;
                                m44 = lmg2.a().a();
                            }
                            arrayList5.add(m44);
                        } else {
                            g1g.I(h3 - 8);
                        }
                    } else {
                        throw new Exception("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                }
                return new yu9(arrayList5);
        }
    }

    public cy4() {
        this.v0 = 1;
        this.w0 = new g1g(3, false);
    }
}
