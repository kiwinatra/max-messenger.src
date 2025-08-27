package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public final class f extends e {
    public final TextView H0;
    public final int I0;
    public final /* synthetic */ bw8 J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(bw8 bw8, View view) {
        super(bw8.v0, view, (ImageButton) view.findViewById(ufc.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ufc.mr_cast_volume_slider));
        this.J0 = bw8;
        this.H0 = (TextView) view.findViewById(ufc.mr_group_volume_route_name);
        Resources resources = bw8.v0.w0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(gec.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.I0 = (int) typedValue.getDimension(displayMetrics);
    }
}
