package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: rh2  reason: default package */
public final class rh2 implements Function0 {
    public final /* synthetic */ ChatMediaViewerScreen a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ai2 c;

    public rh2(ChatMediaViewerScreen chatMediaViewerScreen, int i, ai2 ai2) {
        this.a = chatMediaViewerScreen;
        this.b = i;
        this.c = ai2;
    }

    public final Object invoke() {
        String name = this.a.getClass().getName();
        ai2 ai2 = this.c;
        int i = this.b;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            int i2 = ai2.b;
            int j = chatMediaViewerScreen.A0.j();
            int size = ai2.a.size();
            StringBuilder n = a81.n("Media viewer. Pager, after submitList \n                        |initPos:", i2, ", \n                        |prevItemsA:", i, ", \n                        |itemsA:");
            n.append(j);
            n.append(", \n                        |items:");
            n.append(size);
            a67.d(w78, name, StringsKt__IndentKt.trimMargin$default(n.toString(), (String) null, 1, (Object) null), (Throwable) null);
        }
        if (this.b == 0 && (!this.c.a.isEmpty()) && this.c.b >= 0) {
            ChatMediaViewerScreen chatMediaViewerScreen2 = this.a;
            chatMediaViewerScreen2.getClass();
            ((ViewPager2) chatMediaViewerScreen2.Z.getValue(chatMediaViewerScreen2, ChatMediaViewerScreen.H0[5])).e(this.c.b, false);
        }
        return Unit.INSTANCE;
    }
}
