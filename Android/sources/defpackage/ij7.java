package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: ij7  reason: default package */
public final class ij7 implements TextWatcher {
    public final aeb a;
    public boolean b = false;
    public boolean c;
    public zs o;
    public int v;
    public int w;
    public final boolean x;
    public int y = 0;
    public int z = 0;

    public ij7(aeb aeb, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.a = aeb;
        b(i, str);
        this.x = true;
        this.w = i2;
    }

    public final String a(CharSequence charSequence) {
        this.o.f();
        String str = "+" + this.v;
        boolean z2 = this.x;
        if (z2 || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + charSequence;
        }
        int length = charSequence.length();
        char c2 = 0;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c2 != 0) {
                    str2 = this.o.i(c2);
                }
                c2 = charAt;
            }
        }
        if (c2 != 0) {
            str2 = this.o.i(c2);
        }
        String trim = str2.trim();
        if (z2 || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            trim = trim.length() > str.length() ? trim.charAt(str.length()) == ' ' ? trim.substring(str.length() + 1) : trim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(trim) ? "" : trim;
    }

    public final synchronized void afterTextChanged(Editable editable) {
        try {
            if (!this.b) {
                int selectionEnd = Selection.getSelectionEnd(editable);
                boolean z2 = false;
                int i = 0;
                for (int i2 = 0; i2 < editable.length(); i2++) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                        i++;
                    }
                }
                int i3 = this.w;
                if (i > i3) {
                    int i4 = i - i3;
                    int max = Math.max(this.y + this.z, 1) - 1;
                    this.b = true;
                    while (max < editable.length() && i4 > 0) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(max))) {
                            editable.delete(max, max + 1);
                            i4--;
                        } else {
                            max++;
                        }
                    }
                    this.b = false;
                } else if (this.c) {
                    if (editable.length() != 0) {
                        z2 = true;
                    }
                    this.c = z2;
                } else {
                    boolean z3 = selectionEnd == editable.length();
                    String a2 = a(editable);
                    if (!a2.equals(editable.toString())) {
                        if (!z3) {
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= editable.length()) {
                                    break;
                                } else if (i5 >= selectionEnd) {
                                    break;
                                } else {
                                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i5))) {
                                        i6++;
                                    }
                                    i5++;
                                }
                            }
                            selectionEnd = 0;
                            int i7 = 0;
                            while (true) {
                                if (selectionEnd >= a2.length()) {
                                    selectionEnd = 0;
                                    break;
                                } else if (i7 == i6) {
                                    break;
                                } else {
                                    if (PhoneNumberUtils.isNonSeparator(a2.charAt(selectionEnd))) {
                                        i7++;
                                    }
                                    selectionEnd++;
                                }
                            }
                        } else {
                            selectionEnd = a2.length();
                        }
                    }
                    if (!z3) {
                        while (true) {
                            int i8 = selectionEnd - 1;
                            if (i8 > 0 && !PhoneNumberUtils.isNonSeparator(a2.charAt(i8))) {
                                selectionEnd--;
                            }
                        }
                    }
                    this.b = true;
                    editable.replace(0, editable.length(), a2, 0, a2.length());
                    this.b = false;
                    Selection.setSelection(editable, selectionEnd);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void b(int i, String str) {
        this.v = i;
        aeb aeb = this.a;
        aeb.getClass();
        zs zsVar = new zs(aeb, str);
        this.o = zsVar;
        zsVar.f();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.b && !this.c && i2 > 0) {
            for (int i4 = i; i4 < i + i2; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.c = true;
                    this.o.f();
                    return;
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.y = i;
        this.z = i3;
        if (!this.b && !this.c && i3 > 0) {
            for (int i4 = i; i4 < i + i3; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.c = true;
                    this.o.f();
                    return;
                }
            }
        }
    }
}
