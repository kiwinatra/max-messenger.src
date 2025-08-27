package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: f79  reason: default package */
public final class f79 extends ax4 {
    public t69 A0;
    public u69 B0;
    public final int y0;
    public final int z0;

    public f79(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.y0 = 21;
            this.z0 = 22;
            return;
        }
        this.y0 = 22;
        this.z0 = 21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            t69 r0 = r4.A0
            if (r0 == 0) goto L_0x005a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L_0x0019
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            j69 r0 = (defpackage.j69) r0
            goto L_0x001c
        L_0x0019:
            j69 r0 = (defpackage.j69) r0
            r1 = 0
        L_0x001c:
            int r2 = r5.getAction()
            r3 = 10
            if (r2 == r3) goto L_0x0043
            float r2 = r5.getX()
            int r2 = (int) r2
            float r3 = r5.getY()
            int r3 = (int) r3
            int r2 = r4.pointToPosition(r2, r3)
            r3 = -1
            if (r2 == r3) goto L_0x0043
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0043
            int r1 = r0.getCount()
            if (r2 >= r1) goto L_0x0043
            u69 r1 = r0.getItem(r2)
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            u69 r2 = r4.B0
            if (r2 == r1) goto L_0x005a
            m69 r0 = r0.a
            if (r2 == 0) goto L_0x0051
            t69 r3 = r4.A0
            r3.f(r0, r2)
        L_0x0051:
            r4.B0 = r1
            if (r1 == 0) goto L_0x005a
            t69 r2 = r4.A0
            r2.n(r0, r1)
        L_0x005a:
            boolean r4 = super.onHoverEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f79.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.y0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.z0) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (j69) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j69) adapter).a.c(false);
            return true;
        }
    }

    public void setHoverListener(t69 t69) {
        this.A0 = t69;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
