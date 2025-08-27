package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: x54  reason: default package */
public final class x54 implements so5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final ata i;
    public final uq8 j;
    public final Uri k;
    public final l7c l;
    public final List m;

    public x54(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, l7c l7c, ata ata, uq8 uq8, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = l7c;
        this.i = ata;
        this.k = uri;
        this.j = uq8;
        this.m = arrayList;
    }

    public final Object a(List list) {
        x54 x54 = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new exe());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (i2 < x54.m.size()) {
            if (((exe) linkedList.peek()).a != i2) {
                long c2 = x54.c(i2);
                if (c2 != -9223372036854775807L) {
                    j2 += c2;
                }
            } else {
                fcb b2 = x54.b(i2);
                List list2 = b2.c;
                exe exe = (exe) linkedList.poll();
                int i3 = exe.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = exe.b;
                    r9 r9Var = (r9) list2.get(i4);
                    List list3 = r9Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((w2d) list3.get(exe.c));
                        exe = (exe) linkedList.poll();
                        if (!(exe.a == i3 && exe.b == i4)) {
                            List list4 = list2;
                            arrayList2.add(new r9(r9Var.a, r9Var.b, arrayList3, r9Var.d, r9Var.e, r9Var.f));
                        }
                        arrayList3.add((w2d) list3.get(exe.c));
                        exe = (exe) linkedList.poll();
                        break;
                    } while (exe.b == i4);
                    List list42 = list2;
                    arrayList2.add(new r9(r9Var.a, r9Var.b, arrayList3, r9Var.d, r9Var.e, r9Var.f));
                    if (exe.a != i3) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(exe);
                arrayList.add(new fcb(b2.a, b2.b - j2, arrayList2, b2.d));
            }
            i2++;
            x54 = this;
        }
        long j3 = x54.b;
        return new x54(x54.a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, x54.c, x54.d, x54.e, x54.f, x54.g, x54.h, x54.l, x54.i, x54.j, x54.k, arrayList);
    }

    public final fcb b(int i2) {
        return (fcb) this.m.get(i2);
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
            j3 = ((fcb) list.get(i2)).b;
        } else {
            j2 = ((fcb) list.get(i2 + 1)).b;
            j3 = ((fcb) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return t0g.D(c(i2));
    }
}
