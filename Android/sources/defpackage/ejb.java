package defpackage;

import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: ejb  reason: default package */
public final /* synthetic */ class ejb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget b;

    public /* synthetic */ ejb(PickerChatsTabWidget pickerChatsTabWidget, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget;
    }

    public final Object invoke() {
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatsTabWidget.Z;
                c2b c2b = new c2b(pickerChatsTabWidget.getContext(), (AttributeSet) null);
                c2b.setId(hra.e);
                c2b.setTabMode(0);
                return c2b;
            default:
                KProperty[] kPropertyArr2 = PickerChatsTabWidget.Z;
                ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                viewPager2.setId(hra.d);
                hsg.m(viewPager2);
                return viewPager2;
        }
    }
}
