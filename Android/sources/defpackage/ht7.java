package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import kotlin.TuplesKt;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: ht7  reason: default package */
public final /* synthetic */ class ht7 implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ht7(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final Object a() {
        return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", o54.f(TuplesKt.to("ru.ok.tamtam.extra.REQUEST_CODE", Integer.valueOf(this.a)), TuplesKt.to("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(this.b))));
    }
}
