package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: f0  reason: default package */
public abstract class f0 {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public f0(int i) {
        switch (i) {
            case 3:
                this.o = new Object();
                this.a = new gx8(this);
                this.b = new WeakReference((Object) null);
                return;
            default:
                this.o = new p3a((Object) this);
                return;
        }
    }

    public static void M(FrameLayout frameLayout) {
        dt6 dt6 = dt6.d;
        Context context = frameLayout.getContext();
        int b2 = dt6.b(et6.a, context);
        String c2 = pvg.c(b2, context);
        String b3 = pvg.b(b2, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c2);
        linearLayout.addView(textView);
        Intent a2 = dt6.a(b2, context, (String) null);
        if (a2 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b3);
            linearLayout.addView(button);
            button.setOnClickListener(new cr(6, context, a2));
        }
    }

    public void A(float f) {
    }

    public void B(upc upc) {
    }

    public void C(upc upc) {
    }

    public void D(int i) {
    }

    public void E(int i) {
    }

    public void F() {
    }

    public void G() {
    }

    public void H(long j) {
    }

    public void I() {
    }

    public void J() {
        ez d;
        FileOutputStream f;
        try {
            Pair K = K();
            int intValue = ((Number) K.component1()).intValue();
            y33 y33 = (y33) K.component2();
            if (y33 != null) {
                try {
                    String e = e();
                    a67 a67 = z68.b;
                    if (a67 != null) {
                        if (a67.c()) {
                            w78 w78 = w78.o;
                            int size = ((List) ((AtomicReference) this.c).get()).size();
                            a67.d(w78, e, "saveProtoToFile " + size + ", " + (intValue / 1024) + "kb", (Throwable) null);
                        }
                    }
                    d = d();
                    f = d.f();
                    if (f != null) {
                        f.write((byte[]) y33.e0(), 0, intValue);
                        d.b(f);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(y33, (Throwable) null);
                } catch (Throwable th) {
                    CloseableKt.closeFinally(y33, th);
                    throw th;
                }
            } else if (intValue == 0) {
                ez d2 = d();
                if (d2.c.delete() && d2.d.delete()) {
                    d2.e.delete();
                }
            }
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th2) {
            z68.f(e(), "failed to save state", th2);
        }
    }

    public Pair K() {
        ad9 b2 = b();
        int serializedSize = b2.getSerializedSize();
        if (serializedSize == 0) {
            return TuplesKt.to(0, null);
        }
        jd4 a2 = ((oqb) ((Lazy) this.b).getValue()).b().a(serializedSize);
        byte[] bArr = (byte[]) a2.e0();
        String e = e();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            float length = ((float) bArr.length) / ((float) 1024);
            a67.d(w78, e, "serializeData: size=" + length + "kb, bytes.ref=" + bArr + "}", (Throwable) null);
        }
        ArraysKt___ArraysJvmKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
        ad9.toByteArray(b2, bArr, 0, serializedSize);
        return TuplesKt.to(Integer.valueOf(serializedSize), a2);
    }

    public void L(hx8 hx8, Handler handler) {
        synchronized (this.o) {
            try {
                this.b = new WeakReference(hx8);
                hy hyVar = (hy) this.c;
                hy hyVar2 = null;
                if (hyVar != null) {
                    hyVar.removeCallbacksAndMessages((Object) null);
                }
                if (hx8 != null) {
                    if (handler != null) {
                        hyVar2 = new hy(this, handler.getLooper(), 12);
                    }
                }
                this.c = hyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void N(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((owg) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    public void O(Bundle bundle, owg owg) {
        if (((wu7) this.a) != null) {
            owg.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(owg);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        c((p3a) this.o);
    }

    public void a() {
        ((AtomicReference) this.c).set(CollectionsKt.emptyList());
        try {
            Result.Companion companion = Result.Companion;
            ez d = d();
            Result.m23constructorimpl(Boolean.valueOf(d.c.delete() && d.d.delete() && d.e.delete()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    public abstract ad9 b();

    public abstract void c(p3a p3a);

    public abstract ez d();

    public String e() {
        return (String) ((Lazy) this.o).getValue();
    }

    public boolean f() {
        return this.o != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.qr9
            if (r0 == 0) goto L_0x0013
            r0 = r8
            qr9 r0 = (defpackage.qr9) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qr9 r0 = new qr9
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            f0 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0062
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r8)
            ez r8 = r7.d()
            r0.a = r7
            r0.o = r5
            java.lang.Object r2 = r7.a
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            sr9 r6 = new sr9
            r6.<init>(r8, r7, r4)
            java.lang.Object r8 = defpackage.ev0.I(r2, r6, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            byte[] r8 = (byte[]) r8
            if (r8 != 0) goto L_0x006b
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r7
        L_0x006b:
            java.lang.Object r2 = r7.a
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.a()
            rr9 r5 = new rr9
            r5.<init>(r7, r8, r4)
            r0.a = r4
            r0.o = r3
            java.lang.Object r8 = defpackage.ev0.I(r2, r5, r0)
            if (r8 != r1) goto L_0x008b
            return r1
        L_0x008b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Boolean h(byte[] bArr);

    public void i(zp8 zp8) {
    }

    public void j(zp8 zp8, int i) {
    }

    public void k(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void l(String str, Bundle bundle) {
    }

    public void m() {
    }

    public boolean n(Intent intent) {
        return false;
    }

    public void o() {
    }

    public void p() {
    }

    public void q(String str, Bundle bundle) {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(Uri uri, Bundle bundle) {
    }

    public void t() {
    }

    public void u(String str, Bundle bundle) {
    }

    public void v(String str, Bundle bundle) {
    }

    public void w(Uri uri, Bundle bundle) {
    }

    public void x(zp8 zp8) {
    }

    public void y() {
    }

    public void z(long j) {
    }

    public f0(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
        this.c = new AtomicReference(CollectionsKt.emptyList());
        this.o = LazyKt.lazy(new c28(12, this));
    }

    public f0(Context context, mqf mqf) {
        this.a = context;
        this.c = ro4.b();
        this.b = mqf;
    }

    public f0(Context context, FrgBase frgBase, jb9 jb9, int i) {
        this.a = context;
        this.c = frgBase;
        this.b = tr1.h((qra) ym.e());
        new sd3(jb9, (m5) null, frgBase, i);
    }
}
