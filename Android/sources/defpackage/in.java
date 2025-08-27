package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.core.widget.a;

/* renamed from: in  reason: default package */
public class in extends AutoCompleteTextView implements t15 {
    public static final int[] o = {16843126};
    public final jn a;
    public final gp b;
    public final zqd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        zhf.a(getContext(), this);
        g6d w = g6d.w(getContext(), attributeSet, o, i, 0);
        if (((TypedArray) w.c).hasValue(0)) {
            setDropDownBackgroundDrawable(w.q(0));
        }
        w.x();
        jn jnVar = new jn(this);
        this.a = jnVar;
        jnVar.d(attributeSet, i);
        gp gpVar = new gp(this);
        this.b = gpVar;
        gpVar.f(attributeSet, i);
        gpVar.b();
        zqd zqd = new zqd((EditText) this);
        this.c = zqd;
        zqd.w(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener v = zqd.v(keyListener);
            if (v != keyListener) {
                super.setKeyListener(v);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final boolean a() {
        return ((w35) ((y15) this.c.c).a.b).w;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.a();
        }
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.a;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        q8.x(onCreateInputConnection, editorInfo, this);
        return ((y15) this.c.c).a(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(iq.D(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.A(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.v(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.a;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gp gpVar = this.b;
        gpVar.i(colorStateList);
        gpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gp gpVar = this.b;
        gpVar.j(mode);
        gpVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gp gpVar = this.b;
        if (gpVar != null) {
            gpVar.g(i, context);
        }
    }
}
