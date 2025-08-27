package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wfb  reason: default package */
public final class wfb extends orb {
    public final grg v0;

    public wfb(Context context, boolean z, grg grg) {
        super(context);
        this.v0 = grg;
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        js9 js9 = fu4.k;
        setBackground(new ColorDrawable(js9.e(getContext()).f().c().d));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setClipToPadding(false);
        frameLayout.setBackground(new ColorDrawable(js9.e(frameLayout.getContext()).f().c().f));
        frameLayout.setOutlineProvider(new lr0(vo4.c().getDisplayMetrics().density * 20.0f, 1));
        int roundToInt = MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
        frameLayout.setPadding(0, roundToInt, 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(1);
        appCompatTextView.setText(qmc.oneme_pick_photo_bottom_dialog_title);
        puf.b.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        linearLayout.addView(appCompatTextView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        aqa aqa = aqa.c;
        oneMeButton.setSize(aqa);
        zpa zpa = zpa.o;
        oneMeButton.setMode(zpa);
        xpa xpa = xpa.a;
        oneMeButton.setAppearance(xpa);
        oneMeButton.setText(qmc.oneme_pick_photo_bottom_dialog_gallery_button_text);
        ct.G(oneMeButton, 300, new ufb(this, 0));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 1;
        oneMeButton2.setLayoutParams(layoutParams2);
        oneMeButton2.setSize(aqa);
        oneMeButton2.setMode(zpa);
        oneMeButton2.setAppearance(xpa);
        oneMeButton2.setText(qmc.oneme_pick_photo_bottom_dialog_camera_button_text);
        ct.G(oneMeButton2, 300, new ufb(this, 1));
        linearLayout.addView(oneMeButton2);
        if (z) {
            OneMeButton oneMeButton3 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton3.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 1;
            oneMeButton3.setLayoutParams(layoutParams3);
            oneMeButton3.setSize(aqa);
            oneMeButton3.setMode(zpa);
            oneMeButton3.setAppearance(xpa.b);
            oneMeButton3.setText(qmc.oneme_pick_photo_bottom_dialog_delete_button_text);
            ct.G(oneMeButton3, 300, new ufb(this, 2));
            linearLayout.addView(oneMeButton3);
        }
        OneMeButton oneMeButton4 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton4.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 1;
        oneMeButton4.setLayoutParams(layoutParams4);
        oneMeButton4.setSize(aqa);
        oneMeButton4.setMode(zpa);
        oneMeButton4.setAppearance(xpa.o);
        oneMeButton4.setText(qmc.oneme_pick_photo_bottom_dialog_cancel_button_text);
        ct.G(oneMeButton4, 300, new ufb(this, 3));
        linearLayout.addView(oneMeButton4);
        frameLayout.addView(linearLayout);
        nu4 nu4 = new nu4(context);
        nu4.setTranslationY((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, -roundToInt));
        frameLayout.addView(nu4);
        addView(frameLayout);
        setCallback(new vfb(frameLayout, this));
    }
}
