package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: s87  reason: default package */
public final class s87 extends OneMeDraweeView {
    public static final /* synthetic */ KProperty[] H0;
    public static final z35 I0 = new z35();
    public final r87 A0 = new r87(this, 1);
    public final r87 B0 = new r87((Object) p87.m, this);
    public Function0 C0 = new a46(22);
    public final r87 D0 = new r87(this, 0);
    public int E0;
    public int F0;
    public final Lazy G0;

    static {
        Class<s87> cls = s87.class;
        H0 = new KProperty[]{rae.s(cls, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;", 0), rae.s(cls, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;", 0), rae.s(cls, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;", 0)};
    }

    public s87(Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        this.G0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new p35(context, 6));
        setId(cwa.M);
        ig5 ig5 = ((sp6) getHierarchy()).e;
        ig5.Z = 0;
        if (ig5.Y == 1) {
            ig5.Y = 0;
        }
    }

    /* access modifiers changed from: private */
    public final void setup(p87 p87) {
        qa7 qa7;
        sp6 sp6 = (sp6) getHierarchy();
        sp6.h(p87.i);
        boolean z = p87.j;
        sp6.k(z ? (Drawable) this.G0.getValue() : getOverlayDrawable());
        qa7 qa72 = null;
        v3d v3d = p87.h;
        if (z) {
            qa7 = null;
        } else {
            ra7 d = ra7.d(p87.b);
            d.d = v3d;
            qa7 = d.a();
        }
        Uri uri = p87.g;
        if (uri != null) {
            ra7 d2 = ra7.d(uri);
            d2.d = v3d;
            qa72 = d2.a();
        }
        o(qa7, qa72);
    }

    public final p87 getImageAttach() {
        return (p87) this.B0.getValue(this, H0[1]);
    }

    public final k97 getImageInfo() {
        return (k97) this.D0.getValue(this, H0[2]);
    }

    public final int getMeasuredLayoutHeight() {
        return this.E0;
    }

    public final int getMeasuredLayoutWidth() {
        return this.F0;
    }

    public final Function0<Unit> getOnFinalImageSetCallback() {
        return this.C0;
    }

    public final Drawable getOverlayDrawable() {
        return (Drawable) this.A0.getValue(this, H0[0]);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i5 = getImageAttach().c;
        int i6 = getImageAttach().d;
        if (i5 <= 0 || i6 <= 0) {
            i3 = size / 2;
            i4 = size;
        } else {
            i4 = i5;
            i3 = i6;
        }
        int i7 = getImageAttach().f;
        int roundToInt = MathKt.roundToInt(((float) 120) * vo4.c().getDisplayMetrics().density);
        z35 z35 = I0;
        kv0.T(size, size, i4, i3, roundToInt, i7, z35);
        this.E0 = z35.c;
        this.F0 = z35.b;
        setMeasuredDimension(z35.d, z35.e);
    }

    public final void p(k97 k97, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(k97);
        this.C0.invoke();
    }

    public final void setImageAttach(p87 p87) {
        this.B0.setValue(this, H0[1], p87);
    }

    public final void setImageInfo(k97 k97) {
        this.D0.setValue(this, H0[2], k97);
    }

    public final void setOnFinalImageSetCallback(Function0<Unit> function0) {
        this.C0 = function0;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.A0.setValue(this, H0[0], drawable);
    }
}
