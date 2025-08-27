package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;

/* renamed from: d7d  reason: default package */
public final class d7d implements h3f, g3f {
    public static final TreeMap z = new TreeMap();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] o;
    public final String[] v;
    public final byte[][] w;
    public final int[] x;
    public int y;

    public d7d(int i) {
        this.a = i;
        int i2 = i + 1;
        this.x = new int[i2];
        this.c = new long[i2];
        this.o = new double[i2];
        this.v = new String[i2];
        this.w = new byte[i2][];
    }

    public static final d7d a(int i, String str) {
        TreeMap treeMap = z;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                d7d d7d = (d7d) ceilingEntry.getValue();
                d7d.b = str;
                d7d.y = i;
                return d7d;
            }
            Unit unit = Unit.INSTANCE;
            d7d d7d2 = new d7d(i);
            d7d2.b = str;
            d7d2.y = i;
            return d7d2;
        }
    }

    public final void T(double d, int i) {
        this.x[i] = 3;
        this.o[i] = d;
    }

    public final void X(int i) {
        this.x[i] = 1;
    }

    public final void close() {
    }

    public final void h(int i, String str) {
        this.x[i] = 4;
        this.v[i] = str;
    }

    public final void k(int i, long j) {
        this.x[i] = 2;
        this.c[i] = j;
    }

    public final void l(int i, byte[] bArr) {
        this.x[i] = 5;
        this.w[i] = bArr;
    }

    public final String m() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void n(g3f g3f) {
        int i = this.y;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.x[i2];
                if (i3 == 1) {
                    g3f.X(i2);
                } else if (i3 == 2) {
                    g3f.k(i2, this.c[i2]);
                } else if (i3 == 3) {
                    g3f.T(this.o[i2], i2);
                } else if (i3 == 4) {
                    String str = this.v[i2];
                    if (str != null) {
                        g3f.h(i2, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.w[i2];
                    if (bArr != null) {
                        g3f.l(i2, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void o() {
        TreeMap treeMap = z;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
