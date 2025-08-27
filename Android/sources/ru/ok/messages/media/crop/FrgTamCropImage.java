package ru.ok.messages.media.crop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgTamCropImage extends FrgBase {
    public UCropView B1;
    public ImageButton C1;
    public ImageButton D1;
    public ImageButton E1;
    public ImageButton F1;
    public TextView G1;

    public final void A2(View view, Bundle bundle) {
        UCropView uCropView = (UCropView) view.findViewById(lic.frg_tam_crop_image__iv_crop);
        this.B1 = uCropView;
        uCropView.getOverlayView().setFreestyleCropMode(1);
        this.B1.getCropImageView().setRotateEnabled(false);
        this.B1.getCropImageView().setMaxScaleMultiplier(4.0f);
        GestureCropImageView cropImageView = this.B1.getCropImageView();
        cud cud = ((qra) ((id3) this.p1.b)).y().b;
        cud.getClass();
        cropImageView.setMinImageSize((float) ((int) cud.r(PmsKey.f79minimagesidesize, (long) 64)));
        this.C1 = (ImageButton) view.findViewById(lic.frg_tam_crop_image__rotate);
        this.D1 = (ImageButton) view.findViewById(lic.frg_tam_crop_image__flip);
        this.G1 = (TextView) view.findViewById(lic.frg_tam_crop_image__btn_clear);
        this.E1 = (ImageButton) view.findViewById(lic.frg_tam_crop_image__btn_done);
        this.F1 = (ImageButton) view.findViewById(lic.frg_tam_crop_image__btn_close);
        Uri uri = (Uri) this.x.getParcelable("ru.ok.tamtam.extra.SOURCE_URI");
        Uri uri2 = (Uri) this.x.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
        z68.c("ru.ok.messages.media.crop.FrgTamCropImage", "onViewCreated:\nsourceUri: %s\nresultUri: %s", uri.toString(), uri2.toString());
        try {
            this.B1.getCropImageView().setImageUri(uri, uri2, bundle != null ? (d44) bundle.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : this.x.containsKey("ru.ok.tamtam.extra.CROP_STATE") ? (d44) this.x.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : null);
        } catch (Exception unused) {
            h3();
        }
        y64.n(this.C1, new oi6(this, 0));
        y64.n(this.D1, new oi6(this, 1));
        y64.n(this.G1, new oi6(this, 2));
        y64.n(this.F1, new oi6(this, 3));
        y64.n(this.E1, new oi6(this, 4));
        this.C1.setBackground(this.r1.d());
        this.D1.setBackground(this.r1.d());
        this.G1.setBackground(this.r1.e());
        this.E1.setBackground(this.r1.d());
        this.F1.setBackground(this.r1.d());
        this.C1.setColorFilter(this.r1.x);
        this.D1.setColorFilter(this.r1.x);
        this.E1.setColorFilter(this.r1.l);
        this.F1.setColorFilter(this.r1.x);
        TextView textView = this.G1;
        scf scf = this.r1;
        textView.setTextColor(i8b.j(scf.x, scf.N));
    }

    public final String V2() {
        return "CROP_IMAGE";
    }

    public final void h3() {
        m5 X2 = X2();
        if (X2 != null) {
            X2.setResult(0);
            int i = qad.t1;
            Handler handler = hi7.j;
            hi7.b0(0, X2, X2.getString(i));
            U2();
        }
    }

    public final void i3() {
        m5 X2 = X2();
        if (X2 != null) {
            Intent intent = new Intent();
            Uri uri = (Uri) this.x.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
            intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uri);
            z68.c("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: result: %s", uri.toString());
            Uri uri2 = (Uri) this.x.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI");
            if (uri2 != null) {
                z68.c("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: additionalResult: %s", uri2.toString());
                intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", uri2);
            }
            if (this.B1.getCropImageView().hasChanges()) {
                intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", this.B1.getCropImageView().getCropState());
            }
            X2.setResult(-1, intent);
            U2();
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(ujc.frg_tam_crop_image, viewGroup, false);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.CROP_STATE", this.B1.getCropImageView().getCropState());
    }
}
