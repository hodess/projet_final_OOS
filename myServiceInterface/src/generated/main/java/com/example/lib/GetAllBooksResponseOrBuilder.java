// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book.proto

package com.example.lib;

public interface GetAllBooksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.GetAllBooksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Liste des voitures
   * </pre>
   *
   * <code>repeated .com.example.Book books = 1;</code>
   */
  java.util.List<com.example.lib.Book> 
      getBooksList();
  /**
   * <pre>
   * Liste des voitures
   * </pre>
   *
   * <code>repeated .com.example.Book books = 1;</code>
   */
  com.example.lib.Book getBooks(int index);
  /**
   * <pre>
   * Liste des voitures
   * </pre>
   *
   * <code>repeated .com.example.Book books = 1;</code>
   */
  int getBooksCount();
  /**
   * <pre>
   * Liste des voitures
   * </pre>
   *
   * <code>repeated .com.example.Book books = 1;</code>
   */
  java.util.List<? extends com.example.lib.BookOrBuilder> 
      getBooksOrBuilderList();
  /**
   * <pre>
   * Liste des voitures
   * </pre>
   *
   * <code>repeated .com.example.Book books = 1;</code>
   */
  com.example.lib.BookOrBuilder getBooksOrBuilder(
      int index);
}
