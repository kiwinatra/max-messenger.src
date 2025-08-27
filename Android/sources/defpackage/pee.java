package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: pee  reason: default package */
public final class pee extends tyc {
    public static final /* synthetic */ KProperty[] y = {rae.s(pee.class, "isSecure", "isSecure()Z", 0)};
    public final int o;
    public final fg7 v;
    public final Function0 w;
    public final bl x = new bl(this);

    public pee(int i, fg7 fg7, zj2 zj2) {
        this.o = i;
        this.v = fg7;
        this.w = zj2;
        Delegates delegates = Delegates.INSTANCE;
    }

    public final int j() {
        return this.o;
    }

    public final void s(pzc pzc, int i) {
        oee oee = (oee) pzc;
        boolean booleanValue = ((Boolean) this.x.getValue(this, y[0])).booleanValue();
        gg3 gg3 = oee.F0;
        gg3.setSecure(booleanValue);
        gg3.addTextChangedListener(new nee(oee, i));
        gg3.setOnKeyListener(new mee(oee, i));
        bab bab = new bab(gg3.getContext(), oee.E0, i, oee.D0);
        gg3.setCustomSelectionActionModeCallback(bab);
        gg3.setCustomInsertionActionModeCallback(bab);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [gg3, android.widget.TextView, android.view.View, android.widget.EditText] */
    public final pzc u(ViewGroup viewGroup, int i) {
        ? editText = new EditText(viewGroup.getContext(), (AttributeSet) null);
        editText.setId(khc.one_me_codeinput_edit_text_view);
        editText.setMinimumWidth(MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
        editText.setMinimumHeight(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        editText.setInputType(2);
        editText.setGravity(17);
        editText.setFilters(new InputFilter[]{gg3.c});
        puf.b.b(editText, uy4.b);
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new n04((float) MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density)));
        editText.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.onThemeChanged(fu4.k.e(editText.getContext()).f());
        editText.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new oee(this, this.o, this.v, editText);
    }
}
