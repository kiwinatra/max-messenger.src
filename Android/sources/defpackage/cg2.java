package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: cg2  reason: default package */
public final /* synthetic */ class cg2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaTabWidget b;

    public /* synthetic */ cg2(ChatMediaTabWidget chatMediaTabWidget, int i) {
        this.a = i;
        this.b = chatMediaTabWidget;
    }

    public final Object invoke() {
        ChatMediaTabWidget chatMediaTabWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMediaTabWidget.Z;
                h3b d = o54.d(chatMediaTabWidget.getContext(), (AttributeSet) null);
                d.setId(jxa.o0);
                d.setForm(z2b.a);
                d.setLeftActions(new p2b(new gl1(13)));
                return d;
            case 1:
                KProperty[] kPropertyArr2 = ChatMediaTabWidget.Z;
                c2b c2b = new c2b(chatMediaTabWidget.getContext(), (AttributeSet) null);
                c2b.setId(jxa.k0);
                c2b.setTabMode(0);
                c2b.setTabGravity(2);
                return c2b;
            default:
                KProperty[] kPropertyArr3 = ChatMediaTabWidget.Z;
                ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                viewPager2.setId(jxa.m0);
                viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewPager2.setOffscreenPageLimit(3);
                viewPager2.b(new gi0(2, chatMediaTabWidget));
                hsg.m(viewPager2);
                return viewPager2;
        }
    }
}
