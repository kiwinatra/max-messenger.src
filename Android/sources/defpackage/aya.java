package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: aya  reason: default package */
public final class aya extends g13 implements phf {
    public static final /* synthetic */ KProperty[] B0;
    public final zxa A0 = new zxa(this, 1);
    public final zxa z0 = new zxa(this, 0);

    static {
        Class<aya> cls = aya.class;
        B0 = new KProperty[]{rae.s(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;", 0), rae.s(cls, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;", 0)};
    }

    public aya(Context context) {
        super(context, (AttributeSet) null, edc.circularProgressIndicatorStyle, g13.y0);
        h13 h13 = (h13) this.a;
        qv4 qv4 = new qv4(h13);
        Context context2 = getContext();
        ue7 ue7 = new ue7(context2, h13, qv4, new d13(h13));
        Resources resources = context2.getResources();
        int i = qfc.indeterminate_static;
        w1g w1g = new w1g();
        ThreadLocal threadLocal = h4d.a;
        w1g.a = c4d.a(resources, i, (Resources.Theme) null);
        new v1g(w1g.a.getConstantState());
        ue7.w0 = w1g;
        setIndeterminateDrawable(ue7);
        setProgressDrawable(new rm4(getContext(), h13, qv4));
        Delegates delegates = Delegates.INSTANCE;
        setIndeterminate(true);
        setTrackCornerRadius(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
    }

    public static int d(txa txa, k2b k2b) {
        if (Intrinsics.areEqual((Object) txa, (Object) mxa.a)) {
            return k2b.d().f.a;
        }
        if (Intrinsics.areEqual((Object) txa, (Object) nxa.a)) {
            k2b.d().f.getClass();
            return -1;
        } else if (Intrinsics.areEqual((Object) txa, (Object) oxa.a)) {
            return k2b.d().f.c;
        } else {
            if (Intrinsics.areEqual((Object) txa, (Object) pxa.a)) {
                return k2b.d().f.g;
            }
            if (Intrinsics.areEqual((Object) txa, (Object) qxa.a)) {
                k2b.d().f.getClass();
                return -15921907;
            } else if (Intrinsics.areEqual((Object) txa, (Object) sxa.a)) {
                k2b.d().f.getClass();
                return -16745729;
            } else if (Intrinsics.areEqual((Object) txa, (Object) rxa.a)) {
                return k2b.d().f.e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final txa getAppearance() {
        return (txa) this.z0.getValue(this, B0[0]);
    }

    public final yxa getSize() {
        return (yxa) this.A0.getValue(this, B0[1]);
    }

    public final void onThemeChanged(k2b k2b) {
        setIndicatorColor(d(getAppearance(), k2b));
    }

    public final void setAppearance(txa txa) {
        this.z0.setValue(this, B0[0], txa);
    }

    public final void setSize(yxa yxa) {
        this.A0.setValue(this, B0[1], yxa);
    }
}
