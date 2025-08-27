package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.views.widgets.SquareFrameLayout;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: pf2  reason: default package */
public final class pf2 extends SquareFrameLayout implements phf {
    public final ColorDrawable a;
    public final OneMeDraweeView b;
    public final Lazy c;

    public pf2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ColorDrawable colorDrawable = new ColorDrawable(fu4.k.e(getContext()).f().c().h);
        this.a = colorDrawable;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tp6 tp6 = new tp6(oneMeDraweeView.getResources());
        tp6.d = colorDrawable;
        oneMeDraweeView.setHierarchy(tp6.a());
        this.b = oneMeDraweeView;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new s2(17, (Object) context, (Object) this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(oneMeDraweeView);
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setColor(k2b.c().h);
    }

    public final void setItem(l29 l29) {
        qa7 qa7;
        Uri uri;
        if (!l29.X && (uri = l29.o) != null) {
            ra7 d = ra7.d(uri);
            d.i = true;
            qa7 = d.a();
        } else {
            qa7 = null;
        }
        Uri uri2 = l29.z;
        qa7 a2 = uri2 != null ? ra7.d(uri2).a() : null;
        OneMeDraweeView oneMeDraweeView = this.b;
        oneMeDraweeView.setBackground((Drawable) null);
        oneMeDraweeView.o(qa7, a2);
        int ordinal = l29.v.ordinal();
        Lazy lazy = this.c;
        if (ordinal != 0) {
            if (ordinal == 1) {
                VideoInfoTextView videoInfoTextView = (VideoInfoTextView) lazy.getValue();
                Long l = l29.w;
                videoInfoTextView.j(l != null ? l.longValue() : 0);
                videoInfoTextView.setVisibility(0);
            } else if (ordinal == 2) {
                VideoInfoTextView videoInfoTextView2 = (VideoInfoTextView) lazy.getValue();
                videoInfoTextView2.k();
                videoInfoTextView2.setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (lazy.isInitialized()) {
            ((VideoInfoTextView) lazy.getValue()).setVisibility(8);
        }
    }
}
