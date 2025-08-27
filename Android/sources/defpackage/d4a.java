package defpackage;

import android.view.MotionEvent;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: d4a  reason: default package */
public final /* synthetic */ class d4a implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d4a(int i) {
        this.a = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i = e4a.w0;
                return true;
            default:
                KProperty[] kPropertyArr = VideoMessageWidget.X;
                return true;
        }
    }
}
