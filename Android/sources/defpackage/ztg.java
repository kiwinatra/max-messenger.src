package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ztg  reason: default package */
public final /* synthetic */ class ztg implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ JSONObject o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;

    public /* synthetic */ ztg(e0 e0Var, Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        this.a = e0Var;
        this.b = map;
        this.c = jSONObject;
        this.o = jSONObject2;
        this.v = str;
        this.w = j;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.o, this.v, this.w);
    }
}
