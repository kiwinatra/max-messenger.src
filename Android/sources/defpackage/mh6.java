package defpackage;

import android.content.DialogInterface;
import ru.ok.messages.views.dialogs.FrgDlgMoveOwner;

/* renamed from: mh6  reason: default package */
public final /* synthetic */ class mh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgMoveOwner b;

    public /* synthetic */ mh6(FrgDlgMoveOwner frgDlgMoveOwner, long j, int i) {
        this.a = i;
        this.b = frgDlgMoveOwner;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                FrgDlgMoveOwner frgDlgMoveOwner = this.b;
                frgDlgMoveOwner.T2(false, false);
                if (frgDlgMoveOwner.x.getBoolean("ru.ok.tamtam.extra.EXTRA_BEFORE_LEAVE", false)) {
                    ((nh6) frgDlgMoveOwner.b3()).y0();
                    return;
                }
                return;
            default:
                FrgDlgMoveOwner frgDlgMoveOwner2 = this.b;
                ((nh6) frgDlgMoveOwner2.b3()).y1(frgDlgMoveOwner2.x.getBoolean("ru.ok.tamtam.extra.EXTRA_BEFORE_LEAVE", false));
                return;
        }
    }
}
