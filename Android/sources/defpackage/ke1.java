package defpackage;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: ke1  reason: default package */
public final /* synthetic */ class ke1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ke1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Function1 function1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
                if (!(view instanceof EditText)) {
                    return false;
                }
                EditText editText = (EditText) view;
                if (motionEvent.getX() < ((float) (editText.getWidth() - editText.getTotalPaddingRight()))) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((Function1) obj).invoke((EditText) obj2);
                }
                return true;
            case 1:
                KProperty[] kPropertyArr2 = MessageWriteWidget.C0;
                ((Function1) obj).invoke(motionEvent);
                return ((GestureDetector) obj2).onTouchEvent(motionEvent);
            case 2:
                int i = OneMeContactsChipGroup.F0;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                Chip chip = (Chip) obj;
                Drawable chipIcon = chip.getChipIcon();
                if (motionEvent.getX() > chip.getChipStartPadding() + ((float) (chipIcon != null ? chipIcon.getIntrinsicWidth() : 0))) {
                    return false;
                }
                ((Function0) obj2).invoke();
                return true;
            default:
                hqe hqe = (hqe) obj2;
                wmd wmd = hqe.H0;
                umd umd = wmd instanceof umd ? (umd) wmd : null;
                if (motionEvent.getAction() == 0 && umd != null && umd.w && (function1 = (Function1) obj) != null) {
                    function1.invoke(hqe);
                }
                return false;
        }
    }

    public /* synthetic */ ke1(hqe hqe, Function1 function1) {
        this.a = 3;
        this.c = hqe;
        this.b = function1;
    }
}
