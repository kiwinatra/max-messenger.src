package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Lazy;

public class InputDialog extends DialogFragment {
    public int B1;
    public int C1;
    public String D1;
    public boolean E1;

    public static InputDialog Z2(int i, int i2, String str, int i3, int i4, int i5, int i6, boolean z) {
        InputDialog inputDialog = new InputDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", i);
        bundle.putInt("ru.ok.tamtam.extra.HINT", i2);
        bundle.putString("ru.ok.tamtam.extra.PREFILL", str);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_RES_ID", i3);
        bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_RES_ID", i4);
        bundle.putInt("ru.ok.tamtam.extra.INPUT_TYPE", i5);
        bundle.putInt("ru.ok.tamtam.extra.MAX_LENGTH", i6);
        bundle.putBoolean("ru.ok.tamtam.extra.EMPTY_INPUT", z);
        inputDialog.L2(bundle);
        return inputDialog;
    }

    public final Dialog V2(Bundle bundle) {
        Bundle F2 = F2();
        Context G2 = G2();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(G2);
        int i = F2.getInt("ru.ok.tamtam.extra.TITLE_RES_ID");
        String S1 = S1(F2.getInt("ru.ok.tamtam.extra.POSITIVE_RES_ID"));
        String S12 = S1(F2.getInt("ru.ok.tamtam.extra.NEGATIVE_RES_ID"));
        int i2 = F2.getInt("ru.ok.tamtam.extra.HINT");
        this.D1 = F2.getString("ru.ok.tamtam.extra.PREFILL");
        int i3 = F2.getInt("ru.ok.tamtam.extra.INPUT_TYPE");
        this.B1 = F2.getInt("ru.ok.tamtam.extra.MAX_LENGTH");
        this.C1 = F2.getBoolean("ru.ok.tamtam.extra.EMPTY_INPUT") ^ true ? 1 : 0;
        LayoutInflater layoutInflater = this.X0;
        if (layoutInflater == null) {
            layoutInflater = D2();
        }
        View inflate = layoutInflater.inflate(ujc.dialog_input, (ViewGroup) null);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(lic.dialog_input__layout_input);
        TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(lic.dialog_input__et_input);
        TextView textView = (TextView) inflate.findViewById(lic.dialog_input__title);
        textView.setTextColor(k0.G);
        textInputLayout.setCounterEnabled(true);
        iq.k(k0, textInputLayout);
        textInputLayout.setCounterMaxLength(this.B1);
        int i4 = k0.G;
        textInputLayout.setCounterTextColor(ColorStateList.valueOf(i4));
        textInputEditText.setInputType(i3);
        textInputEditText.selectAll();
        textInputEditText.setPadding(0, textInputEditText.getPaddingTop(), 0, textInputEditText.getPaddingBottom());
        textInputEditText.setTextColor(i4);
        textInputEditText.setHighlightColor(k0.l);
        textInputEditText.setHintTextColor(k0.K);
        textInputEditText.setBackgroundColor(k0.n);
        textInputEditText.setOnEditorActionListener(new mg7(this, textInputEditText));
        textInputEditText.addTextChangedListener(new u2(6, this));
        textInputEditText.setHint(i2);
        textInputEditText.setText(this.D1);
        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.B1)});
        textView.setText(i);
        cg8 s = new cg8(G2()).s(inflate);
        s.a.n = this;
        s.o(S1, new w13(this, textInputEditText, 8));
        s.m(S12, new d10(15, (Object) this));
        ed g = s.g();
        cd cdVar = g.w;
        cdVar.k.setEnabled(false);
        b3(cdVar.k, this.D1);
        b E2 = E2();
        if (!E2.isFinishing()) {
            textInputEditText.requestFocus();
            textInputEditText.post(new uo5(18, (Object) E2, (Object) textInputEditText));
        }
        g.getWindow().setSoftInputMode(32);
        return g;
    }

    public final void a3(AppCompatEditText appCompatEditText) {
        if (!this.E1) {
            Intent intent = new Intent();
            intent.putExtra("ru.ok.tamtam.extra.INPUT_RESULT", appCompatEditText.getText().toString().trim());
            a U1 = U1(true);
            if (U1 != null) {
                U1.f2(V1(), -1, intent);
            }
        }
        this.E1 = true;
    }

    public final void b3(Button button, String str) {
        boolean z = false;
        int length = str != null ? str.length() : 0;
        if (length >= this.C1 && length <= this.B1 && !cvg.c(str, this.D1)) {
            z = true;
        }
        button.setEnabled(z);
        button.setAlpha(z ? 1.0f : 0.2f);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.E1) {
            a U1 = U1(true);
            if (U1 != null) {
                U1.f2(V1(), 0, (Intent) null);
            }
            this.E1 = true;
        }
    }
}
