package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.XmlResourceParser;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function1;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* renamed from: fbf  reason: default package */
public abstract class fbf implements CameraEnumerator {
    public static final sq6 o = new sq6(20);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ fbf() {
        this.a = 10;
    }

    public static float J(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    public abstract IntentFilter A();

    public void B(RecyclerView recyclerView) {
        tyc tyc = (tyc) this.c;
        if (tyc != null || ((vyc) this.b) != null) {
            if (!(tyc == null || recyclerView.getAdapter() == ((tyc) this.c))) {
                String name = getClass().getName();
                tyc adapter = recyclerView.getAdapter();
                z68.o(name, "adapter was changed! cached adapter = " + ((tyc) this.c) + ", recyclerView.adapter = " + adapter, new IllegalStateException("adapter was changed"));
            }
            tyc tyc2 = (tyc) this.c;
            vyc vyc = (vyc) this.b;
            if (!(tyc2 == null || vyc == null)) {
                tyc2.D(vyc);
            }
            this.c = null;
            this.b = null;
        }
    }

    public Object C(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) kr7.h(xmlResourceParser).get(((eh) this.b).a);
        return num != null ? z(context, xmlResourceParser, num.intValue()) : this.c;
    }

    public abstract int D();

    public abstract CameraCharacteristics E(String str);

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = H().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new mu1(str, supportedFormats) : isBackFacing(str) ? new lu1(str, supportedFormats) : new nu1(str, supportedFormats));
        }
        return arrayList;
    }

    public Set G() {
        return Collections.emptySet();
    }

    public abstract CameraEnumerator H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ou1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: ou1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ou1 I(defpackage.cv1 r3) {
        /*
            r2 = this;
            java.util.ArrayList r2 = r2.F()
            int[] r0 = defpackage.ti0.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x004e
            r0 = 2
            if (r3 == r0) goto L_0x0035
            r0 = 3
            if (r3 != r0) goto L_0x002f
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            r0 = r3
            ou1 r0 = (defpackage.ou1) r0
            boolean r0 = r0 instanceof defpackage.nu1
            if (r0 == 0) goto L_0x001a
            r1 = r3
        L_0x002c:
            ou1 r1 = (defpackage.ou1) r1
            goto L_0x0066
        L_0x002f:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0035:
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r2.next()
            r0 = r3
            ou1 r0 = (defpackage.ou1) r0
            boolean r0 = r0 instanceof defpackage.lu1
            if (r0 == 0) goto L_0x0039
            r1 = r3
        L_0x004b:
            ou1 r1 = (defpackage.ou1) r1
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            r0 = r3
            ou1 r0 = (defpackage.ou1) r0
            boolean r0 = r0 instanceof defpackage.mu1
            if (r0 == 0) goto L_0x0052
            r1 = r3
        L_0x0064:
            ou1 r1 = (defpackage.ou1) r1
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbf.I(cv1):ou1");
    }

    public int K() {
        if (((Lazy) this.c).isInitialized()) {
            return Q().getMeasuredHeight();
        }
        return 0;
    }

    public int L() {
        if (((Lazy) this.c).isInitialized()) {
            return Q().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem M(MenuItem menuItem) {
        if (!(menuItem instanceof d3f)) {
            return menuItem;
        }
        d3f d3f = (d3f) menuItem;
        if (((qae) this.c) == null) {
            this.c = new qae();
        }
        MenuItem menuItem2 = (MenuItem) ((qae) this.c).get(d3f);
        if (menuItem2 != null) {
            return menuItem2;
        }
        y69 y69 = new y69((Context) this.b, d3f);
        ((qae) this.c).put(d3f, y69);
        return y69;
    }

    public short N() {
        return ((x3b) this.c).a;
    }

    public int O() {
        return ((HashMap) this.b).hashCode();
    }

    public gbf P() {
        return gbf.f0;
    }

    public View Q() {
        return (View) ((Lazy) this.c).getValue();
    }

    public abstract void R();

    public void S(int i, int i2) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            View view = (View) lazy.getValue();
            ev0.x(Q(), i, i2, 0, 12);
        }
    }

    public void T(int i, int i2) {
        Lazy lazy = (Lazy) this.c;
        if (lazy.isInitialized()) {
            ((View) lazy.getValue()).measure(i, i2);
        }
    }

    public boolean U() {
        return !(this instanceof i80);
    }

    public abstract vyc V(RecyclerView recyclerView, tyc tyc);

    public abstract void W();

    public void X(View view) {
    }

    public abstract void Y(String str, Executor executor, CameraDevice.StateCallback stateCallback);

    public abstract void Z(lk0 lk0);

    public abstract void a0(tsd tsd, rr1 rr1);

    public abstract void b0();

    public void c0() {
        y();
        IntentFilter A = A();
        if (A.countActions() != 0) {
            if (((ao) this.b) == null) {
                this.b = new ao(0, this);
            }
            ((eo) this.c).Y.registerReceiver((ao) this.b, A);
        }
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        try {
            return H().createCapturer(str, cameraEventsHandler, captureFormatHelper);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((voc) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public void d(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public abstract void d0();

    public abstract void e0();

    public void f(String str, double d) {
        ((HashMap) this.b).put(str, Double.valueOf(d));
    }

    public abstract void f0(CameraManager.AvailabilityCallback availabilityCallback);

    public String[] getDeviceNames() {
        return H().getDeviceNames();
    }

    public List getSupportedFormats(String str) {
        return H().getSupportedFormats(str);
    }

    public void h(int i, String str) {
        ((HashMap) this.b).put(str, Integer.valueOf(i));
    }

    public void i(String str, List list) {
        ((HashMap) this.b).put(str, list);
    }

    public boolean isBackFacing(String str) {
        return H().isBackFacing(str);
    }

    public boolean isFrontFacing(String str) {
        return H().isFrontFacing(str);
    }

    public void j(String str, long[] jArr) {
        ((HashMap) this.b).put(str, jArr);
    }

    public void p(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void s(String str, Map map) {
        ((HashMap) this.b).put(str, map);
    }

    public void t(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return kv0.R((HashMap) this.b, o);
            default:
                return super.toString();
        }
    }

    public void u() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        f6e.b(viewGroup, Q(), new ViewGroup.LayoutParams(-2, -2));
        Q().setVisibility(0);
    }

    public void v(RecyclerView recyclerView) {
        B(recyclerView);
        tyc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.c = adapter;
            vyc V = V(recyclerView, adapter);
            this.b = V;
            adapter.A(V);
            return;
        }
        throw new IllegalArgumentException("require not null adapter".toString());
    }

    public boolean w() {
        return this instanceof b68;
    }

    public abstract void x();

    public void y() {
        ao aoVar = (ao) this.b;
        if (aoVar != null) {
            try {
                ((eo) this.c).Y.unregisterReceiver(aoVar);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract Object z(Context context, XmlResourceParser xmlResourceParser, int i);

    public /* synthetic */ fbf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public fbf(voc voc) {
        this.a = 4;
        this.b = voc;
        this.c = getClass().getSimpleName();
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        try {
            return H().createCapturer(str, cameraEventsHandler);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((voc) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public fbf(Function1 function1) {
        this.a = 6;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new s2(4, (Object) function1, (Object) this));
    }

    public fbf(x3b x3b) {
        this.a = 0;
        this.b = new HashMap();
        this.c = x3b;
    }

    public fbf(Context context) {
        this.a = 5;
        this.b = context;
    }

    public fbf(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new Object());
        }
    }

    public fbf(CameraDevice cameraDevice, h88 h88) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = h88;
    }

    public fbf(Context context, f6e f6e) {
        this.a = 8;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = f6e;
    }

    public fbf(eo eoVar) {
        this.a = 2;
        this.c = eoVar;
    }
}
