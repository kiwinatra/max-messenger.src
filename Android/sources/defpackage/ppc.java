package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: ppc  reason: default package */
public final class ppc implements d8e {
    public final HashSet a = new HashSet();

    public final void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((d8e) it.next()).onRateCall(jSONObject);
        }
    }
}
