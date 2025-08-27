package ru.ok.utils.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R/\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/utils/widgets/BadgeCountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lbif;", "", "backgroundColor", "", "setBackgroundColor", "(I)V", "", "x", "Z", "getNeedPlusIndicator", "()Z", "setNeedPlusIndicator", "(Z)V", "needPlusIndicator", "y", "getManageVisibility", "setManageVisibility", "manageVisibility", "<set-?>", "z", "Lkotlin/properties/ReadWriteProperty;", "getCount", "()I", "setCount", "count", "Log0;", "v0", "getStyle", "()Log0;", "setStyle", "(Log0;)V", "style", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBadgeCountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeCountView.kt\nru/ok/utils/widgets/BadgeCountView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,135:1\n256#2,2:136\n310#2:147\n326#2,2:148\n328#2,2:159\n311#2:161\n33#3,3:138\n33#3,3:141\n49#4,2:144\n45#4:146\n75#5:150\n44#5:151\n99#5:152\n24#5:153\n44#5:154\n99#5:155\n75#5:156\n44#5:157\n99#5:158\n24#5:162\n*S KotlinDebug\n*F\n+ 1 BadgeCountView.kt\nru/ok/utils/widgets/BadgeCountView\n*L\n34#1:136,2\n105#1:147\n105#1:148,2\n105#1:159,2\n105#1:161\n58#1:138,3\n78#1:141,3\n48#1:144,2\n48#1:146\n106#1:150\n106#1:151\n106#1:152\n106#1:153\n106#1:154\n106#1:155\n107#1:156\n107#1:157\n107#1:158\n124#1:162\n*E\n"})
public final class BadgeCountView extends AppCompatTextView implements bif {
    public static final /* synthetic */ KProperty[] x0;
    public final bl v0;
    public int w0;
    public boolean x;
    public boolean y = true;
    public final ed0 z;

    static {
        Class<BadgeCountView> cls = BadgeCountView.class;
        x0 = new KProperty[]{rae.s(cls, NewHtcHomeBadger.COUNT, "getCount()I", 0), rae.s(cls, "style", "getStyle()Lru/ok/utils/widgets/BadgeCountView$Style;", 0)};
    }

    @JvmOverloads
    public BadgeCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(17);
        setIncludeFontPadding(false);
        setTextAlignment(4);
        setVisibility(8);
        c();
        Delegates delegates = Delegates.INSTANCE;
        this.z = new ed0(this, context);
        this.v0 = new bl(2, this);
        this.w0 = -1;
    }

    private final og0 getStyle() {
        return (og0) this.v0.getValue(this, x0[1]);
    }

    /* access modifiers changed from: private */
    public final void setStyle(og0 og0) {
        this.v0.setValue(this, x0[1], og0);
    }

    public final void c() {
        scf scf;
        if (isInEditMode()) {
            setTextColor(-1);
            setBackgroundColor(-16776961);
            setCount(20);
            this.x = true;
            return;
        }
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        setTextColor(scf.G);
        setBackgroundColor(scf.I);
    }

    public final int getCount() {
        return ((Number) this.z.getValue(this, x0[0])).intValue();
    }

    public final boolean getManageVisibility() {
        return this.y;
    }

    public final boolean getNeedPlusIndicator() {
        return this.x;
    }

    public void setBackgroundColor(int i) {
        this.w0 = i;
        Drawable background = getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(i);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(i);
        }
    }

    public final void setCount(int i) {
        this.z.setValue(this, x0[0], Integer.valueOf(i));
    }

    public final void setManageVisibility(boolean z2) {
        this.y = z2;
    }

    public final void setNeedPlusIndicator(boolean z2) {
        this.x = z2;
    }
}
