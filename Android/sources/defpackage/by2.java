package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: by2  reason: default package */
public final /* synthetic */ class by2 implements Function1 {
    public final /* synthetic */ my2 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Map o;
    public final /* synthetic */ Set v;
    public final /* synthetic */ Set w;

    public /* synthetic */ by2(my2 my2, Set set, Set set2, Map map, Set set3, Set set4) {
        this.a = my2;
        this.b = set;
        this.c = set2;
        this.o = map;
        this.v = set3;
        this.w = set4;
    }

    public final Object invoke(Object obj) {
        boolean z;
        a32 a32 = (a32) obj;
        my2 my2 = this.a;
        my2.getClass();
        boolean contains = this.b.contains(Long.valueOf(a32.b.a));
        Lazy lazy = my2.o;
        Map map = this.o;
        if (contains || ((os2) lazy.getValue()).a(this.c, map, a32)) {
            if (!this.v.contains(Long.valueOf(a32.b.a)) && !((os2) lazy.getValue()).a(this.w, map, a32)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
