package org.zezutom.planner.tasks

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

trait DataTask[T] extends Serializable {

  private var _outcome:T = _

  def outcome = _outcome

  val outputPath = Paths.get("src", "main", "resources").toAbsolutePath.toString

  def execute(repo:Repository): DataTask[T] = {
    this._outcome = query(repo)
    this
  }

  def query(repo: Repository): T

  def asString(outcome: T): String

  def save(fileName: String) =
    if (!fileName.isEmpty)
      Files.write(Paths.get(outputPath, fileName), asString(outcome).getBytes(StandardCharsets.UTF_8))

}
