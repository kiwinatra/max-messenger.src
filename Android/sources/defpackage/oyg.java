package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* renamed from: oyg  reason: default package */
public abstract class oyg {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
            return 6;
        }
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static BillingResult c(Intent intent, String str) {
        if (intent == null) {
            return wzf.j(6, "An internal error occurred.");
        }
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(a(str, intent.getExtras()));
        newBuilder.setDebugMessage(d(str, intent.getExtras()));
        return newBuilder.build();
    }

    public static String d(String str, Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            e(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            "Unexpected type for debug message: ".concat(obj.getClass().getName());
            return "";
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                str2.substring(0, min);
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static Purchase f(String str, String str2) {
        if (str == null || str2 == null) {
            e("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            return null;
        }
    }
}
