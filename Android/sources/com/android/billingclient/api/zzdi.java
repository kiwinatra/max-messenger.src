package com.android.billingclient.api;

import android.content.Context;

final class zzdi {
    private static boolean zza = false;

    public static synchronized boolean zza(Context context) {
        synchronized (zzdi.class) {
            if (zza) {
                return false;
            }
            zza = true;
            return false;
        }
    }
}
