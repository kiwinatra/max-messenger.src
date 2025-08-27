package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cna  reason: default package */
public final class cna {
    public String a;
    public int b;
    public String c;
    public int d;
    public long e;
    public String f;
    public boolean g;
    public ArrayList h;
    public ArrayList i;

    public final dna a() {
        String str = this.a;
        int i2 = this.b;
        String str2 = this.c;
        int i3 = this.d;
        long j = this.e;
        String str3 = this.g ? this.f : null;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List list = this.h;
        if (list == null) {
            list = Collections.emptyList();
        }
        List list2 = list;
        List list3 = this.i;
        if (list3 == null) {
            list3 = Collections.emptyList();
        }
        List list4 = list3;
        b();
        if (str == null) {
            throw new IllegalStateException("Collector not set");
        } else if (str2 != null) {
            return new dna(str, i2, str2, i3, j, str3, emptyList, emptyList2, list2, list4);
        } else {
            throw new IllegalStateException("Operation not set");
        }
    }

    public final void b() {
        this.a = null;
        this.b = -1;
        this.c = null;
        this.d = 1;
        this.e = 0;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
    }

    public final void c(String str, String str2) {
        int indexOf;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.i;
        if (str2 == null) {
            if (arrayList != null && (indexOf = arrayList.indexOf(str)) >= 0) {
                arrayList.remove(indexOf);
                arrayList2.remove(indexOf);
            }
        } else if (arrayList != null) {
            int indexOf2 = arrayList.indexOf(str);
            if (indexOf2 >= 0) {
                arrayList2.set(indexOf2, str2);
                return;
            }
            arrayList.add(str);
            arrayList2.add(str2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList3.add(str);
            arrayList4.add(str2);
            this.h = arrayList3;
            this.i = arrayList4;
        }
    }

    public final void d(long j) {
        if (j >= 0) {
            this.e = j;
            return;
        }
        throw new IllegalArgumentException(wj6.i(j, "Illegal time "));
    }
}
