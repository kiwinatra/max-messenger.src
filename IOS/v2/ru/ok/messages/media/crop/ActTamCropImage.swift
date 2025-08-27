package ru.ok.messages.media.crop;

import android.net.Uri;
import android.os.Bundle;

public class ActTamCropImage extends m5 {
    public q09 z0;

    public final String E() {
        return null;
    }

    public final scf K0() {
        if (this.z0 == null) {
            this.z0 = q09.f0;
        }
        return this.z0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ujc.act_tam_crop_image);
        L(this.z0.M);
        findViewById(lic.act_tam_crop_image__root).setBackgroundColor(K0().n);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.SOURCE_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.SOURCE_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.RESULT_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.CROP_STATE", (d44) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE"));
            bundle2.putBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG", booleanExtra);
            FrgTamCropImage frgTamCropImage = new FrgTamCropImage();
            frgTamCropImage.L2(bundle2);
            b59.c(v(), lic.act_tam_crop_image__container, frgTamCropImage, "ru.ok.messages.media.crop.FrgTamCropImage");
        }
    }
}
