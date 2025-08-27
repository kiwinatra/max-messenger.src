package defpackage;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.Map;

/* renamed from: d58  reason: default package */
public final class d58 extends cne {
    public final /* synthetic */ e58 X;
    public final /* synthetic */ bwb w;
    public final /* synthetic */ yvb x;
    public final /* synthetic */ qa7 y;
    public final /* synthetic */ CancellationSignal z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d58(e58 e58, zi0 zi0, bwb bwb, yvb yvb, bwb bwb2, yvb yvb2, qa7 qa7, CancellationSignal cancellationSignal) {
        super(zi0, bwb, yvb, "LocalThumbnailBitmapSdk29Producer");
        this.X = e58;
        this.w = bwb2;
        this.x = yvb2;
        this.y = qa7;
        this.z = cancellationSignal;
    }

    public final void b(Object obj) {
        y33.U((y33) obj);
    }

    public final Map c(Object obj) {
        return xb7.a("createdThumbnail", String.valueOf(((y33) obj) != null));
    }

    public final Object d() {
        String str;
        Bitmap bitmap;
        e58 e58 = this.X;
        qa7 qa7 = this.y;
        v3d v3d = qa7.i;
        int i = 2048;
        int i2 = v3d != null ? v3d.a : 2048;
        Uri uri = qa7.b;
        if (v3d != null) {
            i = v3d.b;
        }
        Size size = new Size(i2, i);
        try {
            e58.getClass();
            str = mzf.a(e58.c, uri);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        CancellationSignal cancellationSignal = this.z;
        if (str != null) {
            String a = n29.a(str);
            bitmap = a != null ? StringsKt__StringsJVMKt.startsWith$default(a, "video/", false, 2, (Object) null) : false ? ThumbnailUtils.createVideoThumbnail(new File(str), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(str), size, cancellationSignal);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = e58.c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmap == null) {
            return null;
        }
        CloseableStaticBitmap of = CloseableStaticBitmap.of(bitmap, (b4d) pf6.j(), (tac) bc7.d, 0);
        ik0 ik0 = (ik0) this.x;
        ik0.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        of.putExtras(ik0.w);
        return y33.p0(of);
    }

    public final void e() {
        super.e();
        this.z.cancel();
    }

    public final void f(Exception exc) {
        super.f(exc);
        bwb bwb = this.w;
        yvb yvb = this.x;
        bwb.e(yvb, "LocalThumbnailBitmapSdk29Producer", false);
        ((ik0) yvb).h("local", "thumbnail_bitmap");
    }

    public final void g(Object obj) {
        y33 y33 = (y33) obj;
        super.g(y33);
        boolean z2 = y33 != null;
        bwb bwb = this.w;
        yvb yvb = this.x;
        bwb.e(yvb, "LocalThumbnailBitmapSdk29Producer", z2);
        ((ik0) yvb).h("local", "thumbnail_bitmap");
    }
}
