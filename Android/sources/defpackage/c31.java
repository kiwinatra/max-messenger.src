package defpackage;

import kotlin.Lazy;
import org.json.JSONObject;

/* renamed from: c31  reason: default package */
public final class c31 {
    public final sp1 a;
    public final Lazy b;
    public final Lazy c;

    public c31(sp1 sp1, Lazy lazy, Lazy lazy2) {
        this.a = sp1;
        this.b = lazy;
        this.c = lazy2;
    }

    public final b31 a(fl1 fl1, wje wje, ep1 ep1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        wje wje2 = wje;
        jSONObject.put("is_video", wje2.b);
        fl1 fl12 = fl1;
        return new b31(sp1.a(this.a).call(new z21(fl1, jSONObject, c2, wje2, this, ep1, fVar)), fl1, true, false);
    }

    public final b31 b(dl1 dl1, wje wje, ep1 ep1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", dl1.r);
        wje wje2 = wje;
        jSONObject.put("is_video", wje2.b);
        return new b31(sp1.a(this.a).createConfRoom(new y21(jSONObject, c2, wje2, this, ep1, fVar, 0)), dl1, true, false);
    }

    public final long c() {
        return ((qjd) ((x23) ((ym1) ((um1) this.c.getValue())).a.getValue())).s();
    }

    public final b31 d(String str, boolean z, wje wje, ep1 ep1, f fVar) {
        String str2 = str;
        return new b31(sp1.a(this.a).joinByLink(new y21(str, c(), wje, this, ep1, fVar, 1)), new el1(str, z), !z, false);
    }
}
