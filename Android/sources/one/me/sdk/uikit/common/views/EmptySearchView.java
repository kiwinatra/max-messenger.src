package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\rJ\u001b\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/sdk/uikit/common/views/EmptySearchView;", "Landroid/widget/LinearLayout;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "drawableRes", "", "setImage", "(I)V", "titleRes", "setTitle", "descriptionRes", "setDescription", "", "description", "(Ljava/lang/String;)V", "buttonTitle", "setButtonTitle", "Lkotlin/Function0;", "action", "setButtonAction", "(Lkotlin/jvm/functions/Function0;)V", "", "visible", "setIsButtonVisible", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmptySearchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptySearchView.kt\none/me/sdk/uikit/common/views/EmptySearchView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,115:1\n24#2:116\n24#2:117\n24#2:118\n24#2:119\n32#2:120\n26#3:121\n20#3:122\n20#3:123\n256#4,2:124\n*S KotlinDebug\n*F\n+ 1 EmptySearchView.kt\none/me/sdk/uikit/common/views/EmptySearchView\n*L\n30#1:116\n31#1:117\n39#1:118\n49#1:119\n67#1:120\n76#1:121\n80#1:122\n84#1:123\n102#1:124,2\n*E\n"})
public final class EmptySearchView extends LinearLayout implements phf {
    public static final /* synthetic */ int v = 0;
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final OneMeButton o;

    public EmptySearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 188;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.setMargins(0, 0, 0, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
        appCompatImageView.setLayoutParams(layoutParams);
        setGravity(17);
        js9 js9 = fu4.k;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView.getContext()).f().getIcon().g));
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(layoutParams2);
        puf.d.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        appCompatTextView.setGravity(17);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams3);
        puf.m.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().f);
        appCompatTextView2.setGravity(17);
        this.c = appCompatTextView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        oneMeButton.setSize(aqa.b);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.a);
        oneMeButton.setGravity(17);
        this.o = oneMeButton;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setPaddingRelative(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 21.5d), 0, MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 21.5d), 0);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(oneMeButton);
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setImageTintList(ColorStateList.valueOf(k2b.getIcon().g));
        this.b.setTextColor(k2b.getText().e);
        this.c.setTextColor(k2b.getText().f);
    }

    public final void setButtonAction(Function0<Unit> function0) {
        ct.G(this.o, 300, new e7(9, function0));
    }

    public final void setButtonTitle(int i) {
        this.o.setText(i);
    }

    public final void setDescription(int i) {
        this.c.setText(q8.p(i, getContext()));
    }

    public final void setImage(int i) {
        this.a.setImageDrawable(ew3.b(getContext(), i));
    }

    public final void setIsButtonVisible(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(int i) {
        this.b.setText(q8.p(i, getContext()));
    }

    public final void setDescription(String str) {
        this.c.setText(str);
    }
}
