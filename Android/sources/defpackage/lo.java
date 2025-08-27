package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: lo  reason: default package */
public final class lo extends MultiAutoCompleteTextView implements t15 {
    public static final int[] o = {16843126};
    public final jn a;
    public final gp b;
    public final zqd c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lo(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = defpackage.hdc.autoCompleteTextViewStyle
            defpackage.tkf.a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.zhf.a(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = o
            r2 = 0
            g6d r5 = defpackage.g6d.w(r5, r6, r1, r0, r2)
            java.lang.Object r1 = r5.c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r1 = r5.q(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L_0x002b:
            r5.x()
            jn r5 = new jn
            r5.<init>(r4)
            r4.a = r5
            r5.d(r6, r0)
            gp r5 = new gp
            r5.<init>(r4)
            r4.b = r5
            r5.f(r6, r0)
            r5.b()
            zqd r5 = new zqd
            r5.<init>((android.widget.EditText) r4)
            r4.c = r5
            r5.w(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.v(r6)
            if (r5 != r6) goto L_0x0070
            goto L_0x007f
        L_0x0070:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.<init>(android.content.Context, android.util.AttributeSet):void");
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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
