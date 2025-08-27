package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: pg6  reason: default package */
public final /* synthetic */ class pg6 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ pg6(GestureDetector gestureDetector, int i) {
        this.a = i;
        this.b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.b;
        switch (this.a) {
            case 0:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 1:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 2:
                return gestureDetector.onTouchEvent(motionEvent);
            case 3:
                return gestureDetector.onTouchEvent(motionEvent);
            case 4:
                return gestureDetector.onTouchEvent(motionEvent);
            case 5:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 6:
                KProperty[] kPropertyArr2 = PickerChatController.z0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 7:
                return gestureDetector.onTouchEvent(motionEvent);
            default:
                return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}
