package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;

public abstract class e extends pzc {
    public rw8 D0;
    public final ImageButton E0;
    public final MediaRouteVolumeSlider F0;
    public final /* synthetic */ dw8 G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(dw8 dw8, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int i;
        int i2;
        this.G0 = dw8;
        this.E0 = imageButton;
        this.F0 = mediaRouteVolumeSlider;
        Context context = dw8.w0;
        int i3 = nfc.mr_cast_mute_button;
        int i4 = zw8.a;
        Drawable D = iq.D(context, i3);
        if (zw8.i(context)) {
            ru4.g(D, fw3.a(context, zw8.a));
        }
        imageButton.setImageDrawable(D);
        Context context2 = dw8.w0;
        if (zw8.i(context2)) {
            i = fw3.a(context2, qdc.mr_cast_progressbar_progress_and_thumb_light);
            i2 = fw3.a(context2, qdc.mr_cast_progressbar_background_light);
        } else {
            i = fw3.a(context2, qdc.mr_cast_progressbar_progress_and_thumb_dark);
            i2 = fw3.a(context2, qdc.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(i, i2);
    }

    public final void M(rw8 rw8) {
        this.D0 = rw8;
        int i = rw8.o;
        boolean z = i == 0;
        ImageButton imageButton = this.E0;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new wld(7, this));
        rw8 rw82 = this.D0;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.F0;
        mediaRouteVolumeSlider.setTag(rw82);
        mediaRouteVolumeSlider.setMax(rw8.p);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.G0.D0);
    }

    public final void N(boolean z) {
        ImageButton imageButton = this.E0;
        if (imageButton.isActivated() != z) {
            imageButton.setActivated(z);
            dw8 dw8 = this.G0;
            if (z) {
                dw8.G0.put(this.D0.c, Integer.valueOf(this.F0.getProgress()));
            } else {
                dw8.G0.remove(this.D0.c);
            }
        }
    }
}
