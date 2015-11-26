package org.visola.spring.security.tokenfilter;

import java.util.Optional;

import org.springframework.security.core.Authentication;

public interface TokenService {

  Optional<Authentication> validateToken(Optional<String> token);

}