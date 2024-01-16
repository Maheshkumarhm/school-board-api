package com.school.sba.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseStructure<T> {
private int status;
private String message;
private T data;
}
