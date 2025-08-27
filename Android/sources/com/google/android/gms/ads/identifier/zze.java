package com.google.android.gms.ads.identifier;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zze {
    public static final void zza(String str) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection.getResponseCode() >= 200) {
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } catch (IOException | RuntimeException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            throw th;
        }
    }
}
