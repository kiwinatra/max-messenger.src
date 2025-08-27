package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/messages/media/mediabar/NumericCheckButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "id", "", "setBackground", "(I)V", "number", "setNumber", "Landroid/graphics/drawable/Drawable;", "uncheckedBackground", "setUncheckedBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "checked", "v", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NumericCheckButton extends AppCompatButton {
    public static final int x = nad.L;
    public static final int y = nad.I;
    public final ch o = ((qra) ym.e()).d();
    public boolean v;
    public Drawable w;

    @JvmOverloads
    public NumericCheckButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackground(x);
    }

    private final void setBackground(int i) {
        setBackground(ew3.b(getContext(), i));
    }

    private final void setChecked(boolean z) {
        ScaleAnimation scaleAnimation;
        if (z != this.v) {
            this.v = z;
            clearAnimation();
            ch chVar = this.o;
            if (z) {
                scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 50.0f, 50.0f);
                scaleAnimation.setInterpolator(chVar.a.f());
            } else {
                scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 50.0f, 50.0f);
                scaleAnimation.setRepeatCount(1);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setInterpolator(chVar.a.n());
            }
            scaleAnimation.setDuration(100);
            startAnimation(scaleAnimation);
        }
    }

    public final void setNumber(int i) {
        if (i > 0) {
            setBackground(y);
            String valueOf = i > 99999 ? "99999+" : String.valueOf(i);
            setTextSize(i < 1000 ? 12.0f : i > 99999 ? 7.0f : i > 9999 ? 8.0f : 10.0f);
            setText(valueOf);
            setChecked(true);
            return;
        }
        Drawable drawable = this.w;
        if (drawable == null) {
            setBackground(x);
        } else {
            setBackground(drawable);
        }
        setText((CharSequence) null);
        setChecked(false);
    }

    public final void setUncheckedBackground(Drawable drawable) {
        this.w = drawable;
    }
}
