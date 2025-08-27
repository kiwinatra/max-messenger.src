package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: pq2  reason: default package */
public final /* synthetic */ class pq2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ pq2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
                String obj2 = charSequence.toString();
                OneMeButton f0 = chatTitleIconScreen.f0();
                fr2 h0 = chatTitleIconScreen.h0();
                h0.getClass();
                if ((!StringsKt.isBlank(obj2)) && obj2.length() <= ((akd) h0.o).t()) {
                    z = true;
                }
                f0.setEnabled(z);
                chatTitleIconScreen.h0().F0 = StringsKt.trim((CharSequence) charSequence.toString()).toString();
                return Unit.INSTANCE;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                KProperty[] kPropertyArr2 = ChatTitleIconScreen.x0;
                chatTitleIconScreen.getClass();
                KProperty[] kPropertyArr3 = ChatTitleIconScreen.x0;
                KProperty kProperty = kPropertyArr3[3];
                sn0 sn0 = chatTitleIconScreen.X;
                constraintLayout.addView((TextView) sn0.getValue());
                constraintLayout.addView(chatTitleIconScreen.d0());
                constraintLayout.addView(chatTitleIconScreen.e0());
                if (chatTitleIconScreen.g0() == zke.CHANNEL) {
                    constraintLayout.addView(chatTitleIconScreen.c0());
                }
                constraintLayout.addView(chatTitleIconScreen.f0());
                pj3 h = ct.h(constraintLayout);
                KProperty kProperty2 = kPropertyArr3[3];
                int id = ((TextView) sn0.getValue()).getId();
                KProperty kProperty3 = kPropertyArr3[2];
                h.e(id, 3, ((h3b) chatTitleIconScreen.z.getValue()).getId(), 4);
                tr1.u((float) 16, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
                h.e(id, 6, 0, 6);
                h.e(id, 7, 0, 7);
                int id2 = chatTitleIconScreen.d0().getId();
                KProperty kProperty4 = kPropertyArr3[3];
                h.e(id2, 3, ((TextView) sn0.getValue()).getId(), 4);
                float f = (float) 24;
                tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
                h.e(id2, 6, 0, 6);
                h.e(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.e0().getId();
                h.e(id3, 3, chatTitleIconScreen.d0().getId(), 4);
                tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
                h.e(id3, 6, 0, 6);
                h.e(id3, 7, 0, 7);
                int id4 = chatTitleIconScreen.c0().getId();
                h.e(id4, 3, chatTitleIconScreen.e0().getId(), 4);
                float f2 = (float) 8;
                tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
                h.e(id4, 6, 0, 6);
                h.e(id4, 7, 0, 7);
                View c0 = chatTitleIconScreen.c0().getVisibility() == 0 ? chatTitleIconScreen.c0() : chatTitleIconScreen.e0();
                int id5 = chatTitleIconScreen.f0().getId();
                h.e(id5, 3, c0.getId(), 4);
                tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id5, 4));
                h.e(id5, 6, 0, 6);
                h.e(id5, 7, 0, 7);
                h.e(id5, 4, 0, 4);
                h.j(id5).d.x = 1.0f;
                h.a(constraintLayout);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr4 = ChatTitleIconScreen.x0;
                chatTitleIconScreen.h0().G0 = StringsKt.trim((CharSequence) (String) obj).toString();
                return Unit.INSTANCE;
        }
    }
}
