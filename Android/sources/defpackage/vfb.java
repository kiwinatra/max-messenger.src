package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: vfb  reason: default package */
public final class vfb extends frb {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ wfb c;

    public vfb(FrameLayout frameLayout, wfb wfb) {
        this.b = frameLayout;
        this.c = wfb;
    }

    public final int a() {
        return c();
    }

    public final int c() {
        return this.c.getMeasuredHeight() - this.b.getMeasuredHeight();
    }

    public final int e() {
        return this.c.getMeasuredHeight();
    }

    public final View f() {
        return this.b;
    }

    public final void h() {
        wfb wfb = this.c;
        ViewParent parent = wfb.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(wfb);
        }
        CreateChannelViewModel i3 = ((CreateChannelFragment) wfb.v0.b).i3();
        i3.getClass();
        i3.E.setValue(i3, CreateChannelViewModel.G[8], Boolean.FALSE);
    }
}
