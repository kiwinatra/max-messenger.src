package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: wc3  reason: default package */
public final class wc3 extends TouchDelegate {
    public final ArrayList a = new ArrayList();

    public wc3(View view) {
        super(new Rect(), view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((TouchDelegate) it.next()).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
