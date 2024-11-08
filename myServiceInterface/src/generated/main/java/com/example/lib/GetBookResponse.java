// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book.proto

package com.example.lib;

/**
 * <pre>
 * Réponse contenant la voiture demandée
 * </pre>
 *
 * Protobuf type {@code com.example.GetBookResponse}
 */
public final class GetBookResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.GetBookResponse)
    GetBookResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBookResponse.newBuilder() to construct.
  private GetBookResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBookResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBookResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.lib.BookProto.internal_static_com_example_GetBookResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.lib.BookProto.internal_static_com_example_GetBookResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.lib.GetBookResponse.class, com.example.lib.GetBookResponse.Builder.class);
  }

  public static final int BOOK_FIELD_NUMBER = 1;
  private com.example.lib.Book book_;
  /**
   * <pre>
   * Le livre trouvée
   * </pre>
   *
   * <code>.com.example.Book book = 1;</code>
   * @return Whether the book field is set.
   */
  @java.lang.Override
  public boolean hasBook() {
    return book_ != null;
  }
  /**
   * <pre>
   * Le livre trouvée
   * </pre>
   *
   * <code>.com.example.Book book = 1;</code>
   * @return The book.
   */
  @java.lang.Override
  public com.example.lib.Book getBook() {
    return book_ == null ? com.example.lib.Book.getDefaultInstance() : book_;
  }
  /**
   * <pre>
   * Le livre trouvée
   * </pre>
   *
   * <code>.com.example.Book book = 1;</code>
   */
  @java.lang.Override
  public com.example.lib.BookOrBuilder getBookOrBuilder() {
    return book_ == null ? com.example.lib.Book.getDefaultInstance() : book_;
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
    if (book_ != null) {
      output.writeMessage(1, getBook());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (book_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBook());
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
    if (!(obj instanceof com.example.lib.GetBookResponse)) {
      return super.equals(obj);
    }
    com.example.lib.GetBookResponse other = (com.example.lib.GetBookResponse) obj;

    if (hasBook() != other.hasBook()) return false;
    if (hasBook()) {
      if (!getBook()
          .equals(other.getBook())) return false;
    }
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
    if (hasBook()) {
      hash = (37 * hash) + BOOK_FIELD_NUMBER;
      hash = (53 * hash) + getBook().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.lib.GetBookResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.GetBookResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.lib.GetBookResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.lib.GetBookResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.lib.GetBookResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.lib.GetBookResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.lib.GetBookResponse parseFrom(
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
  public static Builder newBuilder(com.example.lib.GetBookResponse prototype) {
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
   * <pre>
   * Réponse contenant la voiture demandée
   * </pre>
   *
   * Protobuf type {@code com.example.GetBookResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.GetBookResponse)
      com.example.lib.GetBookResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.lib.BookProto.internal_static_com_example_GetBookResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.lib.BookProto.internal_static_com_example_GetBookResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.lib.GetBookResponse.class, com.example.lib.GetBookResponse.Builder.class);
    }

    // Construct using com.example.lib.GetBookResponse.newBuilder()
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
      book_ = null;
      if (bookBuilder_ != null) {
        bookBuilder_.dispose();
        bookBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.lib.BookProto.internal_static_com_example_GetBookResponse_descriptor;
    }

    @java.lang.Override
    public com.example.lib.GetBookResponse getDefaultInstanceForType() {
      return com.example.lib.GetBookResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.lib.GetBookResponse build() {
      com.example.lib.GetBookResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.lib.GetBookResponse buildPartial() {
      com.example.lib.GetBookResponse result = new com.example.lib.GetBookResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.lib.GetBookResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.book_ = bookBuilder_ == null
            ? book_
            : bookBuilder_.build();
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
      if (other instanceof com.example.lib.GetBookResponse) {
        return mergeFrom((com.example.lib.GetBookResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.lib.GetBookResponse other) {
      if (other == com.example.lib.GetBookResponse.getDefaultInstance()) return this;
      if (other.hasBook()) {
        mergeBook(other.getBook());
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
              input.readMessage(
                  getBookFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.example.lib.Book book_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.lib.Book, com.example.lib.Book.Builder, com.example.lib.BookOrBuilder> bookBuilder_;
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     * @return Whether the book field is set.
     */
    public boolean hasBook() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     * @return The book.
     */
    public com.example.lib.Book getBook() {
      if (bookBuilder_ == null) {
        return book_ == null ? com.example.lib.Book.getDefaultInstance() : book_;
      } else {
        return bookBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public Builder setBook(com.example.lib.Book value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        book_ = value;
      } else {
        bookBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public Builder setBook(
        com.example.lib.Book.Builder builderForValue) {
      if (bookBuilder_ == null) {
        book_ = builderForValue.build();
      } else {
        bookBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public Builder mergeBook(com.example.lib.Book value) {
      if (bookBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          book_ != null &&
          book_ != com.example.lib.Book.getDefaultInstance()) {
          getBookBuilder().mergeFrom(value);
        } else {
          book_ = value;
        }
      } else {
        bookBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public Builder clearBook() {
      bitField0_ = (bitField0_ & ~0x00000001);
      book_ = null;
      if (bookBuilder_ != null) {
        bookBuilder_.dispose();
        bookBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public com.example.lib.Book.Builder getBookBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBookFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    public com.example.lib.BookOrBuilder getBookOrBuilder() {
      if (bookBuilder_ != null) {
        return bookBuilder_.getMessageOrBuilder();
      } else {
        return book_ == null ?
            com.example.lib.Book.getDefaultInstance() : book_;
      }
    }
    /**
     * <pre>
     * Le livre trouvée
     * </pre>
     *
     * <code>.com.example.Book book = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.lib.Book, com.example.lib.Book.Builder, com.example.lib.BookOrBuilder> 
        getBookFieldBuilder() {
      if (bookBuilder_ == null) {
        bookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.lib.Book, com.example.lib.Book.Builder, com.example.lib.BookOrBuilder>(
                getBook(),
                getParentForChildren(),
                isClean());
        book_ = null;
      }
      return bookBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.example.GetBookResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.GetBookResponse)
  private static final com.example.lib.GetBookResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.lib.GetBookResponse();
  }

  public static com.example.lib.GetBookResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBookResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBookResponse>() {
    @java.lang.Override
    public GetBookResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBookResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBookResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.lib.GetBookResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

