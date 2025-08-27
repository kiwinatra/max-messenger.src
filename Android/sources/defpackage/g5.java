package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import com.yalantis.ucrop.util.MatrixUtils;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.messages.views.widgets.AvatarCropView;

/* renamed from: g5  reason: default package */
public final /* synthetic */ class g5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAvatarCrop b;

    public /* synthetic */ g5(ActAvatarCrop actAvatarCrop, int i) {
        this.a = i;
        this.b = actAvatarCrop;
    }

    public final void onClick(View view) {
        ActAvatarCrop actAvatarCrop = this.b;
        switch (this.a) {
            case 0:
                e44 e44 = (e44) actAvatarCrop.z0.getZoomableController();
                if (!e44.o) {
                    float f = e44.y0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{90.0f});
                    ofFloat.setDuration(250);
                    ofFloat.addUpdateListener(new v7d(e44, f, 2));
                    ofFloat.addListener(e44);
                    ofFloat.start();
                    actAvatarCrop.H0 = !actAvatarCrop.H0;
                    Matrix matrix = actAvatarCrop.G0;
                    Point point = actAvatarCrop.F0;
                    matrix.postRotate(90.0f, ((float) point.x) / 2.0f, ((float) point.y) / 2.0f);
                    return;
                }
                return;
            case 1:
                e44 e442 = (e44) actAvatarCrop.z0.getZoomableController();
                if (!e442.o) {
                    float matrixValue = MatrixUtils.getMatrixValue(e442.Y, 0);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{matrixValue, -matrixValue});
                    ofFloat2.setDuration(250);
                    ofFloat2.addUpdateListener(new z00(8, (Object) e442));
                    ofFloat2.addListener(e442);
                    ofFloat2.start();
                    Matrix matrix2 = actAvatarCrop.G0;
                    Point point2 = actAvatarCrop.F0;
                    matrix2.postScale(-1.0f, 1.0f, ((float) point2.x) / 2.0f, ((float) point2.y) / 2.0f);
                    return;
                }
                return;
            case 2:
                int i = ActAvatarCrop.I0;
                actAvatarCrop.finish();
                return;
            case 3:
                actAvatarCrop.H0 = false;
                AvatarCropView avatarCropView = actAvatarCrop.z0;
                e44 e443 = (e44) avatarCropView.getZoomableController();
                e443.reset();
                e443.e();
                if (avatarCropView.M0 > 0 && avatarCropView.N0 == 0) {
                    ((e44) avatarCropView.getZoomableController()).d(avatarCropView.M0);
                }
                avatarCropView.b(e443.Y);
                actAvatarCrop.G0.reset();
                actAvatarCrop.D0.setVisibility(8);
                return;
            default:
                int i2 = ActAvatarCrop.I0;
                ((qra) ((id3) actAvatarCrop.x.b)).getClass();
                sjd sjd = sjd.a;
                mka mka = new mka(2, new h5(0, actAvatarCrop));
                jbf z = sjd.z();
                z.getClass();
                mka.n(((kbf) z).a()).j(((kbf) sjd.z()).c()).l(new ao1(3, new i5(actAvatarCrop, 0), new i5(actAvatarCrop, 1)));
                return;
        }
    }
}
