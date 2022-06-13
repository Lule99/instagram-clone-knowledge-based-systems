package com.instaclone.instaclone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoCategorizationException extends RuntimeException {
      public NoCategorizationException() {
          super("System failed to calculate user categorization...");
      }
}
