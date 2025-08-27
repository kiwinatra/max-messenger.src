package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: s5  reason: default package */
public abstract class s5 extends m5 {
    public static void T(Context context, ij2 ij2, long j) {
        Intent intent = new Intent(context, s5.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.TYPE", ij2.a);
        context.startActivity(intent);
    }
}
