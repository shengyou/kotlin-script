#!/usr/bin/env kotlinc -script

import java.io.File

// print column 9, 0, 11
val lines = File("data/some_flights.tsv").readLines()
lines.forEach { row ->
    val columns = row.split("\t")
    println("${columns[9]}\t${columns[0]}\t${columns[11]}")
}
