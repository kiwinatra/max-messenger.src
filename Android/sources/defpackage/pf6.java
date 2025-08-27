package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.text.TextUtils;
import androidx.cardview.widget.CardView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Charsets;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pf6  reason: default package */
public final class pf6 implements zi6, qk3, nsb, ln0, xf5, usb, b4d {
    public static pf6 X;
    public static final pf6 b = new pf6(0);
    public static final long[] c = new long[0];
    public static volatile abe o;
    public static final pf6 v = new pf6(3);
    public static final pf6 w = new pf6(5);
    public static final pf6 x = new pf6(6);
    public static pf6 y;
    public static pf6 z;
    public final /* synthetic */ int a;

    public /* synthetic */ pf6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ev6, java.lang.Object] */
    public static final ev6 d() {
        int i = fv6.o;
        bv6 bv6 = bv6.a;
        ? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.c = c44.DEFAULT_ASPECT_RATIO;
        obj.d = 0;
        obj.e = false;
        obj.f = bv6;
        return obj;
    }

    private final void f() {
    }

    public static Font g(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : HttpStatus.SC_BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int k = k(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int k2 = k(fontStyle, font2.getStyle());
            if (k2 < k) {
                font = font2;
                k = k2;
            }
        }
        return font;
    }

    public static jr8 h(int i) {
        Object obj;
        Iterator it = jr8.y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jr8) obj).ordinal() == i) {
                break;
            }
        }
        jr8 jr8 = (jr8) obj;
        return jr8 == null ? jr8.b : jr8;
    }

    public static mm5 i(String str, String str2) {
        return new mm5(1, str, str2.getBytes(Charsets.UTF_8));
    }

    public static pf6 j() {
        if (z == null) {
            z = new pf6(19);
        }
        return z;
    }

    public static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static boolean l(frg frg) {
        abe abe = o;
        if (abe == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        } else if (vzg.a(abe, "system.shutdown.until.ts")) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("system.");
            sb.append(frg.b);
            sb.append(".shutdown.until.ts");
            return vzg.a(abe, sb.toString());
        }
    }

    private final void m(snd snd) {
    }

    public zpf B(int i, int i2) {
        switch (this.a) {
            case 12:
                throw new UnsupportedOperationException();
            default:
                return new ip4();
        }
    }

    public void M(snd snd) {
        switch (this.a) {
            case 12:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public long a(long j) {
        return j;
    }

    public void accept(Object obj) {
        hga.d.getClass();
        z68.b(hga.f, "storeMessagesProcessed: failed ", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).E();
    }

    public void b(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public CharSequence c(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (!TextUtils.isEmpty(listPreference.B())) {
            return listPreference.B();
        }
        return listPreference.a.getString(hmc.not_set);
    }

    public md5[] e(kd5[] kd5Arr, zg0 zg0) {
        int i;
        zk0 zk0;
        int i2;
        kd5[] kd5Arr2 = kd5Arr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= kd5Arr2.length) {
                break;
            }
            kd5 kd5 = kd5Arr2[i4];
            if (kd5 == null || kd5.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                qb7 o2 = tb7.o();
                o2.d(new w9(0, 0));
                arrayList.add(o2);
            }
            i4++;
        }
        int length = kd5Arr2.length;
        long[][] jArr = new long[length][];
        for (int i5 = 0; i5 < kd5Arr2.length; i5++) {
            kd5 kd52 = kd5Arr2[i5];
            if (kd52 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = kd52.b;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = (long) kd52.a.d[iArr[i6]].i;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        y9.v(arrayList, jArr3);
        nx9 f = ni0.S().f().f();
        int i8 = 0;
        while (i8 < length) {
            long[] jArr5 = jArr[i8];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr6.length) {
                        break;
                    }
                    int i10 = length;
                    long j2 = jArr6[i9];
                    if (j2 != -1) {
                        d = Math.log((double) j2);
                    }
                    dArr[i9] = d;
                    i9++;
                    length = i10;
                }
                i2 = length;
                int i11 = length2 - 1;
                double d2 = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d3 = dArr[i12];
                    i12++;
                    f.g(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i12]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i8));
                }
            }
            i8++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        tb7 p = tb7.p(f.h());
        for (int i13 = 0; i13 < p.size(); i13++) {
            int intValue = ((Integer) p.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr3[intValue] = jArr[intValue][i14];
            y9.v(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < kd5Arr2.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        y9.v(arrayList, jArr3);
        qb7 o3 = tb7.o();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            qb7 qb7 = (qb7) arrayList.get(i16);
            o3.d(qb7 == null ? tb7.s() : qb7.j());
        }
        k0d j3 = o3.j();
        md5[] md5Arr = new md5[kd5Arr2.length];
        for (int i17 = 0; i17 < kd5Arr2.length; i17++) {
            kd5 kd53 = kd5Arr2[i17];
            if (kd53 != null) {
                int[] iArr3 = kd53.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        zk0 = new zk0(kd53.a, new int[]{iArr3[0]});
                    } else {
                        long j4 = (long) 25000;
                        zk0 = new y9(kd53.a, iArr3, zg0, (long) 10000, j4, j4, 1279, 719, 0.7f, 0.75f, (tb7) j3.get(i17), c7f.a);
                    }
                    md5Arr[i17] = zk0;
                }
            }
        }
        return md5Arr;
    }

    public void n(fj fjVar, float f) {
        q8d q8d = (q8d) ((Drawable) fjVar.b);
        CardView cardView = (CardView) fjVar.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (!(f == q8d.e && q8d.f == useCompatPadding && q8d.g == preventCornerOverlap)) {
            q8d.e = f;
            q8d.f = useCompatPadding;
            q8d.g = preventCornerOverlap;
            q8d.b((Rect) null);
            q8d.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            fjVar.u(0, 0, 0, 0);
            return;
        }
        q8d q8d2 = (q8d) ((Drawable) fjVar.b);
        float f2 = q8d2.e;
        float f3 = q8d2.a;
        int ceil = (int) Math.ceil((double) r8d.a(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil((double) r8d.b(f2, f3, cardView.getPreventCornerOverlap()));
        fjVar.u(ceil, ceil2, ceil, ceil2);
    }

    public boolean test(Object obj) {
        return gcf.a(((Number) obj).intValue());
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return "MediaItemType";
            default:
                return super.toString();
        }
    }

    public void v() {
        switch (this.a) {
            case 12:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public pf6() {
        this.a = 21;
        new ConcurrentHashMap();
    }
}
