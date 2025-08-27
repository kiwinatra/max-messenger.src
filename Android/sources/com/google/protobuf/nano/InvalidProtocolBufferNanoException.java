package com.google.protobuf.nano;

import java.io.IOException;

public class InvalidProtocolBufferNanoException extends IOException {
    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.protobuf.nano.InvalidProtocolBufferNanoException, java.io.IOException] */
    public static InvalidProtocolBufferNanoException a() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
