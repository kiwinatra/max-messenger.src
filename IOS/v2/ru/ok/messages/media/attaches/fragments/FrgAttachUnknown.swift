package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.views.widgets.BlockedAttachView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgAttachUnknown extends FrgAttachView {
    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_unknown_attach_view, viewGroup, false);
        o3();
        BlockedAttachView blockedAttachView = (BlockedAttachView) slideOutLayout.findViewById(lic.frg_unknown_attach__deleted_view);
        blockedAttachView.a.setText(this.x.getString("ru.ok.tamtam.extra.TEXT"));
        blockedAttachView.setBackgroundColor(-16777216);
        y64.n(blockedAttachView, new b5(13, this));
        slideOutLayout.setSlideOutListener(this);
        M2(true);
        b33 q1 = q1();
        if (q1 != null) {
            q1.n();
        }
        p3(slideOutLayout, blockedAttachView);
        return slideOutLayout;
    }

    public final void n3(boolean z) {
    }

    public final boolean s2(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || X2() == null) {
            return true;
        }
        M1().finish();
        return true;
    }
}
