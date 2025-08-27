package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rj4  reason: default package */
public final class rj4 extends oe8 {
    public static final f5b f = f5b.a(new v00(19));
    public static final f5b g = f5b.a(new v00(21));
    public final bk3 d;
    public final AtomicReference e;

    public rj4(Context context, bk3 bk3) {
        int i = dj4.X0;
        dj4 dj4 = new dj4(new fj4(context));
        this.d = bk3;
        this.e = new AtomicReference(dj4);
    }

    public static int a(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : IntCompanionObject.MAX_VALUE;
    }

    public static int c(ca6 ca6, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ca6.c)) {
            return 4;
        }
        String f2 = f(str);
        String f3 = f(ca6.c);
        if (f3 == null || f2 == null) {
            return (!z || f3 != null) ? 0 : 1;
        }
        if (f3.startsWith(f2) || f2.startsWith(f3)) {
            return 3;
        }
        int i = t0g.a;
        return f3.split("-", 2)[0].equals(f2.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static void e(SparseArray sparseArray, eqf eqf, int i) {
        if (eqf != null) {
            int g2 = uq9.g(eqf.a.c[0].Z);
            Pair pair = (Pair) sparseArray.get(g2);
            if (pair == null || ((eqf) pair.first).b.isEmpty()) {
                sparseArray.put(g2, Pair.create(eqf, Integer.valueOf(i)));
            }
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, me8 me8, int[][][] iArr, kj4 kj4, Comparator comparator) {
        Object obj;
        boolean z;
        me8 me82 = me8;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < me82.a) {
            if (i == me82.b[i2]) {
                tpf tpf = me82.c[i2];
                int i3 = 0;
                while (i3 < tpf.a) {
                    rpf a = tpf.a(i3);
                    k0d b = kj4.b(i2, a, iArr[i2][i3]);
                    int i4 = a.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        mj4 mj4 = (mj4) b.get(i5);
                        int a2 = mj4.a();
                        if (!zArr[i5] && a2 != 0) {
                            if (a2 == 1) {
                                obj = tb7.t(mj4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mj4);
                                int i6 = i5 + 1;
                                while (i6 < i4) {
                                    mj4 mj42 = (mj4) b.get(i6);
                                    if (mj42.a() != 2 || !mj4.b(mj42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(mj42);
                                        z = true;
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    boolean z2 = z;
                                    me8 me83 = me8;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i5++;
                        me8 me84 = me8;
                    }
                    i3++;
                    me8 me85 = me8;
                }
            }
            kj4 kj42 = kj4;
            i2++;
            me82 = me8;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((mj4) list.get(i7)).c;
        }
        mj4 mj43 = (mj4) list.get(0);
        return Pair.create(new jd5(0, mj43.b, iArr2), Integer.valueOf(mj43.a));
    }

    public final fj4 b() {
        dj4 dj4 = (dj4) this.e.get();
        dj4.getClass();
        return new fj4(dj4);
    }

    public final void h(fj4 fj4) {
        ed5 ed5;
        dj4 dj4 = new dj4(fj4);
        if (!((dj4) this.e.getAndSet(dj4)).equals(dj4) && (ed5 = this.a) != null) {
            ed5.y.c(10);
        }
    }
}
