package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* renamed from: eng  reason: default package */
public final class eng {
    public final /* synthetic */ int a;
    public final Widget b;
    public final Lazy c;

    public eng(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Lazy h = pcb.a.getAccessor().h(g2g.class);
                this.b = widget;
                this.c = h;
                return;
            default:
                this.b = widget;
                this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(21, this));
                return;
        }
    }

    private final void d(String[] strArr, int i, int i2, int i3, int i4) {
    }

    public void a() {
        e0b e0b = new e0b(this.b);
        e0b.h(new igf(nqa.a));
        e0b.j();
    }

    public void b() {
        dd ddVar = new dd(this.b.getContext(), 16974128);
        int i = nqa.g;
        zc zcVar = ddVar.a;
        zcVar.f = zcVar.a.getText(i);
        ddVar.setPositiveButton(nqa.h, new e10(3));
        ddVar.g();
    }

    public final void c(String[] strArr, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return;
            default:
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                zx3 zx3 = widget;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                e9d e9d = null;
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                permissionBottomSheet.p0(widget);
                if (e9d != null) {
                    i9d i9d = new i9d(permissionBottomSheet, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                    return;
                }
                return;
        }
    }

    public final void e(int i, String[] strArr) {
        Object obj;
        Lazy lazy = this.c;
        switch (this.a) {
            case 0:
                ((eng) lazy.getValue()).e(i, strArr);
                return;
            default:
                Widget widget = this.b;
                if (i == 180) {
                    g2g g2g = (g2g) lazy.getValue();
                    Context context = widget.getContext();
                    g2g.getClass();
                    String str = hsg.n;
                    boolean z = g2g.a;
                    try {
                        Result.Companion companion = Result.Companion;
                        context.startActivity(hsg.u(context, z));
                        obj = Result.m23constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable r3 = Result.m26exceptionOrNullimpl(obj);
                    if (r3 != null) {
                        String str2 = hsg.n;
                        z68.f(hsg.n, "showFsiSettings getOpenFsiSettingsIntent error " + r3, (Throwable) null);
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        String packageName = context.getPackageName();
                        intent.setData(Uri.parse("package:" + packageName));
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                widget.requestPermissions(strArr, i);
                return;
        }
    }

    public final boolean f(String str) {
        switch (this.a) {
            case 0:
                return ((eng) this.c.getValue()).f(str);
            default:
                String[] strArr = edb.d;
                if (ArraysKt.contains((T[]) edb.o, str)) {
                    return true;
                }
                return this.b.shouldShowRequestPermissionRationale(str);
        }
    }

    public final void g(int i, int i2) {
        switch (this.a) {
            case 0:
                ((eng) this.c.getValue()).g(i, i2);
                return;
            default:
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, i2);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                zx3 zx3 = widget;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                e9d e9d = null;
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                permissionBottomSheet.p0(widget);
                if (e9d != null) {
                    i9d i9d = new i9d(permissionBottomSheet, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                    return;
                }
                return;
        }
    }
}
