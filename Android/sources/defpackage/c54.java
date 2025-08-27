package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: c54  reason: default package */
public final class c54 extends LinearLayout {
    public int a = IntCompanionObject.MAX_VALUE;
    public final EditText b;
    public final TextView c;

    public c54(Context context) {
        super(context, (AttributeSet) null);
        EditText editText = new EditText(context);
        puf.k.b(editText, uy4.b);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        editText.setHintTextColor(fu4.k.e(editText.getContext()).f().getText().h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.b = editText;
        TextView textView = new TextView(context);
        puf.u.b(textView, uy4.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.c = textView;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 16.0f));
        addView(editText);
        addView(textView);
        float f = (float) 12;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        b0h.H(this, new sa(3, (Continuation) null, 7));
    }

    public final String getText() {
        return this.b.getText().toString();
    }

    public final void setHint(CharSequence charSequence) {
        this.b.setHint(charSequence);
    }

    public final void setMaxCount(int i) {
        this.a = i;
        TextView textView = this.c;
        EditText editText = this.b;
        Editable text = editText.getText();
        textView.setText(String.valueOf(i - (text != null ? text.length() : 0)));
        editText.setFilters(this.a != Integer.MAX_VALUE ? (InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.a)} : new InputFilter[0]);
    }

    public final void setTextChangeListener(Function1<? super String, Unit> function1) {
        this.b.addTextChangedListener(new ne1(2, function1, this));
    }
}
