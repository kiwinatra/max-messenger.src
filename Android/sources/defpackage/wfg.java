package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* renamed from: wfg  reason: default package */
public final class wfg {
    public final Lazy a;
    public final Lazy b;

    public wfg(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [hj7, java.lang.Object] */
    public static void a(wfg wfg, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        nd ndVar = (nd) wfg.a.getValue();
        Map createMapBuilder = MapsKt.createMapBuilder();
        Lazy lazy = wfg.b;
        createMapBuilder.put("sessionId", Long.valueOf(((a33) ((x23) lazy.getValue())).B()));
        createMapBuilder.put("botId", Long.valueOf(j));
        createMapBuilder.put("webAppName", str2);
        createMapBuilder.put("success", Integer.valueOf(z ? 1 : 0));
        createMapBuilder.put("type", Integer.valueOf(i));
        if (num != null) {
            createMapBuilder.put("method", num);
        }
        if (num2 != null) {
            createMapBuilder.put("code", num2);
        }
        Map build = MapsKt.build(createMapBuilder);
        ? obj = new Object();
        obj.v = "WEBAPP_BRIDGE";
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.a = System.currentTimeMillis();
        obj.w = str;
        obj.c(build);
        ndVar.j(obj.d());
    }
}
