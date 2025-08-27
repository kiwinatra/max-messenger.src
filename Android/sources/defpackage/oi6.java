package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import com.yalantis.ucrop.task.a;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* renamed from: oi6  reason: default package */
public final /* synthetic */ class oi6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgTamCropImage b;

    public /* synthetic */ oi6(FrgTamCropImage frgTamCropImage, int i) {
        this.a = i;
        this.b = frgTamCropImage;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FrgTamCropImage frgTamCropImage = this.b;
                ((qra) ((id3) frgTamCropImage.p1.b)).c().e("LOCAL_MEDIA_ROTATE");
                float width = frgTamCropImage.B1.getCropImageView().geDrawableCropRect().width();
                frgTamCropImage.B1.getCropImageView().postRotate(90.0f);
                OverlayView overlayView = frgTamCropImage.B1.getOverlayView();
                float f = 1.0f / overlayView.w;
                overlayView.w = f;
                RectF rectF = overlayView.a;
                overlayView.a(rectF, f);
                overlayView.b();
                q6b q6b = overlayView.K0;
                if (q6b != null) {
                    ((UCropView) q6b).a.setCropRect(rectF);
                }
                overlayView.postInvalidateOnAnimation();
                frgTamCropImage.B1.getCropImageView().postScale(frgTamCropImage.B1.getCropImageView().geDrawableCropRect().height() / width);
                frgTamCropImage.B1.getCropImageView().applyLimits(false);
                return;
            case 1:
                FrgTamCropImage frgTamCropImage2 = this.b;
                ((qra) ((id3) frgTamCropImage2.p1.b)).c().e("LOCAL_MEDIA_FLIP");
                frgTamCropImage2.B1.getCropImageView().flipHorizontally();
                frgTamCropImage2.B1.getCropImageView().applyLimits(false);
                return;
            case 2:
                this.b.B1.getCropImageView().resetCropState();
                return;
            case 3:
                this.b.U2();
                return;
            case 4:
                FrgTamCropImage frgTamCropImage3 = this.b;
                frgTamCropImage3.getClass();
                new qa3(1, new oi6(frgTamCropImage3, 5)).l(xfd.a()).i(qe.a()).j(new ao1(0, new pi6(frgTamCropImage3, 1), new oi6(frgTamCropImage3, 6)));
                return;
            case 5:
                FrgTamCropImage frgTamCropImage4 = this.b;
                frgTamCropImage4.B1.getCropImageView().crop(frgTamCropImage4.x.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
                return;
            case 6:
                FrgTamCropImage frgTamCropImage5 = this.b;
                m5 X2 = frgTamCropImage5.X2();
                if (X2 != null) {
                    Uri uri = (Uri) frgTamCropImage5.x.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI");
                    Uri uri2 = (Uri) frgTamCropImage5.x.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI");
                    if (uri == null || uri2 == null) {
                        frgTamCropImage5.i3();
                        return;
                    }
                    int maxBitmapSize = frgTamCropImage5.B1.getCropImageView().getMaxBitmapSize();
                    new a(X2, (Uri) frgTamCropImage5.x.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI"), (Uri) null, maxBitmapSize, maxBitmapSize, new er7(19, (Object) frgTamCropImage5)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                }
                return;
            default:
                this.b.i3();
                return;
        }
    }
}
