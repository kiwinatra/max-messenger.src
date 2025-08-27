package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: pz2  reason: default package */
public final class pz2 extends ud5 {
    public final /* synthetic */ Chip q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pz2(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    public final int n(float f, float f2) {
        int i = Chip.J0;
        Chip chip = this.q;
        return (!chip.e() || !chip.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
    }

    public final void o(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        int i = Chip.J0;
        Chip chip = this.q;
        if (chip.e()) {
            rz2 rz2 = chip.v;
            if (rz2 != null && rz2.U0) {
                z = true;
            }
            if (z && chip.y != null) {
                arrayList.add(1);
            }
        }
    }

    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.y;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.F0) {
                    chip.E0.x(1, 1);
                }
            }
        }
        return z;
    }

    public final void t(g4 g4Var) {
        Chip chip = this.q;
        boolean f = chip.f();
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        accessibilityNodeInfo.setCheckable(f);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        g4Var.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final void u(int i, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                g4Var.j(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i2 = ymc.mtrl_chip_close_icon_content_description;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                g4Var.j(context.getString(i2, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            g4Var.b(a4.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        g4Var.j(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.K0);
    }

    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.z0 = z;
            chip.refreshDrawableState();
        }
    }
}
