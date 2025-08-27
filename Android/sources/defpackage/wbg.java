package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: wbg  reason: default package */
public final class wbg extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public wbg(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    public final void K0(lzc lzc, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.K0(lzc, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public final void a0(hzc hzc, lzc lzc, g4 g4Var) {
        super.a0(hzc, lzc, g4Var);
        this.E.F0.getClass();
    }

    public final void b0(hzc hzc, lzc lzc, View view, g4 g4Var) {
        int i;
        int i2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.F0.o;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.x.getClass();
            i = a.M(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.x.getClass();
            i2 = a.M(view);
        } else {
            i2 = 0;
        }
        g4Var.i(f4.a(false, i, 1, i2, 1));
    }

    public final boolean o0(hzc hzc, lzc lzc, int i, Bundle bundle) {
        this.E.F0.getClass();
        return super.o0(hzc, lzc, i, bundle);
    }

    public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
