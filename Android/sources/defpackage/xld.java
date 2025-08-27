package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: xld  reason: default package */
public final class xld implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xld(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        switch (this.a) {
            case 0:
                gmd gmd = (gmd) this.b;
                if (gmd.mSearchable == null) {
                    return false;
                }
                if (gmd.mSearchSrcTextView.isPopupShowing() && gmd.mSearchSrcTextView.getListSelection() != -1) {
                    return gmd.onSuggestionsKey(view, i, keyEvent);
                }
                if (TextUtils.getTrimmedLength(gmd.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                gmd.launchQuerySearch(0, (String) null, gmd.mSearchSrcTextView.getText().toString());
                return true;
            default:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.b;
                if ((!seekBarPreference.d1 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.b1) == null) {
                    return false;
                }
                return seekBar.onKeyDown(i, keyEvent);
        }
    }
}
