package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.bots.InlineKeyboardAttachView;

/* renamed from: fk3  reason: default package */
public final class fk3 extends ViewGroup {
    public final ro4 a = ro4.b();
    public final gg9 b;
    public final InlineKeyboardAttachView c;

    public fk3(Context context) {
        super(context, (AttributeSet) null, 0);
        getContext();
        setId(lic.row_constructor_message__root);
        gg9 gg9 = new gg9(getContext());
        this.b = gg9;
        gg9.setId(lic.row_constructor_message__message);
        addView(gg9);
        InlineKeyboardAttachView inlineKeyboardAttachView = new InlineKeyboardAttachView(getContext(), (AttributeSet) null);
        this.c = inlineKeyboardAttachView;
        inlineKeyboardAttachView.setId(lic.row_constructor_message__inline_keyboard);
        addView(inlineKeyboardAttachView);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        gg9 gg9 = this.b;
        int measuredWidth2 = (measuredWidth - gg9.getMeasuredWidth()) / 2;
        int paddingTop = getPaddingTop();
        int measuredWidth3 = gg9.getMeasuredWidth() + measuredWidth2;
        int measuredHeight = gg9.getMeasuredHeight() + paddingTop;
        if (ct.z(gg9)) {
            gg9.layout(measuredWidth - measuredWidth3, paddingTop, measuredWidth - measuredWidth2, measuredHeight);
        } else {
            gg9.layout(measuredWidth2, paddingTop, measuredWidth3, measuredHeight);
        }
        int bottom = gg9.getBottom() + this.a.b;
        int measuredWidth4 = gg9.getMeasuredWidth() + measuredWidth2;
        InlineKeyboardAttachView inlineKeyboardAttachView = this.c;
        int measuredHeight2 = inlineKeyboardAttachView.getMeasuredHeight() + bottom;
        if (ct.z(inlineKeyboardAttachView)) {
            inlineKeyboardAttachView.layout(measuredWidth - measuredWidth4, bottom, measuredWidth - measuredWidth2, measuredHeight2);
        } else {
            inlineKeyboardAttachView.layout(measuredWidth2, bottom, measuredWidth4, measuredHeight2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        ro4 ro4 = this.a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - ro4.N, IntCompanionObject.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        gg9 gg9 = this.b;
        gg9.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = gg9.getMeasuredHeight();
        InlineKeyboardAttachView inlineKeyboardAttachView = this.c;
        if (inlineKeyboardAttachView.getVisibility() == 0) {
            inlineKeyboardAttachView.measure(View.MeasureSpec.makeMeasureSpec(gg9.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += inlineKeyboardAttachView.getMeasuredHeight() + ro4.b;
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + measuredHeight);
    }
}
