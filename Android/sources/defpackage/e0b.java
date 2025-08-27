package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: e0b  reason: default package */
public final class e0b {
    public final WeakReference a;
    public z0b b;
    public final j50 c;
    public final int d;
    public final int e;

    public e0b(ViewGroup viewGroup) {
        WeakReference weakReference = new WeakReference(viewGroup);
        this.a = weakReference;
        Parcelable.Creator<z0b> creator = z0b.CREATOR;
        this.b = z0b.w;
        if (viewGroup != null) {
            this.c = new j50(weakReference);
        }
    }

    public final void a(ngf ngf) {
        ViewGroup viewGroup;
        Context context;
        z0b z0b = this.b;
        CharSequence charSequence = null;
        if (!(ngf == null || (viewGroup = (ViewGroup) this.a.get()) == null || (context = viewGroup.getContext()) == null)) {
            charSequence = ngf.b(context.getResources());
        }
        this.b = z0b.a(z0b, (s0b) null, (CharSequence) null, charSequence, (y0b) null, (n0b) null, 27);
    }

    public final void b(CharSequence charSequence) {
        this.b = z0b.a(this.b, (s0b) null, (CharSequence) null, charSequence, (y0b) null, (n0b) null, 27);
    }

    public final void c(n0b n0b) {
        this.b = z0b.a(this.b, (s0b) null, (CharSequence) null, (CharSequence) null, (y0b) null, n0b, 15);
    }

    public final void d(f0b f0b) {
        j50 j50 = this.c;
        if (j50 != null) {
            j50.w = f0b;
        }
    }

    public final void e(int i) {
        z0b z0b = this.b;
        this.b = z0b.a(z0b, (s0b) null, (CharSequence) null, (CharSequence) null, (y0b) null, n0b.a(z0b.v, i, 0, 0, 6), 15);
    }

    public final void f(s0b s0b) {
        this.b = z0b.a(this.b, s0b, (CharSequence) null, (CharSequence) null, (y0b) null, (n0b) null, 30);
    }

    public final void g(y0b y0b) {
        this.b = z0b.a(this.b, (s0b) null, (CharSequence) null, (CharSequence) null, y0b, (n0b) null, 23);
    }

    public final void h(ngf ngf) {
        CharSequence charSequence;
        Context context;
        z0b z0b = this.b;
        ViewGroup viewGroup = (ViewGroup) this.a.get();
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            charSequence = null;
        } else {
            ngf.getClass();
            charSequence = ngf.b(context.getResources());
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.b = z0b.a(z0b, (s0b) null, charSequence, (CharSequence) null, (y0b) null, (n0b) null, 29);
    }

    public final void i(CharSequence charSequence) {
        this.b = z0b.a(this.b, (s0b) null, charSequence, (CharSequence) null, (y0b) null, (n0b) null, 29);
    }

    public final z3a j() {
        j50 j50;
        if (this.a.get() == null || (j50 = this.c) == null) {
            return null;
        }
        z0b z0b = this.b;
        n0b n0b = z0b.v;
        z0b a2 = z0b.a(z0b, (s0b) null, (CharSequence) null, (CharSequence) null, (y0b) null, n0b.a(n0b, 0, n0b.b + this.e, n0b.c + this.d, 1), 15);
        j50.o = a2;
        long j = 3500;
        long j2 = a2.a instanceof r0b ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : 3500;
        AtomicBoolean atomicBoolean = l0b.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            k0b k0b = l0b.b;
            h0b h0b = (h0b) j50.y;
            if (k0b != null ? Intrinsics.areEqual(k0b.b.get(), (Object) h0b) : false) {
                Handler handler = l0b.a;
                handler.removeCallbacksAndMessages(l0b.b);
                k0b k0b2 = l0b.b;
                handler.removeCallbacksAndMessages(k0b2);
                if (k0b2 != null) {
                    j = k0b2.a;
                }
                handler.sendMessageDelayed(Message.obtain(handler, 0, k0b2), j);
            } else {
                l0b.c = new k0b(h0b, j2);
                if (l0b.b == null) {
                    l0b.c();
                }
            }
            atomicBoolean.set(false);
        }
        return new z3a(1, j50);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0b(one.me.sdk.arch.Widget r9) {
        /*
            r8 = this;
            r0 = r9
        L_0x0001:
            zx3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x000c
            zx3 r0 = r0.getParentController()
            goto L_0x0001
        L_0x000c:
            android.view.View r0 = r0.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0020
            android.view.View r0 = (android.view.View) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0028
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            r8.<init>((android.view.ViewGroup) r0)
            android.view.View r0 = r9.getView()
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = defpackage.y7e.r(r0)
            if (r0 == 0) goto L_0x003e
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            yh7 r3 = r9.getInsetsConfig()
            jdb r3 = r3.a
            if (r3 != 0) goto L_0x0048
            r3 = r1
        L_0x0048:
            r4 = -1
            if (r3 != 0) goto L_0x004d
            r3 = r4
            goto L_0x0055
        L_0x004d:
            int[] r5 = defpackage.d0b.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r5[r3]
        L_0x0055:
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x0074
            if (r3 == r5) goto L_0x005d
        L_0x005b:
            r3 = r2
            goto L_0x007e
        L_0x005d:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x005b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x006e
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x006f
        L_0x006e:
            r3 = r1
        L_0x006f:
            if (r3 == 0) goto L_0x005b
            int r3 = r3.topMargin
            goto L_0x007e
        L_0x0074:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x005b
            int r3 = r3.getPaddingTop()
        L_0x007e:
            r8.e = r3
            yh7 r3 = r9.getInsetsConfig()
            nr0 r3 = r3.b
            if (r3 == 0) goto L_0x008b
            jdb r3 = r3.a
            goto L_0x008c
        L_0x008b:
            r3 = r1
        L_0x008c:
            if (r3 != 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            int[] r4 = defpackage.d0b.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r4 = r4[r3]
        L_0x0097:
            if (r4 == r6) goto L_0x00b3
            if (r4 == r5) goto L_0x009c
            goto L_0x00bd
        L_0x009c:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00bd
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00ad
            r1 = r9
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00ad:
            if (r1 == 0) goto L_0x00b1
            int r2 = r1.bottomMargin
        L_0x00b1:
            r0 = r2
            goto L_0x00bd
        L_0x00b3:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00bd
            int r0 = r9.getPaddingBottom()
        L_0x00bd:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0b.<init>(one.me.sdk.arch.Widget):void");
    }
}
