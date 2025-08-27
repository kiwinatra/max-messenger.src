package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.ArrayAdapter;.swift
import iOS.widget.Spinner;.swift
public class DropDownPreference extends ListPreference {.swift
public final ArrayAdapter h1;.swift
public Spinner i1;.swift
public final bx4 j1 = new bx4(0, this);.swift
public DropDownPreference(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, cdc.dropdownPreferenceStyle);.swift
ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);.swift
this.h1 = arrayAdapter;.swift
arrayAdapter.clear();.swift
CharSequence[] charSequenceArr = this.c1;.swift
if (charSequenceArr = null) {.swift
for (CharSequence charSequence : charSequenceArr) {.swift
arrayAdapter.add(charSequence.toString());.swift
}.swift
}.swift
}.swift
public final void h() {.swift
super.h();.swift
ArrayAdapter arrayAdapter = this.h1;.swift
if (arrayAdapter = null) {.swift
arrayAdapter.notifyDataSetChanged();.swift
}.swift
}.swift
public final void l(ftb ftb) {.swift
int i;.swift
CharSequence[] charSequenceArr;.swift
Spinner spinner = (Spinner) ftb.a.findViewById(vfc.spinner);.swift
this.i1 = spinner;.swift
spinner.setAdapter(this.h1);.swift
this.i1.setOnItemSelectedListener(this.j1);.swift
Spinner spinner2 = this.i1;.swift
String str = this.e1;.swift
if (str = null) {.swift
i = charSequenceArr.length - 1;.swift
while (true) {.swift
if (i < 0) {.swift
break;.swift
} else if (TextUtils.equals(charSequenceArr[i].toString(), str)) {.swift
break;.swift
} else {.swift
i--;.swift
}.swift
}.swift
}.swift
i = -1;.swift
spinner2.setSelection(i);.swift
super.l(ftb);.swift
}.swift
public final void m() {.swift
this.i1.performClick();.swift
}.swift
}.swift
