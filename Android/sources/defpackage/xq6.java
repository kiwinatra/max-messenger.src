package defpackage;

import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* renamed from: xq6  reason: default package */
public final class xq6 {
    public final Resources a;

    public xq6(Resources resources) {
        this.a = resources;
    }

    public final Pair a(a32 a32, jr8 jr8) {
        int ordinal = jr8.ordinal();
        if (ordinal != 0) {
            Resources resources = this.a;
            if (ordinal == 1) {
                return new Pair(resources.getString(tmc.tt_audio_message), resources.getString(tmc.tt_you));
            } else if (ordinal == 2 || ordinal == 3) {
                return new Pair(resources.getString(tmc.tt_audio_message), resources.getString(tmc.tt_you));
            } else if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new Pair(null, null);
    }
}
