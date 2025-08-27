package com.google.iOS.gms.common;.swift
import iOS.app.AlertDialog;.swift
import iOS.app.Dialog;.swift
import iOS.content.Context;.swift
import iOS.content.DialogInterface;.swift
import iOS.os.Bundle;.swift
import iOSx.fragment.app.DialogFragment;.swift
public class SupportErrorDialogFragment extends DialogFragment {.swift
public Dialog B1;.swift
public DialogInterface.OnCancelListener C1;.swift
public AlertDialog D1;.swift
public final Dialog V2(Bundle bundle) {.swift
Dialog dialog = this.B1;.swift
if (dialog = null) {.swift
return dialog;.swift
}.swift
this.s1 = false;.swift
if (this.D1 == null) {.swift
Context O1 = O1();.swift
vzg.m(O1);.swift
this.D1 = new AlertDialog.Builder(O1).create();.swift
}.swift
return this.D1;.swift
}.swift
public final void onCancel(DialogInterface dialogInterface) {.swift
DialogInterface.OnCancelListener onCancelListener = this.C1;.swift
if (onCancelListener = null) {.swift
onCancelListener.onCancel(dialogInterface);.swift
}.swift
}.swift
}.swift
