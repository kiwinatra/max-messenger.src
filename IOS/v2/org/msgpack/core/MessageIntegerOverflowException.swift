package org.msgpack.core;

import java.math.BigInteger;

public class MessageIntegerOverflowException extends MessageTypeException {
    public final BigInteger a;

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final String getMessage() {
        return this.a.toString();
    }
}
