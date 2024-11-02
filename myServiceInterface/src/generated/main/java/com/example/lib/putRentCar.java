// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package com.example.lib;

/**
 * Protobuf type {@code com.example.putRentCar}
 */
public final class putRentCar extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.putRentCar)
    putRentCarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use putRentCar.newBuilder() to construct.
  private putRentCar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private putRentCar() {
    plateNumber_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new putRentCar();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.lib.CarProto.internal_static_com_example_putRentCar_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.lib.CarProto.internal_static_com_example_putRentCar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.lib.putRentCar.class, com.example.lib.putRentCar.Builder.class);
  }

  public static final int PLATE_NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object plateNumber_ = "";
  /**
   * <pre>
   * Numéro de plaque pour identifier la voiture
   * </pre>
   *
   * <code>string plate_number = 1;</code>
   * @return The plateNumber.
   */
  @java.lang.Override
  public java.lang.String getPlateNumber() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plateNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Numéro de plaque pour identifier la voiture
   * </pre>
   *
   * <code>string plate_number = 1;</code>
   * @return The bytes for plateNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlateNumberBytes() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plateNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWSTATERENT_FIELD_NUMBER = 2;
  private boolean newStateRent_ = false;
  /**
   * <code>bool newStateRent = 2;</code>
   * @return The newStateRent.
   */
  @java.lang.Override
  public boolean getNewStateRent() {
    return newStateRent_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, plateNumber_);
    }
    if (newStateRent_ != false) {
      output.writeBool(2, newStateRent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, plateNumber_);
    }
    if (newStateRent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, newStateRent_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.lib.putRentCar)) {
      return super.equals(obj);
    }
    com.example.lib.putRentCar other = (com.example.lib.putRentCar) obj;

    if (!getPlateNumber()
        .equals(other.getPlateNumber())) return false;
    if (getNewStateRent()
        != other.getNewStateRent()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PLATE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPlateNumber().hashCode();
    hash = (37 * hash) + NEWSTATERENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNewStateRent());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.lib.putRentCar parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.putRentCar parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.putRentCar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.putRentCar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.putRentCar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.putRentCar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.putRentCar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.lib.putRentCar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.lib.putRentCar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.lib.putRentCar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.lib.putRentCar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.lib.putRentCar parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.lib.putRentCar prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.putRentCar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.putRentCar)
      com.example.lib.putRentCarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.lib.CarProto.internal_static_com_example_putRentCar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.lib.CarProto.internal_static_com_example_putRentCar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.lib.putRentCar.class, com.example.lib.putRentCar.Builder.class);
    }

    // Construct using com.example.lib.putRentCar.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      plateNumber_ = "";
      newStateRent_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.lib.CarProto.internal_static_com_example_putRentCar_descriptor;
    }

    @java.lang.Override
    public com.example.lib.putRentCar getDefaultInstanceForType() {
      return com.example.lib.putRentCar.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.lib.putRentCar build() {
      com.example.lib.putRentCar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.lib.putRentCar buildPartial() {
      com.example.lib.putRentCar result = new com.example.lib.putRentCar(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.lib.putRentCar result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.plateNumber_ = plateNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newStateRent_ = newStateRent_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.lib.putRentCar) {
        return mergeFrom((com.example.lib.putRentCar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.lib.putRentCar other) {
      if (other == com.example.lib.putRentCar.getDefaultInstance()) return this;
      if (!other.getPlateNumber().isEmpty()) {
        plateNumber_ = other.plateNumber_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getNewStateRent() != false) {
        setNewStateRent(other.getNewStateRent());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              plateNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              newStateRent_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object plateNumber_ = "";
    /**
     * <pre>
     * Numéro de plaque pour identifier la voiture
     * </pre>
     *
     * <code>string plate_number = 1;</code>
     * @return The plateNumber.
     */
    public java.lang.String getPlateNumber() {
      java.lang.Object ref = plateNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plateNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Numéro de plaque pour identifier la voiture
     * </pre>
     *
     * <code>string plate_number = 1;</code>
     * @return The bytes for plateNumber.
     */
    public com.google.protobuf.ByteString
        getPlateNumberBytes() {
      java.lang.Object ref = plateNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plateNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Numéro de plaque pour identifier la voiture
     * </pre>
     *
     * <code>string plate_number = 1;</code>
     * @param value The plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      plateNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Numéro de plaque pour identifier la voiture
     * </pre>
     *
     * <code>string plate_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlateNumber() {
      plateNumber_ = getDefaultInstance().getPlateNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Numéro de plaque pour identifier la voiture
     * </pre>
     *
     * <code>string plate_number = 1;</code>
     * @param value The bytes for plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      plateNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean newStateRent_ ;
    /**
     * <code>bool newStateRent = 2;</code>
     * @return The newStateRent.
     */
    @java.lang.Override
    public boolean getNewStateRent() {
      return newStateRent_;
    }
    /**
     * <code>bool newStateRent = 2;</code>
     * @param value The newStateRent to set.
     * @return This builder for chaining.
     */
    public Builder setNewStateRent(boolean value) {

      newStateRent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool newStateRent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewStateRent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      newStateRent_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.putRentCar)
  }

  // @@protoc_insertion_point(class_scope:com.example.putRentCar)
  private static final com.example.lib.putRentCar DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.lib.putRentCar();
  }

  public static com.example.lib.putRentCar getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<putRentCar>
      PARSER = new com.google.protobuf.AbstractParser<putRentCar>() {
    @java.lang.Override
    public putRentCar parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<putRentCar> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<putRentCar> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.lib.putRentCar getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

