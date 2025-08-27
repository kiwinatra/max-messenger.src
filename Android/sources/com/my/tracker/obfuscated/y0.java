package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import java.net.InetAddress;
import org.json.JSONObject;

public final class y0 {
    boolean a = false;
    private x0 b = null;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String str2;
        x2.a("Ipv4DataProvider: get IPv4 address");
        try {
            s0.b a2 = s0.a(okHttpClientProvider).a(str);
            if (!a2.c()) {
                str2 = "Ipv4DataProvider: unsuccessful response from server: " + a2.a();
            } else {
                String str3 = (String) a2.b();
                if (TextUtils.isEmpty(str3)) {
                    str2 = "Ipv4DataProvider: empty response from server";
                } else {
                    String optString = new JSONObject(str3).optString("ip");
                    if (TextUtils.isEmpty(optString)) {
                        str2 = "Ipv4DataProvider: IP is empty";
                    } else {
                        x2.a("Ipv4DataProvider: IPv4 address is received " + optString);
                        this.b = new x0(InetAddress.getByName(optString).getAddress());
                        return;
                    }
                }
            }
            x2.a(str2);
        } catch (Throwable th) {
            x2.b("Ipv4DataProvider: failed to get IPv4 address", th);
        }
    }

    public x0 a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (!this.a) {
            this.a = true;
            m.b(new o6d((Object) this, (Object) str, (Object) okHttpClientProvider, 25));
        }
        return this.b;
    }
}
