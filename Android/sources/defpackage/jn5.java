package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: jn5  reason: default package */
public final class jn5 {
    public final String a;
    public final HashMap b = new HashMap();

    public jn5(String str) {
        this.a = str;
    }

    public static boolean a(String str, String str2) {
        String a2 = FileProvider.a(str);
        String a3 = FileProvider.a(str2);
        if (!a2.equals(a3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a3);
            sb.append('/');
            return a2.startsWith(sb.toString());
        }
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        } else {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
    }
}
