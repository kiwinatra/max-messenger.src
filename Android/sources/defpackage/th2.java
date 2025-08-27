package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.view.Window;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: th2  reason: default package */
public final class th2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float o;

    public th2(float f, ChatMediaViewerScreen chatMediaViewerScreen, boolean z) {
        this.o = f;
        this.b = chatMediaViewerScreen;
        this.c = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        Window window;
        n09 n09;
        switch (this.a) {
            case 0:
                if (this.o == c44.DEFAULT_ASPECT_RATIO) {
                    KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
                    ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
                    chatMediaViewerScreen.q0().setVisibility(8);
                    chatMediaViewerScreen.o0().setVisibility(8);
                    if (this.c && (n09 = chatMediaViewerScreen.x0) != null) {
                        n09.m(false);
                    }
                    Activity activity = chatMediaViewerScreen.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        l2b l2b = l2b.a;
                        l2b.d.getClass();
                        window.setNavigationBarColor(0);
                    }
                    chatMediaViewerScreen.l0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        Window window;
        n09 n09;
        int i = 0;
        boolean z = this.c;
        Object obj = this.b;
        float f = this.o;
        switch (this.a) {
            case 0:
                return;
            case 1:
                KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) obj;
                if (chatMediaViewerScreen.q0().getVisibility() != 0) {
                    chatMediaViewerScreen.q0().setVisibility(0);
                }
                if (chatMediaViewerScreen.o0().getVisibility() != 0) {
                    chatMediaViewerScreen.o0().setVisibility(0);
                }
                if (z && (n09 = chatMediaViewerScreen.x0) != null) {
                    n09.m(true);
                }
                if (f == 1.0f) {
                    Activity activity = chatMediaViewerScreen.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        window.setNavigationBarColor(l2b.d.h);
                    }
                    chatMediaViewerScreen.l0(true);
                    return;
                }
                return;
            default:
                k3b k3b = (k3b) obj;
                k3b.setAlpha(f);
                if (!z) {
                    i = 8;
                }
                k3b.setVisibility(i);
                return;
        }
    }

    public th2(k3b k3b, float f, boolean z) {
        this.b = k3b;
        this.o = f;
        this.c = z;
    }

    public th2(ChatMediaViewerScreen chatMediaViewerScreen, boolean z, float f) {
        this.b = chatMediaViewerScreen;
        this.c = z;
        this.o = f;
    }
}
