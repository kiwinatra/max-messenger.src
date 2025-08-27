package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

/* renamed from: t65  reason: default package */
public final class t65 extends fzc {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;

    public t65(FastScroller fastScroller) {
        this.a = 2;
        this.d = new ArrayList();
        this.b = 0;
        this.c = fastScroller;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 2:
                FastScroller fastScroller = (FastScroller) this.c;
                if (i == 0 && this.b != 0) {
                    lid viewProvider = fastScroller.getViewProvider();
                    viewProvider.getClass();
                    if (viewProvider.a() != null) {
                        viewProvider.a().getClass();
                    }
                } else if (i != 0 && this.b == 0) {
                    lid viewProvider2 = fastScroller.getViewProvider();
                    viewProvider2.getClass();
                    if (viewProvider2.a() != null) {
                        viewProvider2.a().getClass();
                    }
                }
                this.b = i;
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        xme xme;
        Object value;
        tyc adapter;
        xme xme2;
        Object value2;
        Object obj = this.d;
        switch (this.a) {
            case 0:
                EndlessRecyclerView endlessRecyclerView = (EndlessRecyclerView) obj;
                endlessRecyclerView.post(new s65(i, i2, this, endlessRecyclerView));
                return;
            case 1:
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
                int height = recyclerView.getHeight();
                int i3 = this.b;
                if (computeVerticalScrollRange >= height + i3) {
                    LinearLayoutManager v = y7e.v(recyclerView);
                    MessagesListWidget messagesListWidget = (MessagesListWidget) obj;
                    if (!(v == null || (adapter = recyclerView.getAdapter()) == null)) {
                        int j = adapter.j();
                        Integer valueOf = Integer.valueOf(j);
                        if (j <= 0) {
                            valueOf = null;
                        }
                        if (!(valueOf == null || v.r(valueOf.intValue() - 1) == null || computeVerticalScrollRange - (computeVerticalScrollOffset + computeVerticalScrollExtent) >= i3)) {
                            Boolean bool = (Boolean) this.c;
                            if (bool == null || Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                                KProperty[] kPropertyArr = MessagesListWidget.R0;
                                en9 k0 = messagesListWidget.k0();
                                do {
                                    xme2 = k0.o1;
                                    value2 = xme2.getValue();
                                } while (!xme2.b(value2, hid.a((hid) value2, 0, false, false, (gid) null, 13)));
                                this.c = Boolean.FALSE;
                                return;
                            }
                            return;
                        }
                    }
                    Boolean bool2 = (Boolean) this.c;
                    if (bool2 == null || Intrinsics.areEqual((Object) bool2, (Object) Boolean.FALSE)) {
                        KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                        en9 k02 = messagesListWidget.k0();
                        do {
                            xme = k02.o1;
                            value = xme.getValue();
                        } while (!xme.b(value, hid.a((hid) value, 0, true, false, (gid) null, 13)));
                        this.c = Boolean.TRUE;
                        return;
                    }
                    return;
                }
                return;
            default:
                FastScroller fastScroller = (FastScroller) this.c;
                if (fastScroller.o != null && !fastScroller.x0 && fastScroller.b.getChildCount() > 0) {
                    c(recyclerView);
                    return;
                }
                return;
        }
    }

    public void c(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        FastScroller fastScroller = (FastScroller) this.c;
        if (fastScroller.c()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(((float) computeHorizontalScrollOffset) / ((float) (computeHorizontalScrollRange - computeHorizontalScrollExtent)));
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public t65(MessagesListWidget messagesListWidget) {
        this.a = 1;
        this.d = messagesListWidget;
        this.b = MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density);
    }

    public t65(EndlessRecyclerView endlessRecyclerView, u65 u65) {
        this.a = 0;
        this.d = endlessRecyclerView;
        this.c = u65;
        this.b = 1;
    }
}
