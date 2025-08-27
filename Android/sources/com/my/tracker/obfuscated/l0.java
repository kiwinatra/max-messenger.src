package com.my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

public final class l0 {
    private k0 a;
    protected boolean b = false;

    private static k0 b(Context context) {
        x2.a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            x2.a("GoogleAdInfoDataProvider: AId: " + id);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            x2.a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + isLimitAdTrackingEnabled);
            return new k0(id, isLimitAdTrackingEnabled);
        } catch (Throwable th) {
            x2.b("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    public k0 a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
