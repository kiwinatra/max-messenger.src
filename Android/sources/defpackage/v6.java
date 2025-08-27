package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: v6  reason: default package */
public abstract class v6 extends m5 implements vde {
    public static void T(Context context) {
        context.startActivity(new Intent(context, v6.class));
    }

    public static void U(Context context, long j, long j2, ype ype, boolean z) {
        Intent intent = new Intent(context, v6.class);
        intent.putExtra("act:stickers:STICKER_SET_ID", j);
        intent.putExtra("act:stickers:OPENED_FROM_CHAT_ID", j2);
        intent.putExtra("act:stickers:SEND_SOURCE", ype.a);
        intent.putExtra("act:stickers:REGULAR_SENDING", z);
        context.startActivity(intent);
    }
}
