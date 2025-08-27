package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import one.me.profile.ProfileScreen;

/* renamed from: v5c  reason: default package */
public final /* synthetic */ class v5c implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t3c b;
    public final /* synthetic */ x5c c;

    public /* synthetic */ v5c(l3c l3c, x5c x5c) {
        this.b = l3c;
        this.c = x5c;
    }

    public final void onClick(View view) {
        x5c x5c = this.c;
        t3c t3c = this.b;
        switch (this.a) {
            case 0:
                w5c w5c = x5c.v;
                long j = ((o3c) t3c).a;
                ProfileScreen profileScreen = (ProfileScreen) w5c;
                profileScreen.getClass();
                String str = "ID #" + j + " скопирован в буфер обмена";
                ((ClipboardManager) profileScreen.requireActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, String.valueOf(j)));
                e0b e0b = (e0b) jxb.a.getAccessor().h(e0b.class).getValue();
                e0b.i(str);
                e0b.e(2);
                e0b.j();
                return;
            default:
                l3c l3c = (l3c) t3c;
                l3c.getClass();
                k3c k3c = k3c.a;
                w5c w5c2 = x5c.v;
                long j2 = l3c.a.a;
                ((ProfileScreen) w5c2).getClass();
                r4c.b.o1(j2);
                return;
        }
    }

    public /* synthetic */ v5c(x5c x5c, o3c o3c) {
        this.c = x5c;
        this.b = o3c;
    }
}
