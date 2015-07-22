package org.zezutom.planner.tasks

import org.apache.spark.sql.types.StructType

class SchemaDiscoverer(val verbose: Boolean = true) extends DataTask[StructType] {

  override def query(repo:Repository): StructType = {
    if (verbose) repo.dataFrame.printSchema()
    repo.dataFrame.schema
  }

  override def asString(outcome: StructType): String = outcome.mkString("\n")
}
