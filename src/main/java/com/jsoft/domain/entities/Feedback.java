package com.jsoft.domain.entities;

import org.neo4j.graphdb.Node;

import java.util.Date;

/**
 * Made by aurbrsz / 12/26/11 - 17:58
 */
public class Feedback {

  private static final String COMPANY  = "company";
  private static final String FEEDBACK = "feedback";
  private static final String DATE     = "date";

  private final Node underlyingNode;

  public Feedback(final Node feedbackNode) {
    this.underlyingNode = feedbackNode;
  }

  protected Node getUnderlyingNode() {
    return underlyingNode;
  }

  public String getCompany() {
    return (String)underlyingNode.getProperty(COMPANY);
  }

  public String getFeedback() {
    return (String)underlyingNode.getProperty(FEEDBACK);
  }

  public Date getDate() {
    return (Date)underlyingNode.getProperty(DATE);
  }

  @Override
  public int hashCode() {
    return underlyingNode.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Feedback && underlyingNode.equals(((Feedback)o).getUnderlyingNode());
  }

  @Override
  public String toString() {
    return "Feedback[" + getCompany() + "," + getFeedback() + "]";
  }

}
