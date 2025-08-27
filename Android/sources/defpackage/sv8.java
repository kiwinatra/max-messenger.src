package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: sv8  reason: default package */
public final class sv8 extends pzc {
    public final View D0;
    public final ImageView E0;
    public final ProgressBar F0;
    public final TextView G0;
    public final /* synthetic */ tv8 H0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sv8(tv8 tv8, View view) {
        super(view);
        this.H0 = tv8;
        this.D0 = view;
        this.E0 = (ImageView) view.findViewById(ufc.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(ufc.mr_picker_route_progress_bar);
        this.F0 = progressBar;
        this.G0 = (TextView) view.findViewById(ufc.mr_picker_route_name);
        zw8.j(tv8.X.y, progressBar);
    }
}
