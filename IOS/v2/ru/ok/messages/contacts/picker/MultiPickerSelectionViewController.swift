package ru.ok.messages.contacts.picker;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.Keep;

public class MultiPickerSelectionViewController implements View.OnLayoutChangeListener {
    public final ch a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    public ObjectAnimator f;
    public final boolean g = false;
    public boolean h;

    public MultiPickerSelectionViewController(ch chVar, View view, View view2, View view3) {
        this.a = chVar;
        this.b = view;
        view.addOnLayoutChangeListener(this);
        this.c = view2;
        this.d = view3;
    }

    public final void a(boolean z) {
        View view = this.b;
        if (z) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "translationY", new int[]{(int) (view.getTranslationY() == c44.DEFAULT_ASPECT_RATIO ? (float) view.getHeight() : view.getTranslationY()), 0});
            this.f = ofInt;
            ofInt.setInterpolator(this.a.a.n());
            this.f.setDuration(this.g ? 300 : 200);
            this.f.addListener(new z6(10, (Object) this));
            this.f.start();
            return;
        }
        view.setVisibility(0);
        View view2 = this.d;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        setTranslationY(0);
        this.e = true;
    }

    public final void b(boolean z, boolean z2) {
        if (this.h != z2) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            View view = this.b;
            if (!z2) {
                this.e = false;
                if (z) {
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "translationY", new int[]{(int) view.getTranslationY(), view.getHeight()});
                    this.f = ofInt;
                    ofInt.setInterpolator(this.a.a.n());
                    this.f.setDuration(this.g ? 300 : 200);
                    this.f.start();
                } else {
                    setTranslationY(view.getHeight());
                }
            } else if (view.getVisibility() == 8) {
                view.setVisibility(4);
                view.post(new c70((Object) this, z, 10));
            } else {
                a(z);
            }
            this.h = z2;
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.e) {
            View view2 = this.b;
            int height = view2.getHeight() - ((int) view2.getTranslationY());
            View view3 = this.d;
            if (view3 != null) {
                view3.setTranslationY((float) (-height));
            }
            iq.q(this.c, height);
        }
    }

    @Keep
    public void setTranslationY(int i) {
        View view = this.b;
        view.setTranslationY((float) i);
        int height = view.getHeight() - i > 0 ? view.getHeight() - i : 0;
        View view2 = this.d;
        if (view2 != null) {
            view2.setTranslationY((float) (-height));
        }
        iq.q(this.c, height);
    }
}
