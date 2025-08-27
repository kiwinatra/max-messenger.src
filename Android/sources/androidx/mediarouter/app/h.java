package androidx.mediarouter.app;

import android.view.View;

public final class h implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton a;

    public h(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = !mediaRouteExpandCollapseButton.y;
        mediaRouteExpandCollapseButton.y = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.o);
            mediaRouteExpandCollapseButton.o.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.x);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.v);
            mediaRouteExpandCollapseButton.v.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.w);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.z;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
