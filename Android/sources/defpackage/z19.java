package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: z19  reason: default package */
public final /* synthetic */ class z19 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaTypePickerWidget b;

    public /* synthetic */ z19(MediaTypePickerWidget mediaTypePickerWidget, int i) {
        this.a = i;
        this.b = mediaTypePickerWidget;
    }

    public final Object invoke() {
        boolean z = true;
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaTypePickerWidget.w;
                mediaTypePickerWidget.getClass();
                KProperty[] kPropertyArr2 = MediaTypePickerWidget.w;
                KProperty kProperty = kPropertyArr2[1];
                KProperty kProperty2 = kPropertyArr2[0];
                return new r19((p19) mediaTypePickerWidget.m1571getSharedViewModelcp94BC8(((egd) mediaTypePickerWidget.b.a(mediaTypePickerWidget)).a, p19.class, (Function0) null).getValue(), ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue());
            default:
                KProperty[] kPropertyArr3 = MediaTypePickerWidget.w;
                h19 h19 = new h19(mediaTypePickerWidget.getContext());
                r19 c0 = mediaTypePickerWidget.c0();
                c0.getClass();
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(u19.a);
                a32 a32 = (a32) ((my2) ((qx2) c0.y.getValue())).o(c0.c).a.getValue();
                Lazy lazy = c0.x;
                if (a32 != null) {
                    boolean z2 = a32.b.a != 0;
                    if (!a32.N() || a32.J()) {
                        z = false;
                    }
                    akd akd = (akd) ((bud) lazy.getValue());
                    akd.getClass();
                    if (akd.r(PmsKey.f81moneytransferbotid, 0) != 0 && z && z2) {
                        createListBuilder.add(w19.a);
                    }
                }
                akd akd2 = (akd) ((bud) lazy.getValue());
                akd2.getClass();
                if (akd2.m(PmsKey.f102sendlocationenabled, false)) {
                    createListBuilder.add(v19.a);
                }
                createListBuilder.add(s19.a);
                createListBuilder.add(t19.a);
                h19.setState(CollectionsKt.build(createListBuilder));
                h19.setOnClickListener(new hq7(mediaTypePickerWidget.c0()));
                if (h19.isAttachedToWindow()) {
                    h19.setPadding(h19.getPaddingLeft(), h19.getPaddingTop(), h19.getPaddingRight(), MathKt.roundToInt((iog.g((View) null, h19.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * vo4.c().getDisplayMetrics().density));
                } else {
                    h19.addOnAttachStateChangeListener(new p50(5, h19, h19));
                }
                return h19;
        }
    }
}
