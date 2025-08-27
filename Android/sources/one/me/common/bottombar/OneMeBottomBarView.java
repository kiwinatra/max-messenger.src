package one.me.common.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lone/me/common/bottombar/OneMeBottomBarView;", "Landroid/widget/LinearLayout;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSelectedItemId", "()I", "", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "isBlurEnabled", "()Ljava/lang/Boolean;", "setBlurEnabled", "(Ljava/lang/Boolean;)V", "spa", "js9", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeBottomBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeBottomBarView.kt\none/me/common/bottombar/OneMeBottomBarView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,207:1\n33#2,3:208\n28#3:211\n24#3:215\n24#3:219\n24#3:228\n24#3:229\n1317#4:212\n1318#4:218\n1317#4,2:230\n1317#4,2:232\n1317#4,2:234\n1317#4,2:236\n1317#4:238\n1318#4:242\n1317#4,2:243\n1317#4,2:245\n326#5,2:213\n328#5,2:216\n157#5,8:220\n254#5:239\n256#5,2:240\n*S KotlinDebug\n*F\n+ 1 OneMeBottomBarView.kt\none/me/common/bottombar/OneMeBottomBarView\n*L\n35#1:208,3\n45#1:211\n53#1:215\n56#1:219\n75#1:228\n76#1:229\n51#1:212\n51#1:218\n83#1:230,2\n90#1:232,2\n97#1:234,2\n106#1:236,2\n114#1:238\n114#1:242\n127#1:243,2\n145#1:245,2\n52#1:213,2\n52#1:216,2\n56#1:220,8\n117#1:239\n118#1:240,2\n*E\n"})
public final class OneMeBottomBarView extends LinearLayout implements phf {
    public static final js9 b = new Object();
    public static final /* synthetic */ KProperty[] c = {rae.s(OneMeBottomBarView.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;", 0)};
    public final bl a = new bl(18, this);

    @JvmOverloads
    public OneMeBottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        setOrientation(0);
        sta[] staArr = sta.a;
        setElevation(16.0f * vo4.c().getDisplayMetrics().density);
    }

    public final void a(k2b k2b, Boolean bool) {
        Context context = getContext();
        int i = k2b.c().g;
        Boolean bool2 = Boolean.TRUE;
        Drawable a2 = q8.a(context, i, 2.0f, Intrinsics.areEqual((Object) bool, (Object) bool2));
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            a2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
        setBackground(a2);
    }

    public final int getSelectedItemId() {
        z69 z69 = new z69(1, this);
        while (z69.hasNext()) {
            View view = (View) z69.next();
            if (view.isSelected()) {
                Object w = vzg.w(view, jic.tag_tab_item);
                spa spa = w instanceof spa ? (spa) w : null;
                if (spa != null) {
                    return spa.c;
                }
                return -1;
            }
        }
        return -1;
    }

    public final void onMeasure(int i, int i2) {
        wh7 f = iog.g(this, getRootWindowInsets()).a.f(2);
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = MathKt.roundToInt(((float) (f.d > 0 ? 4 : 12)) * vo4.c().getDisplayMetrics().density);
                        childAt.setLayoutParams(layoutParams2);
                        i3 = i4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                float f2 = (float) 8;
                setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), getPaddingTop(), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), getPaddingBottom());
                b.getClass();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + js9.b(this), 1073741824));
                return;
            }
        }
    }

    public final void onThemeChanged(k2b k2b) {
        a(k2b, (Boolean) this.a.getValue(this, c[0]));
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((kr0) childAt).L();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.setValue(this, c[0], bool);
    }
}
