package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

public abstract class s0 {

    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    public static final class b {
        boolean a;
        Object b;
        String c;

        private b() {
        }

        public static b d() {
            return new b();
        }

        public String a() {
            return this.c;
        }

        public Object b() {
            return this.b;
        }

        public boolean c() {
            return this.a;
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public abstract b a(String str);

    public static s0 a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new j1(okHttpClientProvider);
            } catch (Throwable th) {
                x2.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new q0();
    }

    public static s0 a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new k1(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                x2.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new r0(aVar, z);
    }
}
