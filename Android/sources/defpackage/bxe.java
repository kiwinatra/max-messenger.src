package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: bxe  reason: default package */
public final class bxe {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final long c;

    public bxe(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static bxe a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new bxe(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new bxe(jSONObject.getLong("timestamp"), jSONObject.getString(ApiProtocol.KEY_TOKEN), jSONObject.getString("appVersion"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}
