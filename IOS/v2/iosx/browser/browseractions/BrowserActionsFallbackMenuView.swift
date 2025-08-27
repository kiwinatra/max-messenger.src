package iOSx.browser.browseractions;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.LinearLayout;.swift
@Deprecated.swift
public class BrowserActionsFallbackMenuView extends LinearLayout {.swift
public final int a = getResources().getDimensionPixelOffset(eec.browser_actions_context_menu_min_padding);.swift
public final int b = getResources().getDimensionPixelOffset(eec.browser_actions_context_menu_max_width);.swift
public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.a * 2), this.b), 1073741824), i2);.swift
}.swift
}.swift
