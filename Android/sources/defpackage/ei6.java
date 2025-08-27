package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.b;
import java.util.List;
import ru.ok.messages.views.dev.FrgPrefs;

/* renamed from: ei6  reason: default package */
public final class ei6 {
    public final /* synthetic */ id3 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ FrgPrefs c;

    public ei6(FrgPrefs frgPrefs, id3 id3, List list) {
        this.c = frgPrefs;
        this.a = id3;
        this.b = list;
    }

    @oye
    public void onEvent(n6f n6f) {
        ((qra) this.a).J().f(this);
        boolean z = n6f.b;
        FrgPrefs frgPrefs = this.c;
        if (z) {
            Context G2 = frgPrefs.G2();
            hi7.b0(0, G2, "Settings synced. Total = " + this.b.size());
        } else {
            hi7.b0(0, frgPrefs.G2(), "Muted chats settings sync have failed");
        }
        b M1 = frgPrefs.M1();
        if (M1 != null) {
            M1.finishAffinity();
            int i = o6.z0;
            Intent intent = new Intent(M1, o6.class);
            intent.setFlags(604045312);
            M1.startActivity(intent);
        }
    }
}
