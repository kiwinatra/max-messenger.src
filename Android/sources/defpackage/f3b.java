package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Lazy;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: f3b  reason: default package */
public final class f3b {
    public final /* synthetic */ h3b a;

    public f3b(h3b h3b) {
        this.a = h3b;
    }

    public final void a() {
        h3b h3b = this.a;
        h3b.C0 = true;
        h3b.setPadding(0, h3b.getPaddingTop(), h3b.getPaddingRight(), h3b.getPaddingBottom());
        if (h3b.getRightSecondaryView() instanceof pza) {
            View rightSecondaryView = h3b.getRightSecondaryView();
            if (rightSecondaryView != null) {
                ViewGroup.LayoutParams layoutParams = rightSecondaryView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(0);
                    rightSecondaryView.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            View rightPrimaryView = h3b.getRightPrimaryView();
            if (rightPrimaryView != null) {
                rightPrimaryView.setVisibility(8);
            }
        }
        h3b.getTitleTextView().setVisibility(8);
        Lazy<j7e> subtitleTextViewLazy = h3b.getSubtitleTextViewLazy();
        if (subtitleTextViewLazy.isInitialized()) {
            subtitleTextViewLazy.getValue().setVisibility(8);
        }
        Lazy<OneMeAvatarView> titleAvatarViewLazy = h3b.getTitleAvatarViewLazy();
        if (titleAvatarViewLazy.isInitialized()) {
            titleAvatarViewLazy.getValue().setVisibility(8);
        }
        Lazy<ImageView> titleDropdownViewLazy = h3b.getTitleDropdownViewLazy();
        if (titleDropdownViewLazy.isInitialized()) {
            titleDropdownViewLazy.getValue().setVisibility(8);
        }
        View leftView = h3b.getLeftView();
        if (leftView != null) {
            leftView.setVisibility(8);
        }
    }
}
