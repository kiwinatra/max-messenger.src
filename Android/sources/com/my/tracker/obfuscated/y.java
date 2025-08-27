package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

public final class y {
    private final e0 a;

    private y(e0 e0Var) {
        this.a = e0Var;
    }

    public String a(Intent intent) {
        x2.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            x2.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                x2.a("DeeplinkHandler: intent data is null");
                return null;
            }
            x2.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                x2.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                x2.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            x2.a("DeeplinkHandler: deeplink " + queryParameter);
            x2.a("DeeplinkHandler: clickId " + queryParameter2);
            this.a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            x2.b("DeeplinkHandler error: ", th);
            return null;
        }
    }

    public static y a(e0 e0Var) {
        return new y(e0Var);
    }
}
