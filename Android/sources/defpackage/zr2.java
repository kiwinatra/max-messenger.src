package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt;

/* renamed from: zr2  reason: default package */
public final class zr2 extends kbe {
    public static h42 R(wk2 wk2) {
        int ordinal = wk2.ordinal();
        if (ordinal == 0) {
            return h42.a;
        }
        if (ordinal == 1) {
            return h42.b;
        }
        if (ordinal == 2) {
            return h42.c;
        }
        if (ordinal == 3) {
            return h42.o;
        }
        if (ordinal == 4) {
            return h42.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: P */
    public final void M(xk2 xk2) {
        i42 i42 = (i42) this.a;
        int id = i42.getId();
        i42.setId(Long.hashCode(xk2.a));
        i42.setTitle(xk2.c);
        boolean z = false;
        CharSequence charSequence = xk2.w;
        if (!(!(charSequence == null || StringsKt.isBlank(charSequence)))) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = xk2.v;
        }
        i42.setSubtitle(charSequence);
        i42.setTyping(xk2.x);
        i42.setPinned(xk2.z0 != 0);
        i42.setMuted(xk2.w0);
        i42.setOnline(xk2.z);
        i42.setVerified(xk2.X);
        i42.setMention(xk2.y0);
        i42.setReaction(xk2.x0);
        i42.setTime(xk2.y);
        if (id == i42.getId()) {
            z = true;
        }
        i42.e(xk2.v0, z);
        i42.setStatus(R(xk2.Z));
        Uri uri = xk2.b;
        if (uri == null) {
            i42.c(xk2.C0, Long.valueOf(xk2.B0));
        } else {
            i42.setAvatar(uri);
        }
    }

    /* renamed from: Q */
    public final void N(xk2 xk2, Object obj) {
        CharSequence charSequence = null;
        vk2 vk2 = obj instanceof vk2 ? (vk2) obj : null;
        if (vk2 != null) {
            BitSet bitSet = (BitSet) vk2.a;
            boolean z = true;
            boolean z2 = bitSet.get(1);
            View view = this.a;
            if (z2) {
                Uri uri = xk2.b;
                if (uri == null) {
                    ((i42) view).c(xk2.C0, Long.valueOf(xk2.B0));
                } else {
                    ((i42) view).setAvatar(uri);
                }
            }
            if (bitSet.get(0)) {
                ((i42) view).setOnline(xk2.z);
            }
            if (bitSet.get(2)) {
                ((i42) view).setTitle(xk2.c);
            }
            if (bitSet.get(4)) {
                i42 i42 = (i42) view;
                CharSequence charSequence2 = xk2.w;
                if (!(charSequence2 == null || StringsKt.isBlank(charSequence2))) {
                    charSequence = charSequence2;
                }
                if (charSequence == null) {
                    charSequence = xk2.v;
                }
                i42.setSubtitle(charSequence);
            }
            if (bitSet.get(5)) {
                ((i42) view).setTyping(xk2.x);
            }
            if (bitSet.get(6)) {
                ((i42) view).setTime(xk2.y);
            }
            if (bitSet.get(8)) {
                ((i42) view).setStatus(R(xk2.Z));
            }
            if (bitSet.get(9)) {
                ((i42) view).e(xk2.v0, true);
            }
            if (bitSet.get(10)) {
                ((i42) view).setMuted(xk2.w0);
            }
            if (bitSet.get(11)) {
                ((i42) view).setReaction(xk2.x0);
            }
            if (bitSet.get(12)) {
                ((i42) view).setMention(xk2.y0);
            }
            if (bitSet.get(13)) {
                i42 i422 = (i42) view;
                if (xk2.z0 == 0) {
                    z = false;
                }
                i422.setPinned(z);
                return;
            }
            return;
        }
        M(xk2);
    }
}
