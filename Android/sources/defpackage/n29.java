package defpackage;

import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: n29  reason: default package */
public abstract class n29 {
    public static final Map a = MapsKt.mapOf(TuplesKt.to("mkv", "video/x-matroska"), TuplesKt.to("glb", "model/gltf-binary"));

    public static final String a(String str) {
        String lowerCase;
        int m = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        String substring = (m < 0 || m == str.length() + -1) ? null : str.substring(m + 1);
        if (substring == null || (lowerCase = substring.toLowerCase(Locale.US)) == null) {
            return null;
        }
        String str2 = (String) tq9.c.get(lowerCase);
        if (str2 == null) {
            str2 = tq9.a.getMimeTypeFromExtension(lowerCase);
        }
        return str2 == null ? (String) a.get(lowerCase) : str2;
    }
}
