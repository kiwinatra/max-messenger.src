package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.chats.picker.PickerChatController;

/* renamed from: t53  reason: default package */
public final class t53 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t53(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(MotionEvent motionEvent) {
        d99 d99 = (d99) this.c;
        View view = d99.G0;
        if (!(view instanceof tc9) || view.getTouchDelegate() == null) {
            return false;
        }
        return d99.G0.getTouchDelegate().onTouchEvent(motionEvent);
    }

    public boolean b(View view) {
        gg9 gg9 = (gg9) this.b;
        if (view == gg9) {
            gg9.onLongClick(view);
            return true;
        } else if (view == null) {
            return false;
        } else {
            if (!view.performLongClick()) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return b((View) parent);
                }
            }
            return true;
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (((gg9) this.b).isSelected() || ((View) this.c).getVisibility() != 0) {
                    return false;
                }
                throw null;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    View view = ((d99) this.c).G0;
                    t99 t99 = view instanceof t99 ? (t99) view : null;
                    if (t99 != null) {
                        t99.f(motionEvent, d99.P0);
                    }
                }
                return true;
            case 2:
                return ((View) this.c).getVisibility() == 0;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                a6e a6e = (a6e) this.b;
                TouchDelegate touchDelegate = a6e.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && a6e.y.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    a6e.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    a6e.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    a6e.setPressed(true);
                    a6e.invalidate();
                }
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    ((v89) ((d99) this.c).a).performLongClick();
                    return;
                }
                return;
            case 2:
                View view = (View) this.c;
                if (view.getVisibility() == 0) {
                    b(view);
                    return;
                }
                return;
            case 3:
                super.onLongPress(motionEvent);
                ((Function0) this.c).invoke();
                return;
            case 5:
                a6e a6e = (a6e) this.b;
                TouchDelegate touchDelegate = a6e.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    a6e.setPressed(false);
                    a6e.invalidate();
                    a6e.performLongClick();
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                View view = (View) this.c;
                if (view.getVisibility() != 0) {
                    return false;
                }
                if (!(view instanceof p89)) {
                    return view instanceof lf9 ? ((View) ((gg9) this.b).getParent()).performClick() : view.performClick();
                }
                ((p89) view).onSingleTapUp(motionEvent);
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        l43 p;
        String str;
        String str2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                s53 s53 = (s53) obj2;
                if (s53 != null) {
                    ((hfb) s53).c(((r53) obj).getColor());
                }
                return true;
            case 1:
                if (!a(motionEvent)) {
                    d99 d99 = (d99) obj;
                    View view = d99.G0;
                    t99 t99 = view instanceof t99 ? (t99) view : null;
                    if (!(t99 == null || (p = t99.p(motionEvent)) == null)) {
                        str2 = p.j();
                    }
                    if (t99 != null) {
                        t99.f(motionEvent, d99.Q0);
                    }
                    if (t99 == null || (!t99.i(motionEvent) && str2 == null)) {
                        ((v89) d99.a).performClick();
                    } else {
                        ((Function1) obj2).invoke(str2);
                    }
                }
                return true;
            case 3:
                ((Function0) obj2).invoke();
                return true;
            case 4:
                dc9 dc9 = (dc9) obj;
                CharSequence text = dc9.getText();
                String obj3 = text != null ? text.toString() : null;
                KProperty[] kPropertyArr = PickerChatController.z0;
                PickerChatController pickerChatController = (PickerChatController) obj2;
                pickerChatController.getClass();
                KProperty kProperty = PickerChatController.z0[2];
                pickerChatController.v.b(pickerChatController, obj3);
                whb f0 = pickerChatController.f0();
                CharSequence text2 = dc9.getText();
                if (!f0.D0) {
                    f0.D0 = true;
                    List list = CollectionsKt.toList(((Map) f0.Y.a.getValue()).keySet());
                    q5e q5e = (q5e) f0.x.getValue();
                    if (text2 != null) {
                        if (StringsKt.isBlank(text2)) {
                            text2 = null;
                        }
                        if (text2 != null) {
                            str = text2.toString();
                            q5e.b(f0.b, list, str, (List) null);
                            xag.h(f0.B0, new q33());
                        }
                    }
                    str = null;
                    q5e.b(f0.b, list, str, (List) null);
                    xag.h(f0.B0, new q33());
                }
                return true;
            case 5:
                a6e a6e = (a6e) obj2;
                TouchDelegate touchDelegate = a6e.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    a6e.setPressed(false);
                    a6e.invalidate();
                    if (a6e.y.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ((Function0) obj).invoke();
                    } else {
                        ((View) a6e.getParent()).performClick();
                    }
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public t53(d99 d99, b99 b99) {
        this.a = 1;
        this.c = d99;
        this.b = b99;
    }

    public t53(gg9 gg9, View view, fg9 fg9) {
        this.a = 2;
        this.b = gg9;
        this.c = view;
    }
}
