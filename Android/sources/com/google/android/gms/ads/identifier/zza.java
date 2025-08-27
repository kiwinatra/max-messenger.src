package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

final class zza extends Thread {
    final /* synthetic */ Map zza;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zza = map;
    }

    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.zza;
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zze.zza(buildUpon.build().toString());
    }
}
