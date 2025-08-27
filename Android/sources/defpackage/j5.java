package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: j5  reason: default package */
public final class j5 extends bj0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                ActAvatarCrop actAvatarCrop = (ActAvatarCrop) obj;
                actAvatarCrop.F0 = new Point(k97.getWidth(), k97.getHeight());
                actAvatarCrop.E0.setEnabled(true);
                return;
            case 1:
                ((eoa) obj).invalidateSelf();
                return;
            case 2:
                OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) obj;
                if (Looper.getMainLooper().isCurrentThread()) {
                    Function0 function0 = oneMeAvatarView.w0;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    oneMeAvatarView.invalidate();
                    return;
                }
                Handler handler = oneMeAvatarView.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new loa(oneMeAvatarView, 0));
                    return;
                } else {
                    oneMeAvatarView.post(new loa(oneMeAvatarView, 1));
                    return;
                }
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) obj;
                if (Looper.getMainLooper().isCurrentThread()) {
                    oneMeDraweeView.p(k97, animatable);
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler2 = oneMeDraweeView.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new pta(oneMeDraweeView, str, k97, animatable, 0));
                    return;
                } else {
                    oneMeDraweeView.post(new pta(oneMeDraweeView, str, k97, animatable, 1));
                    return;
                }
            case 4:
                int i = StickerView.N0;
                ((StickerView) obj).u();
                return;
            case 5:
                ((nzf) obj).invalidateSelf();
                return;
            default:
                y7e.Q((ZoomableDraweeView) obj, new l8g(8, this, k97));
                return;
        }
    }

    public void b(String str, Throwable th) {
        switch (this.b) {
            case 1:
                String str2 = ((eoa) this.c).c;
                z68.p(str2, "Failed to load image. ID: " + str + ". Exception: " + th);
                return;
            case 2:
                OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) this.c;
                String str3 = oneMeAvatarView.a;
                z68.o(str3, "Failed to load image. ID: " + str, th);
                oneMeAvatarView.postInvalidate();
                return;
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                String str4 = oneMeDraweeView.v0;
                z68.p(str4, "Failed to load image. ID: " + str + ". Exception: " + th);
                if (Looper.getMainLooper().isCurrentThread()) {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler = oneMeDraweeView.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new ota(oneMeDraweeView, 0));
                    return;
                } else {
                    oneMeDraweeView.post(new ota(oneMeDraweeView, 1));
                    return;
                }
            case 5:
                Function1 function1 = ((nzf) this.c).c;
                if (function1 != null) {
                    function1.invoke(th);
                    return;
                }
                return;
            case 6:
                y7e.Q((ZoomableDraweeView) this.c, new l8g(9, this, th));
                return;
            default:
                return;
        }
    }

    public void d(String str) {
        switch (this.b) {
            case 6:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                y7e.Q(zoomableDraweeView, new csg(zoomableDraweeView, 2));
                return;
            default:
                return;
        }
    }

    public void e(String str, k97 k97) {
        switch (this.b) {
            case 1:
                ((eoa) this.c).invalidateSelf();
                return;
            case 2:
                ((OneMeAvatarView) this.c).postInvalidate();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (isCurrentThread) {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler = oneMeDraweeView.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new ota(oneMeDraweeView, 2));
                    return;
                } else {
                    oneMeDraweeView.post(new ota(oneMeDraweeView, 3));
                    return;
                }
            case 6:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                zoomableDraweeView.removeCallbacks(zoomableDraweeView.z0);
                y7e.Q(zoomableDraweeView, zoomableDraweeView.z0);
                return;
            default:
                return;
        }
    }
}
