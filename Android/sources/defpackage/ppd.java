package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: ppd  reason: default package */
public final /* synthetic */ class ppd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectAlbumWidget b;

    public /* synthetic */ ppd(SelectAlbumWidget selectAlbumWidget, int i) {
        this.a = i;
        this.b = selectAlbumWidget;
    }

    public final Object invoke() {
        SelectAlbumWidget selectAlbumWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = SelectAlbumWidget.w;
                bqd bqd = new bqd(new y3a(29, (Object) selectAlbumWidget), ((aua) selectAlbumWidget.b.getValue()).a());
                bs0.K(new ps5(ct.k(selectAlbumWidget.e0().y, selectAlbumWidget.getViewLifecycleOwner().getLifecycle(), iu7.o), new qpd((Continuation) null, bqd), 5), selectAlbumWidget.getViewLifecycleScope());
                return bqd;
            case 1:
                KProperty[] kPropertyArr2 = SelectAlbumWidget.w;
                RecyclerView recyclerView = new RecyclerView(selectAlbumWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(sya.d);
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                KProperty kProperty = SelectAlbumWidget.w[1];
                recyclerView.setAdapter((bqd) selectAlbumWidget.c.getValue());
                recyclerView.setOutlineProvider(new lr0(vo4.c().getDisplayMetrics().density * 20.0f, 0));
                b0h.H(recyclerView, new qrb(3, (Continuation) null, 10));
                return recyclerView;
            default:
                KProperty[] kPropertyArr3 = SelectAlbumWidget.w;
                orb orb = new orb(selectAlbumWidget.getContext());
                orb.setStackFromBottom(false);
                orb.setCallback(new qa(selectAlbumWidget, 4));
                orb.addView(selectAlbumWidget.c0());
                b0h.H(orb, new mh0(3, (Continuation) null, 14));
                return orb;
        }
    }
}
