package defpackage;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.fragment.app.a;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.jakewharton.processphoenix.ProcessPhoenix;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.android.OneMeApplication;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: e4  reason: default package */
public final class e4 implements h79, by9, nj6, qk3, ReadWriteProperty, x28, e0a, kr4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static e4 q(int i, int i2, int i3) {
        return new e4(0, (Object) AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public void A(Long l) {
        mf8 mf8 = (mf8) this.b;
        mf8.getClass();
        try {
            uxg uxg = mf8.a;
            hha hha = new hha(l);
            oxg oxg = (oxg) uxg;
            Parcel H0 = oxg.H0();
            hzg.c(H0, hha);
            oxg.I0(H0, 29);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void B() {
        mf8 mf8 = (mf8) this.b;
        mf8.getClass();
        try {
            oxg oxg = (oxg) mf8.a;
            Parcel H0 = oxg.H0();
            int i = hzg.a;
            H0.writeInt(1);
            oxg.I0(H0, 14);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 7:
                xx5 xx5 = (xx5) obj;
                if (xx5 != null) {
                    ((eu1) this.b).w.i(Integer.valueOf(xx5.a ? 2 : 3));
                    return;
                }
                return;
            case 8:
                Void voidR = (Void) obj;
                return;
            default:
                Void voidR2 = (Void) obj;
                return;
        }
    }

    public boolean a0(m69 m69) {
        Window.Callback callback;
        if (m69 != m69.k()) {
            return true;
        }
        eo eoVar = (eo) this.b;
        if (!eoVar.O0 || (callback = eoVar.Z.getCallback()) == null || eoVar.Z0) {
            return true;
        }
        callback.onMenuOpened(108, m69);
        return true;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                List list = (List) obj;
                ia2 ia2 = (ia2) this.b;
                pm7 pm7 = ia2.I0;
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                ia2.J0.set(true);
                t92 t92 = new t92(list, ia2, (Continuation) null);
                ia2.I0 = ev0.v(ia2.y, (q04) ia2.c.getValue(), (f14) null, t92, 2);
                return;
            case 22:
                eca eca = (eca) obj;
                gj7 gj7 = (gj7) this.b;
                gj7.d.f(gj7);
                gj7.l.compareAndSet(true, false);
                return;
            case 23:
                z68.f(((kw7) this.b).x, "failed to store sticker set", (Throwable) obj);
                return;
            default:
                Throwable th = (Throwable) obj;
                if ((th instanceof OnErrorNotImplementedException) || (th instanceof UndeliverableException)) {
                    z68.f("RxJavaErrorHandler", "rxjava undeliverable error", th);
                    ((fn4) h2g.a.getAccessor().g(fn4.class)).e();
                    return;
                } else if (th instanceof SQLiteDatabaseCorruptException) {
                    ProcessPhoenix.b((OneMeApplication) this.b);
                    return;
                } else {
                    Thread currentThread = Thread.currentThread();
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(currentThread, th);
                        return;
                    }
                    return;
                }
        }
    }

    public void b() {
        n64 n64 = (n64) this.b;
        n64.A.b();
        DashManifestStaleException dashManifestStaleException = n64.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    public void c(qp9 qp9) {
        ((e0a) this.b).c(qp9);
    }

    public void close() {
        ((e0a) this.b).close();
    }

    public void d() {
        u50.d((u50) this.b);
    }

    public void e() {
        xga xga = (xga) ((nr4) this.b).e;
        xga.getClass();
        KProperty[] kPropertyArr = VideoViewerWidget.X;
        j9g e0 = ((VideoViewerWidget) xga.b).e0();
        if (e0 != null) {
            ((ChatMediaViewerScreen) e0).v0(true);
        }
    }

    public void f() {
        u50.d((u50) this.b);
    }

    public void g(Throwable th) {
        switch (this.a) {
            case 7:
                if (!(th instanceof CameraControl$OperationCanceledException)) {
                    ((eu1) this.b).w.i(4);
                    return;
                }
                return;
            case 8:
                synchronized (((jx1) this.b).a) {
                    try {
                        ((jx1) this.b).d.p();
                        int y = tr1.y(((jx1) this.b).i);
                        if (y == 3 || y == 5 || y == 6) {
                            if (!(th instanceof CancellationException)) {
                                jx1 jx1 = (jx1) this.b;
                                int i = jx1.i;
                                jx1.d();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((l87) this.b).close();
                return;
        }
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object b2 = ((hdd) this.b).b("CreateChannelViewModel:channel_avatar_bottom_dialog");
        return b2 == null ? Boolean.FALSE : b2;
    }

    public void h(we6 we6, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((e0a) this.b).h(we6, byteBuffer, bufferInfo);
    }

    public we6 i(ea6 ea6) {
        return ((e0a) this.b).i(ea6);
    }

    public void j() {
        u50.d((u50) this.b);
    }

    public void k(String str, String str2) {
        ct.e(str);
        ct.g(str2, str);
        l(str, str2);
    }

    public void l(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(str);
        arrayList.add(StringsKt.trim((CharSequence) str2).toString());
    }

    public void m(m69 m69, boolean z) {
        co coVar;
        m69 k = m69.k();
        int i = 0;
        boolean z2 = k != m69;
        if (z2) {
            m69 = k;
        }
        eo eoVar = (eo) this.b;
        co[] coVarArr = eoVar.U0;
        int length = coVarArr != null ? coVarArr.length : 0;
        while (true) {
            if (i < length) {
                coVar = coVarArr[i];
                if (coVar != null && coVar.h == m69) {
                    break;
                }
                i++;
            } else {
                coVar = null;
                break;
            }
        }
        if (coVar == null) {
            return;
        }
        if (z2) {
            eoVar.p(coVar.a, coVar, k);
            eoVar.r(coVar, true);
            return;
        }
        eoVar.r(coVar, z);
    }

    public lx6 n() {
        Object[] array = ((ArrayList) this.b).toArray(new String[0]);
        if (array != null) {
            return new lx6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean o() {
        a aVar = (a) this.b;
        if (aVar.O1() == null) {
            return false;
        }
        return n54.f(aVar.O1());
    }

    public void p() {
        u50.d((u50) this.b);
    }

    public void r(Exception exc) {
        i8b.p("Audio sink error", exc);
        p7d p7d = ((ln8) this.b).P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new e70(p7d, exc, 1));
        }
    }

    public void s() {
        mf8 mf8 = (mf8) this.b;
        mf8.getClass();
        try {
            oxg oxg = (oxg) mf8.a;
            oxg.I0(oxg.H0(), 1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        getValue(obj, kProperty);
        ((hdd) this.b).c(obj2, "CreateChannelViewModel:channel_avatar_bottom_dialog");
    }

    public void t(int i) {
        nr4.a((nr4) this.b, true, i * 10);
    }

    public void u(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i < arrayList.size()) {
                if (StringsKt__StringsJVMKt.equals(str, (String) arrayList.get(i), true)) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public void v() {
        u50.d((u50) this.b);
    }

    public void w() {
        u50.d((u50) this.b);
    }

    public void x() {
        u50.d((u50) this.b);
    }

    public void y(String str, String str2) {
        ct.e(str);
        ct.g(str2, str);
        u(str);
        l(str, str2);
    }

    public void z(ao0 ao0) {
        if (ao0 instanceof ao0) {
            y35 y35 = ao0.a;
            uxg uxg = ((mf8) this.b).a;
            if (y35 == null) {
                try {
                    oxg oxg = (oxg) uxg;
                    Parcel H0 = oxg.H0();
                    hzg.c(H0, (IInterface) null);
                    oxg.I0(H0, 18);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                oxg oxg2 = (oxg) uxg;
                Parcel H02 = oxg2.H0();
                hzg.c(H02, (p67) y35.b);
                oxg2.I0(H02, 18);
            }
        } else {
            throw new IllegalArgumentException("Can't set icon. MarkerImpl can work only with BitmapDescriptorImpl");
        }
    }

    public /* synthetic */ e4(int i, boolean z) {
        this.a = i;
    }

    public e4(int i) {
        this.a = i;
        switch (i) {
            case 20:
                this.b = new ArrayList(20);
                return;
            default:
                this.b = new wi6(5, 1, (byte) 0);
                return;
        }
    }

    public e4(TextView textView) {
        this.a = 16;
        bs0.q(textView, "textView cannot be null");
        this.b = new t35(textView);
    }
}
