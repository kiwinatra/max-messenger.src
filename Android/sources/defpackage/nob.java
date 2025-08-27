package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: nob  reason: default package */
public final class nob implements nj6, wp0, p64, pie, p4, qk3, f9g, t0d {
    public Object a;

    public /* synthetic */ nob(Object obj) {
        this.a = obj;
    }

    public boolean A() {
        return true;
    }

    public int B() {
        g4g g4g = ((VideoViewerWidget) this.a).y;
        if (g4g != null) {
            return g4g.getHeight();
        }
        return 0;
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public void a(Object obj) {
        List list = (List) obj;
        lyc lyc = (lyc) this.a;
        lyc.i(lyc.T, lyc.S);
    }

    /* JADX INFO: finally extract failed */
    public void accept(Object obj, Object obj2) {
        qdf qdf = (qdf) obj2;
        pwg pwg = (pwg) ((twg) obj).o();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(pwg.e);
        int i = rvg.a;
        mef mef = (mef) this.a;
        if (mef == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            mef.writeToParcel(obtain, 0);
        }
        try {
            pwg.d.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            qdf.b((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public long b(long j) {
        return 0;
    }

    public void c() {
        s().discardDisplayList();
    }

    public void d(int i) {
        s().setAlpha(((float) i) / 255.0f);
    }

    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        boolean z = false;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        WeakHashMap weakHashMap = gag.a;
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.e;
        view.offsetLeftAndRight(((i != 0 || !z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        wie wie = swipeDismissBehavior.b;
        if (wie != null) {
            wie.j0(view);
        }
        return true;
    }

    public void f() {
        g4g g4g = ((VideoViewerWidget) this.a).y;
    }

    public void g(Throwable th) {
        lyc lyc = (lyc) this.a;
        bs0.r("In-progress recording shouldn't be null", lyc.q != null);
        if (!lyc.q.Z) {
            Objects.toString(th);
            lyc.i(th, lyc.C == null ? 8 : 6);
        }
    }

    public oie h() {
        return (sx6) this.a;
    }

    public long i(long j, long j2) {
        return j2;
    }

    public void j(Surface surface) {
        n7g p0;
        String str = ((VideoViewerWidget) this.a).a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        j9g e0 = ((VideoViewerWidget) this.a).e0();
        if (e0 != null && (p0 = ((ChatMediaViewerScreen) e0).p0()) != null) {
            p0.L0(surface);
        }
    }

    public void k(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(s());
    }

    public long l(long j, long j2) {
        return 0;
    }

    public void m(Bitmap bitmap, float f) {
        s().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        s().beginRecording().drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
        s().endRecording();
        s().setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    public long n(long j, long j2) {
        return -9223372036854775807L;
    }

    public cpc o(long j) {
        return (cpc) this.a;
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoViewerWidget) this.a).a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public int p() {
        g4g g4g = ((VideoViewerWidget) this.a).y;
        if (g4g != null) {
            return g4g.getWidth();
        }
        return 0;
    }

    public void q(int i, boolean z) {
        vq5 vq5 = (vq5) this.a;
        if (z) {
            vq5.a(i);
        } else {
            vq5.getClass();
        }
    }

    public void r(x6 x6Var, qk3 qk3) {
        jbd.a(x6Var, (lfd) this.a, (x6) null, qk3, (lfd) null);
    }

    public RenderNode s() {
        return (RenderNode) ((Lazy) this.a).getValue();
    }

    public Long t() {
        Long l = (Long) this.a;
        Long valueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
        return valueOf;
    }

    public long u(long j, long j2) {
        return 0;
    }

    public nob(int i) {
        switch (i) {
            case 2:
                this.a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new mxb(26));
                return;
            case 6:
                this.a = new sx6(19);
                return;
            default:
                this.a = new vq5(0);
                return;
        }
    }

    public void accept(Object obj) {
        ((UploadFileAttachWorker) this.a).e((Throwable) obj);
    }
}
