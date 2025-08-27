package com.google.android.material.textfield;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;

public class TextInputEditText extends AppCompatEditText {
    public final Rect w = new Rect();
    public boolean x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputEditText(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r6 = defpackage.edc.editTextStyle
            r7 = 0
            android.content.Context r0 = defpackage.fh8.a(r11, r12, r6, r7)
            r10.<init>(r0, r12, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.w = r0
            int[] r8 = defpackage.tnc.TextInputEditText
            int r9 = defpackage.hnc.Widget_Design_TextInputEditText
            int[] r5 = new int[r7]
            defpackage.vhf.a(r11, r12, r6, r9)
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r6
            r4 = r9
            defpackage.vhf.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r6, r9)
            int r12 = defpackage.tnc.TextInputEditText_textInputLayoutFocusedRectEnabled
            boolean r12 = r11.getBoolean(r12, r7)
            r10.setTextInputLayoutFocusedRectEnabled(r12)
            r11.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputEditText.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.x && rect != null) {
            Rect rect2 = this.w;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.x) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.Q0) ? super.getHint() : textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Q0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.x || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom + height;
        Rect rect2 = this.w;
        rect2.set(i, i2, i3, i4);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.x = z;
    }
}
