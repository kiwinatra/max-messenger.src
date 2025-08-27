package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: iv8  reason: default package */
public final class iv8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public iv8(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.B0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.n1) {
            dVar.o1 = true;
            return;
        }
        int i2 = dVar.I0.getLayoutParams().height;
        d.o(dVar.I0, -1);
        dVar.u(dVar.i());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(dVar.I0, i2);
        if (!(dVar.C0.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.C0.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = dVar.l(bitmap.getWidth(), bitmap.getHeight());
            dVar.C0.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int m = dVar.m(dVar.i());
        int size = dVar.O0.size();
        boolean n = dVar.n();
        rw8 rw8 = dVar.z;
        int size2 = n ? Collections.unmodifiableList(rw8.u).size() * dVar.W0 : 0;
        if (size > 0) {
            size2 += dVar.Y0;
        }
        int min = Math.min(size2, dVar.X0);
        if (!dVar.m1) {
            min = 0;
        }
        int max = Math.max(i, min) + m;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (dVar.A0.getMeasuredHeight() - dVar.B0.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (dVar.I0.getMeasuredHeight() + dVar.M0.getLayoutParams().height >= dVar.B0.getMeasuredHeight()) {
                dVar.C0.setVisibility(8);
            }
            max = min + m;
            i = 0;
        } else {
            dVar.C0.setVisibility(0);
            d.o(dVar.C0, i);
        }
        if (!dVar.i() || max > height) {
            dVar.J0.setVisibility(8);
        } else {
            dVar.J0.setVisibility(0);
        }
        dVar.u(dVar.J0.getVisibility() == 0);
        int m2 = dVar.m(dVar.J0.getVisibility() == 0);
        int max2 = Math.max(i, min) + m2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        dVar.I0.clearAnimation();
        dVar.M0.clearAnimation();
        dVar.B0.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.h(dVar.I0, m2);
            dVar.h(dVar.M0, min);
            dVar.h(dVar.B0, height);
        } else {
            d.o(dVar.I0, m2);
            d.o(dVar.M0, min);
            d.o(dVar.B0, height);
        }
        d.o(dVar.z0, rect.height());
        List unmodifiableList = Collections.unmodifiableList(rw8.u);
        if (unmodifiableList.isEmpty()) {
            dVar.O0.clear();
            dVar.N0.notifyDataSetChanged();
        } else if (new HashSet(dVar.O0).equals(new HashSet(unmodifiableList))) {
            dVar.N0.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = dVar.M0;
                c cVar = dVar.N0;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = cVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                OverlayListView overlayListView2 = dVar.M0;
                c cVar2 = dVar.N0;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = cVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(dVar.X.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList = dVar.O0;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList);
            dVar.P0 = hashSet;
            HashSet hashSet2 = new HashSet(dVar.O0);
            hashSet2.removeAll(unmodifiableList);
            dVar.Q0 = hashSet2;
            dVar.O0.addAll(0, dVar.P0);
            dVar.O0.removeAll(dVar.Q0);
            dVar.N0.notifyDataSetChanged();
            if (z && dVar.m1) {
                if (dVar.Q0.size() + dVar.P0.size() > 0) {
                    dVar.M0.setEnabled(false);
                    dVar.M0.requestLayout();
                    dVar.n1 = true;
                    dVar.M0.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, hashMap, hashMap2));
                    return;
                }
            }
            dVar.P0 = null;
            dVar.Q0 = null;
        }
    }
}
