package br.com.fiap.exceptions;

public class UsuarioNotFoundException extends RuntimeException {
  public UsuarioNotFoundException(String message) {
    super(message);
  }
}

