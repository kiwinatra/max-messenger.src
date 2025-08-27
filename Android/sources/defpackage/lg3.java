package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: lg3  reason: default package */
public final class lg3 extends RecyclerView implements phf, fg7 {
    public static final /* synthetic */ KProperty[] a2;
    public boolean T1 = true;
    public hg3 U1;
    public final jg3 V1;
    public Function0 W1;
    public final jg3 X1;
    public Function1 Y1;
    public final afe Z1;

    static {
        Class<lg3> cls = lg3.class;
        a2 = new KProperty[]{rae.s(cls, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;", 0), rae.s(cls, "countCells", "getCountCells()I", 0)};
    }

    public lg3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        ig3 ig3 = ig3.SUCCESS;
        this.V1 = new jg3(this, 0);
        this.W1 = new v4(context, 28);
        this.X1 = new jg3(this, 1);
        this.Z1 = new afe(sag.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        j(new fr(3));
    }

    public static ArrayList I0(lg3 lg3) {
        lg3.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = lg3.getChildCount();
        for (int i = 0; i < childCount; i++) {
            lg7 J0 = lg3.J0(i);
            if (J0 != null) {
                arrayList.add(J0);
            }
        }
        return arrayList;
    }

    private final lg7 getFirstEmptyInputController() {
        Object obj;
        Iterator it = I0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oee) ((lg7) obj)).M().length() == 0) {
                break;
            }
        }
        return (lg7) obj;
    }

    /* access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            lg7 J0 = J0(i);
            if (J0 != null) {
                oee oee = (oee) J0;
                gg3 gg3 = oee.F0;
                if (!z && ((Boolean) oee.G0.w.invoke()).booleanValue()) {
                    kr7.C(gg3);
                }
                gg3.setClickable(z);
                gg3.setFocusable(z);
                gg3.setFocusableInTouchMode(z);
            }
        }
    }

    public final lg7 J0(int i) {
        pzc M = M(i);
        if (M instanceof lg7) {
            return (lg7) M;
        }
        return null;
    }

    public final boolean K0(int i) {
        return i >= 0 && i <= getCountCells();
    }

    public final void L0(int i, String str) {
        if (K0(i) && K0(str.length())) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                int i3 = i2 - i;
                lg7 J0 = J0(i2);
                if (J0 != null) {
                    ((oee) J0).N(String.valueOf(StringsKt.getOrNull(str, i3)));
                }
            }
        }
    }

    public final boolean M0() {
        lg7 firstEmptyInputController = getFirstEmptyInputController();
        Boolean valueOf = firstEmptyInputController != null ? Boolean.valueOf(((oee) firstEmptyInputController).F0.requestFocus()) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void N0() {
        gg3 gg3;
        lg7 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null && (gg3 = ((oee) firstEmptyInputController).F0) != null) {
            gg3.requestFocus();
            gg3.post(new uo5(17, (Object) gg3, (Object) gg3));
        }
    }

    public final int getCountCells() {
        return ((Number) this.X1.getValue(this, a2[1])).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.T1;
    }

    public final hg3 getListener() {
        return this.U1;
    }

    public final Function1<ig3, Unit> getOnAnimationEnded() {
        return this.Y1;
    }

    public final ig3 getState() {
        return (ig3) this.V1.getValue(this, a2[0]);
    }

    public final void onDetachedFromWindow() {
        afe afe = this.Z1;
        afe.b();
        KProperty[] kPropertyArr = afe.e;
        KProperty kProperty = kPropertyArr[1];
        wie wie = afe.d;
        pm7 pm7 = (pm7) wie.getValue(afe, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(afe, kPropertyArr[1], (Object) null);
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(k2b k2b) {
        int i = fu4.k.e(getContext()).f().i(getState().a);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            lg7 J0 = J0(i2);
            if (J0 != null) {
                gg3 gg3 = ((oee) J0).F0;
                gg3 gg32 = gg3 instanceof phf ? gg3 : null;
                if (gg32 != null) {
                    gg32.onThemeChanged(k2b);
                }
                gg3.setTextColor(i);
            }
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        return M0();
    }

    public final void setCountCells(int i) {
        this.X1.setValue(this, a2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.T1 = z;
    }

    public final void setKeyboardOpen(Function0<Boolean> function0) {
        this.W1 = function0;
    }

    public final void setListener(hg3 hg3) {
        this.U1 = hg3;
    }

    public final void setOnAnimationEnded(Function1<? super ig3, Unit> function1) {
        this.Y1 = function1;
    }

    public final void setSecure(boolean z) {
        tyc adapter = getAdapter();
        pee pee = adapter instanceof pee ? (pee) adapter : null;
        if (pee != null) {
            pee.x.setValue(pee, pee.y[0], Boolean.valueOf(z));
        }
    }

    public final void setState(ig3 ig3) {
        this.V1.setValue(this, a2[0], ig3);
    }
}
