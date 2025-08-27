package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import kotlin.TuplesKt;

public final class ConfirmationDialog extends DialogFragment {
    public boolean B1;

    public final Dialog V2(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle F2 = F2();
        String string = F2.getString("ru.ok.tamtam.extra.TITLE");
        CharSequence charSequence = F2.getCharSequence("ru.ok.tamtam.extra.CONTENT");
        String string2 = F2.getString("ru.ok.tamtam.extra.POSITIVE_TEXT");
        String string3 = F2.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT");
        if (TextUtils.isEmpty(string) && (i4 = F2.getInt("ru.ok.tamtam.extra.TITLE_RES_ID")) != 0) {
            string = S1(i4);
        }
        if (TextUtils.isEmpty(charSequence) && (i3 = F2.getInt("ru.ok.tamtam.extra.CONTENT_RES_ID")) != 0) {
            charSequence = S1(i3);
        }
        if (TextUtils.isEmpty(string2) && (i2 = F2.getInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID")) != 0) {
            string2 = S1(i2);
        }
        if (TextUtils.isEmpty(string3) && (i = F2.getInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID")) != 0) {
            string3 = S1(i);
        }
        cg8 q = new cg8(G2()).q(string);
        q.a.f = charSequence;
        q.o(string2, new yg3(this, 0));
        q.m(string3, new yg3(this, 1));
        return q.create();
    }

    public final void Z2() {
        if (!this.B1) {
            Bundle bundle = this.x;
            Bundle bundle2 = bundle != null ? bundle.getBundle("ru.ok.tamtam.extra.DATA") : null;
            Q1().f0("ConfirmationDialog:request_key", o54.f(TuplesKt.to("NEGATIVE", ah3.c)));
            a U1 = U1(true);
            if (U1 == null) {
                b M1 = M1();
                if (M1 instanceof zg3) {
                    ((zg3) M1).getClass();
                } else if (M1 instanceof m5) {
                    Intent intent = new Intent();
                    intent.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                    ((m5) M1).onActivityResult(V1(), 0, intent);
                }
            } else if (U1 instanceof zg3) {
                zg3 zg3 = (zg3) U1;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("ru.ok.tamtam.extra.DATA", bundle2);
                U1.f2(V1(), 0, intent2);
            }
            this.B1 = true;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Z2();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Z2();
    }
}
