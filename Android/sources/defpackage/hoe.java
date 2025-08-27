package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: hoe  reason: default package */
public final class hoe extends FrameLayout {
    public final y35 a;
    public ore b;
    public gpe c;

    public hoe(Context context) {
        super(context, (AttributeSet) null);
        y35 y35 = new y35(context);
        this.a = y35;
        setClipToPadding(false);
        addView((OneMeDraweeView) y35.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(gpe gpe) {
        gpe gpe2 = this.c;
        boolean z = true;
        if (gpe2 != null && gpe2.x == gpe.x && gpe2.y == gpe.y) {
            z = false;
        }
        this.c = gpe;
        ore ore = this.b;
        if (ore != null) {
            ore.f = gpe;
            ore.b();
        }
        String str = gpe.o;
        y35 y35 = this.a;
        y35.getClass();
        qa7 b2 = qa7.b(str);
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) y35.b;
        int i = OneMeDraweeView.z0;
        oneMeDraweeView.o(b2, (qa7) null);
        oneMeDraweeView.setVisibility(0);
        if (z) {
            requestLayout();
        }
    }

    public final ore getSizeConfigurator() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        ore ore = this.b;
        ft a2 = ore != null ? ore.a(i, i2) : null;
        if (a2 != null) {
            i = a2.b;
        }
        if (a2 != null) {
            i2 = a2.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(ore ore) {
        this.b = ore;
    }
}
