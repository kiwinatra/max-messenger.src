package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

public class VideoFramePreview extends RoundedRectFrameLayout implements bif {
    public final AppCompatImageView v;
    public final AppCompatTextView w;
    public final ProgressBar x;
    public final View y = new View(getContext());

    public VideoFramePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ro4 b = ro4.b();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        this.v = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.x = progressBar;
        progressBar.setIndeterminate(true);
        int i = b.q;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.x, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        this.w = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.w.setTextSize(b.P);
        this.w.setGravity(17);
        AppCompatTextView appCompatTextView2 = this.w;
        int i2 = b.f;
        int i3 = b.b;
        appCompatTextView2.setPadding(i2, i3, i2, i3);
        float f = (float) b.w;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#333344"));
        shapeDrawable.setAlpha(96);
        this.w.setBackground(shapeDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = b.d;
        addView(this.w, layoutParams2);
        this.y.setBackground(i8b.O((Integer) null, Integer.valueOf(fw3.a(getContext(), lad.w)), Integer.valueOf(b.a), b.g));
        addView(this.y, new FrameLayout.LayoutParams(-1, -1));
        setCornerRadius((float) b.h);
        c();
    }

    public final void a(boolean z) {
        if (z) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        iq.b0(this.x, j4b.k0(context).l);
    }

    public void setPreviewEnabled(boolean z) {
        View view = this.y;
        AppCompatImageView appCompatImageView = this.v;
        if (z) {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            Lazy lazy = scf.b0;
            setBackgroundColor(j4b.k0(context).x);
            view.setVisibility(0);
            return;
        }
        appCompatImageView.setVisibility(8);
        setBackground((Drawable) null);
        view.setVisibility(8);
    }
}
