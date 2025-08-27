package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import kotlin.TuplesKt;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: jt7  reason: default package */
public final /* synthetic */ class jt7 implements ya4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ s58 c;
    public final /* synthetic */ float o;
    public final /* synthetic */ Long v;

    public /* synthetic */ jt7(long j, long j2, s58 s58, float f, Long l) {
        this.a = j;
        this.b = j2;
        this.c = s58;
        this.o = f;
        this.v = l;
    }

    public final Object a() {
        return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", o54.f(TuplesKt.to("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(this.a)), TuplesKt.to("ru.ok.tamtam.extra.MESSAGE_ID", Long.valueOf(this.b)), TuplesKt.to("ru.ok.tamtam.extra.LOCATION", this.c), TuplesKt.to("ru.ok.tamtam.extra.ZOOM", Float.valueOf(this.o)), TuplesKt.to("ru.ok.tamtam.extra.CONTACT_ID", this.v)));
    }
}
