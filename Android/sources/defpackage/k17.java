package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: k17  reason: default package */
public final class k17 extends m17 {
    public static final k17 n = new k17("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (ea6) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final ea6 j;
    public final List k;
    public final Map l;
    public final List m;

    public k17(String str, List list, List list2, List list3, List list4, List list5, List list6, ea6 ea6, List list7, boolean z, Map map, List list8) {
        super(str, z, list);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = ((i17) list2.get(i2)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = ea6;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = ((g17) list.get(i2)).a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i2, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= list2.size()) {
                    break;
                }
                fxe fxe = (fxe) list2.get(i4);
                if (fxe.b == i2 && fxe.c == i3) {
                    arrayList.add(obj);
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    public final Object a(List list) {
        return new k17(this.a, this.b, c(0, this.e, list), Collections.emptyList(), c(1, this.g, list), c(2, this.h, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}
