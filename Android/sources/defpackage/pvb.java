package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: pvb  reason: default package */
public final class pvb {
    public final Executor a;
    public ub0 b;
    public sq6 c;
    public er7 d;
    public ejd e;
    public t9a f;
    public gga g;
    public v9a h;
    public sx6 i;
    public final ykb j;
    public final boolean k;

    public pvb(Executor executor) {
        ykb ykb = nn4.a;
        if (nn4.a.g(LowMemoryQuirk.class) != null) {
            this.a = new tsd(executor);
        } else {
            this.a = executor;
        }
        this.j = ykb;
        this.k = ykb.e(IncorrectJpegMetadataQuirk.class);
    }

    public final qb0 a(qb0 qb0, int i2) {
        bs0.r((String) null, ld9.H(qb0.c));
        this.f.getClass();
        byte[] bArr = (byte[]) qb0.a;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            Rect rect = qb0.e;
            Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
            na5 na5 = qb0.b;
            Objects.requireNonNull(na5);
            Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
            RectF rectF = grf.a;
            Matrix matrix = new Matrix(qb0.g);
            matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
            Size size = new Size(decodeRegion.getWidth(), decodeRegion.getHeight());
            it1 it1 = qb0.h;
            if (it1 != null) {
                this.e.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeRegion.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Objects.requireNonNull(na5);
                return new qb0(byteArray, na5, (Build.VERSION.SDK_INT < 34 || !wn0.d(decodeRegion)) ? 256 : 4101, size, rect2, qb0.f, matrix, it1);
            }
            throw new NullPointerException("Null cameraCaptureResult");
        } catch (IOException e2) {
            throw new Exception("Failed to decode JPEG.", e2);
        }
    }

    public final ha7 b(vb0 vb0) {
        qvb qvb = vb0.a;
        qb0 qb0 = (qb0) this.c.o(vb0);
        if ((qb0.c == 35 || this.k) && this.b.d == 256) {
            qb0 qb02 = (qb0) this.d.D(new bb0(qb0, qvb.d));
            this.h.getClass();
            Size size = qb02.d;
            obd obd = new obd(b59.n(size.getWidth(), size.getHeight(), 256, 2));
            ha7 a2 = ImageProcessingUtil.a(obd, (byte[]) qb02.a);
            obd.a();
            Objects.requireNonNull(a2);
            na5 na5 = qb02.b;
            Objects.requireNonNull(na5);
            sb6 sb6 = (sb6) a2;
            Size size2 = new Size(sb6.getWidth(), sb6.getHeight());
            sb6.n0();
            qb0 = new qb0(a2, na5, sb6.n0(), size2, qb02.e, qb02.f, qb02.g, qb02.h);
        }
        this.g.getClass();
        ha7 ha7 = (ha7) qb0.a;
        dyd dyd = new dyd(ha7, qb0.d, new cb0(ha7.getImageInfo().d(), ha7.getImageInfo().getTimestamp(), qb0.f, qb0.g));
        dyd.b(qb0.e);
        return dyd;
    }
}
