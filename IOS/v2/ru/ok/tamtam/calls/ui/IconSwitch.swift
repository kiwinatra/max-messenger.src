package ru.ok.tamtam.calls.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ok/tamtam/calls/ui/IconSwitch;", "Landroid/widget/LinearLayout;", "Lwcf;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "", "setText", "(I)V", "", "(Ljava/lang/CharSequence;)V", "res", "setIconDrawable", "orientation", "setOrientation", "Le77;", "listener", "setListener", "(Le77;)V", "", "checked", "setChecked", "(Z)V", "Landroidx/appcompat/widget/AppCompatImageView;", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/SwitchCompat;", "b", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitch", "()Landroidx/appcompat/widget/SwitchCompat;", "switch", "call-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIconSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconSwitch.kt\nru/ok/tamtam/calls/ui/IconSwitch\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 5 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,121:1\n24#2:122\n24#2:124\n52#3:123\n233#4,3:125\n49#5,2:128\n45#5:130\n*S KotlinDebug\n*F\n+ 1 IconSwitch.kt\nru/ok/tamtam/calls/ui/IconSwitch\n*L\n38#1:122\n45#1:124\n44#1:123\n57#1:125,3\n62#1:128,2\n62#1:130\n*E\n"})
public final class IconSwitch extends LinearLayout implements wcf, Checkable {
    public static final /* synthetic */ int c = 0;
    public final AppCompatImageView a;
    public final SwitchCompat b;

    @JvmOverloads
    public IconSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        scf scf;
        setOrientation(0);
        setClickable(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
        this.a = appCompatImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        addView(appCompatImageView, layoutParams);
        SwitchCompat switchCompat = new SwitchCompat(context, attributeSet);
        switchCompat.setTextAlignment(2);
        switchCompat.setTextSize(16.0f);
        if (context.getResources().getConfiguration().orientation == 2) {
            switchCompat.setSwitchPadding(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        }
        this.b = switchCompat;
        addView(switchCompat, new LinearLayout.LayoutParams(-1, -2));
        switchCompat.setOnCheckedChangeListener(new zy2(2, this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ync.IconSwitch);
            appCompatImageView.setImageDrawable(obtainStyledAttributes.getDrawable(ync.IconSwitch_icon_switch_start_drawable));
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        L0(scf);
    }

    public final void L0(scf scf) {
        this.a.setColorFilter(scf.x);
        int i = scf.x;
        SwitchCompat switchCompat = this.b;
        switchCompat.setTextColor(i);
        int i2 = scf.m;
        int i3 = scf.l;
        switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i3, i2}));
        switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{j4b.l0(0.3f, i3), j4b.l0(0.3f, scf.N)}));
    }

    public final AppCompatImageView getIcon() {
        return this.a;
    }

    public final SwitchCompat getSwitch() {
        return this.b;
    }

    public final boolean isChecked() {
        return this.b.isChecked();
    }

    public void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    public final void setIconDrawable(int i) {
        this.a.setImageDrawable(ew3.b(getContext(), i));
    }

    public final void setListener(e77 e77) {
    }

    public void setOrientation(int i) {
        super.setOrientation(0);
    }

    public final void setText(int i) {
        this.b.setText(i);
    }

    public final void toggle() {
        this.b.toggle();
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
