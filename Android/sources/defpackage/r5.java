package defpackage;

import android.content.Intent;
import androidx.fragment.app.b;

/* renamed from: r5  reason: default package */
public abstract class r5 extends m5 implements vde {
    public static void T(b bVar, long j) {
        Intent intent = new Intent(bVar, r5.class);
        intent.addFlags(67108864);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        bVar.startActivity(intent);
    }
}
