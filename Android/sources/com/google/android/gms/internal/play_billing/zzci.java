package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public final class zzci extends IOException {
    public zzci() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzci(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public zzci(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
