package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ih2  reason: default package */
public final /* synthetic */ class ih2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ ih2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    public final Object invoke() {
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
                cd2 cd2 = cd2.a;
                Lazy h = cd2.getAccessor().h(qx2.class);
                Lazy h2 = cd2.getAccessor().h(tc2.class);
                Lazy h3 = cd2.getAccessor().h(msa.class);
                Lazy h4 = cd2.getAccessor().h(eu3.class);
                Lazy h5 = cd2.getAccessor().h(yva.class);
                Lazy h6 = cd2.getAccessor().h(n5g.class);
                Lazy h7 = cd2.getAccessor().h(cdd.class);
                Lazy h8 = cd2.getAccessor().h(fe6.class);
                Lazy h9 = cd2.getAccessor().h(uj5.class);
                chatMediaViewerScreen.getClass();
                KProperty[] kPropertyArr2 = ChatMediaViewerScreen.H0;
                KProperty kProperty = kPropertyArr2[0];
                is isVar = chatMediaViewerScreen.c;
                long longValue = ((Number) isVar.a(chatMediaViewerScreen)).longValue();
                KProperty kProperty2 = kPropertyArr2[1];
                KProperty kProperty3 = kPropertyArr2[2];
                Class<gaf> cls = gaf.class;
                KProperty kProperty4 = kPropertyArr2[3];
                boolean booleanValue = ((Boolean) chatMediaViewerScreen.w.a(chatMediaViewerScreen)).booleanValue();
                KProperty kProperty5 = kPropertyArr2[4];
                boolean booleanValue2 = ((Boolean) chatMediaViewerScreen.x.a(chatMediaViewerScreen)).booleanValue();
                rl rlVar = (rl) cd2.getAccessor().g(rl.class);
                KProperty kProperty6 = kPropertyArr2[0];
                return new aj2(h, h2, h3, h4, h5, h6, h7, h8, h9, longValue, (String) chatMediaViewerScreen.o.a(chatMediaViewerScreen), ((Number) chatMediaViewerScreen.v.a(chatMediaViewerScreen)).longValue(), booleanValue, booleanValue2, (Context) cd2.getAccessor().g(Context.class), (to9) cd2.getAccessor().g(to9.class), (gaf) cd2.getAccessor().g(cls), rlVar, new cj9(((Number) isVar.a(chatMediaViewerScreen)).longValue(), (sv0) cd2.getAccessor().g(sv0.class), (gaf) cd2.getAccessor().g(cls)));
            default:
                KProperty[] kPropertyArr3 = ChatMediaViewerScreen.H0;
                n7g n7g = ((mce) cd2.a.getAccessor().h(mce.class).getValue()).get();
                if (chatMediaViewerScreen.getView() != null) {
                    hr8 hr8 = (hr8) CollectionsKt.getOrNull(chatMediaViewerScreen.A0.w0.f, ((ViewPager2) chatMediaViewerScreen.Z.getValue(chatMediaViewerScreen, ChatMediaViewerScreen.H0[5])).getCurrentItem());
                    yq8 yq8 = hr8 instanceof yq8 ? (yq8) hr8 : null;
                    if (yq8 != null && yq8.v) {
                        n7g.g(c44.DEFAULT_ASPECT_RATIO);
                        n7g.K0(false);
                        n7g.x = new u6h(9, chatMediaViewerScreen);
                        return n7g;
                    }
                }
                if (chatMediaViewerScreen.D0 < c44.DEFAULT_ASPECT_RATIO && n7g.b() == c44.DEFAULT_ASPECT_RATIO) {
                    n7g.g(1.0f);
                }
                n7g.K0(false);
                n7g.x = new u6h(9, chatMediaViewerScreen);
                return n7g;
        }
    }
}
