package defpackage;

import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: oxc  reason: default package */
public final /* synthetic */ class oxc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordExitBottomSheet b;

    public /* synthetic */ oxc(RecordExitBottomSheet recordExitBottomSheet, int i) {
        this.a = i;
        this.b = recordExitBottomSheet;
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [android.widget.TextView, android.widget.CompoundButton, android.view.View, java.lang.Object, androidx.appcompat.widget.AppCompatCheckBox, bz2] */
    public final Object invoke() {
        RecordExitBottomSheet recordExitBottomSheet = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RecordExitBottomSheet.F0;
                return ev0.i(recordExitBottomSheet.getContext());
            case 1:
                KProperty[] kPropertyArr2 = RecordExitBottomSheet.F0;
                TextView textView = new TextView(recordExitBottomSheet.getContext());
                textView.setId(qqa.D0);
                puf.c.b(textView, uy4.b);
                textView.setTextColor(l2b.i.e);
                textView.setGravity(17);
                textView.setPadding(0, MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), 0, 0);
                return textView;
            case 2:
                KProperty[] kPropertyArr3 = RecordExitBottomSheet.F0;
                TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                textView2.setId(qqa.C0);
                puf.o.b(textView2, uy4.b);
                textView2.setTextColor(l2b.i.f);
                textView2.setGravity(17);
                return textView2;
            case 3:
                KProperty[] kPropertyArr4 = RecordExitBottomSheet.F0;
                OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton.setId(qqa.y0);
                oneMeButton.setAppearance(xpa.b);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setCustomTheme(l2b.a);
                return oneMeButton;
            case 4:
                KProperty[] kPropertyArr5 = RecordExitBottomSheet.F0;
                OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton2.setId(qqa.z0);
                oneMeButton2.setAppearance(xpa.c);
                oneMeButton2.setSize(aqa.c);
                oneMeButton2.setCustomTheme(l2b.a);
                return oneMeButton2;
            case 5:
                KProperty[] kPropertyArr6 = RecordExitBottomSheet.F0;
                r1e r1e = new r1e(recordExitBottomSheet.getContext(), (AttributeSet) null);
                r1e.setDisableStartIconText(true);
                int i = qqa.A0;
                r1e.setId(i);
                r1e.setItemId((long) i);
                int i2 = pqa.K;
                int i3 = l2b.c.a;
                Drawable b2 = ew3.b(recordExitBottomSheet.getContext(), i2);
                if (b2 != null) {
                    ru4.g(b2, i3);
                    ru4.i(b2, PorterDuff.Mode.SRC_IN);
                }
                r1e.setStartIcon(b2);
                r1e.setType(h1e.b);
                float[] fArr = new float[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    fArr[i4] = vo4.c().getDisplayMetrics().density * 16.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(l2b.d.a.g);
                r1e.setBackground(shapeDrawable);
                r1e.setThemeDepended(m1e.b);
                return r1e;
            default:
                KProperty[] kPropertyArr7 = RecordExitBottomSheet.F0;
                ? appCompatCheckBox = new AppCompatCheckBox(recordExitBottomSheet.getContext(), (AttributeSet) null);
                appCompatCheckBox.setId(qqa.B0);
                appCompatCheckBox.setText(sqa.l0);
                puf.i.b(appCompatCheckBox, uy4.b);
                l2b l2b = l2b.a;
                appCompatCheckBox.setTextColor(l2b.i.e);
                Lazy lazy = recordExitBottomSheet.w0;
                ev0.e((StateListDrawable) lazy.getValue(), l2b);
                appCompatCheckBox.setButtonDrawable((Drawable) (StateListDrawable) lazy.getValue());
                appCompatCheckBox.setChecked(true);
                appCompatCheckBox.setVisibility(8);
                appCompatCheckBox.setPaddingBetweenCheckbox(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                return appCompatCheckBox;
        }
    }
}
