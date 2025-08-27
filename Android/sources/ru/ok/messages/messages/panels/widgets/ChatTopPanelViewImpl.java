package ru.ok.messages.messages.panels.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;

public class ChatTopPanelViewImpl extends RelativeLayout implements jr2 {
    public List a = Collections.emptyList();
    public final yx9 b;
    public final kid c;
    public final ua o;
    public final mqf v;

    /* JADX WARNING: type inference failed for: r4v7, types: [f0, ua] */
    public ChatTopPanelViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.view_chat_top_panel, this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(ydc.chat_top_panel_horizontal_padding);
        getContext();
        mqf mqf = new mqf(this, ro4.b().h);
        this.v = mqf;
        this.b = new yx9((ViewStub) findViewById(lic.view_chat_top_panel__vs_mini_audio_player), mqf);
        this.o = new f0(((ViewStub) findViewById(lic.view_chat_top_panel__vs_add_or_block)).getContext(), mqf);
        kid kid = new kid((ViewStub) findViewById(lic.view_chat_top_panel__vs_panels), mqf, dimensionPixelOffset);
        this.c = kid;
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        RecyclerView recyclerView = kid.x;
        if (recyclerView != null) {
            f6e.C(recyclerView);
            kid.x.setBackgroundColor(k0.O);
        }
    }

    public AddOrBlockUserView getAddOrBlockView() {
        this.o.getClass();
        return null;
    }

    public MiniPlayerView getMiniPlayerView() {
        this.b.getClass();
        return null;
    }

    public RecyclerView getRvPanels() {
        return this.c.x;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yx9 yx9 = this.b;
        yx9.getClass();
        e14.c(yx9, (CancellationException) null);
    }

    public void setAnimationAnchor(View view) {
        this.v.v = view;
    }

    public void setListenerProvider(ir2 ir2) {
        this.c.o = ir2;
        this.o.o = ir2;
        this.b.o = ir2;
    }
}
