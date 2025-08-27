package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public boolean a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        fj3 fj3 = (fj3) getLayoutParams();
        if (!this.a || fj3.a != i) {
            fj3.a = i;
            setLayoutParams(fj3);
        }
    }

    public void setGuidelineEnd(int i) {
        fj3 fj3 = (fj3) getLayoutParams();
        if (!this.a || fj3.b != i) {
            fj3.b = i;
            setLayoutParams(fj3);
        }
    }

    public void setGuidelinePercent(float f) {
        fj3 fj3 = (fj3) getLayoutParams();
        if (!this.a || fj3.c != f) {
            fj3.c = f;
            setLayoutParams(fj3);
        }
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
