package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: po5  reason: default package */
public final class po5 implements ln5 {
    public final kn5 b = new kn5("ru.oneme.app.provider", (byte) 0);
    public final Context c;

    public po5(Context context) {
        this.c = context;
    }

    public static File g(String str, String str2) {
        File file = new File(str, str2);
        file.mkdirs();
        return file;
    }

    public static Uri s(String str) {
        if (cvg.A(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public final String b() {
        File externalCacheDir;
        if (Build.VERSION.SDK_INT <= 29 || (externalCacheDir = this.c.getExternalCacheDir()) == null) {
            return c();
        }
        File file = new File(externalCacheDir.getAbsolutePath());
        if (!file.exists() && !file.mkdirs()) {
            z68.n("po5", (IOException) null, "getAppBasePath: mkdirs fails!", Arrays.copyOf(new Object[0], 0));
        }
        return file.getAbsolutePath();
    }

    public final String c() {
        File file = new File(this.c.getCacheDir().getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final File d(long j) {
        return new File(g(b(), "audioCache"), wj6.j(j, "audio_", ".wav"));
    }

    public final File e(long j) {
        return new File(g(b(), "botCommands"), wj6.i(j, "botCommands"));
    }

    public final Uri f(Context context, File file) {
        return FileProvider.d(context, file, this.b.a);
    }

    public final File h(l20 l20) {
        File file;
        boolean A = cvg.A(l20.r);
        long j = l20.v;
        s10 s10 = l20.j;
        if (!A) {
            File file2 = new File(l20.r);
            if (file2.exists() && file2.length() == s10.b && file2.lastModified() == j) {
                return file2;
            }
        }
        long j2 = s10.a;
        String f = o5a.f(s10.c);
        String f2 = o5a.f(f);
        File j3 = j();
        int lastIndexOf = f2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = f2.substring(0, lastIndexOf);
            String substring2 = f2.substring(lastIndexOf);
            file = new File(j3, substring + "_" + j2 + substring2);
        } else {
            file = new File(j3, f2 + "_" + j2);
        }
        if (file.exists()) {
            return file;
        }
        File file3 = new File(j(), f);
        return (file3.exists() && file3.length() == s10.b && file3.lastModified() == j) ? file3 : cjf.y(j(), o5a.f(f));
    }

    public final File i(String str) {
        return new File(j(), o5a.f(str));
    }

    public final File j() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        File externalFilesDir = Build.VERSION.SDK_INT == 29 ? this.c.getExternalFilesDir(str) : Environment.getExternalStoragePublicDirectory(str);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "MAX");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final File k(long j) {
        return new File(g(b(), "gifCache"), wj6.i(j, "gif_"));
    }

    public final File l(String str) {
        return new File(m(), a81.m("gif_preview", str));
    }

    public final File m() {
        return g(b(), "imageCache");
    }

    public final File n(String str) {
        return r(str + ".mp4");
    }

    public final File o(String str, String str2) {
        String m = !cvg.A(str2) ? a81.m(".", str2) : "";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        return r(str + m);
    }

    public final File p(long j) {
        return new File(g(b(), "stickerCache"), wj6.i(j, "sticker_"));
    }

    public final File q() {
        File file = new File(b(), "showcase");
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    public final File r(String str) {
        return new File(g(b(), "upload"), o5a.f(str));
    }

    public final File t(long j) {
        return new File(j(), wj6.j(j, "video_", ".mp4"));
    }
}
