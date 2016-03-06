package com.q4k;

import java.util.concurrent.atomic.AtomicInteger;

public class Question {

  private static final AtomicInteger COUNTER = new AtomicInteger();

  private final int id;
  private String name;
  private String html;

  public Question(String name, String html) {
    this.id = COUNTER.getAndIncrement();
    this.name = name;
    this.html = html;
  }

  public Question() {
    this.id = COUNTER.getAndIncrement();
  }

  public String getName() {
    return name;
  }

  public String getHtml() {
    return html;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHtml(String html) {
    this.html = html;
  }
}