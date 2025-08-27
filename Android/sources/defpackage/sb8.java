package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: sb8  reason: default package */
public final class sb8 implements lo0 {
    public final xe8 a = new xe8(4);
    public final int b = 0;
    public final int c;
    public final qqb o;
    public int v;

    public sb8(int i, v9a v9a) {
        this.c = i;
        this.o = v9a;
    }

    public final synchronized void a() {
        while (true) {
            if (this.v <= 0) {
                break;
            }
            Bitmap bitmap = (Bitmap) this.a.y();
            if (bitmap == null) {
                break;
            }
            this.a.getClass();
            this.v -= vo0.d(bitmap);
            this.o.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [gt0, java.lang.Object] */
    public final void b(Object obj) {
        boolean add;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int d = vo0.d(bitmap);
        if (d <= this.c) {
            this.o.getClass();
            xe8 xe8 = this.a;
            xe8.getClass();
            if (xe8.t(bitmap)) {
                synchronized (xe8) {
                    add = ((HashSet) xe8.b).add(bitmap);
                }
                if (add) {
                    jk3 jk3 = (jk3) xe8.c;
                    int d2 = vo0.d(bitmap);
                    synchronized (jk3) {
                        try {
                            gt0 gt0 = (gt0) ((SparseArray) jk3.a).get(d2);
                            gt0 gt02 = gt0;
                            if (gt0 == null) {
                                LinkedList linkedList = new LinkedList();
                                ? obj2 = new Object();
                                obj2.a = null;
                                obj2.b = d2;
                                obj2.c = linkedList;
                                obj2.d = null;
                                ((SparseArray) jk3.a).put(d2, obj2);
                                gt02 = obj2;
                            }
                            gt02.c.addLast(bitmap);
                            if (((gt0) jk3.b) != gt02) {
                                jk3.q(gt02);
                                gt0 gt03 = (gt0) jk3.b;
                                if (gt03 == null) {
                                    jk3.b = gt02;
                                    jk3.c = gt02;
                                } else {
                                    gt02.d = gt03;
                                    gt03.a = gt02;
                                    jk3.b = gt02;
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
            synchronized (this) {
                this.v += d;
            }
        }
    }

    public final Object get(int i) {
        Bitmap n;
        synchronized (this) {
            try {
                if (this.v > this.b) {
                    a();
                }
                n = this.a.n(i);
                if (n != null) {
                    this.a.getClass();
                    this.v -= vo0.d(n);
                    this.o.getClass();
                } else {
                    this.o.getClass();
                    n = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return n;
    }
}
