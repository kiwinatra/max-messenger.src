package com.google.protobuf.nano;

import java.io.IOException;

public class CodedOutputByteBufferNano$OutOfSpaceException extends IOException {
    public CodedOutputByteBufferNano$OutOfSpaceException(int i, int i2) {
        super(a81.l("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i, " limit ", i2, ")."));
    }
}
