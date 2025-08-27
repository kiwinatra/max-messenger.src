package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: lm4  reason: default package */
public final class lm4 extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] y;
    public final km4 a = new km4(this, 0);
    public final km4 b = new km4(this, 1);
    public final km4 c = new km4(Integer.valueOf(jya.K), this, 2);
    public final km4 o = new km4(Integer.valueOf(jya.M), this, 3);
    public final km4 v = new km4(Integer.valueOf(jya.L), this, 4);
    public final EditText w;
    public final TextView x;

    static {
        Class<lm4> cls = lm4.class;
        y = new KProperty[]{rae.s(cls, "maxCount", "getMaxCount()I", 0), rae.s(cls, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;", 0), rae.s(cls, "textColorAttr", "getTextColorAttr()I", 0), rae.s(cls, "hintColorAttr", "getHintColorAttr()I", 0), rae.s(cls, "limitTextColorAttr", "getLimitTextColorAttr()I", 0)};
    }

    public lm4(Context context) {
        super(context, (AttributeSet) null);
        Delegates delegates = Delegates.INSTANCE;
        EditText editText = new EditText(context);
        editText.setId(dad.L);
        puf.k.b(editText, uy4.b);
        editText.setBackground((Drawable) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.w = editText;
        TextView textView = new TextView(context);
        puf.u.b(textView, uy4.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.x = textView;
        setOrientation(0);
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new n04((float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density)));
        addView(editText);
        addView(textView);
        float f = (float) 12;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final Integer getBackgroundColorAttr() {
        return (Integer) this.b.getValue(this, y[1]);
    }

    public final int getHintColorAttr() {
        return ((Number) this.o.getValue(this, y[3])).intValue();
    }

    public final int getLimitTextColorAttr() {
        return ((Number) this.v.getValue(this, y[4])).intValue();
    }

    public final int getMaxCount() {
        return ((Number) this.a.getValue(this, y[0])).intValue();
    }

    public final int getTextColorAttr() {
        return ((Number) this.c.getValue(this, y[2])).intValue();
    }

    public final void onThemeChanged(k2b k2b) {
        EditText editText = this.w;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            k2b.getText().getClass();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        js9 js9 = fu4.k;
        if (backgroundColorAttr != null) {
            setBackgroundColor(js9.e(getContext()).f().i(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(js9.e(getContext()).f().i(getTextColorAttr()));
        editText.setHintTextColor(js9.e(getContext()).f().i(getHintColorAttr()));
        this.x.setTextColor(js9.e(getContext()).f().i(getLimitTextColorAttr()));
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.setValue(this, y[1], num);
    }

    public final void setHint(ngf ngf) {
        EditText editText = this.w;
        ngf.getClass();
        editText.setHint(ngf.b(getContext().getResources()));
    }

    public final void setHintColorAttr(int i) {
        this.o.setValue(this, y[3], Integer.valueOf(i));
    }

    public final void setLimitTextColorAttr(int i) {
        this.v.setValue(this, y[4], Integer.valueOf(i));
    }

    public final void setMaxCount(int i) {
        this.a.setValue(this, y[0], Integer.valueOf(i));
    }

    public final void setText(String str) {
        this.w.setText(str);
        TextView textView = this.x;
        int i = 0;
        textView.setVisibility(getMaxCount() != Integer.MAX_VALUE ? 0 : 8);
        int maxCount = getMaxCount();
        if (str != null) {
            i = str.length();
        }
        textView.setText(String.valueOf(maxCount - i));
    }

    public final void setTextColorAttr(int i) {
        this.c.setValue(this, y[2], Integer.valueOf(i));
    }
}
