package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: h2b  reason: default package */
public final class h2b extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] v0;
    public final EditText a;
    public final g2b b = new g2b(this, 0);
    public final g2b c = new g2b(this);
    public final g2b o = new g2b(new InputFilter[0], this, 2);
    public final g2b v = new g2b(Integer.valueOf(jya.K), this, 3);
    public final g2b w = new g2b(Integer.valueOf(jya.L), this, 4);
    public final g2b x = new g2b(this, 5);
    public final Lazy y;
    public final Lazy z;

    static {
        Class<h2b> cls = h2b.class;
        v0 = new KProperty[]{rae.s(cls, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;", 0), rae.s(cls, "hint", "getHint()Ljava/lang/String;", 0), rae.s(cls, "filters", "getFilters()[Landroid/text/InputFilter;", 0), rae.s(cls, "textColorAttr", "getTextColorAttr()I", 0), rae.s(cls, "hintColorAttr", "getHintColorAttr()I", 0), rae.s(cls, "currentPlaceholderType", "getCurrentPlaceholderType()Lone/me/sdk/uikit/common/views/OneMeTextInput$PlaceholderType;", 0)};
    }

    public h2b(Context context) {
        super(context, (AttributeSet) null);
        EditText editText = new EditText(context);
        editText.setMinimumHeight(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        editText.setBackground((Drawable) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        puf.k.b(editText, uy4.b);
        float f = (float) 12;
        editText.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), editText.getPaddingTop(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), editText.getPaddingBottom());
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new n04((float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density)));
        editText.setCompoundDrawablePadding(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        editText.setImportantForAutofill(1);
        editText.setSingleLine(true);
        editText.setInputType(editText.getInputType() | 16384);
        setOnClearIconClick(editText);
        editText.addTextChangedListener(new ne1(9, editText, this));
        this.a = editText;
        Delegates delegates = Delegates.INSTANCE;
        vra vra = new vra(3, context, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = LazyKt.lazy(lazyThreadSafetyMode, vra);
        this.z = LazyKt.lazy(lazyThreadSafetyMode, new c28(24, this));
        setOrientation(1);
        addView(editText);
    }

    private final f2b getCurrentPlaceholderType() {
        return (f2b) this.x.getValue(this, v0[5]);
    }

    private final TextView getPlaceholderView() {
        return (TextView) this.y.getValue();
    }

    private final void setCurrentPlaceholderType(f2b f2b) {
        this.x.setValue(this, v0[5], f2b);
    }

    private final void setOnClearIconClick(EditText editText) {
        editText.setOnTouchListener(new ng1(10, editText));
    }

    public final void a() {
        getPlaceholderView().setText((CharSequence) null);
        getPlaceholderView().setVisibility(8);
        setCurrentPlaceholderType((f2b) null);
    }

    public final boolean b() {
        return getCurrentPlaceholderType() == f2b.a && y7e.L(this.y);
    }

    public final void c(String str, f2b f2b) {
        if (!Intrinsics.areEqual((Object) getPlaceholderView().getText(), (Object) str) || f2b != getCurrentPlaceholderType()) {
            getPlaceholderView().setText(str);
            getPlaceholderView().setVisibility(0);
            setCurrentPlaceholderType(f2b);
        }
    }

    public final void d(k2b k2b, f2b f2b) {
        int i;
        int ordinal = f2b.ordinal();
        if (ordinal == 0) {
            i = k2b.getText().b;
        } else if (ordinal == 1) {
            i = k2b.getText().e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Lazy lazy = this.y;
        if (lazy.isInitialized()) {
            ((TextView) lazy.getValue()).setTextColor(i);
        }
    }

    public final Integer getBackgroundColorAttr() {
        return (Integer) this.b.getValue(this, v0[0]);
    }

    public final InputFilter[] getFilters() {
        return (InputFilter[]) this.o.getValue(this, v0[2]);
    }

    public final String getHint() {
        return (String) this.c.getValue(this, v0[1]);
    }

    public final int getHintColorAttr() {
        return ((Number) this.w.getValue(this, v0[4])).intValue();
    }

    public final CharSequence getText() {
        Editable text = this.a.getText();
        return text.subSequence(0, text.length());
    }

    public final int getTextColorAttr() {
        return ((Number) this.v.getValue(this, v0[3])).intValue();
    }

    public final void onThemeChanged(k2b k2b) {
        EditText editText = this.a;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            k2b.getText().getClass();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        js9 js9 = fu4.k;
        if (backgroundColorAttr != null) {
            editText.setBackgroundColor(js9.e(getContext()).f().i(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(js9.e(getContext()).f().i(getTextColorAttr()));
        editText.setHintTextColor(js9.e(getContext()).f().i(getHintColorAttr()));
        Lazy lazy = this.z;
        if (lazy.isInitialized()) {
            ((Drawable) lazy.getValue()).setTint(js9.e(getContext()).f().getIcon().i);
        }
        f2b currentPlaceholderType = getCurrentPlaceholderType();
        if (currentPlaceholderType != null) {
            d(k2b, currentPlaceholderType);
        }
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.setValue(this, v0[0], num);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.a.setEnabled(z2);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.o.setValue(this, v0[2], inputFilterArr);
    }

    public final void setHint(String str) {
        this.c.setValue(this, v0[1], str);
    }

    public final void setHintColorAttr(int i) {
        this.w.setValue(this, v0[4], Integer.valueOf(i));
    }

    public final void setInputType(int i) {
        this.a.setInputType(i);
    }

    public final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void setTextColorAttr(int i) {
        this.v.setValue(this, v0[3], Integer.valueOf(i));
    }
}
