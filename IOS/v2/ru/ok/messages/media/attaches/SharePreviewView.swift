package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.Lazy;
import ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator;

public class SharePreviewView extends ConstraintLayout {
    public static final /* synthetic */ int H0 = 0;
    public final ViewPager E0 = ((ViewPager) findViewById(lic.view_share_preview__vp_pager));
    public final ScrollingPagerIndicator F0;
    public final ImageButton G0;

    public SharePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        id3 e = ym.e();
        getContext();
        ro4 b = ro4.b();
        ((qra) e).h();
        LayoutInflater.from(getContext()).inflate(ujc.view_share_preview, this);
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) findViewById(lic.view_share_preview__indicator);
        this.F0 = scrollingPagerIndicator;
        scrollingPagerIndicator.setDotCount(3);
        this.F0.setDotNormalSize(b.f);
        this.F0.setDotSelectedSize(b.f);
        this.F0.setSpaceBetweenDotCenters(b.j);
        ImageButton imageButton = (ImageButton) findViewById(lic.view_share_preview__btn_close);
        this.G0 = imageButton;
        y64.n(imageButton, new ivc(3, this));
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        setBackgroundColor(k0.n);
        this.F0.setDotColor(k0.J);
        ScrollingPagerIndicator scrollingPagerIndicator2 = this.F0;
        int i = k0.x;
        scrollingPagerIndicator2.setSelectedDotColor(i);
        this.G0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.G0.setBackground(k0.d());
        if (this.E0.getMeasuredWidth() != 0 || this.E0.getMeasuredHeight() != 0) {
            int currentItem = this.E0.getCurrentItem();
            ViewPager viewPager = this.E0;
            viewPager.setAdapter(viewPager.getAdapter());
            this.E0.setCurrentItem(currentItem);
        }
    }

    public l20 getShare() {
        this.E0.getCurrentItem();
        throw null;
    }

    public void setListener(c6e c6e) {
    }
}
