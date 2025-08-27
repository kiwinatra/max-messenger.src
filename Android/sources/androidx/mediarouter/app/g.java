package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class g extends e {
    public final View H0;
    public final ImageView I0;
    public final ProgressBar J0;
    public final TextView K0;
    public final RelativeLayout L0;
    public final CheckBox M0;
    public final float N0;
    public final int O0;
    public final wld P0 = new wld(9, this);
    public final /* synthetic */ bw8 Q0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(bw8 bw8, View view) {
        super(bw8.v0, view, (ImageButton) view.findViewById(ufc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ufc.mr_cast_volume_slider));
        this.Q0 = bw8;
        this.H0 = view;
        this.I0 = (ImageView) view.findViewById(ufc.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(ufc.mr_cast_route_progress_bar);
        this.J0 = progressBar;
        this.K0 = (TextView) view.findViewById(ufc.mr_cast_route_name);
        this.L0 = (RelativeLayout) view.findViewById(ufc.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(ufc.mr_cast_checkbox);
        this.M0 = checkBox;
        dw8 dw8 = bw8.v0;
        Context context = dw8.w0;
        Drawable D = iq.D(context, nfc.mr_cast_checkbox);
        if (zw8.i(context)) {
            ru4.g(D, fw3.a(context, zw8.a));
        }
        checkBox.setButtonDrawable(D);
        zw8.j(dw8.w0, progressBar);
        this.N0 = zw8.d(dw8.w0);
        Resources resources = dw8.w0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(gec.mr_dynamic_dialog_row_height, typedValue, true);
        this.O0 = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean O(rw8 rw8) {
        if (rw8.g()) {
            return true;
        }
        grg b = this.Q0.v0.z.b(rw8);
        if (b != null) {
            fw8 fw8 = (fw8) b.b;
            if ((fw8 != null ? fw8.b : 1) == 3) {
                return true;
            }
        }
        return false;
    }

    public final void P(boolean z, boolean z2) {
        CheckBox checkBox = this.M0;
        int i = 0;
        checkBox.setEnabled(false);
        this.H0.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.I0.setVisibility(4);
            this.J0.setVisibility(0);
        }
        if (z2) {
            if (z) {
                i = this.O0;
            }
            this.Q0.E(this.L0, i);
        }
    }
}
