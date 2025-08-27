package defpackage;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.SequencesKt;

/* renamed from: hf8  reason: default package */
public final class hf8 implements ActionMode.Callback {
    public final EditText a;
    public final gf8 b;
    public final HashSet c = new HashSet();

    public hf8(EditText editText, gf8 gf8) {
        this.a = editText;
        this.b = gf8;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        if (!(text == null || text.length() == 0)) {
            int itemId = menuItem.getItemId();
            int i = nic.markdown_bold;
            gf8 gf8 = this.b;
            if (itemId == i) {
                ld8.k0(text, selectionStart, selectionEnd, false, new eq0());
                if (gf8 != null) {
                    gf8.k(if8.b);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_italic) {
                ld8.k0(text, selectionStart, selectionEnd, false, new ol7());
                if (gf8 != null) {
                    gf8.k(if8.c);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_underline) {
                ld8.k0(text, selectionStart, selectionEnd, true, new gvf());
                if (gf8 != null) {
                    gf8.k(if8.o);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_mono) {
                ld8.k0(text, selectionStart, selectionEnd, true, new xs9());
                if (gf8 != null) {
                    gf8.k(if8.v);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_strikethrough) {
                ld8.k0(text, selectionStart, selectionEnd, true, new uxe());
                if (gf8 != null) {
                    gf8.k(if8.x);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_code) {
                ld8.k0(text, selectionStart, selectionEnd, false, new d43());
                if (gf8 != null) {
                    gf8.k(if8.z);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_link) {
                if (gf8 != null) {
                    ky7[] ky7Arr = (ky7[]) text.getSpans(selectionStart, selectionEnd, ky7.class);
                    if (ky7Arr != null && ky7Arr.length != 0) {
                        Iterator it = ArrayIteratorKt.iterator(ky7Arr);
                        while (true) {
                            if (!it.hasNext()) {
                                gf8.x(selectionStart, selectionEnd, (String) null);
                                break;
                            }
                            ky7 ky7 = (ky7) it.next();
                            int spanStart = text.getSpanStart(ky7);
                            int spanEnd = text.getSpanEnd(ky7);
                            if (spanStart == selectionStart && spanEnd == selectionEnd) {
                                gf8.x(selectionStart, selectionEnd, ky7.b);
                                break;
                            }
                        }
                    } else {
                        gf8.x(selectionStart, selectionEnd, (String) null);
                    }
                }
                if (gf8 != null) {
                    gf8.k(if8.w);
                }
                return true;
            } else if (itemId == nic.markdown_heading) {
                ld8.k0(text, selectionStart, selectionEnd, true, new mx6());
                if (gf8 != null) {
                    gf8.k(if8.y);
                }
                actionMode.finish();
                return true;
            } else if (itemId == nic.markdown_regular) {
                ld8.e0(text, selectionStart, selectionEnd);
                if (gf8 != null) {
                    gf8.k(if8.a);
                }
                actionMode.finish();
                return true;
            } else if (!(itemId == 16908320 || itemId == 16908321)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                z68.c("hf8", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)), new Object[0]);
            }
        }
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        HashSet hashSet = this.c;
        hashSet.clear();
        hashSet.add(16908320);
        hashSet.add(16908321);
        bf8.c.getClass();
        for (bf8 bf8 : bf8.v) {
            int i = bf8.a;
            menu.add(nic.markdown_group, i, 0, this.a.getResources().getString(bf8.b)).setShowAsAction(0);
            hashSet.add(Integer.valueOf(i));
        }
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.c.clear();
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        for (MenuItem itemId : SequencesKt.filter(new mag(2, menu), new vq7(8, (Object) this))) {
            menu.removeItem(itemId.getItemId());
        }
        return true;
    }
}
