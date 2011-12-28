package com.jsoft.neo4j;

import org.neo4j.kernel.EmbeddedGraphDatabase;

/**
 * Made by aurbrsz / 12/26/11 - 17:49
 */
public class StartDatabase {

  public static void main(String[] args) {
    EmbeddedGraphDatabase graphDb;
    graphDb = new EmbeddedGraphDatabase("/work/feedbckz/db/unit-test");
    registerShutdownHook(graphDb);
  }

  private static void registerShutdownHook(final EmbeddedGraphDatabase graphDb) {
    // Registers a shutdown hook for the Neo4j instance so that it
    // shuts down nicely when the VM exits (even if you "Ctrl-C" the
    // running example before it's completed)
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        graphDb.shutdown();
      }
    });
  }

}
