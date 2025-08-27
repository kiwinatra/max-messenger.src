package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u80  reason: default package */
public final class u80 extends y2 {
    public final void b() {
        LinkedHashMap m = m();
        super.b();
        o(m);
    }

    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String f = f("auth.token.external.cache", (String) null);
        if (f != null) {
            linkedHashMap = new LinkedHashMap();
            try {
                JSONObject jSONObject = new JSONObject(f);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                z68.f(this.e, "getStringMap: failed", e);
            }
        }
        return linkedHashMap;
    }

    public final void n(Account account, String str, boolean z) {
        if (account != null) {
            l("auth.account.name", account.name);
        }
        l("auth.token", str);
        i("auth.account.external", z);
        if (z) {
            String f = f("auth.account.name", (String) null);
            if (f == null || f.length() == 0 || str == null || str.length() == 0) {
                z68.f(this.e, "cacheExternalToken: rejected", (Throwable) null);
                return;
            }
            LinkedHashMap m = m();
            m.put(f, str);
            o(m);
        }
    }

    public final void o(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            l("auth.token.external.cache", jSONObject.toString());
        } catch (JSONException e) {
            z68.f(this.e, "putStringMap: failed", e);
        }
    }
}
