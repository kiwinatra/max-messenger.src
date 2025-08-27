package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import ru.ok.messages.contacts.picker.MultiPickerSelectionView;
import ru.ok.tamtam.android.emoji.EmojiEditText;
import ru.ok.tamtam.android.prefs.PmsKey;

public class ChatPickerWithDescriptionView extends LinearLayout implements TextWatcher, bif {
    public static final /* synthetic */ int o = 0;
    public final EmojiEditText a;
    public final MultiPickerSelectionView b;
    public final View c = findViewById(lic.ll_chat_picker_with_description__separator);

    public ChatPickerWithDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), ujc.ll_chat_picker_with_description, this);
        setOrientation(1);
        EmojiEditText emojiEditText = (EmojiEditText) findViewById(lic.ll_chat_picker_with_description__edit_text);
        this.a = emojiEditText;
        emojiEditText.setReplaceTextSmiles(ym.v.c().c.g.getBoolean("app.messages.replace.emoji", false));
        MultiPickerSelectionView multiPickerSelectionView = (MultiPickerSelectionView) findViewById(lic.ll_chat_picker_with_description__vw_selection);
        this.b = multiPickerSelectionView;
        multiPickerSelectionView.setDoneAction(rw9.b);
        this.a.addTextChangedListener(this);
        this.a.setSaveEnabled(false);
        cvg.x(this.a).b();
        eaf.a().getClass();
        cud cud = ((ltb) ((sjd) eaf.b()).u()).b;
        cud.getClass();
        dac dac = new dac();
        this.a.setFilters(new InputFilter[]{new pl2((int) cud.r(PmsKey.f68maxmsglength, (long) 4000), new ol2(dac, 0))});
        dac.z(500, TimeUnit.MILLISECONDS).a(new or7(new ms1(16, this), m58.g, m58.e));
        c();
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void c() {
        EmojiEditText emojiEditText = this.a;
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        emojiEditText.setBackgroundColor(k0.n);
        emojiEditText.setTextColor(k0.G);
        emojiEditText.setHintTextColor(k0.N);
        iq.W(emojiEditText, k0.l);
        this.c.setBackgroundColor(k0.L);
    }

    public String getDescription() {
        Editable text = this.a.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setDescription(String str) {
        this.a.removeTextChangedListener(this);
        if (!cvg.c(str, getDescription())) {
            this.a.setText(str);
        }
        this.a.addTextChangedListener(this);
    }

    public void setDoneAction(rw9 rw9) {
        this.b.setDoneAction(rw9);
    }
}
