package ru.ok.messages.calls.views;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

public class CallRendererView extends FrameLayout implements fl4, u51, r61 {
    public static final /* synthetic */ int y0 = 0;
    public final ro4 a;
    public final ch b;
    public final RoundedRectFrameLayout c;
    public final View o;
    public final p3a v;
    public final enb v0;
    public final yl4 w;
    public boolean w0;
    public Parcelable x;
    public final hn4 x0;
    public GestureDetector y;
    public boolean z;

    /* JADX WARNING: type inference failed for: r5v37, types: [java.lang.Object, p3a] */
    public CallRendererView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), ujc.view_call_renderer, this);
        if (!isInEditMode()) {
            getContext();
            this.a = ro4.b();
            getContext();
            qra qra = (qra) ym.e();
            this.b = qra.d();
            qra.m();
            this.x0 = qra.n();
            a33 a33 = qra.y().a;
            this.o = findViewById(lic.view_call_renderer__pip_dim);
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0(context2);
            this.o.setBackgroundColor(j4b.l0(0.8f, k0.T));
            ((ImageView) findViewById(lic.view_call_renderer__pip_arrow)).setColorFilter(k0.S);
            TextureViewRenderer textureViewRenderer = (TextureViewRenderer) findViewById(lic.view_call_renderer__pip);
            RoundedRectFrameLayout roundedRectFrameLayout = (RoundedRectFrameLayout) findViewById(lic.view_call_renderer__pip_container);
            this.c = roundedRectFrameLayout;
            y64.n(roundedRectFrameLayout, new b5(5, this));
            findViewById(lic.view_call_renderer__ll_reconnect);
            findViewById(lic.view_call_renderer__progress);
            TextView textView = (TextView) findViewById(lic.view_call_renderer__progress_title);
            ViewStub viewStub = (ViewStub) findViewById(lic.view_call_renderer__call_grid);
            ViewStub viewStub2 = (ViewStub) findViewById(lic.view_call_renderer__full_renderer);
            CallDebugView callDebugView = (CallDebugView) findViewById(lic.view_call_renderer__debug_view);
            yl4 yl4 = new yl4(8, false);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.w = yl4;
            linkedHashSet.add(this);
            setOnTouchListener(new ng1(0, this));
            y64.n(this, new b5(5, this));
            enb enb = new enb(getContext(), this.b, this.x0, this.c);
            this.v0 = enb;
            this.c.setOnTouchListener(enb);
            ? obj = new Object();
            obj.a = new HashMap();
            this.v = obj;
        }
    }

    private Parcelable getCallGridViewSavedState() {
        Parcelable parcelable = this.x;
        if (parcelable == null) {
            return null;
        }
        this.x = null;
        return parcelable;
    }

    private int getCount() {
        return 0;
    }

    private GestureDetector getFullRendererGestureDetector() {
        if (this.y == null) {
            this.y = new GestureDetector(getContext(), new q00(4, this));
        }
        return this.y;
    }

    private void setFullScreenAvatarUri(Uri uri) {
        uri.getClass();
        ld9.p.get();
        throw null;
    }

    private void setFullScreenOpponentName(String str) {
        throw null;
    }

    private void setLocalRendererToDelegate(TextureViewRenderer textureViewRenderer) {
    }

    public final void a() {
    }

    public ye1 getCurrentPipOpponent() {
        return null;
    }

    public final Map getRemoteVideoRenderers(ue1 ue1) {
        return Collections.emptyMap();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v0.getClass();
        enb enb = this.v0;
        View view = enb.D0;
        cnb cnb = new cnb(enb, 0);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new cdg(viewTreeObserver, cnb));
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setLocalRendererToDelegate((TextureViewRenderer) null);
        this.v0.c.animate().cancel();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        HashMap hashMap;
        dnb dnb;
        if (!(parcelable instanceof j54)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j54 j54 = (j54) parcelable;
        super.onRestoreInstanceState(j54.a);
        yl4 yl4 = this.w;
        yl4.getClass();
        Bundle bundle = j54.c;
        if (bundle != null) {
            yl4.b = bundle.getLong("ru.ok.tamtam.extra.FOCUSED_PARTICIPANT");
        }
        this.x = bundle.getParcelable("ru.ok.tamtam.extra.CALL_GRID_VIEW_STATE");
        this.z = bundle.getBoolean("ru.ok.tamtam.extra.DEBUG_MODE");
        enb enb = this.v0;
        enb.getClass();
        if (bundle.containsKey("ru.ok.tamtam.call.EDGE_KEY") && (dnb = (dnb) bundle.getSerializable("ru.ok.tamtam.call.EDGE_KEY")) != null && !enb.C0) {
            pbb pbb = new pbb(1, enb, dnb);
            ViewTreeObserver viewTreeObserver = enb.c.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new cdg(viewTreeObserver, pbb));
        }
        p3a p3a = this.v;
        if (p3a != null && (hashMap = (HashMap) bundle.getSerializable("ru.ok.tamtam.extra.TALKING")) != null && !hashMap.isEmpty()) {
            p3a.a = hashMap;
        }
    }

    public final Parcelable onSaveInstanceState() {
        j54 j54 = new j54(super.onSaveInstanceState());
        j54.c.putLong("ru.ok.tamtam.extra.FOCUSED_PARTICIPANT", this.w.b);
        j54.c.putBoolean("ru.ok.tamtam.extra.DEBUG_MODE", this.z);
        enb enb = this.v0;
        Bundle bundle = j54.c;
        ila ila = enb.X;
        if (ila != null) {
            bundle.putSerializable("ru.ok.tamtam.call.EDGE_KEY", (dnb) ila.o);
        }
        p3a p3a = this.v;
        if (p3a != null) {
            Bundle bundle2 = j54.c;
            if (!((HashMap) p3a.a).isEmpty()) {
                bundle2.putSerializable("ru.ok.tamtam.extra.TALKING", (HashMap) p3a.a);
            }
        }
        return j54;
    }

    public void setDebugMode(boolean z2) {
        this.z = z2;
        this.x0.e();
    }

    public void setFocusedParticipantId(long j) {
        this.w.b = j;
    }

    public void setListener(og1 og1) {
    }

    public void setOreoPipEnabled(boolean z2) {
        if (z2 != this.w0) {
            this.w0 = z2;
            if (z2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
                ro4 ro4 = this.a;
                int i = ro4.A;
                marginLayoutParams.width = i;
                marginLayoutParams.height = i;
                int i2 = ro4.e;
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.setMarginEnd(i2);
                RoundedRectFrameLayout roundedRectFrameLayout = this.c;
                roundedRectFrameLayout.setX((float) roundedRectFrameLayout.getLeft());
                RoundedRectFrameLayout roundedRectFrameLayout2 = this.c;
                roundedRectFrameLayout2.setY((float) roundedRectFrameLayout2.getTop());
                this.c.setLayoutParams(marginLayoutParams);
                this.c.setCornerRadius((float) this.a.d);
                this.v0.C0 = true;
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            this.a.getClass();
            int i3 = (int) 110.0f;
            marginLayoutParams2.width = vo4.b(i3);
            this.a.getClass();
            marginLayoutParams2.height = vo4.b(i3);
            marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(ydc.call_pip_margin_bottom);
            marginLayoutParams2.setMarginEnd(this.a.n);
            this.c.setLayoutParams(marginLayoutParams2);
            this.c.setCornerRadius((float) this.a.h);
            enb enb = this.v0;
            enb.C0 = false;
            enb.z0 = true;
            enb.A0 = enb.A0;
        }
    }

    public void setOreoPipEnabledRequested(boolean z2) {
        enb enb = this.v0;
        enb.C0 = z2;
        if (!z2) {
            enb.z0 = true;
            enb.A0 = enb.A0;
        }
    }

    public void setParent(View view) {
        enb enb = this.v0;
        enb.D0 = view;
        cnb cnb = new cnb(enb, 1);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new cdg(viewTreeObserver, cnb));
    }

    public void setShowGroupStatusViews(boolean z2) {
    }
}
