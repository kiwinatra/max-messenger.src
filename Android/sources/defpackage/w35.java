package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: w35  reason: default package */
public final class w35 implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public u35 c;
    public int o = IntCompanionObject.MAX_VALUE;
    public int v = 0;
    public boolean w;

    public w35(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
        this.w = true;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            s15.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.w) {
            if ((this.b || s15.p != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
                int b2 = s15.a().b();
                if (b2 != 0) {
                    if (b2 == 1) {
                        int i4 = i;
                        s15.a().g(i4, i + i3, (Spannable) charSequence, this.o, this.v);
                        return;
                    } else if (b2 != 3) {
                        return;
                    }
                }
                s15 a2 = s15.a();
                if (this.c == null) {
                    this.c = new u35(editText);
                }
                a2.i(this.c);
            }
        }
    }
}
