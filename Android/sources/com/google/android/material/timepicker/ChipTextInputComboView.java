package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int v = 0;
    public final Chip a;
    public final TextInputLayout b;
    public final EditText c;
    public final a o;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(qjc.material_time_chip, this, false);
        this.a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(qjc.material_time_input, this, false);
        this.b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.c = editText;
        editText.setVisibility(4);
        a aVar = new a(this);
        this.o = aVar;
        editText.addTextChangedListener(aVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = gag.a;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(agc.material_label)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public final boolean isChecked() {
        return this.a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z) {
        Chip chip = this.a;
        chip.setChecked(z);
        int i = 0;
        int i2 = z ? 0 : 4;
        EditText editText = this.c;
        editText.setVisibility(i2);
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new c3a(editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.a.setTag(i, obj);
    }

    public final void toggle() {
        this.a.toggle();
    }
}
