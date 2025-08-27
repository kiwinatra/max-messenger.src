package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsView;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: vr1  reason: default package */
public final class vr1 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;

    public /* synthetic */ vr1(int i, Object obj, Object obj2) {
        this.a = i;
        this.o = obj;
        this.b = false;
        this.c = obj2;
    }

    public final void run() {
        wie wie;
        Bitmap bitmap = null;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                ((Executor) obj2).execute(new pr1(1, this));
                return;
            case 1:
                Bitmap bitmap2 = (Bitmap) obj2;
                hk6 hk6 = (hk6) obj;
                if (bitmap2.getWidth() % 2 == 1) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth() + 1, bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.setDensity(bitmap2.getDensity());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawARGB(0, 0, 0, 0);
                    canvas.drawBitmap(bitmap2, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
                    hk6.getClass();
                    bitmap = createBitmap;
                } else {
                    hk6.getClass();
                }
                Bitmap bitmap3 = bitmap != null ? bitmap : bitmap2;
                int i = hk6.c;
                int[] iArr = new int[1];
                if (i == -1) {
                    GLES20.glGenTextures(1, iArr, 0);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLUtils.texImage2D(3553, 0, bitmap3, 0);
                } else {
                    GLES20.glBindTexture(3553, i);
                    GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap3);
                    iArr[0] = i;
                }
                if (this.b) {
                    bitmap3.recycle();
                }
                hk6.c = iArr[0];
                if (bitmap != null) {
                    bitmap.recycle();
                }
                hk6.z = bitmap2.getWidth();
                hk6.X = bitmap2.getHeight();
                hk6.b();
                return;
            case 2:
                if (!this.b) {
                    ((lv7) obj2).e((hu7) obj);
                    this.b = true;
                    return;
                }
                return;
            case 3:
                Integer num = ((a2f) ((b2f) obj2)).b;
                SuggestsFragment suggestsFragment = (SuggestsFragment) obj;
                if (num != null) {
                    suggestsFragment.l1.g().z0(num.intValue());
                    ((LinearLayoutManager) suggestsFragment.l1.g().getLayoutManager()).m1(num.intValue(), 0);
                }
                if (!this.b) {
                    suggestsFragment.getClass();
                    z68.c("SuggestsFragment", "show()", new Object[0]);
                    f1f f1f = suggestsFragment.l1;
                    EndlessRecyclerView g = f1f.g();
                    if (!g.isLaidOut() || g.isLayoutRequested()) {
                        g.addOnLayoutChangeListener(new g1f(suggestsFragment, 1));
                        return;
                    }
                    SuggestsView f = f1f.f();
                    Animator animator = f1f.w;
                    if (animator != null) {
                        animator.removeAllListeners();
                        animator.cancel();
                    }
                    ch d = ((qra) ryg.x(suggestsFragment)).d();
                    if (f.isAttachedToWindow() && d.q()) {
                        float height = (float) f.getHeight();
                        f.setTranslationY(height);
                        ObjectAnimator d2 = f1f.d(height, c44.DEFAULT_ASPECT_RATIO);
                        d2.setInterpolator(d.a.d());
                        d2.start();
                    }
                    SuggestsViewModel V2 = suggestsFragment.V2();
                    Boolean bool = Boolean.TRUE;
                    xme xme = V2.n;
                    xme.getClass();
                    xme.m((Object) null, bool);
                    return;
                }
                return;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                kag kag = swipeDismissBehavior.a;
                View view = (View) obj2;
                if (kag != null && kag.g()) {
                    WeakHashMap weakHashMap = gag.a;
                    view.postOnAnimation(this);
                    return;
                } else if (this.b && (wie = swipeDismissBehavior.b) != null) {
                    wie.j0(view);
                    return;
                } else {
                    return;
                }
        }
    }

    public vr1(a2f a2f, SuggestsFragment suggestsFragment, boolean z) {
        this.a = 3;
        this.c = a2f;
        this.o = suggestsFragment;
        this.b = z;
    }

    public vr1(lv7 lv7, hu7 hu7) {
        this.a = 2;
        this.c = lv7;
        this.o = hu7;
    }

    public vr1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 4;
        this.o = swipeDismissBehavior;
        this.c = view;
        this.b = z;
    }
}
