package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zu4  reason: default package */
public final class zu4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ av4 b;

    public /* synthetic */ zu4(av4 av4, int i) {
        this.a = i;
        this.b = av4;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                av4 av4 = this.b;
                zu4.super.setVisible(false, false);
                ArrayList arrayList = av4.w;
                if (arrayList != null && !av4.x) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ye) it.next()).a(av4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                av4 av4 = this.b;
                ArrayList arrayList = av4.w;
                if (arrayList != null && !av4.x) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ye) it.next()).b(av4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
