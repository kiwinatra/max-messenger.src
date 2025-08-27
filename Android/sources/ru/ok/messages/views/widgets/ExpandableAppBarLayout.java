package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.onechat.widgets.NumberTextView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001 J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u000bJ\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00158\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lru/ok/messages/views/widgets/ExpandableAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "", "text", "", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "", "color", "setTitleTextColor", "(I)V", "setSubtitleTextColor", "", "alpha", "setTitleAlpha", "(F)V", "setSubtitleAlpha", "visibility", "setTitleVisibility", "setSubtitleVisibility", "", "locked", "setAppBarLocked", "(Z)V", "value", "M0", "Z", "getExtraActionsEnabled", "()Z", "setExtraActionsEnabled", "extraActionsEnabled", "pd5", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nExpandableAppBarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableAppBarLayout.kt\nru/ok/messages/views/widgets/ExpandableAppBarLayout\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,374:1\n32#2,2:375\n30#3:377\n91#3,14:378\n91#3,14:395\n30#3:410\n91#3,14:411\n41#3:427\n91#3,14:428\n49#4,2:392\n45#4:394\n254#5:409\n254#5:425\n256#5,2:442\n49#6:426\n*S KotlinDebug\n*F\n+ 1 ExpandableAppBarLayout.kt\nru/ok/messages/views/widgets/ExpandableAppBarLayout\n*L\n120#1:375,2\n128#1:377\n128#1:378,14\n176#1:395,14\n187#1:410\n187#1:411,14\n240#1:427\n240#1:428,14\n147#1:392,2\n147#1:394\n185#1:409\n204#1:425\n363#1:442,2\n214#1:426\n*E\n"})
public final class ExpandableAppBarLayout extends AppBarLayout {
    public boolean M0;
    public final ConstraintLayout N0 = ((ConstraintLayout) findViewById(lic.expandable_appbar__fl_title_wrapper));
    public final AppCompatTextView O0 = ((AppCompatTextView) findViewById(lic.expandable_appbar__tv_title));
    public final AppCompatTextView P0 = ((AppCompatTextView) findViewById(lic.expandable_appbar__tv_subtitle));
    public final CollapsingToolbarLayoutImpl Q0 = ((CollapsingToolbarLayoutImpl) findViewById(lic.expandable_appbar__container));

    @JvmOverloads
    public ExpandableAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        pd5[] pd5Arr = pd5.a;
        View.inflate(context, ujc.expandable_appbar_layout, this);
        setLayoutParams(new wz3(-1, -2));
        Toolbar toolbar = (Toolbar) findViewById(lic.toolbar);
        Toolbar toolbar2 = (Toolbar) findViewById(lic.select_actions_toolbar);
        NumberTextView numberTextView = (NumberTextView) findViewById(lic.select_actions_title);
        numberTextView.setDuration(150);
        numberTextView.setTextSize(20);
        numberTextView.setTypeface(Typeface.create("sans-serif-medium", 0));
        numberTextView.setCenterAlign(false);
    }

    public final boolean getExtraActionsEnabled() {
        return this.M0;
    }

    public final void setAppBarLocked(boolean z) {
        int i = 0;
        f(false, false, true);
        this.N0.setVisibility(z ^ true ? 0 : 8);
        dn dnVar = (dn) this.Q0.getLayoutParams();
        if (!z) {
            i = 19;
        }
        dnVar.a = i;
        wz3 wz3 = (wz3) getLayoutParams();
        SecondScrollExpandBehavior secondScrollExpandBehavior = null;
        if (!z) {
            secondScrollExpandBehavior = new SecondScrollExpandBehavior(getContext(), (AttributeSet) null);
        }
        wz3.b(secondScrollExpandBehavior);
    }

    public final void setExtraActionsEnabled(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.P0.setText(charSequence);
    }

    public final void setSubtitleAlpha(float f) {
        this.P0.setAlpha(f);
    }

    public final void setSubtitleTextColor(int i) {
        this.P0.setTextColor(i);
    }

    public final void setSubtitleVisibility(int i) {
        this.P0.setVisibility(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.O0.setText(charSequence);
    }

    public final void setTitleAlpha(float f) {
        this.O0.setAlpha(f);
    }

    public final void setTitleTextColor(int i) {
        this.O0.setTextColor(i);
    }

    public final void setTitleVisibility(int i) {
        this.O0.setVisibility(i);
    }
}
