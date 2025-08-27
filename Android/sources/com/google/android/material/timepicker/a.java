package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;

public final class a extends chf {
    public final /* synthetic */ ChipTextInputComboView a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.a = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.a;
        if (isEmpty) {
            chipTextInputComboView.a.setText(ijf.a(chipTextInputComboView.getResources(), "00", "%02d"));
            return;
        }
        int i = ChipTextInputComboView.v;
        String a2 = ijf.a(chipTextInputComboView.getResources(), editable, "%02d");
        if (TextUtils.isEmpty(a2)) {
            a2 = ijf.a(chipTextInputComboView.getResources(), "00", "%02d");
        }
        chipTextInputComboView.a.setText(a2);
    }
}
