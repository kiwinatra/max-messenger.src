package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import ru.ok.messages.settings.view.LedSeekBar;

/* renamed from: y6  reason: default package */
public final class y6 extends Drawable {
    public final /* synthetic */ int a = 0;
    public final View b;

    public y6(ActionBarContainer actionBarContainer) {
        this.b = actionBarContainer;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (actionBarContainer.x) {
                    Drawable drawable = actionBarContainer.w;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.o;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = actionBarContainer.v;
                if (drawable3 != null && actionBarContainer.y) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            default:
                LedSeekBar ledSeekBar = (LedSeekBar) this.b;
                int width = ((ledSeekBar.getWidth() - ledSeekBar.getPaddingLeft()) - ledSeekBar.getPaddingRight()) / ledSeekBar.o.length;
                int height = (ledSeekBar.getHeight() / 2) - ledSeekBar.b;
                for (int i = 0; i < ledSeekBar.o.length; i++) {
                    Paint paint = new Paint();
                    paint.setColor(ledSeekBar.o[i]);
                    int i2 = i * width;
                    canvas.drawRect((float) i2, (float) height, (float) (i2 + width), (float) (ledSeekBar.b + height), paint);
                }
                return;
        }
    }

    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((LedSeekBar) this.b).b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    public void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.x) {
                    Drawable drawable = actionBarContainer.o;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        return;
                    }
                    return;
                } else if (actionBarContainer.w != null) {
                    actionBarContainer.o.getOutline(outline);
                    return;
                } else {
                    return;
                }
            default:
                super.getOutline(outline);
                return;
        }
    }

    public final void setAlpha(int i) {
        int i2 = this.a;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.a;
    }

    public y6(LedSeekBar ledSeekBar) {
        this.b = ledSeekBar;
    }
}
