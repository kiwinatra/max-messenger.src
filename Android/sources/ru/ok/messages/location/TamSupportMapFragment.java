package ru.ok.messages.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.messages.location.view.SupportMapFragmentImpl;

public class TamSupportMapFragment extends SupportMapFragmentImpl {
    public FrameLayout m1;
    public eof n1;

    public final View W1() {
        return this.m1;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.FrameLayout, eof, android.view.ViewGroup] */
    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m1 = (FrameLayout) super.k2(layoutInflater, viewGroup, bundle);
        ? frameLayout = new FrameLayout(M1());
        this.n1 = frameLayout;
        frameLayout.addView(this.m1);
        return this.n1;
    }
}
