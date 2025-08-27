package defpackage;

import android.text.Editable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: yra  reason: default package */
public final class yra extends TextKeyListener {
    public final /* synthetic */ OneMeContactsChipGroup a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yra(OneMeContactsChipGroup oneMeContactsChipGroup) {
        super(TextKeyListener.Capitalize.NONE, false);
        this.a = oneMeContactsChipGroup;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (i == 67) {
            OneMeContactsChipGroup oneMeContactsChipGroup = this.a;
            if (oneMeContactsChipGroup.getEditText().getText().length() == 0) {
                LinkedHashMap linkedHashMap = oneMeContactsChipGroup.B0;
                if (!linkedHashMap.isEmpty()) {
                    Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.last(linkedHashMap.entrySet());
                    if (((Chip) entry.getValue()).isChecked()) {
                        xra callback = oneMeContactsChipGroup.getCallback();
                        if (callback != null) {
                            callback.x(((Number) entry.getKey()).longValue());
                        }
                        oneMeContactsChipGroup.c(((Number) entry.getKey()).longValue());
                    } else {
                        ((Chip) entry.getValue()).setChecked(true);
                    }
                    return true;
                }
            }
        }
        return super.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return true;
    }
}
