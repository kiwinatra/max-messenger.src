package defpackage;

import com.my.tracker.obfuscated.e0;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: stg  reason: default package */
public final /* synthetic */ class stg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ stg(e0 e0Var, String str, String str2, String str3, String str4, String str5, long j) {
        this.b = e0Var;
        this.c = str;
        this.o = str2;
        this.v = str3;
        this.x = str4;
        this.y = str5;
        this.w = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                long j = this.w;
                this.b.a(this.c, this.o, this.v, (String) this.x, (String) this.y, j);
                return;
            default:
                this.b.a((Map) this.x, (JSONObject) this.y, this.c, this.o, this.v, this.w);
                return;
        }
    }

    public /* synthetic */ stg(e0 e0Var, Map map, JSONObject jSONObject, String str, String str2, String str3, long j) {
        this.b = e0Var;
        this.x = map;
        this.y = jSONObject;
        this.c = str;
        this.o = str2;
        this.v = str3;
        this.w = j;
    }
}
