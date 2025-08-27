package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public final class MaterialDatePicker<S> extends DialogFragment {
    public final LinkedHashSet B1 = new LinkedHashSet();
    public final LinkedHashSet C1 = new LinkedHashSet();
    public int D1;
    public PickerFragment E1;
    public ly0 F1;
    public MaterialCalendar G1;
    public int H1;
    public CharSequence I1;
    public boolean J1;
    public int K1;
    public int L1;
    public CharSequence M1;
    public int N1;
    public CharSequence O1;
    public int P1;
    public CharSequence Q1;
    public int R1;
    public CharSequence S1;
    public TextView T1;
    public CheckableImageButton U1;
    public bh8 V1;
    public boolean W1;
    public CharSequence X1;
    public CharSequence Y1;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int a3(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(iec.mtrl_calendar_content_padding);
        Calendar c = q0g.c();
        c.set(5, 1);
        Calendar b = q0g.b(c);
        b.get(2);
        b.get(1);
        int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(iec.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(iec.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean b3(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b59.V(edc.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final Dialog V2(Bundle bundle) {
        Context G2 = G2();
        G2();
        int i = this.D1;
        if (i != 0) {
            Dialog dialog = new Dialog(G2, i);
            Context context = dialog.getContext();
            this.J1 = b3(16843277, context);
            this.V1 = new bh8(context, (AttributeSet) null, edc.materialCalendarStyle, hnc.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, tnc.MaterialCalendar, edc.materialCalendarStyle, hnc.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(tnc.MaterialCalendar_backgroundTint, 0);
            obtainStyledAttributes.recycle();
            this.V1.j(context);
            this.V1.l(ColorStateList.valueOf(color));
            bh8 bh8 = this.V1;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = gag.a;
            bh8.k(v9g.i(decorView));
            return dialog;
        }
        Z2();
        throw null;
    }

    public final void Z2() {
        wj6.s(this.x.getParcelable("DATE_SELECTOR_KEY"));
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            bundle = this.x;
        }
        this.D1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        wj6.s(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.F1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wj6.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.H1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.I1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.K1 = bundle.getInt("INPUT_MODE_KEY");
        this.L1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.N1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.P1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.R1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.I1;
        if (charSequence == null) {
            charSequence = G2().getResources().getText(this.H1);
        }
        this.X1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.Y1 = charSequence;
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.J1 ? qjc.mtrl_picker_fullscreen : qjc.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.J1) {
            inflate.findViewById(agc.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(a3(context), -2));
        } else {
            inflate.findViewById(agc.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(a3(context), -1));
        }
        WeakHashMap weakHashMap = gag.a;
        ((TextView) inflate.findViewById(agc.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.U1 = (CheckableImageButton) inflate.findViewById(agc.mtrl_picker_header_toggle);
        this.T1 = (TextView) inflate.findViewById(agc.mtrl_picker_title_text);
        this.U1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.U1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, iq.D(context, qfc.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], iq.D(context, qfc.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.U1;
        if (this.K1 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        gag.j(this.U1, (v3) null);
        CheckableImageButton checkableImageButton3 = this.U1;
        this.U1.setContentDescription(this.K1 == 1 ? checkableImageButton3.getContext().getString(ymc.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton3.getContext().getString(ymc.mtrl_picker_toggle_to_text_input_mode));
        this.U1.setOnClickListener(new xu3(23, (Object) this));
        Button button = (Button) inflate.findViewById(agc.confirm_button);
        Z2();
        throw null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.B1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.C1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.S0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ky0, java.lang.Object] */
    public final void x2(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.x2(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.D1);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        ly0 ly0 = this.F1;
        ? obj = new Object();
        int i = ky0.b;
        int i2 = ky0.b;
        long j = ly0.a.w;
        long j2 = ly0.b.w;
        obj.a = Long.valueOf(ly0.o.w);
        MaterialCalendar materialCalendar = this.G1;
        at9 at9 = materialCalendar == null ? null : materialCalendar.o1;
        if (at9 != null) {
            obj.a = Long.valueOf(at9.w);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", ly0.c);
        at9 b = at9.b(j);
        at9 b2 = at9.b(j2);
        l84 l84 = (l84) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new ly0(b, b2, l84, l == null ? null : at9.b(l.longValue()), ly0.v));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.H1);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.I1);
        bundle2.putInt("INPUT_MODE_KEY", this.K1);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L1);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M1);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N1);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O1);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q1);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: kog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: kog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: jog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: jog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y2() {
        /*
            r11 = this;
            super.y2()
            android.app.Dialog r0 = r11.W2()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r11.J1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00e8
            r1 = -1
            r0.setLayout(r1, r1)
            bh8 r1 = r11.V1
            r0.setBackgroundDrawable(r1)
            boolean r1 = r11.W1
            if (r1 != 0) goto L_0x0119
            android.view.View r1 = r11.I2()
            int r4 = defpackage.agc.fullscreen_header
            android.view.View r1 = r1.findViewById(r4)
            android.graphics.drawable.Drawable r4 = r1.getBackground()
            android.content.res.ColorStateList r4 = defpackage.gsg.m(r4)
            if (r4 == 0) goto L_0x003b
            int r4 = r4.getDefaultColor()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            r5 = 0
            if (r4 == 0) goto L_0x0048
            int r6 = r4.intValue()
            if (r6 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r6 = r5
            goto L_0x0049
        L_0x0048:
            r6 = r3
        L_0x0049:
            android.content.Context r7 = r0.getContext()
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = defpackage.ld9.y(r8, r9, r7)
            if (r6 == 0) goto L_0x005c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
        L_0x005c:
            defpackage.hd8.U(r0, r5)
            r0.getContext()
            r0.getContext()
            r0.setStatusBarColor(r5)
            r0.setNavigationBarColor(r5)
            int r4 = r4.intValue()
            boolean r4 = defpackage.ld9.G(r4)
            boolean r6 = defpackage.ld9.G(r5)
            if (r6 != 0) goto L_0x007e
            if (r4 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r4 = r5
            goto L_0x007f
        L_0x007e:
            r4 = r3
        L_0x007f:
            android.view.View r6 = r0.getDecorView()
            p3a r8 = new p3a
            r8.<init>((android.view.View) r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r6 < r9) goto L_0x009a
            kog r6 = new kog
            android.view.WindowInsetsController r10 = r0.getInsetsController()
            r6.<init>(r10, r8)
            r6.x0 = r0
            goto L_0x009f
        L_0x009a:
            jog r6 = new jog
            r6.<init>(r0, r8)
        L_0x009f:
            r6.t0(r4)
            boolean r4 = defpackage.ld9.G(r7)
            boolean r6 = defpackage.ld9.G(r5)
            if (r6 != 0) goto L_0x00ae
            if (r4 == 0) goto L_0x00af
        L_0x00ae:
            r5 = r3
        L_0x00af:
            android.view.View r4 = r0.getDecorView()
            p3a r6 = new p3a
            r6.<init>((android.view.View) r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r9) goto L_0x00c8
            kog r4 = new kog
            android.view.WindowInsetsController r7 = r0.getInsetsController()
            r4.<init>(r7, r6)
            r4.x0 = r0
            goto L_0x00cd
        L_0x00c8:
            jog r4 = new jog
            r4.<init>(r0, r6)
        L_0x00cd:
            r4.s0(r5)
            int r0 = r1.getPaddingTop()
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            int r4 = r4.height
            ila r5 = new ila
            r6 = 7
            r5.<init>(r1, r4, r0, r6)
            java.util.WeakHashMap r0 = defpackage.gag.a
            defpackage.v9g.u(r1, r5)
            r11.W1 = r3
            goto L_0x0119
        L_0x00e8:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r11.R1()
            int r4 = defpackage.iec.mtrl_calendar_dialog_background_inset
            int r10 = r1.getDimensionPixelOffset(r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r10, r10, r10, r10)
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            bh8 r6 = r11.V1
            r5 = r4
            r7 = r10
            r8 = r10
            r9 = r10
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setBackgroundDrawable(r4)
            android.view.View r0 = r0.getDecorView()
            uh7 r4 = new uh7
            android.app.Dialog r5 = r11.W2()
            r4.<init>(r5, r1)
            r0.setOnTouchListener(r4)
        L_0x0119:
            r11.G2()
            int r0 = r11.D1
            if (r0 == 0) goto L_0x0194
            r11.Z2()
            ly0 r1 = r11.F1
            com.google.android.material.datepicker.MaterialCalendar r4 = new com.google.android.material.datepicker.MaterialCalendar
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r2)
            java.lang.String r7 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r8 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r8, r2)
            at9 r1 = r1.o
            java.lang.String r8 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r8, r1)
            r4.L2(r5)
            r11.G1 = r4
            int r1 = r11.K1
            if (r1 != r3) goto L_0x0170
            r11.Z2()
            ly0 r1 = r11.F1
            com.google.android.material.datepicker.MaterialTextInputPicker r4 = new com.google.android.material.datepicker.MaterialTextInputPicker
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r5.putParcelable(r0, r2)
            r5.putParcelable(r7, r1)
            r4.L2(r5)
        L_0x0170:
            r11.E1 = r4
            android.widget.TextView r0 = r11.T1
            int r1 = r11.K1
            if (r1 != r3) goto L_0x0188
            android.content.res.Resources r1 = r11.R1()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r3 = 2
            if (r1 != r3) goto L_0x0188
            java.lang.CharSequence r1 = r11.Y1
            goto L_0x018a
        L_0x0188:
            java.lang.CharSequence r1 = r11.X1
        L_0x018a:
            r0.setText(r1)
            r11.Z2()
            r11.O1()
            throw r2
        L_0x0194:
            r11.Z2()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialDatePicker.y2():void");
    }

    public final void z2() {
        this.E1.l1.clear();
        super.z2();
    }
}
