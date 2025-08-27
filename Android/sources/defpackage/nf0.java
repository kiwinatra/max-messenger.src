package defpackage;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import java.io.File;

/* renamed from: nf0  reason: default package */
public abstract class nf0 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final ydd d = new ydd(9);

    static {
        int i = tad.a;
        int i2 = tad.b;
        int i3 = tad.c;
        int i4 = tad.d;
        a = new int[]{i, i2, i3, i4};
        b = new int[]{i4, i2};
        c = new int[]{i3, i};
    }

    public static File a(po5 po5, String str) {
        File dir = po5.c.getDir("backgrounds", 0);
        File[] listFiles = dir.listFiles();
        if (listFiles != null && listFiles.length == 2) {
            File file = null;
            for (File file2 : listFiles) {
                if (file2.isFile() && (file == null || file2.lastModified() < file.lastModified())) {
                    file = file2;
                }
            }
            file.delete();
        }
        File file3 = new File(dir, String.valueOf(System.currentTimeMillis()));
        j4b.m(new File(str), file3);
        return file3;
    }

    public static String b(x23 x23, boolean z) {
        return z ? ((a33) x23).f("app.chat.background.dark.id", (String) null) : ((a33) x23).f("app.chat.background.light.id", (String) null);
    }

    public static Uri c(x23 x23, boolean z) {
        a33 a33 = (a33) x23;
        String string = z ? a33.g.getString("app.chat.background.uri.dark", (String) null) : a33.g.getString("app.chat.background.uri.light", (String) null);
        if (cvg.A(string)) {
            return null;
        }
        try {
            return Uri.parse(string);
        } catch (Exception unused) {
            z68.c("nf0", "getBackgroundUri: failed to parse uri: " + string, new Object[0]);
            return null;
        }
    }

    public static ColorDrawable d(Uri uri) {
        if (cvg.A(uri.getScheme()) || !uri.getScheme().equals("color")) {
            return null;
        }
        return new ColorDrawable(Color.parseColor(uri.getLastPathSegment()));
    }

    public static void e(String str, boolean z, x23 x23) {
        if (z) {
            ((a33) x23).l("app.chat.background.dark.id", str);
        } else {
            ((a33) x23).l("app.chat.background.light.id", str);
        }
    }

    public static void f(Uri uri, x23 x23, boolean z) {
        if (uri != null) {
            if (z) {
                ((a33) x23).i("app.chat.background.was.set.as.solid.color.dark", false);
            } else {
                ((a33) x23).i("app.chat.background.was.set.as.solid.color.light", false);
            }
        }
        String uri2 = uri != null ? uri.toString() : null;
        if (z) {
            ((a33) x23).l("app.chat.background.uri.dark", uri2);
        } else {
            ((a33) x23).l("app.chat.background.uri.light", uri2);
        }
    }
}
