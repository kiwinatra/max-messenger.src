package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import one.me.android.OneMeApplication;

/* renamed from: yna  reason: default package */
public final class yna extends ContextWrapper {
    public final /* synthetic */ OneMeApplication a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yna(Context context, OneMeApplication oneMeApplication) {
        super(context);
        this.a = oneMeApplication;
    }

    public final Context getApplicationContext() {
        return this.a;
    }
}
