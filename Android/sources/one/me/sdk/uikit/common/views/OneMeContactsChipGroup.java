package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002'\rB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\u001a\u0004\b\"\u0010#*\u0004\b$\u0010%¨\u0006("}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", "Lcom/google/android/material/chip/ChipGroup;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/google/android/material/chip/Chip;", "", "setChipStyle", "(Lcom/google/android/material/chip/Chip;)V", "Lxra;", "x0", "Lxra;", "getCallback", "()Lxra;", "setCallback", "(Lxra;)V", "callback", "Landroid/widget/EditText;", "A0", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "Landroid/view/ContextThemeWrapper;", "D0", "Lkotlin/Lazy;", "getMaterialThemeWrapper", "()Landroid/view/ContextThemeWrapper;", "materialThemeWrapper", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "getCancelChipDrawable", "()Lone/me/sdk/richvector/EnhancedVectorDrawable;", "getCancelChipDrawable$delegate", "(Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;)Ljava/lang/Object;", "cancelChipDrawable", "yra", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeContactsChipGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeContactsChipGroup.kt\none/me/sdk/uikit/common/views/OneMeContactsChipGroup\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,270:1\n24#2:271\n24#2:272\n24#2:275\n24#2:276\n8#3:273\n8#3:274\n216#4,2:277\n216#4,2:279\n1#5:281\n65#6,4:282\n37#6:286\n53#6:287\n72#6:288\n*S KotlinDebug\n*F\n+ 1 OneMeContactsChipGroup.kt\none/me/sdk/uikit/common/views/OneMeContactsChipGroup\n*L\n51#1:271\n62#1:272\n87#1:275\n91#1:276\n71#1:273\n75#1:274\n116#1:277,2\n139#1:279,2\n177#1:282,4\n177#1:286\n177#1:287\n177#1:288\n*E\n"})
public final class OneMeContactsChipGroup extends ChipGroup implements phf {
    public static final /* synthetic */ int F0 = 0;
    public final EditText A0;
    public final LinkedHashMap B0;
    public final LinkedHashMap C0;
    public final Lazy D0;
    public final Lazy E0;
    public xra x0;
    public final Rect y0 = new Rect();
    public final Rect z0 = new Rect();

    @JvmOverloads
    public OneMeContactsChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EditText editText = new EditText(context);
        editText.setMinHeight(MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density));
        puf.m.a(editText.getPaint(), editText.getResources().getDisplayMetrics(), uy4.b);
        js9 js9 = fu4.k;
        editText.setTextColor(js9.e(editText.getContext()).f().getText().e);
        editText.setHintTextColor(js9.e(editText.getContext()).f().getText().h);
        editText.setBackgroundColor(0);
        editText.setFallbackLineSpacing(false);
        editText.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        editText.setGravity(16);
        float f = (float) 4;
        editText.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        editText.setLayoutParams(marginLayoutParams);
        editText.setMaxLines(1);
        this.A0 = editText;
        this.B0 = new LinkedHashMap();
        this.C0 = new LinkedHashMap();
        p35 p35 = new p35(context, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D0 = LazyKt.lazy(lazyThreadSafetyMode, p35);
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, new vra(0, context, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(editText);
        float f2 = (float) 12;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        editText.setKeyListener(new yra(this));
        d();
    }

    private final EnhancedVectorDrawable getCancelChipDrawable() {
        return (EnhancedVectorDrawable) this.E0.getValue();
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.D0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        js9 js9 = fu4.k;
        if (isChecked) {
            js9.e(chip.getContext()).f().c().a.getClass();
            chip.setChipBackgroundColor(ColorStateList.valueOf(-16745729));
            js9.e(chip.getContext()).f().getText().getClass();
            chip.setTextColor(-1);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(js9.e(chip.getContext()).f().c().k));
        chip.setTextColor(js9.e(chip.getContext()).f().getText().e);
    }

    public final void a(long j, long j2, CharSequence charSequence, String str, String str2) {
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.B0;
        if (!linkedHashMap.containsKey(valueOf)) {
            Chip chip = new Chip(getMaterialThemeWrapper(), (AttributeSet) null);
            chip.setId(Long.hashCode(j));
            chip.setText(str);
            puf.m.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), uy4.b);
            chip.setClickable(true);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setCheckedIcon((Drawable) null);
            chip.setFallbackLineSpacing(false);
            chip.setEnsureMinTouchTargetSize(false);
            long j3 = j;
            long j4 = j2;
            CharSequence charSequence2 = charSequence;
            String str3 = str2;
            b(chip, chip.isChecked(), j3, j4, charSequence2, str3);
            chip.setOnCheckedChangeListener(new ura(this, chip, j3, j4, charSequence2, str3));
            for (Map.Entry value : linkedHashMap.entrySet()) {
                ((Chip) value.getValue()).setChecked(false);
            }
            linkedHashMap.put(Long.valueOf(j), chip);
            addView(chip, getChildCount() - 1);
            d();
            xra xra = this.x0;
            if (xra != null) {
                xra.i();
            }
        }
    }

    public final void b(Chip chip, boolean z, long j, long j2, CharSequence charSequence, String str) {
        if (z) {
            chip.setChipIcon(getCancelChipDrawable());
            chip.setOnTouchListener(new ke1(2, chip, new wra(this, j, chip)));
        } else {
            Long valueOf = Long.valueOf(j2);
            LinkedHashMap linkedHashMap = this.C0;
            if (!linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(Long.valueOf(j2), new eoa(getContext()));
            }
            eoa eoa = (eoa) linkedHashMap.get(Long.valueOf(j2));
            eoa.b(new gd0(charSequence, j2));
            eoa.c(str);
            chip.setChipIcon(eoa);
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    public final void c(long j) {
        LinkedHashMap linkedHashMap = this.B0;
        Chip chip = (Chip) linkedHashMap.get(Long.valueOf(j));
        if (chip != null) {
            linkedHashMap.remove(Long.valueOf(j));
            removeView(chip);
            d();
        }
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new dr0(9, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.y0;
        editText.getHitRect(rect);
        Rect rect2 = this.z0;
        rect2.set(rect);
        rect2.left = rect2.right;
        rect2.right = getRight();
    }

    public final xra getCallback() {
        return this.x0;
    }

    public final EditText getEditText() {
        return this.A0;
    }

    public final void onDetachedFromWindow() {
        this.C0.clear();
        this.B0.clear();
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(k2b k2b) {
        EnhancedVectorDrawable enhancedVectorDrawable;
        EditText editText = this.A0;
        editText.setTextColor(k2b.getText().e);
        editText.setHintTextColor(k2b.getText().h);
        for (Map.Entry value : this.B0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
        Lazy lazy = this.E0;
        if (!lazy.isInitialized()) {
            lazy = null;
        }
        if (lazy != null && (enhancedVectorDrawable = (EnhancedVectorDrawable) lazy.getValue()) != null) {
            k2b.getIcon().getClass();
            hi7.Y(enhancedVectorDrawable, "circle_background", -1);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.z0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = this.y0;
        motionEvent.setLocation((float) rect.right, ((float) rect.bottom) / 2.0f);
        return this.A0.dispatchTouchEvent(motionEvent);
    }

    public final void setCallback(xra xra) {
        this.x0 = xra;
    }
}
