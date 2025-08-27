package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gtb  reason: default package */
public final class gtb {
    public final SharedPreferences a;

    public gtb(Context context) {
        this.a = context.getSharedPreferences("webrtc-android-sdk-pref", 0);
    }
}
