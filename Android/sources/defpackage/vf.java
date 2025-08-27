package defpackage;

import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: vf  reason: default package */
public final class vf extends FrameLayout {
    public OneMeButton a;
    public OneMeButton b;
    public boolean c;
    public ValueAnimator o;
    public ohe v;

    public static final void a(vf vfVar, OneMeButton oneMeButton) {
        vfVar.getClass();
        ohe ohe = new ohe((Object) (TextView) oneMeButton.findViewById(dad.j), (q8) ohe.q, (float) c44.DEFAULT_ASPECT_RATIO);
        phe phe = new phe(c44.DEFAULT_ASPECT_RATIO);
        phe.b(200.0f);
        phe.a(0.5f);
        ohe.m = phe;
        ohe.a = 500.0f;
        sf sfVar = new sf(vfVar, oneMeButton);
        ArrayList arrayList = ohe.k;
        if (!arrayList.contains(sfVar)) {
            arrayList.add(sfVar);
        }
        ohe.g();
        vfVar.v = ohe;
    }

    private final void setupViewsPosition(boolean z) {
        if (z) {
            OneMeButton oneMeButton = this.a;
            if (oneMeButton != null) {
                oneMeButton.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            }
            OneMeButton oneMeButton2 = this.b;
            if (oneMeButton2 != null) {
                oneMeButton2.setTranslationY((float) getMeasuredHeight());
                return;
            }
            return;
        }
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setTranslationY(-((float) getMeasuredHeight()));
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        ohe ohe = this.v;
        if (ohe != null) {
            ohe.b();
        }
        this.v = null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        OneMeButton oneMeButton = this.b;
        int measuredHeight = oneMeButton != null ? oneMeButton.getMeasuredHeight() : 0;
        OneMeButton oneMeButton2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, oneMeButton2 != null ? oneMeButton2.getMeasuredHeight() : 0));
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setVisibility(0);
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(Function0<Unit> function0) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            ct.G(oneMeButton, 300, new e7(1, function0));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            oneMeButton.setProgressEnabled(z);
            oneMeButton.setClickable(!z);
        }
    }

    public void setEnabled(boolean z) {
        OneMeButton oneMeButton;
        ohe ohe;
        if (isEnabled() != z) {
            if (!z || !this.c) {
                b();
                setupViewsPosition(z);
            } else {
                OneMeButton oneMeButton2 = this.a;
                if (!(oneMeButton2 == null || (oneMeButton = this.b) == null)) {
                    ValueAnimator valueAnimator = this.o;
                    if ((valueAnimator != null && valueAnimator.isRunning()) || ((ohe = this.v) != null && ohe.f)) {
                        b();
                    }
                    float height = (float) getHeight();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, height});
                    ofFloat.setDuration(200);
                    ofFloat.addUpdateListener(new rf(oneMeButton, oneMeButton2, height, 0));
                    ofFloat.addListener(new uf(0, oneMeButton2));
                    ofFloat.addListener(new tf(0, this, oneMeButton2));
                    ofFloat.start();
                    this.o = ofFloat;
                }
            }
            super.setEnabled(z);
        }
    }

    public final void setupActiveButton(Function1<? super OneMeButton, Unit> function1) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        function1.invoke(oneMeButton);
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ? 0 : 8);
        this.a = oneMeButton;
        addView(oneMeButton);
    }

    public final void setupDisabledButton(Function1<? super OneMeButton, Unit> function1) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        function1.invoke(oneMeButton);
        setOutlineProvider(oneMeButton.getOutlineProvider());
        oneMeButton.setOutlineProvider((ViewOutlineProvider) null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ^ true ? 0 : 8);
        this.b = oneMeButton;
        addView(oneMeButton);
    }
}
