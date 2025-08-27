package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: ur5  reason: default package */
public final class ur5 extends zyc {
    public final Lazy X;
    public final Context a;
    public final Function1 b;
    public final iz9 c = new iz9(3);
    public final Rect o = new Rect();
    public final int v = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
    public final int w;
    public final int x;
    public boolean y;
    public RecyclerView z;

    public ur5(Application application, hn9 hn9) {
        this.a = application;
        this.b = hn9;
        float f = (float) 6;
        this.w = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.x = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        this.X = LazyKt.lazy(LazyThreadSafetyMode.NONE, new u75(5, this));
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, lzc lzc) {
        iz9 iz9 = this.c;
        if (iz9.e != 0) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getAlpha() != c44.DEFAULT_ASPECT_RATIO) {
                    pzc U = recyclerView.U(childAt);
                    d99 d99 = U instanceof d99 ? (d99) U : null;
                    if (d99 != null) {
                        int i2 = d99.w;
                        View view = d99.a;
                        v89 v89 = view instanceof v89 ? (v89) view : null;
                        if (v89 != null) {
                            boolean z2 = (67108864 & i2) == 0;
                            RectF rectF = v89.w0;
                            if (z2 || ig9.a(i2, 0)) {
                                rectF.setEmpty();
                                v89.setOnAvatarClickListener$message_list_release((Function1<? super Long, Unit>) null);
                            } else {
                                eoa eoa = (eoa) iz9.a(v89.getAvatarId());
                                if (eoa != null) {
                                    Rect rect = this.o;
                                    v89.getDrawingRect(rect);
                                    recyclerView.offsetDescendantRectToMyCoords(v89, rect);
                                    eoa.setAlpha(MathKt.roundToInt(childAt.getAlpha() * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
                                    float translationX = view.getTranslationX() + ((float) this.x);
                                    float contentViewTopMargin = (float) (v89.getContentViewTopMargin() + this.w);
                                    int save = canvas.save();
                                    canvas.translate(((float) rect.left) + translationX, ((float) rect.top) + contentViewTopMargin);
                                    try {
                                        eoa.draw(canvas);
                                        rectF.left = translationX;
                                        rectF.top = contentViewTopMargin;
                                        float f = (float) v89.b;
                                        rectF.right = translationX + f;
                                        rectF.bottom = contentViewTopMargin + f;
                                        v89.setOnAvatarClickListener$message_list_release(this.b);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
