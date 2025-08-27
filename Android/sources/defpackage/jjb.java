package defpackage;

import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: jjb  reason: default package */
public final /* synthetic */ class jjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget2 b;

    public /* synthetic */ jjb(PickerChatsTabWidget2 pickerChatsTabWidget2, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget2;
    }

    public final Object invoke() {
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatsTabWidget2.Z;
                c2b c2b = new c2b(pickerChatsTabWidget2.getContext(), (AttributeSet) null);
                c2b.setId(hra.e);
                c2b.setTabMode(0);
                return c2b;
            default:
                KProperty[] kPropertyArr2 = PickerChatsTabWidget2.Z;
                ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget2.getContext());
                viewPager2.setId(hra.d);
                hsg.m(viewPager2);
                return viewPager2;
        }
    }
}
