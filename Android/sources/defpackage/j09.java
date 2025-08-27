package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j09  reason: default package */
public final class j09 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public j09(voc voc, o9g o9g, yy0 yy0, yy0 yy02, py0 py0, sjf sjf) {
        this.a = 3;
        this.h = voc;
        this.b = o9g;
        this.c = yy0;
        this.e = yy02;
        this.i = py0;
        this.j = sjf;
        this.k = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashSet();
        this.d = new HashMap();
        this.m = new nme(this);
    }

    public ikf a(int i2, List list, a9e a9e) {
        if (!list.isEmpty()) {
            this.l = a9e;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                g09 g09 = (g09) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    g09 g092 = (g09) arrayList.get(i3 - 1);
                    g09.d = g092.a.o.b.p() + g092.d;
                    g09.e = false;
                    g09.c.clear();
                } else {
                    g09.d = 0;
                    g09.e = false;
                    g09.c.clear();
                }
                int p = g09.a.o.b.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((g09) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, g09);
                ((HashMap) this.d).put(g09.b, g09);
                if (this.g) {
                    k(g09);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(g09);
                    } else {
                        e09 e09 = (e09) ((HashMap) this.e).get(g09);
                        if (e09 != null) {
                            e09.a.b(e09.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public jkf b(int i2, List list, b9e b9e) {
        if (!list.isEmpty()) {
            this.l = b9e;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                h09 h09 = (h09) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    h09 h092 = (h09) arrayList.get(i3 - 1);
                    h09.d = h092.a.o.e.p() + h092.d;
                    h09.e = false;
                    h09.c.clear();
                } else {
                    h09.d = 0;
                    h09.e = false;
                    h09.c.clear();
                }
                int p = h09.a.o.e.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((h09) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, h09);
                ((HashMap) this.d).put(h09.b, h09);
                if (this.g) {
                    l(h09);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(h09);
                    } else {
                        f09 f09 = (f09) ((HashMap) this.e).get(h09);
                        if (f09 != null) {
                            f09.a.d(f09.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public void c(mne mne, long j2, TimeUnit timeUnit) {
        ((HashMap) this.d).put(mne, new usg(j2, timeUnit));
    }

    public void d(j4e j4e, float f2, RectF rectF, b8d b8d, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        s4e[] s4eArr;
        Path path2;
        Path path3;
        j09 j09 = this;
        j4e j4e2 = j4e;
        float f3 = f2;
        RectF rectF2 = rectF;
        b8d b8d2 = b8d;
        Path path4 = path;
        path.rewind();
        Path path5 = (Path) j09.e;
        path5.rewind();
        Path path6 = (Path) j09.i;
        path6.rewind();
        path6.addRect(rectF2, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i2 = 4;
            matrixArr = (Matrix[]) j09.c;
            fArr = (float[]) j09.k;
            matrixArr2 = (Matrix[]) j09.b;
            s4eArr = (s4e[]) j09.h;
            if (i3 >= 4) {
                break;
            }
            m04 m04 = i3 != 1 ? i3 != 2 ? i3 != 3 ? j4e2.f : j4e2.e : j4e2.h : j4e2.g;
            b59 b59 = i3 != 1 ? i3 != 2 ? i3 != 3 ? j4e2.b : j4e2.a : j4e2.d : j4e2.c;
            s4e s4e = s4eArr[i3];
            b59.getClass();
            b59.D(s4e, f3, m04.a(rectF2));
            int i4 = i3 + 1;
            float f4 = (float) ((i4 % 4) * 90);
            matrixArr2[i3].reset();
            PointF pointF = (PointF) j09.d;
            int i5 = i4;
            if (i3 == 1) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i3 == 2) {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i3 != 3) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f4);
            s4e s4e2 = s4eArr[i3];
            fArr[0] = s4e2.c;
            fArr[1] = s4e2.d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f4);
            i3 = i5;
            path5 = path3;
        }
        Path path7 = path5;
        int i6 = 0;
        while (i6 < i2) {
            s4e s4e3 = s4eArr[i6];
            fArr[0] = s4e3.a;
            fArr[1] = s4e3.b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path4.moveTo(fArr[0], fArr[1]);
            } else {
                path4.lineTo(fArr[0], fArr[1]);
            }
            s4eArr[i6].b(matrixArr2[i6], path4);
            if (b8d2 != null) {
                s4e s4e4 = s4eArr[i6];
                Matrix matrix = matrixArr2[i6];
                bh8 bh8 = (bh8) b8d2.a;
                BitSet bitSet = bh8.o;
                s4e4.getClass();
                bitSet.set(i6, false);
                s4e4.a(s4e4.f);
                bh8.b[i6] = new l4e(new ArrayList(s4e4.h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            s4e s4e5 = s4eArr[i6];
            fArr[0] = s4e5.c;
            fArr[1] = s4e5.d;
            matrixArr2[i6].mapPoints(fArr);
            s4e s4e6 = s4eArr[i8];
            float f5 = s4e6.a;
            float[] fArr2 = (float[]) j09.f;
            fArr2[0] = f5;
            fArr2[1] = s4e6.b;
            matrixArr2[i8].mapPoints(fArr2);
            int i9 = i7;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, c44.DEFAULT_ASPECT_RATIO);
            s4e s4e7 = s4eArr[i6];
            fArr[0] = s4e7.c;
            fArr[1] = s4e7.d;
            matrixArr2[i6].mapPoints(fArr);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            s4e s4e8 = (s4e) j09.j;
            s4e8.d(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 270.0f, c44.DEFAULT_ASPECT_RATIO);
            mz4 mz4 = i6 != 1 ? i6 != 2 ? i6 != 3 ? j4e2.j : j4e2.i : j4e2.l : j4e2.k;
            mz4.u(max, abs, f3, s4e8);
            Path path8 = (Path) j09.l;
            path8.reset();
            s4e8.b(matrixArr[i6], path8);
            if (!j09.g || (!mz4.t() && !j09.j(path8, i6) && !j09.j(path8, i8))) {
                path2 = path7;
                s4e8.b(matrixArr[i6], path4);
            } else {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = s4e8.a;
                fArr[1] = s4e8.b;
                matrixArr[i6].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                s4e8.b(matrixArr[i6], path2);
            }
            b8d b8d3 = b8d;
            if (b8d3 != null) {
                Matrix matrix2 = matrixArr[i6];
                bh8 bh82 = (bh8) b8d3.a;
                bh82.o.set(i6 + 4, false);
                s4e8.a(s4e8.f);
                bh82.c[i6] = new l4e(new ArrayList(s4e8.h), new Matrix(matrix2));
            }
            j09 = this;
            j4e2 = j4e;
            b8d2 = b8d3;
            path7 = path2;
            i6 = i9;
            i2 = 4;
            RectF rectF3 = rectF;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public ikf e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return ikf.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            g09 g09 = (g09) arrayList.get(i3);
            g09.d = i2;
            i2 += g09.a.o.b.p();
        }
        return new bqb(arrayList, (a9e) this.l);
    }

    public jkf f() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return jkf.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            h09 h09 = (h09) arrayList.get(i3);
            h09.d = i2;
            i2 += h09.a.o.e.p();
        }
        return new cqb(arrayList, (b9e) this.l);
    }

    public void g() {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.f).iterator();
                while (it.hasNext()) {
                    g09 g09 = (g09) it.next();
                    if (g09.c.isEmpty()) {
                        e09 e09 = (e09) ((HashMap) this.e).get(g09);
                        if (e09 != null) {
                            e09.a.b(e09.b);
                        }
                        it.remove();
                    }
                }
                return;
            default:
                Iterator it2 = ((HashSet) this.f).iterator();
                while (it2.hasNext()) {
                    h09 h09 = (h09) it2.next();
                    if (h09.c.isEmpty()) {
                        f09 f09 = (f09) ((HashMap) this.e).get(h09);
                        if (f09 != null) {
                            f09.a.d(f09.b);
                        }
                        it2.remove();
                    }
                }
                return;
        }
    }

    public void h(g09 g09) {
        if (g09.e && g09.c.isEmpty()) {
            e09 e09 = (e09) ((HashMap) this.e).remove(g09);
            e09.getClass();
            xj0 xj0 = e09.a;
            xj0.l(e09.b);
            m7f m7f = e09.c;
            xj0.o(m7f);
            xj0.n(m7f);
            ((HashSet) this.f).remove(g09);
        }
    }

    public void i(h09 h09) {
        if (h09.e && h09.c.isEmpty()) {
            f09 f09 = (f09) ((HashMap) this.e).remove(h09);
            f09.getClass();
            yj0 yj0 = f09.a;
            yj0.p(f09.b);
            wsb wsb = f09.c;
            yj0.s(wsb);
            yj0.r(wsb);
            ((HashSet) this.f).remove(h09);
        }
    }

    public boolean j(Path path, int i2) {
        Path path2 = (Path) this.m;
        path2.reset();
        ((s4e[]) this.h)[i2].b(((Matrix[]) this.b)[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hw4, vz8, java.lang.Object, m7f] */
    /* JADX WARNING: type inference failed for: r5v0, types: [sz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [dw4, java.lang.Object] */
    public void k(g09 g09) {
        ag8 ag8 = g09.a;
        zz8 zz8 = new zz8(this);
        ? obj = new Object();
        obj.o = this;
        obj.b = (uz8) this.j;
        obj.c = (fw4) this.k;
        obj.a = g09;
        ((HashMap) this.e).put(g09, new e09(ag8, zz8, obj));
        int i2 = t0g.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, (Handler.Callback) null);
        ag8.getClass();
        uz8 uz8 = ag8.c;
        uz8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        uz8.c.add(obj2);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, (Handler.Callback) null);
        fw4 fw4 = ag8.d;
        fw4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        fw4.c.add(obj3);
        ag8.h(zz8, (arf) this.m, (lpb) this.h);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [tz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [ew4, java.lang.Object] */
    public void l(h09 h09) {
        bg8 bg8 = h09.a;
        a09 a09 = new a09(this);
        wsb wsb = new wsb(this, h09, false);
        ((HashMap) this.e).put(h09, new f09(bg8, a09, wsb));
        Handler p = v0g.p((xp4) null);
        bg8.getClass();
        cs csVar = bg8.c;
        csVar.getClass();
        ? obj = new Object();
        obj.a = p;
        obj.b = wsb;
        ((CopyOnWriteArrayList) csVar.o).add(obj);
        Handler p2 = v0g.p((xp4) null);
        gw4 gw4 = bg8.d;
        gw4.getClass();
        ? obj2 = new Object();
        obj2.a = p2;
        obj2.b = wsb;
        gw4.c.add(obj2);
        bg8.l(a09, (brf) this.m, (mpb) this.h);
    }

    public void m(hug hug) {
        Handler handler = (Handler) this.k;
        if (!Intrinsics.areEqual((Object) handler.getLooper().getThread(), (Object) Thread.currentThread())) {
            handler.post(new kme(this, hug, 0));
        } else if (!this.g) {
            ((LinkedHashSet) this.f).add(hug);
        }
    }

    public void n(lt8 lt8) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        g09 g09 = (g09) identityHashMap.remove(lt8);
        g09.getClass();
        g09.a.k(lt8);
        g09.c.remove(((uf8) lt8).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        h(g09);
    }

    public void o(mt8 mt8) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        h09 h09 = (h09) identityHashMap.remove(mt8);
        h09.getClass();
        h09.a.o(mt8);
        h09.c.remove(((vf8) mt8).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        i(h09);
    }

    public void p(int i2, int i3) {
        switch (this.a) {
            case 0:
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    ArrayList arrayList = (ArrayList) this.b;
                    g09 g09 = (g09) arrayList.remove(i4);
                    ((HashMap) this.d).remove(g09.b);
                    int i5 = -g09.a.o.b.p();
                    for (int i6 = i4; i6 < arrayList.size(); i6++) {
                        ((g09) arrayList.get(i6)).d += i5;
                    }
                    g09.e = true;
                    if (this.g) {
                        h(g09);
                    }
                }
                return;
            default:
                for (int i7 = i3 - 1; i7 >= i2; i7--) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    h09 h09 = (h09) arrayList2.remove(i7);
                    ((HashMap) this.d).remove(h09.b);
                    int i8 = -h09.a.o.e.p();
                    for (int i9 = i7; i9 < arrayList2.size(); i9++) {
                        ((h09) arrayList2.get(i9)).d += i8;
                    }
                    h09.e = true;
                    if (this.g) {
                        i(h09);
                    }
                }
                return;
        }
    }

    public j09() {
        this.a = 2;
        this.h = new s4e[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.i = new Path();
        this.j = new s4e();
        this.k = new float[2];
        this.f = new float[2];
        this.l = new Path();
        this.m = new Path();
        this.g = true;
        for (int i2 = 0; i2 < 4; i2++) {
            ((s4e[]) this.h)[i2] = new s4e();
            ((Matrix[]) this.b)[i2] = new Matrix();
            ((Matrix[]) this.c)[i2] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [sz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [dw4, java.lang.Object] */
    public j09(ed5 ed5, vb4 vb4, Handler handler, lpb lpb) {
        this.a = 0;
        this.h = lpb;
        this.i = ed5;
        this.l = new a9e();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        uz8 uz8 = new uz8();
        this.j = uz8;
        fw4 fw4 = new fw4();
        this.k = fw4;
        this.e = new HashMap();
        this.f = new HashSet();
        vb4.getClass();
        ? obj = new Object();
        obj.a = handler;
        obj.b = vb4;
        uz8.c.add(obj);
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = vb4;
        fw4.c.add(obj2);
    }

    public j09(i09 i09, wb4 wb4, k7f k7f, mpb mpb) {
        this.a = 1;
        this.h = mpb;
        this.i = i09;
        this.l = new b9e();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.j = wb4;
        this.k = k7f;
        this.e = new HashMap();
        this.f = new HashSet();
    }
}
