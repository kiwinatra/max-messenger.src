package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

public class ScrollChangedTabs extends TabLayout {
    public yhd k1;

    public ScrollChangedTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        bpe bpe;
        super.onScrollChanged(i, i2, i3, i4);
        yhd yhd = this.k1;
        if (yhd != null && (bpe = ((yoe) yhd).b.G0) != null) {
            if (i3 != 0 || i4 != 0) {
                bpe.f0();
            }
        }
    }

    public void setOnScrollListener(yhd yhd) {
        this.k1 = yhd;
    }
}
