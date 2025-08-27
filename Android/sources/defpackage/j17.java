package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: j17  reason: default package */
public class j17 extends l17 {
    public static final j17 n = new j17("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (ca6) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final ca6 j;
    public final List k;
    public final Map l;
    public final List m;

    public j17(String str, List list, List list2, List list3, List list4, List list5, List list6, ca6 ca6, List list7, boolean z, Map map, List list8) {
        super(str, z, list);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = ((h17) list2.get(i2)).a;
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
        this.j = ca6;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = ((f17) list.get(i2)).a;
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
                exe exe = (exe) list2.get(i4);
                if (exe.b == i2 && exe.c == i3) {
                    arrayList.add(obj);
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    public final Object a(List list) {
        return new j17(this.a, this.b, c(0, this.e, list), Collections.emptyList(), c(1, this.g, list), c(2, this.h, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}
