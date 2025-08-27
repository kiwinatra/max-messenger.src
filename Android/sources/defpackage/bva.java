package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.Unit;
import one.me.android.deeplink.NewWidgetActivity;

/* renamed from: bva  reason: default package */
public final class bva {
    public final Context a;
    public final Lazy b;

    public bva(Context context, Lazy lazy) {
        this.a = context;
        this.b = lazy;
    }

    public final void a(long j) {
        Uri c = y64.c(wj6.j(j, ":chats?id=", "&type=local"), ((fz7) ((cm) this.b.getValue())).b, (String) null);
        int i = NewWidgetActivity.A0;
        int i2 = NewWidgetActivity.A0;
        Context context = this.a;
        Intent intent = new Intent(context, NewWidgetActivity.class);
        if (c == null) {
            c = null;
        }
        intent.putExtra("deep_link", c);
        intent.putExtra("snackbar", (Parcelable) null);
        intent.setFlags(268435456);
        Unit unit = Unit.INSTANCE;
        context.startActivity(intent);
    }
}
