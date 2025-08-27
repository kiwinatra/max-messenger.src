package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: pj0  reason: default package */
public final /* synthetic */ class pj0 implements qk3 {
    public final /* synthetic */ vd8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long o;

    public /* synthetic */ pj0(vd8 vd8, long j, boolean z, long j2) {
        this.a = vd8;
        this.b = j;
        this.c = z;
        this.o = j2;
    }

    public final void accept(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = this.a.b;
        sj0 sj0 = (sj0) linkedHashMap.get(Long.valueOf(this.b));
        boolean z = this.c;
        if (sj0 != null) {
            e4 e4Var = sj0.a;
            if (z) {
                e4Var.z((ao0) map.get(zd8.a));
            } else {
                e4Var.z((ao0) map.get(zd8.c));
            }
            e4Var.B();
        }
        sj0 sj02 = (sj0) linkedHashMap.get(Long.valueOf(this.o));
        if (sj02 != null) {
            e4 e4Var2 = sj02.a;
            if (z) {
                e4Var2.z((ao0) map.get(zd8.b));
            } else {
                e4Var2.z((ao0) map.get(zd8.o));
            }
            e4Var2.B();
        }
    }
}
