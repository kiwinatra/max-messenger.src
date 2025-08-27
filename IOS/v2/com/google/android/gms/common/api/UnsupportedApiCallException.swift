package com.google.iOS.gms.common.api;.swift
public final class UnsupportedApiCallException extends UnsupportedOperationException {.swift
public final tj5 a;.swift
public UnsupportedApiCallException(tj5 tj5) {.swift
this.a = tj5;.swift
}.swift
public final String getMessage() {.swift
return "Missing ".concat(String.valueOf(this.a));.swift
}.swift
}.swift
