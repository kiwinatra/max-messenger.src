package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: h71  reason: default package */
public final /* synthetic */ class h71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ h71(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    public final Object invoke() {
        CallHistoryPageScreen callHistoryPageScreen = this.b;
        switch (this.a) {
            case 0:
                s9a s9a = CallHistoryPageScreen.X;
                return new n71(callHistoryPageScreen.requireActivity().getApplicationContext(), callHistoryPageScreen.c0(), (lf1) callHistoryPageScreen.c.getValue());
            case 1:
                s9a s9a2 = CallHistoryPageScreen.X;
                return new lf1(LazyKt.lazy(new h71(callHistoryPageScreen, 5)), new eng(callHistoryPageScreen, 0));
            case 2:
                s9a s9a3 = CallHistoryPageScreen.X;
                if (callHistoryPageScreen.c0() != x71.MISSING) {
                    return null;
                }
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(callHistoryPageScreen.getContext(), (AttributeSet) null);
                oneMeEmptyView.setVisibility(8);
                oneMeEmptyView.setId(igc.call_history_page_empty);
                oneMeEmptyView.setIcon(cad.f0);
                oneMeEmptyView.setTitle(new igf(vkc.call_history_missed_calls_empty_state_title));
                return oneMeEmptyView;
            case 3:
                s9a s9a4 = CallHistoryPageScreen.X;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(callHistoryPageScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(igc.call_history_list);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter((f71) callHistoryPageScreen.x.getValue());
                callHistoryPageScreen.o = y7e.n(endlessRecyclerView2);
                OneMeEmptyView oneMeEmptyView2 = (OneMeEmptyView) callHistoryPageScreen.v.getValue();
                if (oneMeEmptyView2 != null) {
                    endlessRecyclerView2.setEmptyView(oneMeEmptyView2);
                }
                endlessRecyclerView2.setPager(new k71(0, callHistoryPageScreen));
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setThreshold(10);
                endlessRecyclerView2.setClipToPadding(false);
                float f = (float) 0;
                float f2 = (float) 10;
                endlessRecyclerView2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                return endlessRecyclerView2;
            case 4:
                s9a s9a5 = CallHistoryPageScreen.X;
                return new f71(new er7(7, (Object) callHistoryPageScreen), sjd.a.t().b());
            default:
                s9a s9a6 = CallHistoryPageScreen.X;
                return callHistoryPageScreen.getRouter();
        }
    }
}
