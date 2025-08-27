package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: uib  reason: default package */
public final /* synthetic */ class uib implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    public /* synthetic */ uib(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        this.a = i;
        this.b = pickerChatsListWidget2;
    }

    public final Object invoke() {
        boolean z = false;
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickerChatsListWidget2.w0;
                cs2 cs2 = cs2.a;
                Class<x23> cls = x23.class;
                cu2 cu2 = new cu2((Context) cs2.getAccessor().g(Context.class), new lgb(5), cs2.getAccessor().h(cls), cs2.getAccessor().h(bud.class), cs2.getAccessor().h(rtb.class), cs2.getAccessor().h(fq2.class), cs2.getAccessor().h(eq2.class));
                Lazy lazy = LazyKt.lazy(new lgb(6));
                gaf e = cs2.e();
                Lazy lazyOf = LazyKt.lazyOf(cu2);
                cp3 cp3 = (cp3) cs2.getAccessor().g(cp3.class);
                Lazy h = cs2.getAccessor().h(fd8.class);
                return new jib(pickerChatsListWidget2.b, ((xs2) cs2.getAccessor().g(xs2.class)).a(pickerChatsListWidget2.b), cp3, (x23) cs2.getAccessor().g(cls), new uib(pickerChatsListWidget2, 3), e, h, lazyOf, lazy);
            case 1:
                KProperty[] kPropertyArr2 = PickerChatsListWidget2.w0;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(pickerChatsListWidget2.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d));
                oneMeEmptyView.setSubtitle(new igf(ead.c));
                return oneMeEmptyView;
            case 2:
                KProperty[] kPropertyArr3 = PickerChatsListWidget2.w0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerChatsListWidget2.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(hra.k);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                return endlessRecyclerView2;
            default:
                KProperty[] kPropertyArr4 = PickerChatsListWidget2.w0;
                pickerChatsListWidget2.getClass();
                KProperty kProperty = PickerChatsListWidget2.w0[0];
                if (((Boolean) pickerChatsListWidget2.c.a(pickerChatsListWidget2)).booleanValue() && Intrinsics.areEqual((Object) pickerChatsListWidget2.b, (Object) "all.chat.folder")) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
