package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* renamed from: gyc  reason: default package */
public final /* synthetic */ class gyc {
    public final /* synthetic */ an5 a;

    public /* synthetic */ gyc(an5 an5) {
        this.a = an5;
    }

    public final MediaMuxer a(int i, a0 a0Var) {
        Uri uri = Uri.EMPTY;
        an5 an5 = this.a;
        if (an5 instanceof an5) {
            File file = an5.b.c;
            File parentFile = file.getParentFile();
            if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
                file.getAbsolutePath();
            }
            MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
            ((lyc) a0Var.b).J = Uri.fromFile(file);
            return mediaMuxer;
        }
        throw new AssertionError("Invalid output options type: ".concat(an5.getClass().getSimpleName()));
    }
}
