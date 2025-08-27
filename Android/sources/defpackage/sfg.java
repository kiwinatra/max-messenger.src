package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* renamed from: sfg  reason: default package */
public final class sfg {
    public final Lazy a;
    public final Lazy b;

    public sfg(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [hj7, java.lang.Object] */
    public final void a(lfg lfg, long j, String str, kfg kfg, n22 n22, String str2) {
        nd ndVar = (nd) this.a.getValue();
        Map createMapBuilder = MapsKt.createMapBuilder();
        Lazy lazy = this.b;
        createMapBuilder.put("sessionId", Long.valueOf(((a33) ((x23) lazy.getValue())).B()));
        createMapBuilder.put("botId", Long.valueOf(j));
        createMapBuilder.put("webAppName", str);
        createMapBuilder.put("entryPoint", Integer.valueOf(kfg.b));
        createMapBuilder.put("sourceType", Integer.valueOf(n22.a));
        Long a2 = n22.a();
        if (a2 != null) {
            createMapBuilder.put("sourceId", Long.valueOf(a2.longValue()));
        }
        if (str2 != null) {
            createMapBuilder.put("label", str2);
        }
        Map build = MapsKt.build(createMapBuilder);
        ? obj = new Object();
        obj.v = "WEBAPP_ACTION";
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.w = lfg.a;
        obj.a = System.currentTimeMillis();
        obj.c(build);
        ndVar.j(obj.d());
    }
}
