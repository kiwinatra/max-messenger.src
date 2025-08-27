package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: x30  reason: default package */
public final class x30 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ y30 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x30(y30 y30, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = y30;
        this.a = contentResolver;
        this.b = uri;
    }

    public final void onChange(boolean z) {
        y30 y30 = this.c;
        y30.a(u30.b((Context) y30.b, (i30) y30.j, (g40) y30.i));
    }
}
