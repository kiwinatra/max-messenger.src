package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: qs7  reason: default package */
public final class qs7 implements lx0 {
    public final LinkedHashMap a;

    public qs7(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ps7(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = kotlin.text.StringsKt.toIntOrNull(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.jr8 e(java.lang.String r1) {
        /*
            android.net.Uri r1 = android.net.Uri.parse(r1)
            pf6 r0 = defpackage.jr8.a
            r0.getClass()
            java.lang.String r0 = "MediaItemType"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x001c
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            if (r1 == 0) goto L_0x001c
            int r1 = r1.intValue()
            goto L_0x001d
        L_0x001c:
            r1 = -1
        L_0x001d:
            jr8 r1 = defpackage.pf6.h(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs7.e(java.lang.String):jr8");
    }

    public final void a(bx0 bx0, yx0 yx0) {
        ps7 ps7 = (ps7) this.a.get(e(yx0.a));
        if (ps7 != null) {
            ps7.a(bx0, yx0);
        }
    }

    public final void b(bx0 bx0, yx0 yx0) {
        ps7 ps7 = (ps7) this.a.get(e(yx0.a));
        if (ps7 != null) {
            ps7.b(bx0, yx0);
        }
    }

    public final void c(bx0 bx0, String str, long j, long j2) {
        ps7 ps7 = (ps7) this.a.get(e(str));
        if (ps7 != null) {
            ps7.c(bx0, str, j, j2);
        }
    }

    public final void d(bx0 bx0, yx0 yx0, wae wae) {
        a(bx0, yx0);
        b(bx0, wae);
    }
}
