package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: bk8  reason: default package */
public final /* synthetic */ class bk8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ bk8(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final void onClick(View view) {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaBarPermissionWidget.x;
                mediaBarPermissionWidget.c0();
                return;
            case 1:
                KProperty[] kPropertyArr2 = MediaBarPermissionWidget.x;
                mediaBarPermissionWidget.c0();
                return;
            default:
                KProperty[] kPropertyArr3 = MediaBarPermissionWidget.x;
                mediaBarPermissionWidget.c0();
                return;
        }
    }
}
