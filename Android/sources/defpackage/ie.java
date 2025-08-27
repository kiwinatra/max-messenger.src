package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;

/* renamed from: ie  reason: default package */
public abstract class ie {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<rla> cls = rla.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(n37.class.getName(), "okhttp.Http2");
        linkedHashMap.put(fef.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = MapsKt.toMap(linkedHashMap);
    }
}
