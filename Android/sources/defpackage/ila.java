package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: ila  reason: default package */
public final class ila implements wy, xy, vla {
    public static final byte[] v = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] w = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object o;

    public ila(Context context) {
        this.a = 9;
        this.c = 0;
        this.o = context;
    }

    public static void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z2 = false;
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = (long) i2;
        if ((j2 >> 8) == 0) {
            z2 = true;
        }
        b0h.f(j2, "out of range: %s", z2);
        byteBuffer.put((byte) ((int) j2));
    }

    public int a() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public int b() {
        switch (this.a) {
            case 2:
                return this.c;
            default:
                return this.c;
        }
    }

    public int c() {
        switch (this.a) {
            case 2:
                int i = this.b;
                return i == -1 ? ((g1g) this.o).y() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((l8b) this.o).y() : i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.wbb r5) {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 + r1
            r4.c = r0
            int r2 = r4.b
            if (r0 <= r2) goto L_0x000b
            return
        L_0x000b:
            java.lang.Object r4 = r4.o
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L_0x0012
            return
        L_0x0012:
            java.io.File r0 = r4.getParentFile()     // Catch:{ IOException -> 0x003b }
            if (r0 == 0) goto L_0x001b
            defpackage.f6e.y(r0)     // Catch:{ IOException -> 0x003b }
        L_0x001b:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x003b }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x003b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003b }
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x003b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x003b }
            defpackage.nfd.h(r0, r5)     // Catch:{ all -> 0x0034 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0034 }
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r4)     // Catch:{ IOException -> 0x003b }
            goto L_0x003d
        L_0x0034:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r4)     // Catch:{ IOException -> 0x003b }
            throw r1     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            java.lang.String r4 = r5.b
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ila.d(wbb):void");
    }

    public void e(int i) {
        ((pj3) this.o).o(this.c, this.b, i);
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = rqg.a((Context) this.o).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int h() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.o;
        PackageManager packageManager = context.getPackageManager();
        if (rqg.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    public iog z(View view, iog iog) {
        int i = iog.a.f(7).b;
        int i2 = this.b;
        View view2 = (View) this.o;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return iog;
    }

    public /* synthetic */ ila(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.o = obj;
        this.c = i2;
    }

    public ila(File file) {
        this.a = 1;
        this.o = file;
        kof kof = kof.a;
        Object obj = kof.c().get(n54.b);
        dcb dcb = obj instanceof dcb ? (dcb) obj : null;
        this.b = (dcb == null ? new dcb(new ni0(14)) : dcb).b;
    }

    public ila(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 5;
        this.o = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), doc.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == doc.State_android_id) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == doc.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new pj3().d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public ila(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.o = new ila[256];
                this.b = 0;
                this.c = 0;
                return;
            default:
                return;
        }
    }

    public ila(int i, int i2) {
        this.a = 6;
        this.o = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public ila(int i, int i2, dnb dnb) {
        this.a = 8;
        this.b = i;
        this.c = i2;
        this.o = dnb;
    }

    public ila(ry ryVar, ca6 ca6) {
        this.a = 2;
        g1g g1g = ryVar.c;
        this.o = g1g;
        g1g.H(12);
        int y = g1g.y();
        if ("audio/raw".equals(ca6.Z)) {
            int v2 = t0g.v(ca6.J0, ca6.H0);
            if (y == 0 || y % v2 != 0) {
                y = v2;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = g1g.y();
    }

    public ila(sy syVar, ea6 ea6) {
        this.a = 3;
        l8b l8b = syVar.c;
        this.o = l8b;
        l8b.G(12);
        int y = l8b.y();
        if ("audio/raw".equals(ea6.n)) {
            int D = v0g.D(ea6.D, ea6.B);
            if (y == 0 || y % D != 0) {
                i8b.V("Audio sample size mismatch. stsd sample size: " + D + ", stsz sample size: " + y);
                y = D;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = l8b.y();
    }
}
