package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: yv8  reason: default package */
public final class yv8 extends pzc {
    public final View D0;
    public final ImageView E0;
    public final ProgressBar F0;
    public final TextView G0;
    public final float H0;
    public rw8 I0;
    public final /* synthetic */ bw8 J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv8(bw8 bw8, View view) {
        super(view);
        this.J0 = bw8;
        this.D0 = view;
        this.E0 = (ImageView) view.findViewById(ufc.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(ufc.mr_cast_group_progress_bar);
        this.F0 = progressBar;
        this.G0 = (TextView) view.findViewById(ufc.mr_cast_group_name);
        this.H0 = zw8.d(bw8.v0.w0);
        zw8.j(bw8.v0.w0, progressBar);
    }
}
