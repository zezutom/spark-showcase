package org.zezutom.planner.exercises

import org.apache.spark.sql.types.StructType

class SchemaDiscoverer(val verbose: Boolean = true) extends DataTask[StructType] {

  override def execute(repo:Repository): StructType = {
    if (verbose) repo.dataFrame.printSchema()
    repo.dataFrame.schema
  }
}
