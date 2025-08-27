package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

public final class u0 {
    private t0 a = null;
    protected boolean b = false;

    private static t0 b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            x2.a("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            x2.a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + isLimitAdTrackingEnabled);
            return new t0(id, isLimitAdTrackingEnabled);
        } catch (Throwable th) {
            x2.b("HuaweiAdInfoDataProvider: failed to get huawei AId", th);
            return null;
        }
    }

    public t0 a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
