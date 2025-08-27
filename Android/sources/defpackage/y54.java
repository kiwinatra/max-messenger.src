package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: y54  reason: default package */
public final class y54 implements to5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final te4 i;
    public final uq8 j;
    public final Uri k;
    public final m7c l;
    public final List m;

    public y54(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, m7c m7c, te4 te4, uq8 uq8, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = m7c;
        this.i = te4;
        this.k = uri;
        this.j = uq8;
        this.m = arrayList;
    }

    public final Object a(List list) {
        long j2;
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new fxe(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j4 = 0;
        int i2 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i2 >= this.m.size()) {
                break;
            }
            if (((fxe) linkedList.peek()).a != i2) {
                long c2 = c(i2);
                if (c2 != -9223372036854775807L) {
                    j4 += c2;
                }
                j3 = j4;
                arrayList = arrayList3;
            } else {
                gcb b2 = b(i2);
                List list2 = b2.c;
                fxe fxe = (fxe) linkedList.poll();
                int i3 = fxe.a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i4 = fxe.b;
                    s9 s9Var = (s9) list2.get(i4);
                    List list3 = s9Var.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((x2d) list3.get(fxe.c));
                        fxe = (fxe) linkedList.poll();
                        if (!(fxe.a == i3 && fxe.b == i4)) {
                            int i5 = s9Var.b;
                            List list4 = s9Var.d;
                            arrayList2 = arrayList3;
                            j3 = j4;
                            arrayList4.add(new s9(s9Var.a, i5, arrayList5, list4, s9Var.e, s9Var.f));
                        }
                        arrayList5.add((x2d) list3.get(fxe.c));
                        fxe = (fxe) linkedList.poll();
                        break;
                    } while (fxe.b == i4);
                    int i52 = s9Var.b;
                    List list42 = s9Var.d;
                    arrayList2 = arrayList3;
                    j3 = j4;
                    arrayList4.add(new s9(s9Var.a, i52, arrayList5, list42, s9Var.e, s9Var.f));
                    if (fxe.a != i3) {
                        break;
                    }
                    arrayList3 = arrayList2;
                    j4 = j3;
                }
                linkedList.addFirst(fxe);
                arrayList = arrayList2;
                arrayList.add(new gcb(b2.a, b2.b - j3, arrayList4, b2.d));
            }
            i2++;
            arrayList3 = arrayList;
            j4 = j3;
        }
        long j5 = j4;
        ArrayList arrayList6 = arrayList3;
        long j6 = this.b;
        if (j6 != -9223372036854775807L) {
            j2 = j6 - j5;
        }
        y54 y54 = r4;
        y54 y542 = new y54(this.a, j2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
        return y54;
    }

    public final gcb b(int i2) {
        return (gcb) this.m.get(i2);
    }

    public final long c(int i2) {
        long j2;
        long j3;
        List list = this.m;
        if (i2 == list.size() - 1) {
            j2 = this.b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((gcb) list.get(i2)).b;
        } else {
            j2 = ((gcb) list.get(i2 + 1)).b;
            j3 = ((gcb) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return v0g.S(c(i2));
    }
}
