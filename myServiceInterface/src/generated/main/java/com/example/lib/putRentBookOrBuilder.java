// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book.proto

package com.example.lib;

public interface putRentBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.putRentBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Numéro ISBN pour identifier le livre
   * </pre>
   *
   * <code>string ISBN = 1;</code>
   * @return The iSBN.
   */
  java.lang.String getISBN();
  /**
   * <pre>
   * Numéro ISBN pour identifier le livre
   * </pre>
   *
   * <code>string ISBN = 1;</code>
   * @return The bytes for iSBN.
   */
  com.google.protobuf.ByteString
      getISBNBytes();

  /**
   * <code>bool newStateRent = 2;</code>
   * @return The newStateRent.
   */
  boolean getNewStateRent();
}
