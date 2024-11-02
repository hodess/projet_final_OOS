// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package com.example.lib;

public interface CarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.Car)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Numéro de plaque
   * </pre>
   *
   * <code>string plate_number = 1;</code>
   * @return The plateNumber.
   */
  java.lang.String getPlateNumber();
  /**
   * <pre>
   * Numéro de plaque
   * </pre>
   *
   * <code>string plate_number = 1;</code>
   * @return The bytes for plateNumber.
   */
  com.google.protobuf.ByteString
      getPlateNumberBytes();

  /**
   * <pre>
   * Marque de la voiture
   * </pre>
   *
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <pre>
   * Marque de la voiture
   * </pre>
   *
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <pre>
   * Prix de la voiture
   * </pre>
   *
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <pre>
   * Indique si la voiture est louée
   * </pre>
   *
   * <code>bool rented = 4;</code>
   * @return The rented.
   */
  boolean getRented();

  /**
   * <pre>
   * Identifiant unique de la voiture
   * </pre>
   *
   * <code>int64 id = 5;</code>
   * @return The id.
   */
  long getId();
}
