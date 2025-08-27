package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: zw3  reason: default package */
public final /* synthetic */ class zw3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ soc b;

    public /* synthetic */ zw3(soc soc, int i) {
        this.a = i;
        this.b = soc;
    }

    public final Object invoke(Object obj) {
        SpannableString valueOf;
        ky7 ky7;
        switch (this.a) {
            case 0:
                soc soc = this.b;
                soc.getClass();
                int ordinal = ((k04) obj).ordinal();
                Context context = (Context) soc.b;
                EditText editText = (EditText) soc.c;
                if (ordinal == 0) {
                    b59.k(context, editText.getText().subSequence(editText.getSelectionStart(), editText.getSelectionEnd()).toString());
                    editText.getText().replace(editText.getSelectionStart(), editText.getSelectionEnd(), "");
                } else if (ordinal == 1) {
                    b59.k(context, editText.getText().subSequence(editText.getSelectionStart(), editText.getSelectionEnd()).toString());
                    hff hff = (hff) soc.v;
                    if (hff != null) {
                        hff.dismiss();
                    }
                } else if (ordinal == 2) {
                    if (editText.hasSelection()) {
                        editText.getText().replace(editText.getSelectionStart(), editText.getSelectionEnd(), "");
                    }
                    if (b59.R(context) != null) {
                        editText.getText().insert(editText.getSelectionStart(), b59.R(context));
                    } else {
                        hff hff2 = (hff) soc.v;
                        if (hff2 != null) {
                            hff2.dismiss();
                        }
                    }
                } else if (ordinal == 3) {
                    editText.selectAll();
                } else if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (editText.getText() != null) {
                    editText.setSelection(editText.getText().length());
                }
                return Unit.INSTANCE;
            default:
                af8 af8 = (af8) obj;
                soc soc2 = this.b;
                EditText editText2 = (EditText) soc2.c;
                Editable text = editText2.getText();
                if (!(text == null || (valueOf = SpannableString.valueOf(text)) == null)) {
                    int selectionStart = editText2.getSelectionStart();
                    int selectionEnd = editText2.getSelectionEnd();
                    if8 if8 = af8.b;
                    yu9 yu9 = (yu9) soc2.o;
                    if (if8 != null) {
                        ((s3a) yu9.b).k(if8);
                    }
                    switch (af8.ordinal()) {
                        case 1:
                            te8.B(valueOf, new mx6(), selectionStart, selectionEnd);
                            break;
                        case 2:
                            te8.B(valueOf, new eq0(), selectionStart, selectionEnd);
                            break;
                        case 3:
                            te8.B(valueOf, new ol7(), selectionStart, selectionEnd);
                            break;
                        case 4:
                            te8.B(valueOf, new xs9(), selectionStart, selectionEnd);
                            break;
                        case 5:
                            te8.B(valueOf, new uxe(), selectionStart, selectionEnd);
                            break;
                        case 6:
                            te8.B(valueOf, new gvf(), selectionStart, selectionEnd);
                            break;
                        case 7:
                            te8.B(valueOf, new d43(), selectionStart, selectionEnd);
                            break;
                        case 8:
                            ky7[] ky7Arr = (ky7[]) valueOf.getSpans(selectionStart, selectionEnd, ky7.class);
                            String str = null;
                            if (ky7Arr != null && ky7Arr.length != 0) {
                                int length = ky7Arr.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        ky7 = ky7Arr[i];
                                        int spanStart = valueOf.getSpanStart(ky7);
                                        int spanEnd = valueOf.getSpanEnd(ky7);
                                        if (spanStart != selectionStart || spanEnd != selectionEnd) {
                                            i++;
                                        }
                                    } else {
                                        ky7 = null;
                                    }
                                }
                                if (ky7 != null) {
                                    str = ky7.b;
                                }
                                ((s3a) yu9.b).x(selectionStart, selectionEnd, str);
                                break;
                            } else {
                                ((s3a) yu9.b).x(selectionStart, selectionEnd, (String) null);
                                break;
                            }
                            break;
                        case 9:
                            ld8.e0(valueOf, selectionStart, selectionEnd);
                            break;
                    }
                    editText2.setText(valueOf);
                    editText2.setSelection(selectionEnd);
                    hff hff3 = (hff) soc2.v;
                    if (hff3 != null) {
                        hff3.dismiss();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
