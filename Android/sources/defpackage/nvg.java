package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: nvg  reason: default package */
public final class nvg extends BroadcastReceiver {
    public Context a;
    public final ox0 b;

    public nvg(ox0 ox0) {
        this.b = ox0;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            ((haf) this.b.b).getClass();
            throw null;
        }
    }
}
