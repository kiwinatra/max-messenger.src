package defpackage;

import android.app.Application;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: gn9  reason: default package */
public final /* synthetic */ class gn9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ gn9(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        boolean z2 = false;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                gn9 gn9 = new gn9(messagesListWidget, 4);
                akd akd = (akd) ((bud) vi9.a.getAccessor().g(bud.class));
                akd.getClass();
                int i = 40;
                int r = (int) akd.r(PmsKey.f82msggetreactionspagesize, (long) 40);
                if (r > 0) {
                    i = r;
                }
                if (((gqc) messagesListWidget.g0().j().r.getValue()).compareTo(gqc.b) < 0) {
                    z = false;
                }
                return new htb(gn9, i, z, (sk3) messagesListWidget.g0().j().s.getValue());
            case 1:
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                messagesListWidget.getContext();
                return new MessagesLayoutManager();
            case 2:
                KProperty[] kPropertyArr3 = MessagesListWidget.R0;
                if ((((wj9) messagesListWidget.k0().l1.getValue()).b || ((wj9) messagesListWidget.k0().l1.getValue()).c) && !messagesListWidget.h0().Q0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                KProperty[] kPropertyArr4 = MessagesListWidget.R0;
                return new xo9(messagesListWidget.h0(), messagesListWidget.k0().b, messagesListWidget.k0().s1, messagesListWidget.v0, messagesListWidget.i0());
            case 4:
                KProperty[] kPropertyArr5 = MessagesListWidget.R0;
                Iterable<MessageModel> iterable = ((wj9) messagesListWidget.k0().l1.getValue()).a;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (MessageModel messageModel : iterable) {
                    arrayList.add(Long.valueOf(messageModel.b));
                }
                return arrayList;
            case 5:
                KProperty[] kPropertyArr6 = MessagesListWidget.R0;
                return messagesListWidget.getRouter();
            case 6:
                KProperty[] kPropertyArr7 = MessagesListWidget.R0;
                en9 k0 = messagesListWidget.k0();
                a32 a32 = (a32) k0.k1.a.getValue();
                if (a32 != null && (k0.v().e() || !a32.V(((j89) k0.E0.getValue()).g()) || !a32.b.i())) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 7:
                KProperty[] kPropertyArr8 = MessagesListWidget.R0;
                FrameLayout frameLayout = new FrameLayout(messagesListWidget.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case 8:
                KProperty[] kPropertyArr9 = MessagesListWidget.R0;
                vqc vqc = new vqc(messagesListWidget.getContext());
                vqc.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return vqc;
            case 9:
                KProperty[] kPropertyArr10 = MessagesListWidget.R0;
                return new lf1(LazyKt.lazy(new gn9(messagesListWidget, 5)), new eng(messagesListWidget, 0));
            case 10:
                KProperty[] kPropertyArr11 = MessagesListWidget.R0;
                return new ur5((Application) vi9.a.getAccessor().g(Application.class), new hn9(messagesListWidget, 3));
            default:
                KProperty[] kPropertyArr12 = MessagesListWidget.R0;
                return new gk9(messagesListWidget.h0(), new gn9(messagesListWidget, 2));
        }
    }
}
