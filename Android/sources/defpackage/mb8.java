package defpackage;

import java.io.File;
import kotlin.text.Regex;
import one.me.rlottie.network.LottieCacheDirProvider;

/* renamed from: mb8  reason: default package */
public final class mb8 {
    public final LottieCacheDirProvider a;

    public mb8(LottieCacheDirProvider lottieCacheDirProvider) {
        this.a = lottieCacheDirProvider;
    }

    public static String a(String str) {
        return a81.m("lottie_cache_", new Regex("\\W+").replace((CharSequence) str, ""));
    }

    public final lb8 b(String str) {
        String str2;
        try {
            File cacheDir = this.a.getCacheDir();
            String a2 = a(str);
            File[] listFiles = cacheDir.listFiles(new kb8(a2));
            if (listFiles == null) {
                return null;
            }
            if (listFiles.length == 0) {
                return null;
            }
            File file = listFiles[0];
            String name = file.getName();
            if (name != null) {
                if (name.length() != 0) {
                    String str3 = a2 + "_origname_";
                    int l = StringsKt__StringsKt.indexOf$default((CharSequence) name, str3, 0, false, 6, (Object) null);
                    if (l != -1) {
                        str2 = name.substring(l + str3.length());
                        return new lb8(file, str2);
                    }
                }
            }
            str2 = null;
            return new lb8(file, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final File c(String str, String str2) {
        return new File(this.a.getCacheDir(), tr1.j(a(str), (str2 == null || str2.length() == 0) ? ".json" : "_origname_".concat(str2)));
    }
}
