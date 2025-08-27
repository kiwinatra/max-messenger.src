package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: v44  reason: default package */
public final class v44 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v44(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChanged() {
        switch (this.a) {
            case 0:
                w44 w44 = (w44) this.b;
                w44.a = true;
                w44.notifyDataSetChanged();
                return;
            case 1:
                sz7 sz7 = (sz7) this.b;
                if (sz7.I0.isShowing()) {
                    sz7.b();
                    return;
                }
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                w44 w44 = (w44) this.b;
                w44.a = false;
                w44.notifyDataSetInvalidated();
                return;
            case 1:
                ((sz7) this.b).dismiss();
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }
}
