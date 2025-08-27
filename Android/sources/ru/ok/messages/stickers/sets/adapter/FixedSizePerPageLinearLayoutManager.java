package ru.ok.messages.stickers.sets.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

public class FixedSizePerPageLinearLayoutManager extends LinearLayoutManager {
    public int E;

    public final boolean g(bzc bzc) {
        if (bzc != null) {
            if (bzc.width == Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) this.E))) {
                return true;
            }
        }
        return false;
    }

    public final bzc s() {
        bzc s = super.s();
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) this.E));
        if (this.p == 0) {
            s.width = round;
        } else {
            s.height = round;
        }
        return s;
    }

    public final bzc u(ViewGroup.LayoutParams layoutParams) {
        bzc u = super.u(layoutParams);
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) this.E));
        if (this.p == 0) {
            u.width = round;
        } else {
            u.height = round;
        }
        return u;
    }
}
