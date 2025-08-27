package ru.ok.messages.stickers;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgGifsLoader extends FrgBaseNonUi {
    public final Set B1 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ArrayList C1 = new ArrayList();
    public rla D1;
    public String E1;
    public String F1;
    public sd3 G1;
    public ao1 H1;
    public boolean I1;
    public boolean J1;

    public static sd3 h3(String str) {
        sd3 sd3 = new sd3();
        sd3.r("https");
        sd3.l("api.tenor.com");
        sd3.p("v1", 0, 2, false);
        sd3.p(str, 0, str.length(), false);
        sd3.b("key", "");
        String q = ((ltb) ((qra) ym.e()).n().b).a.q();
        if (cvg.A(q)) {
            q = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        sd3.b("locale", q);
        sd3.b("media_filter", "minimal");
        return sd3;
    }

    public static ArrayList m3(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("results");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            long j = jSONObject2.getLong("id");
            JSONObject jSONObject3 = jSONObject2.getJSONArray("media").getJSONObject(0);
            arrayList.add(new xr6(j, new ata(14, n3(jSONObject3.getJSONObject("tinygif")), n3(jSONObject3.getJSONObject("mp4")))));
        }
        return arrayList;
    }

    public static e n3(JSONObject jSONObject) {
        String string = jSONObject.getString("url");
        jSONObject.getString("preview");
        JSONArray jSONArray = jSONObject.getJSONArray("dims");
        return new e(string, jSONArray.getInt(0), jSONArray.getInt(1));
    }

    public final void i3(String str, ArrayList arrayList) {
        this.E1 = str;
        this.J1 = false;
        this.C1.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ld9.B().g(qa7.b(((e) ((xr6) it.next()).b.b).c), v87.a, uub.b);
        }
        l3();
    }

    public final void j3() {
        if (!this.I1 || this.C1.size() <= 0) {
            o3();
            this.I1 = true;
            sd3 h3 = h3("trending");
            this.G1 = h3;
            z68.c("ru.ok.messages.stickers.FrgGifsLoader", "loadInitial: url: %s", h3);
            k3(this.G1);
            return;
        }
        l3();
    }

    public final void k3(sd3 sd3) {
        if (this.D1 == null) {
            this.D1 = ((xpc) ((qra) ((id3) this.p1.b)).getAccessor().g(xpc.class)).a;
        }
        fce j = new mka(1, new ib4(21, this, sd3)).n(((kbf) ((qra) ((id3) this.p1.b)).H()).a()).j(qe.a());
        ao1 ao1 = new ao1(3, new lc5(17, (Object) this), new ip5(18));
        j.l(ao1);
        this.H1 = ao1;
    }

    public final void l3() {
        for (a2a y86 : this.B1) {
            y64.B(new y86(9, (Object) y86));
        }
    }

    public final void o3() {
        jbd.c(this.H1);
        this.H1 = null;
        this.E1 = null;
        this.I1 = false;
        this.J1 = true;
        this.F1 = null;
        this.C1.clear();
        l3();
    }

    public final void p3(String str) {
        if (!TextUtils.equals(str, this.F1)) {
            o3();
            this.F1 = str;
            sd3 h3 = h3("search");
            this.G1 = h3;
            h3.b("q", str);
            z68.c("ru.ok.messages.stickers.FrgGifsLoader", "search: url: " + this.G1.toString(), new Object[0]);
            k3(this.G1);
        }
    }
}
