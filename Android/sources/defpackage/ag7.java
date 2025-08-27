package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ag7  reason: default package */
public final class ag7 extends gz {
    public final ak3 o;
    public final String v;

    public ag7(ak3 ak3, String str, boolean z, boolean z2) {
        super(b10.INLINE_KEYBOARD, z, z2);
        this.o = ak3;
        this.v = str;
    }

    public final HashMap a() {
        HashMap a = super.a();
        ArrayList arrayList = new ArrayList();
        for (List<yv0> it : (List) this.o.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (yv0 yv0 : it) {
                yv0.getClass();
                HashMap hashMap = new HashMap();
                String str = yv0.o;
                if (str != null) {
                    hashMap.put("url", str);
                }
                hashMap.put("type", yv0.a.a);
                hashMap.put("text", yv0.b);
                hashMap.put("intent", yv0.c.a);
                hashMap.put(ApiProtocol.PARAM_PAYLOAD, yv0.v);
                hashMap.put("isQuick", Boolean.valueOf(yv0.w));
                hashMap.put("contactId", Long.valueOf(yv0.x));
                arrayList2.add(hashMap);
            }
        }
        a.put("buttons", arrayList);
        return a;
    }
}
