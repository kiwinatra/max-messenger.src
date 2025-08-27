package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Locale;

public final class g implements qjf, mjf {
    public final LinearLayout a;
    public final ijf b;
    public final ojf c;
    public final ojf o;
    public final ChipTextInputComboView v;
    public final ChipTextInputComboView w;
    public final EditText x;
    public final EditText y;
    public final MaterialButtonToggleGroup z;

    public g(LinearLayout linearLayout, ijf ijf) {
        ojf ojf = new ojf(0, this);
        this.c = ojf;
        ojf ojf2 = new ojf(1, this);
        this.o = ojf2;
        this.a = linearLayout;
        this.b = ijf;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(agc.material_minute_text_input);
        this.v = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(agc.material_hour_text_input);
        this.w = chipTextInputComboView2;
        ((TextView) chipTextInputComboView.findViewById(agc.material_label)).setText(resources.getString(ymc.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(agc.material_label)).setText(resources.getString(ymc.material_timepicker_hour));
        chipTextInputComboView.setTag(agc.selection_type, 12);
        chipTextInputComboView2.setTag(agc.selection_type, 10);
        if (ijf.c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(agc.material_clock_period_toggle);
            this.z = materialButtonToggleGroup;
            materialButtonToggleGroup.c.add(new njf(this));
            this.z.setVisibility(0);
            f();
        }
        wld wld = new wld(14, this);
        chipTextInputComboView2.setOnClickListener(wld);
        chipTextInputComboView.setOnClickListener(wld);
        EditText editText = chipTextInputComboView2.c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = ijf.b;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = ijf.a;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.b;
        EditText editText3 = textInputLayout.getEditText();
        this.x = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.b;
        EditText editText4 = textInputLayout2.getEditText();
        this.y = editText4;
        f fVar = new f(chipTextInputComboView2, chipTextInputComboView, ijf);
        gag.j(chipTextInputComboView2.a, new pjf(linearLayout.getContext(), ymc.material_hour_selection, ijf, 0));
        gag.j(chipTextInputComboView.a, new pjf(linearLayout.getContext(), ymc.material_minute_selection, ijf, 1));
        editText3.addTextChangedListener(ojf2);
        editText4.addTextChangedListener(ojf);
        e(ijf);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(fVar);
        editText5.setOnKeyListener(fVar);
        editText6.setOnKeyListener(fVar);
    }

    public final void a() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.a;
        View focusedChild = linearLayout.getFocusedChild();
        if (!(focusedChild == null || (inputMethodManager = (InputMethodManager) fw3.b(focusedChild.getContext(), InputMethodManager.class)) == null)) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    public final void b() {
        this.a.setVisibility(0);
        c(this.b.w);
    }

    public final void c(int i) {
        this.b.w = i;
        boolean z2 = false;
        this.v.setChecked(i == 12);
        if (i == 10) {
            z2 = true;
        }
        this.w.setChecked(z2);
        f();
    }

    public final void d() {
        ijf ijf = this.b;
        boolean z2 = false;
        this.v.setChecked(ijf.w == 12);
        if (ijf.w == 10) {
            z2 = true;
        }
        this.w.setChecked(z2);
    }

    public final void e(ijf ijf) {
        EditText editText = this.x;
        ojf ojf = this.o;
        editText.removeTextChangedListener(ojf);
        EditText editText2 = this.y;
        ojf ojf2 = this.c;
        editText2.removeTextChangedListener(ojf2);
        Locale locale = this.a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(ijf.v)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(ijf.b())});
        ChipTextInputComboView chipTextInputComboView = this.v;
        String a2 = ijf.a(chipTextInputComboView.getResources(), format, "%02d");
        chipTextInputComboView.a.setText(a2);
        if (!TextUtils.isEmpty(a2)) {
            a aVar = chipTextInputComboView.o;
            EditText editText3 = chipTextInputComboView.c;
            editText3.removeTextChangedListener(aVar);
            editText3.setText(a2);
            editText3.addTextChangedListener(aVar);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.w;
        String a3 = ijf.a(chipTextInputComboView2.getResources(), format2, "%02d");
        chipTextInputComboView2.a.setText(a3);
        if (!TextUtils.isEmpty(a3)) {
            a aVar2 = chipTextInputComboView2.o;
            EditText editText4 = chipTextInputComboView2.c;
            editText4.removeTextChangedListener(aVar2);
            editText4.setText(a3);
            editText4.addTextChangedListener(aVar2);
        }
        editText.addTextChangedListener(ojf);
        editText2.addTextChangedListener(ojf2);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.z;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.b(this.b.x == 0 ? agc.material_clock_period_am_button : agc.material_clock_period_pm_button, true);
        }
    }

    public final void invalidate() {
        e(this.b);
    }
}
