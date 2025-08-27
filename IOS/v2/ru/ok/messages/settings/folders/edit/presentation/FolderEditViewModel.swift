package ru.ok.messages.settings.folders.edit.presentation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/messages/settings/folders/edit/presentation/FolderEditViewModel;", "Lyag;", "n06", "yz5", "zz5", "o54", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class FolderEditViewModel extends yag {
    public final az5 c;
    public final u82 d;
    public final nd e;
    public final xme f;
    public final etc g;
    public final xme h;
    public final etc i;
    public final o54 j;

    public FolderEditViewModel(az5 az5, u82 u82, nd ndVar, gaf gaf) {
        o54 o54;
        vz5 vz5;
        this.c = az5;
        this.d = u82;
        this.e = ndVar;
        xme a = f6e.a((Object) null);
        this.f = a;
        this.g = new etc(a);
        xme a2 = f6e.a(new zz5((e15) null, false));
        this.h = a2;
        this.i = new etc(a2);
        if (az5 instanceof xy5) {
            a2.m((Object) null, new zz5(new e15(0, (CharSequence) ArraysKt.random((T[]) tf6.c, (Random) Random.Default), CollectionsKt.emptyList()), true));
            o54 = uz5.o;
        } else {
            if (az5 instanceof yy5) {
                vz5 = new vz5(((yy5) az5).a);
            } else if (az5 instanceof zy5) {
                vz5 = new vz5(((zy5) az5).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            o54 = vz5;
        }
        this.j = o54;
        if (o54 instanceof vz5) {
            ev0.v(b0h.C(this), ((osa) gaf).a(), (f14) null, new sz5(this, (Continuation) null), 2);
        }
    }

    public final zz5 j() {
        return zz5.a((zz5) this.h.getValue(), false, (e15) null, false, 95);
    }

    public final void k(e15 e15) {
        if (!Intrinsics.areEqual((Object) e15, (Object) j().b)) {
            zz5 a = zz5.a(j(), false, e15, false, 125);
            xme xme = this.h;
            xme.getClass();
            xme.m((Object) null, a);
        }
    }

    public final void l(CharSequence charSequence) {
        boolean z = true;
        boolean z2 = (charSequence != null ? charSequence.length() : 0) <= 16;
        boolean z3 = charSequence == null || StringsKt.isBlank(charSequence);
        xme xme = this.h;
        if ((z3 && ((zz5) xme.getValue()).b == null) || !z2) {
            z = false;
        }
        if (z != j().d) {
            zz5 a = zz5.a(j(), false, (e15) null, z, 119);
            xme.getClass();
            xme.m((Object) null, a);
        }
    }
}
