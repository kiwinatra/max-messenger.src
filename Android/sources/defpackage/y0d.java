package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* renamed from: y0d  reason: default package */
public abstract class y0d {
    public static void a(a1d a1d, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(a1d.a(a1d), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
