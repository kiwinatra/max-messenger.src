package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class n {
    final AtomicBoolean a = new AtomicBoolean(false);
    final y2 b;
    final Context c;

    public n(y2 y2Var, Context context) {
        this.b = y2Var;
        this.c = context.getApplicationContext();
    }

    public boolean a() {
        if (this.a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(p1.a(this.c).h());
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else if (a()) {
            str2 = "AttributionHandler: attribution has already been received";
        } else {
            try {
                String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                if (TextUtils.isEmpty(queryParameter)) {
                    x2.a("AttributionHandler: deeplink is empty");
                    return;
                } else {
                    a(new JSONObject().put("deeplink", (Object) queryParameter));
                    return;
                }
            } catch (Throwable th) {
                x2.b("AttributionHandler error: handling referrer failed with error: ", th);
                return;
            }
        }
        x2.a(str2);
    }

    public void b(String str) {
        if (a()) {
            x2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (optJSONObject == null) {
                x2.a("AttributionHandler: empty attribution object has been returned");
            } else if (optJSONObject.has("error")) {
                int optInt = optJSONObject.optInt("error");
                x2.a("AttributionHandler: attribution response returned error " + optInt);
            } else {
                a(optJSONObject);
            }
        } catch (Throwable th) {
            x2.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            x2.a("AttributionHandler: deeplink is empty");
        } else if (!this.a.compareAndSet(false, true)) {
            x2.a("AttributionHandler: attribution has already been received");
        } else {
            p1 a2 = p1.a(this.c);
            if (!TextUtils.isEmpty(a2.h())) {
                x2.a("AttributionHandler: attribution has already been received");
                return;
            }
            a2.i(jSONObject.toString());
            MyTracker.AttributionListener d = this.b.d();
            if (d != null) {
                Handler c2 = this.b.c();
                if (c2 == null) {
                    c2 = m.a;
                }
                try {
                    c2.post(new l8g(22, d, MyTrackerAttribution.newAttribution(optString)));
                } catch (Throwable th) {
                    x2.b("AttributionHandler error: exception occurred while post runnable", th);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            x2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    public static n a(y2 y2Var, Context context) {
        return new n(y2Var, context);
    }
}
