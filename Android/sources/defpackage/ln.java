package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;

/* renamed from: ln  reason: default package */
public class ln extends CheckedTextView implements t15 {
    public final mn a = new mn(this);
    public final jn b;
    public final gp c;
    public jo o;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ln(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            defpackage.tkf.a(r10)
            r9.<init>(r10, r11, r12)
            android.content.Context r10 = r9.getContext()
            defpackage.zhf.a(r10, r9)
            gp r10 = new gp
            r10.<init>(r9)
            r9.c = r10
            r10.f(r11, r12)
            r10.b()
            jn r10 = new jn
            r10.<init>(r9)
            r9.b = r10
            r10.d(r11, r12)
            mn r10 = new mn
            r10.<init>(r9)
            r9.a = r10
            android.content.Context r10 = r9.getContext()
            int[] r0 = defpackage.koc.CheckedTextView
            r1 = 0
            g6d r10 = defpackage.g6d.w(r10, r11, r0, r12, r1)
            java.lang.Object r0 = r10.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r3 = r9.getContext()
            int[] r4 = defpackage.koc.CheckedTextView
            java.util.WeakHashMap r2 = defpackage.gag.a
            java.lang.Object r2 = r10.c
            r6 = r2
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r8 = 0
            r2 = r9
            r5 = r11
            r7 = r12
            defpackage.bag.d(r2, r3, r4, r5, r6, r7, r8)
            int r2 = defpackage.koc.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006a }
            boolean r2 = r0.hasValue(r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x006c
            int r2 = defpackage.koc.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006a }
            int r2 = r0.getResourceId(r2, r1)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x006c
            android.content.Context r3 = r9.getContext()     // Catch:{ NotFoundException -> 0x006c }
            android.graphics.drawable.Drawable r2 = defpackage.iq.D(r3, r2)     // Catch:{ NotFoundException -> 0x006c }
            r9.setCheckMarkDrawable((android.graphics.drawable.Drawable) r2)     // Catch:{ NotFoundException -> 0x006c }
            goto L_0x0087
        L_0x006a:
            r9 = move-exception
            goto L_0x00ba
        L_0x006c:
            int r2 = defpackage.koc.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006a }
            boolean r2 = r0.hasValue(r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0087
            int r2 = defpackage.koc.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006a }
            int r1 = r0.getResourceId(r2, r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0087
            android.content.Context r2 = r9.getContext()     // Catch:{ all -> 0x006a }
            android.graphics.drawable.Drawable r1 = defpackage.iq.D(r2, r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ all -> 0x006a }
        L_0x0087:
            int r1 = defpackage.koc.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006a }
            boolean r1 = r0.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0098
            int r1 = defpackage.koc.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006a }
            android.content.res.ColorStateList r1 = r10.o(r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkTintList(r1)     // Catch:{ all -> 0x006a }
        L_0x0098:
            int r1 = defpackage.koc.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006a }
            boolean r1 = r0.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x00af
            int r1 = defpackage.koc.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006a }
            r2 = -1
            int r0 = r0.getInt(r1, r2)     // Catch:{ all -> 0x006a }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.yu4.c(r0, r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x006a }
        L_0x00af:
            r10.x()
            jo r9 = r9.getEmojiTextViewHelper()
            r9.c(r11, r12)
            return
        L_0x00ba:
            r10.x()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private jo getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new jo(this);
        }
        return this.o;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.a();
        }
        mn mnVar = this.a;
        if (mnVar != null) {
            mnVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        jn jnVar = this.b;
        if (jnVar != null) {
            return jnVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jn jnVar = this.b;
        if (jnVar != null) {
            return jnVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        mn mnVar = this.a;
        if (mnVar != null) {
            return mnVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        mn mnVar = this.a;
        if (mnVar != null) {
            return mnVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        q8.x(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.f(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        mn mnVar = this.a;
        if (mnVar == null) {
            return;
        }
        if (mnVar.e) {
            mnVar.e = false;
            return;
        }
        mnVar.e = true;
        mnVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        mn mnVar = this.a;
        if (mnVar != null) {
            mnVar.a = colorStateList;
            mnVar.c = true;
            mnVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        mn mnVar = this.a;
        if (mnVar != null) {
            mnVar.b = mode;
            mnVar.d = true;
            mnVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gp gpVar = this.c;
        gpVar.i(colorStateList);
        gpVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gp gpVar = this.c;
        gpVar.j(mode);
        gpVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gp gpVar = this.c;
        if (gpVar != null) {
            gpVar.g(i, context);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(iq.D(getContext(), i));
    }
}
