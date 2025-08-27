package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Lu5f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSwipeWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeWidget.kt\none/me/sdk/conductor/changehandlers/swipe/SwipeWidget\n+ 2 Log.kt\nru/ok/tamtam/logger/Log\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n32#2,4:210\n32#2,4:214\n32#2,4:222\n32#2,4:226\n32#2,4:230\n140#2,4:234\n32#2,4:239\n32#2,4:243\n1863#3:218\n1863#3,2:219\n1864#3:221\n1#4:238\n*S KotlinDebug\n*F\n+ 1 SwipeWidget.kt\none/me/sdk/conductor/changehandlers/swipe/SwipeWidget\n*L\n87#1:210,4\n96#1:214,4\n162#1:222,4\n167#1:226,4\n172#1:230,4\n180#1:234,4\n141#1:239,4\n146#1:243,4\n129#1:218\n130#1:219,2\n129#1:221\n*E\n"})
public abstract class SwipeWidget extends Widget implements u5f {
    public static final /* synthetic */ int b = 0;
    public final String a = "SwipeWidget";

    public SwipeWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
    }

    public static void g0(zx3 zx3) {
        for (e9d e : zx3.getChildRouters()) {
            Iterator it = e.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    i9d i9d = (i9d) it.next();
                    zx3 zx32 = i9d.a;
                    Method method = (Method) hy3.d.getValue((Object) null, hy3.a[2]);
                    if (method != null) {
                        method.invoke(zx32, new Object[]{Boolean.TRUE});
                        g0(i9d.a);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
        }
    }

    public final zx3 c0() {
        i9d i9d = (i9d) CollectionsKt.getOrNull(getRouter().e(), CollectionsKt.getLastIndex(getRouter().e()) - 1);
        zx3 zx3 = i9d != null ? i9d.a : null;
        if (zx3 == null) {
            String str = this.a;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.w, str, "No underlying controller! Swiping won't work properly", (Throwable) null);
            }
        }
        return zx3;
    }

    public void d0() {
    }

    public void e0() {
    }

    public void f0() {
    }

    public Long h0() {
        return null;
    }

    public Integer i0() {
        return null;
    }

    public final void onChangeEnded(ey3 ey3, fy3 fy3) {
        super.onChangeEnded(ey3, fy3);
        h6f h6f = null;
        if (!J()) {
            String str = this.a;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, "onChangeEnded: swipe is disabled", (Throwable) null);
                return;
            }
            return;
        }
        View view = getView();
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                zx3 c0 = c0();
                sz0 sz0 = c0 == null ? null : new sz0((Object) c0, (Object) this, (Object) viewGroup, 15);
                if (sz0 != null && fy3.b) {
                    String str2 = this.a;
                    a67 a672 = z68.b;
                    if (a672 != null && a672.c()) {
                        a672.d(w78.o, str2, "onChangeEnded: setup swipe callbacks on new view", (Throwable) null);
                    }
                    boolean z = view instanceof h6f;
                    if (z) {
                        a6f a6f = new a6f(i0(), new lce(10, this), view, viewGroup, sz0, (this instanceof ChatMediaViewerScreen) ^ true ? y5f.a : y5f.b);
                        a6f.q = this;
                        a6f.r = h0();
                        if (z) {
                            h6f = (h6f) view;
                        }
                        if (h6f != null) {
                            h6f.setOnTouch(new hq7(a6f));
                            h6f.setOnRequestInterceptTouchEvent(new rh9(a6f));
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("'To' view must realize SwipeTouchHandler for work".toString());
                }
            }
        }
    }

    public void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        if (!fy3.b) {
            View view = getView();
            h6f h6f = view instanceof h6f ? (h6f) view : null;
            if (h6f != null) {
                h6f.setOnTouch((Function1) null);
                h6f.setOnRequestInterceptTouchEvent((Function0) null);
            }
        }
    }
}
