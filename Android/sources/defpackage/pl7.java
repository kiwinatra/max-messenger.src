package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;

/* renamed from: pl7  reason: default package */
public final class pl7 {
    public final SparseArray a;

    public pl7(int i) {
        switch (i) {
            case 1:
                this.a = new SparseArray();
                return;
            default:
                this.a = new SparseArray();
                return;
        }
    }

    public void a(Rect rect, View view, int i) {
        int[] iArr = (int[]) this.a.get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
        }
    }

    public void b(Rect rect, View view, int i) {
        int[] iArr = (int[]) this.a.get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
        }
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r3 = this;
            androidx.recyclerview.widget.a r6 = r6.getLayoutManager()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            int r6 = androidx.recyclerview.widget.RecyclerView.S(r5)
            android.util.SparseArray r3 = r3.a
            r0 = -1
            if (r6 != r0) goto L_0x0014
            r3.remove(r6)
            return
        L_0x0014:
            java.lang.Object r0 = r3.get(r6)
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L_0x0023
            r0 = 8
            int[] r0 = new int[r0]
            r3.put(r6, r0)
        L_0x0023:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r6 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            if (r6 == 0) goto L_0x002f
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0030
        L_0x002f:
            r3 = r1
        L_0x0030:
            r6 = 0
            if (r3 == 0) goto L_0x0036
            int r3 = r3.leftMargin
            goto L_0x0037
        L_0x0036:
            r3 = r6
        L_0x0037:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            bzc r2 = (defpackage.bzc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.left
            int r3 = r3 + r2
            r2 = 1
            r0[r2] = r3
            int r2 = r4.left
            int r3 = r3 + r2
            r0[r6] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0055
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            int r3 = r3.topMargin
            goto L_0x005c
        L_0x005b:
            r3 = r6
        L_0x005c:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            bzc r2 = (defpackage.bzc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.top
            int r3 = r3 + r2
            r2 = 3
            r0[r2] = r3
            int r2 = r4.top
            int r3 = r3 + r2
            r2 = 2
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x007b
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x007c
        L_0x007b:
            r3 = r1
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            int r3 = r3.rightMargin
            goto L_0x0082
        L_0x0081:
            r3 = r6
        L_0x0082:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            bzc r2 = (defpackage.bzc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.right
            int r3 = r3 + r2
            r2 = 5
            r0[r2] = r3
            int r2 = r4.right
            int r3 = r3 + r2
            r2 = 4
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00a1
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00a1:
            if (r1 == 0) goto L_0x00a5
            int r6 = r1.bottomMargin
        L_0x00a5:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            bzc r3 = (defpackage.bzc) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.bottom
            int r6 = r6 + r3
            r3 = 7
            r0[r3] = r6
            int r3 = r4.bottom
            int r6 = r6 + r3
            r3 = 6
            r0[r3] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl7.c(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView):void");
    }
}
