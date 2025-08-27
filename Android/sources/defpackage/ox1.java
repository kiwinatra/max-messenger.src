package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ox1  reason: default package */
public final class ox1 extends zyc {
    public final Paint a;
    public final List b = Collections.unmodifiableList(new ArrayList());

    public ox1() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(iec.m3_carousel_debug_keyline_width));
        for (jr7 jr7 : this.b) {
            jr7.getClass();
            ThreadLocal threadLocal = w53.a;
            float f = 1.0f - c44.DEFAULT_ASPECT_RATIO;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * c44.DEFAULT_ASPECT_RATIO) + (((float) Color.alpha(-65281)) * f)), (int) ((((float) Color.red(-16776961)) * c44.DEFAULT_ASPECT_RATIO) + (((float) Color.red(-65281)) * f)), (int) ((((float) Color.green(-16776961)) * c44.DEFAULT_ASPECT_RATIO) + (((float) Color.green(-65281)) * f)), (int) ((((float) Color.blue(-16776961)) * c44.DEFAULT_ASPECT_RATIO) + (((float) Color.blue(-65281)) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).N0()) {
                jr7.getClass();
                canvas.drawLine(c44.DEFAULT_ASPECT_RATIO, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.n(), c44.DEFAULT_ASPECT_RATIO, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), paint);
            } else {
                jr7.getClass();
                canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.j(), c44.DEFAULT_ASPECT_RATIO, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.l(), c44.DEFAULT_ASPECT_RATIO, paint);
            }
        }
    }
}
