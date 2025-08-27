package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: bk3  reason: default package */
public final class bk3 implements ui, zi6, qk3, nsb, es6, wf5, ao8, anb {
    public static final bk3 a = new Object();
    public static final bk3 b = new Object();
    public static final bk3 c = new Object();
    public static final bk3 o = new Object();
    public static final bk3 v = new Object();
    public static final bk3 w = new Object();
    public static final bk3 x = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [z9e, java.lang.Object] */
    public static aae j(mz9 mz9) {
        ? obj = new Object();
        obj.a = mz9.f;
        obj.c = mz9.b;
        obj.d = mz9.c;
        obj.b = mz9.e;
        obj.e = mz9.g;
        obj.f = mz9.d;
        return new aae(obj);
    }

    public static rqc m(int i) {
        Object obj;
        Iterator it = rqc.v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rqc) obj).a == i) {
                break;
            }
        }
        rqc rqc = (rqc) obj;
        if (rqc != null) {
            return rqc;
        }
        throw new IllegalArgumentException(wj6.h(i, "Unknown reactionType = "));
    }

    public static bl4 n(bk3 bk3, Integer num) {
        bl4 bl4;
        bl4 bl42 = bl4.REGULAR;
        bk3.getClass();
        byte byteValue = num.byteValue();
        bl4[] values = bl4.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bl4 = null;
                break;
            }
            bl4 = values[i];
            if (bl4.a == byteValue) {
                break;
            }
            i++;
        }
        return bl4 == null ? bl42 : bl4;
    }

    public static Spannable o(CharSequence charSequence, int i, boolean z, boolean z2, Function1 function1) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if ((obj instanceof URLSpan) && !(obj instanceof my7)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    Result.Companion companion = Result.Companion;
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new my7(((URLSpan) obj).getURL(), i, z, z2), spanStart, spanEnd, 33);
                    Result.m23constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m23constructorimpl(ResultKt.createFailure(th));
                }
            }
            if (function1 != null) {
                function1.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    public static /* synthetic */ Spannable p(CharSequence charSequence, int i, int i2) {
        return o(charSequence, i, (i2 & 4) != 0, false, (Function1) null);
    }

    public ypf B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void K(rnd rnd) {
        throw new UnsupportedOperationException();
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public void accept(Object obj) {
        hga.d.getClass();
        z68.b(hga.f, "cleanUpToTime: failed to remove tracker messages", (Throwable) obj);
    }

    public Object apply(Object obj) {
        lfd lfd = (lfd) obj;
        return ((kbf) ((jbf) xd3.g.getValue())).a();
    }

    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public void d(float f, float f2) {
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public int f() {
        return MediaCodecList.getCodecCount();
    }

    public boolean g() {
        return false;
    }

    public void i(float f, float f2, int i, int i2, nmb nmb) {
    }

    public ld5[] k(jd5[] jd5Arr, yg0 yg0) {
        yk0 yk0;
        double d;
        jd5[] jd5Arr2 = jd5Arr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (jd5 jd5 : jd5Arr2) {
            if (jd5 == null || jd5.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                qb7 o2 = tb7.o();
                o2.d(new v9(0, 0));
                arrayList.add(o2);
            }
        }
        int length = jd5Arr2.length;
        long[][] jArr = new long[length][];
        for (int i2 = 0; i2 < jd5Arr2.length; i2++) {
            jd5 jd52 = jd5Arr2[i2];
            if (jd52 == null) {
                jArr[i2] = new long[0];
            } else {
                int[] iArr = jd52.b;
                jArr[i2] = new long[iArr.length];
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    jArr[i2][i3] = (long) jd52.a.c[iArr[i3]].y;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            long[] jArr3 = jArr[i4];
            jArr2[i4] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        x9.v(arrayList, jArr2);
        nx9 f = ni0.S().f().f();
        int i5 = 0;
        while (i5 < length) {
            long[] jArr4 = jArr[i5];
            if (jArr4.length > 1) {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i6 = i;
                while (true) {
                    long[] jArr5 = jArr[i5];
                    d = 0.0d;
                    if (i6 >= jArr5.length) {
                        break;
                    }
                    long j = jArr5[i6];
                    if (j != -1) {
                        d = Math.log((double) j);
                    }
                    dArr[i6] = d;
                    i6++;
                }
                int i7 = length2 - 1;
                double d2 = dArr[i7] - dArr[i];
                int i8 = i;
                while (i8 < i7) {
                    double d3 = dArr[i8];
                    i8++;
                    f.g(Double.valueOf(d2 == d ? 1.0d : (((d3 + dArr[i8]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i5));
                    i = 0;
                    d = 0.0d;
                }
            }
            i5++;
            i = 0;
        }
        tb7 p = tb7.p(f.h());
        for (int i9 = 0; i9 < p.size(); i9++) {
            int intValue = ((Integer) p.get(i9)).intValue();
            int i10 = iArr2[intValue] + 1;
            iArr2[intValue] = i10;
            jArr2[intValue] = jArr[intValue][i10];
            x9.v(arrayList, jArr2);
        }
        for (int i11 = 0; i11 < jd5Arr2.length; i11++) {
            if (arrayList.get(i11) != null) {
                jArr2[i11] = jArr2[i11] * 2;
            }
        }
        x9.v(arrayList, jArr2);
        qb7 o3 = tb7.o();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            qb7 qb7 = (qb7) arrayList.get(i12);
            o3.d(qb7 == null ? tb7.s() : qb7.j());
        }
        k0d j2 = o3.j();
        ld5[] ld5Arr = new ld5[jd5Arr2.length];
        for (int i13 = 0; i13 < jd5Arr2.length; i13++) {
            jd5 jd53 = jd5Arr2[i13];
            if (jd53 != null) {
                int[] iArr3 = jd53.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        int i14 = iArr3[0];
                        int i15 = jd53.c;
                        yk0 = new yk0(jd53.a, new int[]{i14});
                    } else {
                        long j3 = (long) 25000;
                        yk0 = new x9(jd53.a, iArr3, jd53.c, yg0, (long) 10000, j3, j3, 1279, 719, 0.7f, 0.75f, (tb7) j2.get(i13), b7f.a);
                    }
                    ld5Arr[i13] = yk0;
                }
            }
        }
        return ld5Arr;
    }

    public boolean test(Object obj) {
        return gcf.a(((Number) obj).intValue());
    }

    public void v() {
        throw new UnsupportedOperationException();
    }
}
