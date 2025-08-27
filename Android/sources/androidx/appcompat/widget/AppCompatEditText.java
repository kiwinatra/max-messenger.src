package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.a;

public class AppCompatEditText extends EditText implements uma, t15 {
    public final jn a;
    public final gp b;
    public final xgf c;
    public final zqd o;
    public io v;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hdc.editTextStyle);
    }

    private io getSuperCaller() {
        if (this.v == null) {
            this.v = new io(this);
        }
        return this.v;
    }

    public final boolean a() {
        return ((w35) ((y15) this.o.c).a.b).w;
    }

    public final lv3 b(lv3 lv3) {
        return this.c.a(this, lv3);
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

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        gp.h(this, onCreateInputConnection, editorInfo);
        q8.x(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (d = gag.d(this)) == null)) {
            editorInfo.contentMimeTypes = d;
            onCreateInputConnection = new jg7(onCreateInputConnection, new lr2(this));
        }
        return ((y15) this.o.c).a(onCreateInputConnection, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && gag.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = oo.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        xv1 xv1;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || gag.d(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                xv1 = new xv1(primaryClip, 1);
            } else {
                jv3 jv3 = new jv3();
                jv3.b = primaryClip;
                jv3.c = 1;
                xv1 = jv3;
            }
            xv1.setFlags(i == 16908322 ? 0 : 1);
            gag.g(this, xv1.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.o.A(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.o.v(keyListener));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [xgf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tkf.a(context);
        zhf.a(getContext(), this);
        jn jnVar = new jn(this);
        this.a = jnVar;
        jnVar.d(attributeSet, i);
        gp gpVar = new gp(this);
        this.b = gpVar;
        gpVar.f(attributeSet, i);
        gpVar.b();
        this.c = new Object();
        zqd zqd = new zqd((EditText) this);
        this.o = zqd;
        zqd.w(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener v2 = zqd.v(keyListener);
            if (v2 != keyListener) {
                super.setKeyListener(v2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public Editable getText() {
        return super.getText();
    }
}
