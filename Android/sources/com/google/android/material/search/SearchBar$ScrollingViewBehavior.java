package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean g = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.h(coordinatorLayout, view, view2);
        if (!this.g && (view2 instanceof AppBarLayout)) {
            this.g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(c44.DEFAULT_ASPECT_RATIO);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
