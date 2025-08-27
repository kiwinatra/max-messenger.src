package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/widgets/TamAvatarView;", "Lie0;", "", "Lwcf;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TamAvatarView extends ie0 implements wcf {
    public scf y0;

    @JvmOverloads
    public TamAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void L0(scf scf) {
        this.y0 = scf;
        j(this.b);
    }

    public final void j(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(oad.c);
            if (findDrawableByLayerId != null) {
                iq.a0(findDrawableByLayerId, this.y0.n);
            }
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(oad.b);
            if (findDrawableByLayerId2 != null) {
                iq.a0(findDrawableByLayerId2, this.y0.l);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TamAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (!isInEditMode()) {
            setLayerType(2, (Paint) null);
            sp6 a = new tp6(getContext().getResources()).a();
            getContext();
            mv4 mv4 = new mv4(a);
            this.a = mv4;
            mv4.e().setCallback(this);
            sjd sjd = (sjd) o5a.R(context);
            this.o = sjd.s();
            this.w = (ce0) sjd.getAccessor().g(ce0.class);
            this.x = ((ltb) sjd.u()).a;
            this.v = sjd.g();
            this.y = (ptb) sjd.getAccessor().g(ptb.class);
        }
        scf scf = (scf) scf.e0.a.getValue();
        this.y0 = scf == null ? vi4.f0 : scf;
        this.y0 = j4b.k0(context);
    }
}
