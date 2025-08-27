package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public final class f implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView a;
    public final ChipTextInputComboView b;
    public final ijf c;
    public boolean o = false;

    public f(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, ijf ijf) {
        this.a = chipTextInputComboView;
        this.b = chipTextInputComboView2;
        this.c = ijf;
    }

    public final void a(int i) {
        boolean z = false;
        this.b.setChecked(i == 12);
        if (i == 10) {
            z = true;
        }
        this.a.setChecked(z);
        this.c.w = i;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            a(12);
        }
        return z;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.o) {
            return false;
        }
        boolean z = true;
        this.o = true;
        EditText editText = (EditText) view;
        if (this.c.w != 12) {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    a(12);
                    this.o = false;
                    return z;
                } else if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
            }
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
            this.o = false;
            return z;
        } else if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
        z = false;
        this.o = false;
        return z;
    }
}
