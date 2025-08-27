package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;

class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimationDrawable o;
    public final AnimationDrawable v;
    public final String w;
    public final String x;
    public boolean y;
    public View.OnClickListener z;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) ew3.b(context, nfc.mr_group_expand);
        this.o = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) ew3.b(context, nfc.mr_group_collapse);
        this.v = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(zw8.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(wlc.mr_controller_expand_group);
        this.w = string;
        this.x = context.getString(wlc.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new h(this));
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.z = onClickListener;
    }
}
