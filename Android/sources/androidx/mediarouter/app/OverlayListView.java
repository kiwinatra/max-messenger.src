package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

final class OverlayListView extends ListView {
    public final ArrayList a = new ArrayList();

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n6b n6b = (n6b) it.next();
                BitmapDrawable bitmapDrawable = n6b.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (n6b.l) {
                    z = false;
                } else {
                    float min = Math.min(1.0f, ((float) (drawingTime - n6b.j)) / ((float) n6b.e));
                    float f = c44.DEFAULT_ASPECT_RATIO;
                    float max = Math.max(c44.DEFAULT_ASPECT_RATIO, min);
                    if (n6b.k) {
                        f = max;
                    }
                    Interpolator interpolator = n6b.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (((float) n6b.g) * interpolation);
                    Rect rect = n6b.f;
                    Rect rect2 = n6b.c;
                    rect2.top = rect.top + i;
                    rect2.bottom = rect.bottom + i;
                    float f2 = n6b.h;
                    float f3 = i2a.f(n6b.i, f2, interpolation, f2);
                    n6b.b = f3;
                    BitmapDrawable bitmapDrawable2 = n6b.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (f3 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (n6b.k && f >= 1.0f) {
                        n6b.l = true;
                        ata ata = n6b.m;
                        if (ata != null) {
                            d dVar = (d) ata.c;
                            dVar.R0.remove((rw8) ata.b);
                            dVar.N0.notifyDataSetChanged();
                        }
                    }
                    z = !n6b.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
