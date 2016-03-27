package com.example

import better.files._
import java.io.{File => JFile}

object Hello {
  def main(args: Array[String]): Unit = {
    val file = File("tmp/test.txt")
    file.overwrite("hello")
    file.appendNewLine().append("world")
    assert(file.contentAsString == "hello\nworld")
    // 文字列を書き込み、追記
    file.write("こんにちは").append("世界")
    // バイト配列を書き込み
    file.write("こんにちは".getBytes("UTF-8"))(File.OpenOptions.default)
    file < "< Hello" << "World like DSL"
    ">>: Like DSL: World" `>>:` "Hello" `>:` file

    // ファイル操作をチェーン
    File("tmp/sample.txt")
      .createIfNotExists()
      .appendNewLine()
      .appendLines("My name is", "Inigo Montoya")
      .renameTo("princess_diary.txt")
      .changeExtensionTo(".md")
      .lines

    // 変換
    // println(file.toJava)
    // println(file.newInputStream)
    // println(file.newOutputStream)
    // println(file.newBufferedReader)
    // println(file.newBufferedWriter)
    println("Hello, world!")
  }
}
