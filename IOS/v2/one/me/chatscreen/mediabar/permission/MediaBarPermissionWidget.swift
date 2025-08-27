package one.me.chatscreen.mediabar.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaBarPermissionWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaBarPermissionWidget.kt\none/me/chatscreen/mediabar/permission/MediaBarPermissionWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,271:1\n235#2,10:272\n12350#3,2:282\n12350#3,2:284\n1#4:286\n24#5:287\n24#5:289\n24#5:298\n24#5:299\n28#5:300\n24#5:301\n24#5:302\n24#5:303\n26#6:288\n157#7,8:290\n157#7,8:304\n*S KotlinDebug\n*F\n+ 1 MediaBarPermissionWidget.kt\none/me/chatscreen/mediabar/permission/MediaBarPermissionWidget\n*L\n46#1:272,10\n197#1:282,2\n210#1:284,2\n56#1:287\n71#1:289\n104#1:298\n105#1:299\n108#1:300\n144#1:301\n146#1:302\n157#1:303\n59#1:288\n71#1:290,8\n157#1:304,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ KProperty[] x;
    public final Lazy a;
    public final Lazy b;
    public final sn0 c;
    public final sn0 o;
    public final sn0 v;
    public final sn0 w;

    static {
        Class<MediaBarPermissionWidget> cls = MediaBarPermissionWidget.class;
        x = new KProperty[]{wj6.p(cls, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0)};
    }

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = fdb.a.c();
        this.b = createViewModelLazy(zj8.class, new i76(14, new ck7(22)));
        this.c = binding(new ak8(this, 0));
        this.o = binding(new ak8(this, 1));
        this.v = binding(new ak8(this, 2));
        this.w = binding(new ak8(this, 3));
    }

    public final void c0() {
        Lazy lazy = this.a;
        if (((edb) lazy.getValue()).b(edb.l)) {
            ((edb) lazy.getValue()).f(new eng(this, 1), edb.m, 157);
        } else {
            ((edb) lazy.getValue()).f(new eng(this, 1), edb.n, 162);
        }
    }

    public final void onActivityResumed(Activity activity) {
        ((zj8) this.b.getValue()).b.h();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        KProperty[] kPropertyArr = x;
        KProperty kProperty = kPropertyArr[1];
        linearLayout.addView((FrameLayout) this.v.getValue());
        KProperty kProperty2 = kPropertyArr[2];
        linearLayout.addView((LinearLayout) this.w.getValue());
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        sn0 sn0 = this.o;
        if (sn0.isInitialized()) {
            ((at1) sn0.getValue()).c();
        }
        super.onDestroyView(view);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Lazy lazy = this.a;
        int i2 = 0;
        if (i == 157) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            eng eng = new eng(this, 1);
            int i3 = mra.Q;
            int i4 = mra.P;
            ((edb) lazy.getValue()).getClass();
            edb.j(eng, strArr, iArr, i3, i4);
        } else if (i == 162) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            boolean unused = ((edb) lazy.getValue()).getClass();
        }
    }

    public MediaBarPermissionWidget() {
        this(new Bundle(0));
    }
}
