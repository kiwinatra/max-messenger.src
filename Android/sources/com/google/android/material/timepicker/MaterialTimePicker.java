package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public final class MaterialTimePicker extends DialogFragment {
    public final LinkedHashSet B1 = new LinkedHashSet();
    public final LinkedHashSet C1 = new LinkedHashSet();
    public final LinkedHashSet D1 = new LinkedHashSet();
    public final LinkedHashSet E1 = new LinkedHashSet();
    public TimePickerView F1;
    public ViewStub G1;
    public e H1;
    public g I1;
    public mjf J1;
    public int K1;
    public int L1;
    public int M1 = 0;
    public CharSequence N1;
    public int O1 = 0;
    public CharSequence P1;
    public int Q1 = 0;
    public CharSequence R1;
    public MaterialButton S1;
    public Button T1;
    public int U1 = 0;
    public ijf V1;
    public int W1 = 0;

    public final void A2(View view, Bundle bundle) {
        if (this.J1 instanceof g) {
            view.postDelayed(new y86(22, (Object) this), 100);
        }
    }

    public final Dialog V2(Bundle bundle) {
        Context G2 = G2();
        int i = this.W1;
        if (i == 0) {
            TypedValue T = b59.T(edc.materialTimePickerTheme, G2());
            i = T == null ? 0 : T.data;
        }
        Dialog dialog = new Dialog(G2, i);
        Context context = dialog.getContext();
        bh8 bh8 = new bh8(context, (AttributeSet) null, edc.materialTimePickerStyle, hnc.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, tnc.MaterialTimePicker, edc.materialTimePickerStyle, hnc.Widget_MaterialComponents_TimePicker);
        this.L1 = obtainStyledAttributes.getResourceId(tnc.MaterialTimePicker_clockIcon, 0);
        this.K1 = obtainStyledAttributes.getResourceId(tnc.MaterialTimePicker_keyboardIcon, 0);
        int color = obtainStyledAttributes.getColor(tnc.MaterialTimePicker_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        bh8.j(context);
        bh8.l(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(bh8);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = gag.a;
        bh8.k(v9g.i(decorView));
        return dialog;
    }

    public final void Z2(MaterialButton materialButton) {
        e eVar;
        Pair pair;
        if (materialButton != null && this.F1 != null && this.G1 != null) {
            mjf mjf = this.J1;
            if (mjf != null) {
                mjf.a();
            }
            int i = this.U1;
            TimePickerView timePickerView = this.F1;
            ViewStub viewStub = this.G1;
            if (i == 0) {
                e eVar2 = this.H1;
                e eVar3 = eVar2;
                if (eVar2 == null) {
                    eVar3 = new e(timePickerView, this.V1);
                }
                this.H1 = eVar3;
                eVar = eVar3;
            } else {
                if (this.I1 == null) {
                    this.I1 = new g((LinearLayout) viewStub.inflate(), this.V1);
                }
                g gVar = this.I1;
                gVar.v.setChecked(false);
                gVar.w.setChecked(false);
                eVar = this.I1;
            }
            this.J1 = eVar;
            eVar.b();
            this.J1.invalidate();
            int i2 = this.U1;
            if (i2 == 0) {
                pair = new Pair(Integer.valueOf(this.K1), Integer.valueOf(ymc.material_timepicker_text_input_mode_description));
            } else if (i2 == 1) {
                pair = new Pair(Integer.valueOf(this.L1), Integer.valueOf(ymc.material_timepicker_clock_mode_description));
            } else {
                throw new IllegalArgumentException(wj6.h(i2, "no icon for mode: "));
            }
            materialButton.setIconResource(((Integer) pair.first).intValue());
            materialButton.setContentDescription(R1().getString(((Integer) pair.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            bundle = this.x;
        }
        if (bundle != null) {
            ijf ijf = (ijf) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
            this.V1 = ijf;
            if (ijf == null) {
                this.V1 = new ijf(0);
            }
            int i = 1;
            if (this.V1.c != 1) {
                i = 0;
            }
            this.U1 = bundle.getInt("TIME_PICKER_INPUT_MODE", i);
            this.M1 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
            this.N1 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.O1 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.P1 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.Q1 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.R1 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.W1 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(qjc.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(agc.material_timepicker_view);
        this.F1 = timePickerView;
        timePickerView.L0 = this;
        this.G1 = (ViewStub) viewGroup2.findViewById(agc.material_textinput_timepicker);
        this.S1 = (MaterialButton) viewGroup2.findViewById(agc.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(agc.header_title);
        int i = this.M1;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.N1)) {
            textView.setText(this.N1);
        }
        Z2(this.S1);
        Button button = (Button) viewGroup2.findViewById(agc.material_timepicker_ok_button);
        button.setOnClickListener(new gh8(this, 0));
        int i2 = this.O1;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.P1)) {
            button.setText(this.P1);
        }
        Button button2 = (Button) viewGroup2.findViewById(agc.material_timepicker_cancel_button);
        this.T1 = button2;
        button2.setOnClickListener(new gh8(this, 1));
        int i3 = this.Q1;
        if (i3 != 0) {
            this.T1.setText(i3);
        } else if (!TextUtils.isEmpty(this.R1)) {
            this.T1.setText(this.R1);
        }
        Button button3 = this.T1;
        if (button3 != null) {
            button3.setVisibility(this.r1 ? 0 : 8);
        }
        this.S1.setOnClickListener(new gh8(this, 2));
        return viewGroup2;
    }

    public final void m2() {
        super.m2();
        this.J1 = null;
        this.H1 = null;
        this.I1 = null;
        TimePickerView timePickerView = this.F1;
        if (timePickerView != null) {
            timePickerView.L0 = null;
            this.F1 = null;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.D1) {
            onCancel.onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.E1) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.V1);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.U1);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.M1);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.N1);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.O1);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.P1);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.Q1);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.R1);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.W1);
    }
}
